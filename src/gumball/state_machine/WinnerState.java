package gumball.state_machine;

import gumball.GumballMachine;

public class WinnerState extends GumballSoldState{
    public WinnerState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void dispense() {
        System.out.println("You winning the game...");
        if (gumballMachine.getGumballs() >= 2) {
            gumballMachine.releaseBall();
            gumballMachine.releaseBall();
            if (gumballMachine.getGumballs() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        } else {
            System.out.println("Sorry we've got only one ball left");
            super.dispense();
        }
    }
}
