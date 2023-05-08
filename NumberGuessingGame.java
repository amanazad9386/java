import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[]args){
        Random rand = new Random();
        Scanner sc =new Scanner(System.in);
        int randomNumber = rand.nextInt(100)+1;
        int tryCount=0;
        while(true){
            System.out.println("Enter your guess (1-100) : ");
            int playerGuess = sc.nextInt();
            tryCount++;
            if(playerGuess == randomNumber){
                System.out.println("correct Guess");
                System.out.println("Number of Attempts "+tryCount );
                break;
            }
            else if(randomNumber > playerGuess){
                System.out.println("your Number is smaller than generated random number");
            }
            else{
                System.out.println("your number is bigger than generated random number ");
            }
        }
        sc.close();

    }
    
}

