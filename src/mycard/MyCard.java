package mycard;

import java.util.Random;

public class MyCard {
    private Color[] cardType = {Color.CLUBS, Color.DIAMONDS, Color.HEARTS, Color.SPADES};
    private String[] cardValue = {"Ace", "King", "Queen", "Jack", "10",
            "9", "8", "7", "6", "5", "4", "3", "2"};
    private Color color;
    private int value;
    private int type;

    private Joker joker;

    public MyCard(){
        draw();
    }
    public MyCard(int type, int value){
        this.type = type;
        this.value = value;
    }

    public MyCard(Joker joker){
        value = 14;
    }

    public Color getColor(){
        return color;
    }

    public int getValue(){
        return value;
    }


    public void draw(){
        Random random = new Random();

        value = random.nextInt(13)+1;
        int colorChoose = random.nextInt(4);
        switch (colorChoose){
            case 0 -> color = Color.HEARTS;
            case 1 -> color = Color.CLUBS;
            case 2 -> color = Color.DIAMONDS;
            case 3 -> color = Color.SPADES;
        }
    }

    public String toString(){
        if (getValue() == 14){
            return "JOKER";
        }
        return cardValue[value] + " of " + cardType[type];
    }
}
