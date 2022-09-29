package mydie;

public class TestMyDie {
    public void run(){
        MyDie die1 = new MyDie();
        MyDie die2 = new MyDie();

        for (int i = 0; i < 10; i++) {
            die1.roll();
            die2.roll();
            System.out.println("Die 1: " + die1.getValue());
            System.out.println("Die 2: " + die2.getValue());
        }
    }

    public static void main(String[] args) {
        TestMyDie testMyDie = new TestMyDie();
        testMyDie.run();
    }
}
