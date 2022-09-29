package mycard;

public class TestMyCard {
    public void run(){
        MyCard card1 = new MyCard();
        MyCard card2 = new MyCard();
        MyCard card3 = new MyCard();
        MyCard card4 = new MyCard(Joker.JOKER);

        System.out.printf("Card 1: %d of %s\n", card1.getValue(), card1.getColor());
        System.out.printf("Card 2: %d of %s\n", card2.getValue(), card2.getColor());
        System.out.printf("Card 3: %d of %s\n", card3.getValue(), card3.getColor());
        System.out.printf("Card 4: %s\n", card4);

        DeckOfCards deck = new DeckOfCards();
        System.out.println(deck);
        DeckOfCards deck2 = new DeckOfCards(2);
        System.out.println(deck2);

    }

    public static void main(String[] args) {
        TestMyCard testMyCard = new TestMyCard();
        testMyCard.run();
    }
}
