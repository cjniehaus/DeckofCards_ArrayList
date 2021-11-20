import java.util.ArrayList;

public class CardDeckApp {

    public static void main(String[] args) {
        System.out.println("DECK");
        ArrayList<String> deck = getDeck();
        displayCards(deck);

        System.out.println("SHUFFLED DECK");
        shuffleDeck(deck);
        displayCards(deck);

        int count = 2;
        System.out.println("HAND OF " + count + " CARDS");
        ArrayList<String> hand = dealCards(deck, count);
        displayCards(hand);
    }

    private static ArrayList<String> getDeck() {
        ArrayList<String> suits = new ArrayList<>();
        suits.add("Spades");
        suits.add("Hearts");
        suits.add("Diamonds");
        suits.add("Clubs");
        
        ArrayList<String> ranks = new ArrayList<>();
        ranks.add("Ace");
        ranks.add("Two");
        ranks.add("Three");
        ranks.add("Four");
        ranks.add("Five");
        ranks.add("Six");
        ranks.add("Seven"); 
        ranks.add("Eight");
        ranks.add("Nine");
        ranks.add("Ten");
        ranks.add("Jack");
        ranks.add("Queen");
        ranks.add("King");        

        ArrayList<String> deck = new ArrayList<>(52);
        for (String suit : suits) {
            for (String rank : ranks) {
                System.out.print(rank + " of " + suit);
            }
        }
        return deck;
    }

    private static void displayCards(ArrayList<String> cards) {
        System.out.print("|");        
        for (String card : cards) {
            System.out.print(card + "|");
        }
        System.out.println();        
    }

    private static void shuffleDeck(ArrayList<String> deck) {
        for (int i = 0; i < deck.size(); i++) {
            String savedCard = deck.get(i);
            int randomIndex = (int) (Math.random() * deck.size()-1);
            deck.get(i) = deck.get(randomIndex);
            savedCard = deck.get(randomIndex);
        }
    }

    private static ArrayList<String> dealCards(ArrayList<String> deck, int count) {
        ArrayList<String> hand = new ArrayList<>(2);
        return hand;
    }
}