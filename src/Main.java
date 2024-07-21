import gumball.GumballMachine;

/**
 * @author 6510450305 chaiyapat
 * advantage and disadvantage of using design pattern and not using design pattern
 *
 * using design pattern: ดีตรงที่มีการแบ่งส่วนการทำงานออกเป็น state machine ทำให้เข้าใจและอ่านได้ง่าย
 * แต่ในกรณีที่จะเพิ่ม transition จำเป็นต้องตามไปแก้ไขโค้ดในทุกๆ state machine
 * การเพิ่ม state ไม่จำเป็นต้องเข้าไปยุ่งกับ code ของ state อื่นๆ
 *
 * not using design pattern: เป็นการ code ที่ง่ายไม่ต้องคิดเยอะในกรณีที่่มี state machine ไม่มาก
 * แต่เมื่อจะเพิ่ม transition และ state machine เพิ่มต้องเข้าไปแก้ code ในส่วนรวม (เพราะทุก code อยู่รวมกัน)
 */

public class Main {
    public static void main(String[] args) {
        GumballMachine mightyGumball = new GumballMachine(5);
        mightyGumball.report();
        mightyGumball.insertQuarter();
        mightyGumball.choose("Mango");
        mightyGumball.turn();
        System.out.println();

        mightyGumball.report();
        mightyGumball.insertQuarter();
        mightyGumball.ejectQuarter();
        mightyGumball.turn();
        System.out.println();

        mightyGumball.report();
        mightyGumball.insertQuarter();
        mightyGumball.choose("Orange");
        mightyGumball.turn();
        mightyGumball.insertQuarter();
        mightyGumball.choose("Mango");
        mightyGumball.choose("Orange");
        mightyGumball.turn();
        mightyGumball.turn();
        System.out.println();

        mightyGumball.report();
        mightyGumball.insertQuarter();
        mightyGumball.choose("Banana");
        mightyGumball.turn();
        mightyGumball.insertQuarter();
        mightyGumball.choose("Peach");
        mightyGumball.turn();
        mightyGumball.insertQuarter();
        mightyGumball.choose("Chocolate");
        mightyGumball.turn();

        System.out.println();

        mightyGumball.report();
    }
}