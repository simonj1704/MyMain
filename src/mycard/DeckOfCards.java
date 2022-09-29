package mycard;

import java.util.ArrayList;
import java.util.Collections;
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

    public MyCard drawCard(){
        Random random = new Random();

        int index = random.nextInt(cards.size());
        return cards.remove(index);
    }

    public void addJoker(){
        cards.add(new MyCard(Joker.JOKER));
    }

    public MyCard getNext(int index){
        return cards.remove(index++);
    }

    public MyCard getLast(){
        return cards.remove(cards.size()-1);
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    @Override
    public String toString() {
        return "DeckOfCards{" +
                "cardsDeck=" + cards +
                '}';
    }
}


