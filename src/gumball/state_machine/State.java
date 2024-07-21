package gumball.state_machine;

/**
 * @author 6510450305 chaiyapat
 */

public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
    public void choose(String flavor);
}
