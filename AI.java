package student;
//Reese Saladin

public class AI {
    /**
     * Plays cards for the computer AI "randomly" by playing first legal card.
     * @param hand - the AI's Hand of Card objects.
     * @param cardPile - the CardPile the computer will play on.
     * @return - the Card that the AI chooses to play.
     */
    public Card getPlay(Hand hand, CardPile cardPile) {
        for (int i = 0; i < hand.getSize(); i++) {
            if (cardPile.canPlay(hand.get(i))) {
                return hand.get(i);
            }
        }
        return null;
    }

    /**
     * Returns the name of the AI.
     * @return - a String representing this version of the AI.
     */
    public String toString() {
        return "Random Card AI";
    }
}
