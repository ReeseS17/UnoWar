package student;
//Reese Saladin

public class Tournament {
    /**
     * Plays a Tournament between every AI.
     * @param args - a String that represents main's arguments.
     */
    public static void main(String[] args) {
        AI regular = new AI();
        AI smallest = new SmallestCardAI();
        AI biggest = new BiggestCardAI();

        UnoWarMatch regularRegular = new UnoWarMatch(regular, regular);
        System.out.println(regular + " vs. " + regular + " winRate: " + regularRegular.winRate(10000));

        UnoWarMatch regularSmallest = new UnoWarMatch(regular, smallest);
        System.out.println(regular + " vs. " + smallest + " winRate: " + regularSmallest.winRate(10000));

        UnoWarMatch regularBiggest = new UnoWarMatch(regular, biggest);
        System.out.println(regular + " vs. " + biggest + " winRate: " + regularBiggest.winRate(10000));

        System.out.println();

        UnoWarMatch smallestRegular = new UnoWarMatch(smallest, regular);
        System.out.println(smallest + " vs. " + regular + " winRate: " + smallestRegular.winRate(10000));

        UnoWarMatch smallestSmallest = new UnoWarMatch(smallest, smallest);
        System.out.println(smallest + " vs. " + smallest + " winRate: " + smallestSmallest.winRate(10000));

        UnoWarMatch smallestBiggest = new UnoWarMatch(smallest, biggest);
        System.out.println(smallest + " vs. " + biggest + " winRate: " + smallestBiggest.winRate(10000));

        System.out.println();

        UnoWarMatch biggestRegular = new UnoWarMatch(biggest, regular);
        System.out.println(biggest + " vs. " + regular + " winRate: " + biggestRegular.winRate(10000));

        UnoWarMatch biggestSmallest = new UnoWarMatch(biggest, smallest);
        System.out.println(biggest + " vs. " + smallest + " winRate: " + biggestSmallest.winRate(10000));

        UnoWarMatch biggestBiggest = new UnoWarMatch(biggest, biggest);
        System.out.println(biggest + " vs. " + biggest + " winRate: " + biggestBiggest.winRate(10000));

    }
}
