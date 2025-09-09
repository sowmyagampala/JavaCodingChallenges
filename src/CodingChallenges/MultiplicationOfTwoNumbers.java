package CodingChallenges;

import java.util.Scanner;
public class MultiplicationOfTwoNumbers {
    public static void main(String[] args) {
        Scanner se=new Scanner(System.in);
        System.out.println("Enter the required number you want to multiply");
        int j=se.nextInt();
        for( int i=1; i<=10; i++)
        {
            System.out.println(j+ "*" +i+ "=" +i*j);
        }

        /*System.out.println("Hello Jaggu");
        System.out.println("Hi Chowlu");*/
    }
}
