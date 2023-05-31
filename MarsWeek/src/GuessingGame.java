import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public GuessingGame() {
//        Asks for the user’s name
//        Greets the user and prompts them to guess a number
//        Cycles through until the user guesses the right number
//        Ends when the user guesses the right number and displays the number of guesses that the user made
        Scanner scan = new Scanner(System.in);
        System.out.println("Greeting! Welcome to the guessing game!");

        System.out.println("\nWhat is your name? ");
        String name = scan.nextLine();

        System.out.println("\nWelcome " + name + "!!");

        Random rand = new Random();
        int number = rand.nextInt(100);

        boolean correct = false;
        int tries = 0;
        while (!correct) {
            System.out.println("\nWhat is your guess from 1-100?");
            String guess = scan.nextLine();
            tries++;
            //edge cases
            try {
                int i = Integer.parseInt(guess);
                if (i > 100) {
                    System.out.println("You don't like to read huh? Guess from 1-100.");
                } else if (i == number) {
                    System.out.println("Congrats! You guessed it!");
                    correct = true;
                } else if (i < number) {
                    System.out.println("Guess higher");
                } else {
                    System.out.println("Guess Lower");
                }

            } catch (NumberFormatException e) {
                System.out.println("That's not an integer, try again");

            }

        }
        System.out.println("You guessed it in " + tries + " tries");
    }

}
