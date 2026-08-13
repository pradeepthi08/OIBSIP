import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int totalWins = 0;
        boolean playAgain = true;

        System.out.println("===== NUMBER GUESSING GAME =====");

        while (playAgain) {

            int randomNumber = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 7;
            boolean guessedCorrectly = false;

            System.out.println("\nI have selected a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {

                System.out.print("\nEnter your guess: ");
                int guess = scanner.nextInt();

                attempts++;

                if (guess == randomNumber) {
                    guessedCorrectly = true;
                    totalWins++;

                    System.out.println("Correct!");
                    System.out.println("You guessed the number in " + attempts + " attempts.");
                    break;
                }
                else if (guess > randomNumber) {
                    System.out.println("Too High!");
                }
                else {
                    System.out.println("Too Low!");
                }

                System.out.println("Attempts used: " + attempts);
                System.out.println("Attempts left: " + (maxAttempts - attempts));
            }

            if (!guessedCorrectly) {
                System.out.println("\nYou Lost!");
                System.out.println("The correct number was: " + randomNumber);
            }

            System.out.println("\nTotal Wins: " + totalWins);

            System.out.print("\nDo you want to play again? (yes/no): ");
            String choice = scanner.next();

            if (!choice.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        System.out.println("\nThank you for playing!");
        scanner.close();
    }
}