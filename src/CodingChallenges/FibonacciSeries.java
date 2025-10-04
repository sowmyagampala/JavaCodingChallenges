package CodingChallenges;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number Till how many numbers u want me to print");
        int num=sc.nextInt();

        // num=10
        //0,1,1,2,3,5,8,13,21,34
        //r=0,i=1
        int  result=0;
        for (int i=1;i<=num; i++)
        {
           result= result+i;
        }



    }
}

