import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

  public static void main(String[] args) {
    Random rando = new Random();
    Scanner sc = new Scanner(System.in);
    int randomNumber = rando.nextInt(100) + 1;
    int tryCount = 0;
    while(true) {
      System.out.println("Enter your guess between (1-100):");
      int playerGuess = sc.nextInt();
      tryCount++;
      if (playerGuess == randomNumber) {
        System.out.println("Correct Guess you won");
        System.out.println("you have taken " + tryCount + " tries");
        break;
      }
      else if(randomNumber > playerGuess) {
        System.out.println("No The number is lower. Guess once again.");
      }
      else {
        System.out.println("No The number is higher. Guess once again.");
      }
    }
    sc.close();
}
}