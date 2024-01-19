package student;
//Reese Saladin

public class BiggestCardAI extends AI {
    /**
     * Plays cards for the biggestCardAI.
     * Plays the highest-ranked card available.
     * @param hand - the BiggestCardAI's Hand of Card objects.
     * @param cardPile - the CardPile the computer will play on.
     * @return - the Card that the BiggestCardAI chooses to play.
     */
    public Card getPlay(Hand hand, CardPile cardPile) {
        Card biggestValid = null;
        int highestVal = 0;
        for (int i = 0; i < hand.getSize(); i++) {
            if (cardPile.canPlay(hand.get(i))) {
                if (hand.get(i).getRankNum() > highestVal) {
                    biggestValid = hand.get(i);
                    highestVal = hand.get(i).getRankNum();
                }
            }
        }
        return biggestValid;
    }

    /**
     * returns the name of the BiggestCardAI.
     * @return - a String representing the BiggestCardAI.
     */
    public String toString() {
        return "Biggest Card AI";
    }
}
