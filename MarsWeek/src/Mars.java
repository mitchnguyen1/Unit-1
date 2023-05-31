public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String colonyName = "SpaceX City";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;

        //0.75 meals/person a day
        //2 days to land
        meals = meals - ((0.75 * shipPopulation) * 2);
        System.out.println("Meals left after landing: " + meals);

        //meals increase by 50%
        meals = (meals / 2) + meals;
        System.out.println("Meals after 50% increase: " + meals);

        //5 more babies joined
        shipPopulation += 5;

        String landingLocation = "The Hill";

        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain.");
        }

        landing = landingCheck(5);

        new GuessingGame();
    }


    public static boolean landingCheck(int minutesLeft) throws InterruptedException {
        for (int minute = 0; minute < minutesLeft; minute++) {
            if (minute % 2 == 0 && minute % 3 == 0) {
                System.out.println("Keep Center");
            } else if (minute % 2 == 0) {
                System.out.println("Right");
            } else if (minute % 3 == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }
}