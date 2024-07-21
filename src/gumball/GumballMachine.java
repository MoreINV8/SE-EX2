package gumball;
import gumball.state_machine.*;

/**
 * @author 6510450305 chaiyapat
 */

public class GumballMachine {
    private State soldState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldOutState;
    private State winnerState;
    private State chooseFlavorState;

    private int gumballs;
    private State state;
    private String flavor;

    public GumballMachine(int gumballs) {
        this.gumballs = gumballs;
        soldState = new GumballSoldState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldOutState = new OutOfGumballState(this);
        winnerState = new WinnerState(this);
        chooseFlavorState = new ChooseFlavorState(this);

        if (gumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }


    public void insertQuarter() {
        state.insertQuarter();
    }


    public void ejectQuarter() {
        state.ejectQuarter();
    }


    public void turn() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("A " + flavor + " gumball comes rolling out the slot...");
        if (gumballs > 0) {
            gumballs -= 1;
        }
    }

    public  void choose(String flavor) {
        state.choose(flavor);
    }

    public State getSoldState() {
        return soldState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getChooseFlavorState() {
        return chooseFlavorState;
    }

    public int getGumballs() {
        return gumballs;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void report() {
        System.out.println("Mighty Gumball, Inc.");
        System.out.println("Java-enabled Standing Gumball Model #2004");
        System.out.println("Inventory: " + gumballs + " gumballs");
        System.out.println();
    }
}