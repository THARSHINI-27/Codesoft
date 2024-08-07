Package codsoft;
import java.util.Random;
import java.util.Scanner;

public class task1 {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Random random = new Random();
       int lowerBound = 1;
       int upperBound = 100;
       int maxAttempts = 5;
       int rounds = 0;
       int score = 0;
       boolean playAgain = true;

       while (playAgain) {
           int generatedNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
           int attempts = 0;
           boolean guessedCorrectly = false;

           System.out.println("ROUND " + (rounds + 1) + ":");
           System.out.println("Guess the number between " + lowerBound + " to " + upperBound );
           System.out.println("You have " + maxAttempts + " attempts.");

           while (attempts < maxAttempts && !guessedCorrectly) {
               System.out.print("Guess : ");
               int guess = scanner.nextInt();
               attempts++;

               if (guess < generatedNumber) {
                   System.out.println("Too low!");
               } else if (guess > generatedNumber) {
                   System.out.println("Too high!");
               } else {
                   System.out.println("Wow! your guess was right");
                   guessedCorrectly = true;
                   score++;
               }
           }

           if (!guessedCorrectly) {
               System.out.println("Sorry! you've used all your attempts.");
               System.out.println("correct number : " + generatedNumber);
           }

           System.out.println("Your current score: " + score);
           rounds++;

           System.out.print("Do you want to play again?");
           System.out.println(" (yes/no) ");
           String response = scanner.next();
           playAgain = response.equalsIgnoreCase("yes");
       }

       System.out.println("Game over. You played well " + rounds +"rounds and your final score is: " + score );
       scanner.close();
   }
}


