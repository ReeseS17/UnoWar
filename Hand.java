package student;
//Reese Saladin

public class Hand {
    /**
     * an array of Card objects that hold a singular Hand of cards.
     */
    private Card[] hand;
    /**
     * an int attribute that represents the number of Cards that will be in hand.
     */
    private int size;
    /**
     * a Deck attribute that holds the Deck being used for this Hand.
     */
    private Deck deck;

    /**
     * Creates a Hand object that stores Cards of int size amount.
     *
     * @param deck - a Deck object to draw cards from.
     * @param size - int representing the size of hand to draw.
     */
    public Hand(Deck deck, int size) {
        this.deck = deck;
        this.size = size;
        hand = new Card[size];
        for (int i = 0; i < size; i++) {
            hand[i] = deck.draw();
        }
    }

    /**
     * Gets the size of the hand.
     *
     * @return - an int representing the size of the hand.
     */
    public int getSize() {
        return size;
    }

    /**
     * Gets the card of the index i in Hand.
     * @param i - an int representing the index of card to return.
     * @return - the Card object at index i, or card one for invalid indexes.
     */
    public Card get(int i) {
        if (i > size - 1 || i < 0) {
            System.out.println("Invalid hand index!");
            return hand[0];
        } else {
            return hand[i];
        }
    }

    /**
     * Removes a card from Hand if found, and replaces it with a new Card.
     * @param card - a Card object to remove from Hand and be replaced.
     * @return - boolean false if Card is null or not in hand, true otherwise.
     */
    public boolean remove(Card card) {
        if (card == null) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (card.equals(hand[i])) {
                hand[i] = deck.draw();
                return true;
            }
        }
        return false;
    }
}
