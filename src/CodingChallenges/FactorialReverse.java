package CodingChallenges;

import java.util.Scanner;

public class FactorialReverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to which you want to find its factorial");
        if (!sc.hasNextInt())
        {
            System.out.println("Please enter a valid integer");
        }
        int number=sc.nextInt();
        if  (number<=0)
        {
            System.out.println("Enter a number other than zero");
        }
        else
        {
            int i=1;                                       //n=120 i  result  i=1;res=1; T I=2;RES=1;I=3;RES=2;
            int result=1;                                  //RES=6; I=4; RES=24;I=5; RESL=120;I=6
            while (result<number)
            {
                result=result *i;
                if(result==number)
                {
                    System.out.println(i);
                    return;
                }
                i++;
            }
            System.out.println("The entered number is not a correct factorial to any number ");
        }

    }
}
