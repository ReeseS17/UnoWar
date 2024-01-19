package student;
//Reese Saladin

public class UnoWarMatch {
    /**
     * The first AI being used to play an UnoWar match.
     */
    private AI ai1;
    /**
     * The second AI being used to play an UnoWar match.
     */
    private AI ai2;

    /**
     * Creates a match between two AIs to be compared.
     * @param ai1 - an AI object.
     * @param ai2 - an AI object.
     */
    public UnoWarMatch(AI ai1, AI ai2) {
        this.ai1 = ai1;
        this.ai2 = ai2;
    }

    /**
     * Plays a single game of UnoWar between the two AI objects.
     * @return - a boolean true if AI1 wins, false if AI2 wins.
     */
    public boolean playGame() {
        Deck deck = new Deck();
        deck.shuffle();
        Hand ai1Hand = new Hand(deck, 5);
        Hand ai2Hand = new Hand(deck, 5);
        int ai1Wins = 0;
        int ai2Wins = 0;
        boolean firstToPlay = true;
        boolean turn;
        while (ai1Wins < 10 && ai2Wins < 10) {
            CardPile cardPile = new CardPile(deck.draw());
            while (true) {
                if (firstToPlay) {
                    turn = true;
                    if (ai1.getPlay(ai1Hand, cardPile) == null) {
                        break;
                    }
                    cardPile.play(ai1.getPlay(ai1Hand, cardPile));
                    ai1Hand.remove(cardPile.getTopCard());
                    turn = false;
                    if (ai2.getPlay(ai2Hand, cardPile) == null) {
                        break;
                    }
                    cardPile.play(ai2.getPlay(ai2Hand, cardPile));
                    ai2Hand.remove(cardPile.getTopCard());
                } else {
                    turn = false;
                    if (ai2.getPlay(ai2Hand, cardPile) == null) {
                        break;
                    }
                    cardPile.play(ai2.getPlay(ai2Hand, cardPile));
                    ai2Hand.remove(cardPile.getTopCard());
                    turn = true;
                    if (ai1.getPlay(ai1Hand, cardPile) == null) {
                        break;
                    }
                    cardPile.play(ai1.getPlay(ai1Hand, cardPile));
                    ai1Hand.remove(cardPile.getTopCard());
                }
            }
            if (turn) {
                ai2Wins++;
                firstToPlay = false;
            } else {
                ai1Wins++;
                firstToPlay = true;
            }
        }
        return ai1Wins == 10;
    }

    /**
     * Plays nTrials UnoWar games, and gives in decimal form the percent AI1 won.
     * @param nTrials - an int representing the number of games to be played by AIs
     * @return - a double between 0-1 that shows percentage of games AI1 won.
     */
    public double winRate(int nTrials) {
        double wins = 0;
        for (int i = 0; i < nTrials; i++) {
            if (playGame()) {
                wins++;
            }
        }
        return wins / nTrials;
    }
}
