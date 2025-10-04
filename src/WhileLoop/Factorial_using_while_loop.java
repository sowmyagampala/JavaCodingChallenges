package WhileLoop;

import java.util.Scanner;

public class Factorial_using_while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to know the factorial");
        if (!sc.hasNextInt()) {
            System.out.println("You fool!! Int only");
        } else {
            int number = sc.nextInt();
            int fact = 1;
            if (number == 0) {
                System.out.println(fact);
            } else if (number < 0 || number > Integer.MAX_VALUE) {
                System.out.println("Input Out of range error");
            } else {

                int i = 1;
                while (i <= number) {
                    fact = fact * i;
                    i++;

                }
                System.out.println(fact);
            }
        }
    }
}

