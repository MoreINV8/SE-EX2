package gumball.state_machine;

import gumball.GumballMachine;

import java.util.Random;

/**
 * @author 6510450305 chaiyapat
 */

public class ChooseFlavorState implements State {
    private GumballMachine gumballMachine;
    private String favor;

    private final Random random = new Random();
    private final double winningRate = 0.1;

    public ChooseFlavorState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already choose the flavor");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        double result = random.nextDouble(0, 1);
        System.out.println(result);
        if (result < winningRate) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public void choose(String flavor) {
        System.out.println("You have chosen the flavor " + flavor);
        gumballMachine.setFlavor(flavor);
    }
}
