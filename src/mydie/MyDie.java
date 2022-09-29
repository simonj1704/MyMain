package mydie;

import java.util.Random;

public class MyDie {
    private int value;

    public MyDie(){
        roll();
    }

    public int getValue(){
        return value;
    }

    public void roll(){
        Random random = new Random();

        value = random.nextInt(6)+1;
    }



}
