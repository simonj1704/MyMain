package mycard;

import java.util.ArrayList;
import java.util.Random;
public class DeckOfCards {
    private ArrayList<MyCard> cards = new ArrayList<MyCard>();

    public DeckOfCards (){
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 12; j++) {
                cards.add(new MyCard(i,j));
            }
        }
    }

    public DeckOfCards (int jokers){
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 12; j++) {
                cards.add(new MyCard(i,j));
            }
        }
        for (int i = 0; i <= jokers -1; i++) {
            cards.add(new MyCard(Joker.JOKER));
        }
    }

    private MyCard drawCard(){
        Random random = new Random();

        int index = random.nextInt(cards.size());
        return cards.remove(index);
    }

    public void addJoker(){
        cards.add(new MyCard(Joker.JOKER));
    }

    private String cardValue(int value){
        switch (value){
            case 1 -> {
                return "Ace";
            }
            case 2 -> {
                return "2";
            }
            case 3 -> {
                return "3";
            }
            case 4 -> {
                return "4";
            }
            case 5 -> {
                return "5";
            }
            case 6 -> {
                return "6";
            }
            case 7 -> {
                return "7";
            }case 8 -> {
                return "8";
            }case 9 -> {
                return "9";
            }case 10 -> {
                return "10";
            }case 11 -> {
                return "Jack";
            }
            case 12 -> {
                return "Queen";
            }
            case 13 -> {
                return "King";
            }
        }
        return null;
    }

    private Color cardColor(int color){
        switch (color){
            case 0 -> {
                return Color.CLUBS;
            }
            case 1 -> {
                return Color.DIAMONDS;
            }
            case 2 -> {
                return Color.SPADES;
            }
            case 3 -> {
                return Color.HEARTS;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "DeckOfCards{" +
                "cardsDeck=" + cards +
                '}';
    }
}


