package gumball.state_machine;
import gumball.GumballMachine;

import java.util.Random;

public class HasQuarterState implements State {
    private GumballMachine gumballMachine;
    private final Random random = new Random();
    private final double winningRate = 0.1;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
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
}
