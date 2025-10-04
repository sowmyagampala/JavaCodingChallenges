package WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class while_Guessing_Game {
    public static void main(String[] args) {
        Random random =new Random();
        int guessTheNum=random.nextInt(100)+1;
        //System.out.println(guessTheNum);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int guess;
        int attempts=0;
        while(true)
        {
            if(!sc.hasNextInt()) {
                System.out.println("Enter an integer");
                sc.next();
                continue;
            }
                guess=sc.nextInt();
                attempts++;
            if(guess<1 || guess>100){
                System.out.println("enter a number within the range");
                continue;
            } else if (guess<guessTheNum)
            {
                System.out.println("too low!! guess high");
            }
            else if (guess>guessTheNum)
            {
                System.out.println("too high!! Guess low");
            }
            else
            {
                System.out.println("Correct!!! You guessed it right in" + attempts + "attempts");
            }

        }
    }

}
