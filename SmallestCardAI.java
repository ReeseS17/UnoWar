package student;
//Reese Saladin

public class SmallestCardAI extends AI {

    /**
     * Plays cards for the SmallestCardAI.
     * Plays the smallest-ranked legal card.
     * @param hand - the AI's Hand of Card objects.
     * @param cardPile - the CardPile the computer will play on.
     * @return - the Card that the SmallestCardAI chooses to play.
     */
    public Card getPlay(Hand hand, CardPile cardPile) {
        Card smallestValid = null;
        int lowestVal = 14;
        for (int i = 0; i < hand.getSize(); i++) {
            if (cardPile.canPlay(hand.get(i))) {
                if (hand.get(i).getRankNum() < lowestVal) {
                    smallestValid = hand.get(i);
                    lowestVal = hand.get(i).getRankNum();
                }
            }
        }
        return smallestValid;
    }

    /**
     * Returns the name of the SmallestCardAI.
     * @return - a String representing the name of SmallestCardAI.
     */
    public String toString() {
        return "Smallest Card AI";
    }
}
