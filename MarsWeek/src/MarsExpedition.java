import java.util.HashMap;
import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition() throws InterruptedException {
        Scanner scan = new Scanner(System.in);

        boot();

        System.out.println("\nWhat is your name? ");
        String name = scan.nextLine();

        int team = teamSetup(name);
        String snack = snackChoice();
        String car = vehicle();

        System.out.println("Your name: " + name
                + "\nTeam Size: " + team
                + "\nSnack: " + snack
                + "\nVehicle: " + car);


        liftOffMessage();


    }

    public static void boot() throws InterruptedException {
        System.out.println("System Booting Up...");
        Thread.sleep(1000);

        System.out.println("\nSystem Boot Successfully");
        Thread.sleep(500);

        System.out.println("\nWelcome!");
    }

    public static int teamSetup(String name) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome " + name + " to the Expedition prep program! Are you ready to begin? \nType Y or N");
        String input = scan.nextLine();

        if (input.equalsIgnoreCase("Y")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else {
            System.out.println("Too bad you are team leader. You have to go");
        }

        System.out.println("\nHow much people do you want on your team?");
        int team = scan.nextInt();

        if (team > 2) {
            System.out.println("That's way to many people. We can only send 2 more members");
            team = 2;
        } else if (team < 2) {
            System.out.println("We need 2 members.");
            team = 2;
        } else if (team == 2) {
            System.out.println("That's a perfect sized team. Good job.");
        }

        return team;
    }

    public static String snackChoice() {
        Scanner scan = new Scanner(System.in);
        System.out.println("You are allowed to bring one snack with you. What do you want to bring?");
        String snack = scan.nextLine();

        System.out.println("Nice choice, you will be bringing a " + snack + " with you.");

        return snack;
    }

    public static String vehicle() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nPick a vehicle. Type the Character Choice ");
        HashMap<Character, String> cars = new HashMap<>();
        cars.put('A', "Mars Rover");
        cars.put('B', "Cyber Truck");
        cars.put('C', "Lamborghini");
        cars.put('D', "Mars Horse");
        cars.put('E', "Gary the Snail");
        cars.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
        String car = scan.nextLine().toUpperCase();
        char key = car.charAt(0);
        return cars.get(key);
    }

    public static void liftOffMessage() throws InterruptedException {
        System.out.println("\nBlast off in 5....");
        Thread.sleep(1000);
        System.out.println("4....");
        Thread.sleep(1000);
        System.out.println("3....");
        Thread.sleep(1000);
        System.out.println("2....");
        Thread.sleep(1000);
        System.out.println("1....");
        Thread.sleep(1000);
        System.out.println("0....");
        Thread.sleep(1000);
        System.out.println("Blast off!!!!!");
        Thread.sleep(1000);
    }

}
