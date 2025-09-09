package CodingChallenges;

import java.util.Scanner;

public class SimpleCalculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Addition of two numbers:"+ (a+b));
        System.out.println("Subtraction of two numbers:"+ (a-b));
        System.out.println("Multiplication of two numbers:"+(a*b));
        System.out.println("Division of two numbers:"+(a/b));

    }
}
