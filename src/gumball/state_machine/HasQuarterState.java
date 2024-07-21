package gumball.state_machine;
import gumball.GumballMachine;

/**
 * @author 6510450305 chaiyapat
 */

public class HasQuarterState implements State {
    private GumballMachine gumballMachine;

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
        System.out.println("You have to choose the flavor first");
        System.out.println("No gumball dispensed");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public void choose(String flavor) {
        System.out.println("You have chosen the flavor " + flavor);
        gumballMachine.setFlavor(flavor);
        gumballMachine.setState(gumballMachine.getChooseFlavorState());
    }
}
