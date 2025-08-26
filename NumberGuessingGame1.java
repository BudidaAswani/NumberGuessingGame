package NGG;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random random = new Random();
		int secretNumber = random.nextInt(100) + 1;
        int guess;
        int attempts;
        boolean again=true;
        System.out.println(" Welcome to the Number Guessing Game!");
        System.out.println(".....You have to try 10 attempts only to won the game.....");
        System.out.println("Guess a number between 1 and 100:");
        // Game loop
        while (again) {
        	attempts=1;
            attempts++;
        	for(int i=1;i<10;i++) {
        	System.out.print("Enter your guess: ");
            guess = s.nextInt();
            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try a higher number.");
            } else {
                System.out.println("Too high! Try a lower number.");
            }
            }

        if(attempts==10)
            {
            	System.out.println("Your attempts=10...\nYour attempts are completed...");
            	break;
            }
        System.out.println("If you want to play again enter true or false:");
        again=s.nextBoolean();
        
        }
        System.out.println("...Thank you for Playing...");
        s.close();
	}

}
