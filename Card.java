package student;
//Reese Saladin

public class Card {
    /**
     * an int attribute representing a Card's rank, or value.
     */
    private int rank;

    /**
     * an int attribute representing a Card's suit.
     * 1 = Spades, 2 = Hearts, 3 = Clubs, 4 = Diamonds.
     */
    private int suit;

    /**
     * Creates a new Card object.
     * @param rank - the card's rank, or number value.
     * @param suit - the card's suit (1 = Spades, 2 = Hearts, 3 = Clubs, 4 = Diamonds).
     */
    public Card(int rank, int suit) {
        if (rank > 13 || rank < 1 || suit < 1 || suit > 4) {
            System.out.println("Invalid Card");
            this.rank = 1;
            this.suit = 1;
        } else {
            this.rank = rank;
            this.suit = suit;
        }
    }

    /**
     * Gets an int representing the Rank of Card object.
     * @return an int representing the Card's number rank.
     */
    public int getRankNum() {
        return rank;
    }

    /**
     * Gets a String representing the Rank of Card object.
     * @return a String representing the Name of the card's rank.
     */
    public String getRankName() {
        if (rank == 1) {
            return "Ace";
        } else if (rank == 2) {
            return "Two";
        } else if (rank == 3) {
            return "Three";
        } else if (rank == 4) {
            return "Four";
        } else if (rank == 5) {
            return "Five";
        } else if (rank == 6) {
            return "Six";
        } else if (rank == 7) {
            return "Seven";
        } else if (rank == 8) {
            return "Eight";
        } else if (rank == 9) {
            return "Nine";
        } else if (rank == 10) {
            return "Ten";
        } else if (rank == 11) {
            return "Jack";
        } else if (rank == 12) {
            return "Queen";
        } else {
            return "King";
        }
    }

    /**
     * Gets a String representing the Suit of Card object.
     * @return - A String representing the Card's suit.
     */
    public String getSuitName() {
        if (suit == 1) {
            return "Spades";
        } else if (suit == 2) {
            return "Hearts";
        } else if (suit == 3) {
            return "Clubs";
        } else {
            return "Diamonds";
        }
    }

    /**
     * Print's the Card object's Rank name and Suit name.
     * @return a String representing the card's rank and suit.
     */
    public String toString() {
        return this.getRankName() + " of " + this.getSuitName();
    }

    /**
     * Tests whether this Card is equal to other Card (Same rank and suit).
     * @param other - a Card object.
     * @return - true if this and other have equal rank and suit, false otherwise.
     */
    public boolean equals(Object other) {
        if (other instanceof Card) {
            return this.rank == ((Card) other).rank && this.suit == ((Card) other).suit;
        }
        return false;
    }
}
