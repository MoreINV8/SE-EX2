import gumball.GumballMachine;

/**
 * @author 6510450305 chaiyapat
 */

public class Main {
    public static void main(String[] args) {
        GumballMachine mightyGumball = new GumballMachine(5);
        mightyGumball.report();
        mightyGumball.insertQuarter();
        mightyGumball.turn();
        System.out.println();

        mightyGumball.report();
        mightyGumball.insertQuarter();
        mightyGumball.ejectQuarter();
        mightyGumball.turn();
        System.out.println();

        mightyGumball.report();
        mightyGumball.insertQuarter();
        mightyGumball.turn();
        mightyGumball.insertQuarter();
        mightyGumball.turn();
        mightyGumball.turn();
        System.out.println();

        mightyGumball.report();
        mightyGumball.insertQuarter();
        mightyGumball.turn();
        mightyGumball.insertQuarter();
        mightyGumball.turn();
        mightyGumball.insertQuarter();
        mightyGumball.turn();

        System.out.println();

        mightyGumball.report();
    }
}