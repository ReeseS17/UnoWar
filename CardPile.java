package student;
//Reese Saladin

public class CardPile {
    /**
     * a Card attribute that represents the top Card in the CardPile.
     */
    private Card topCard;
    /**
     * an int attribute that represents the number of cards that are in CardPile.
     */
    private int numCards;

    /**
     * Creates a new CardPile with topCard representing the card on top.
     * @param topCard - a Card object that is the top Card of the pile.
     */
    public CardPile(Card topCard) {
        numCards = 1;
        this.topCard = topCard;
    }

    /**
     * Checks if the input card is legal to play on current CardPile.
     * @param card - a Card object that is being tested if it can play.
     * @return - boolean true if Card can be played, false otherwise.
     */
    public boolean canPlay(Card card) {
        return card.getSuitName().equals(topCard.getSuitName()) || card.getRankNum() >= topCard.getRankNum();
    }

    /**
     * Adds card to top of CardPile.
     * Gives error message if card is not legal to play.
     * @param card - a Card object to be played.
     */
    public void play(Card card) {
        if (card == null) {
            System.out.println("Illegal move detected!");
        } else if (canPlay(card)) {
            topCard = card;
            numCards++;
        } else {
            System.out.println("Illegal move detected!");
        }
    }

    /**
     * Gets the number of cards in CardPile.
     * @return - an int representing the number of cards in CardPile.
     */
    public int getNumCards() {
        return numCards;
    }

    /**
     * Gets the card on top of CardPile.
     * @return - a Card object of the card currently on top of CardPile.
     */
    public Card getTopCard() {
        return topCard;
    }


}
