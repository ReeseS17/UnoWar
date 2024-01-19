package student;
import java.util.Random;
//Reese Saladin

public class Deck {
    /**
     * an array of Cards that holds the 52 unique Card objects.
     */
    private Card[] deck;
    /**
     * an int attribute that represents the Cards left in deck (ie cards that have not been used yet).
     */
    private int cardsLeft;

    /**
     * Creates a Deck object made with 52 different Cards.
     */
    public Deck() {
        this.deck = new Card[52];
        this.cardsLeft = 52;
        int counter = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 13; j++) {
                deck[counter] = new Card(j, i);
                counter++;
            }
        }
        shuffle();
    }

    /**
     * Shuffles/rearranges Deck via Durstenfeld-Fisher-Yates algorithm.
     */
    public void shuffle() {
        for (int i = deck.length - 1; i > 0; i--) {
            Random rand = new Random();
            int j = rand.nextInt(i + 1);
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    /**
     * Draws and returns the next card of the Deck, shuffling if none are left.
     *
     * @return - a Card object from the top of Deck.
     */
    public Card draw() {
        if (isEmpty()) {
            shuffle();
            cardsLeft = 52;
        }
        cardsLeft--;
        return deck[cardsLeft];
    }

    /**
     * Returns the number of cards left before the next shuffle.
     *
     * @return - an int representing the number of cards left from Deck.
     */
    public int cardsRemaining() {
        return cardsLeft;
    }

    /**
     * Checks if the Deck is empty.
     *
     * @return - boolean true if Deck is empty, false otherwise.
     */
    public boolean isEmpty() {
        return cardsRemaining() == 0;
    }

}
