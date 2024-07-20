package gumball;

/**
 * @author 6510450305 chaiyapat
 */

public class GumballMachineOld {
        private enum State {
            NoQuarter,
            HasQuarter,
            GumballSolid,
            OutOfGumball
        }


        private int gumballs;
        private State state;


        public GumballMachineOld(int gumballs) {
            this.gumballs = gumballs;
            this.state = State.NoQuarter;
        }


        public void insertQuarter() {
            if (state.equals(State.OutOfGumball)) {
                System.out.println("You cant insert a quarter, the machine is sold out");
            } else if (state.equals(State.NoQuarter)) {
                System.out.println("You inserted a quarter");
                state = State.HasQuarter;
            } else {
                System.out.println("Already have a Quarter!!");
            }
        }


        public void ejectQuarter() {
            if (state.equals(State.HasQuarter)) {
                state = State.NoQuarter;
                System.out.println("Quarter returned");
            } else {
                System.out.println("You haven't inserted a quarter");
            }
        }


        public void turn() {
            if (state.equals(State.OutOfGumball)){
                System.out.println("You turned, but there are no gumballs");
            } else if (state.equals(State.HasQuarter)) {
                System.out.println("You turned...");
                gumballs -= 1;
                state = State.GumballSolid;
                dispenseGumball();
            } else {
                System.out.println("You turned but there's no quarter");
            }
        }


        public void dispenseGumball() {
            if (state.equals(State.GumballSolid)) {
                System.out.println("A gumball comes rolling out the slot");
                if (gumballs > 0) {
                    state = State.NoQuarter;
                } else {
                    System.out.println("Oops, out of gumballs");
                    state = State.OutOfGumball;
                }
            }
        }

        public void report() {
            System.out.println("Mighty Gumball, Inc.");
            System.out.println("Java-enabled Standing Gumball Model #2004");
            System.out.println("Inventory: " + gumballs + " gumballs");
            if (state.equals(State.NoQuarter)) {
                System.out.println("Machine is waiting for quarter");
            } else {
                System.out.println("Machine is sold out");
            }
            System.out.println();
        }
}