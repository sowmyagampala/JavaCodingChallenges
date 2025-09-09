package CodingChallenges;
import java.util.Scanner;

public class SumOfTheNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance=0;
        int b=scanner.nextInt();
        for (int i=1; i<=b; i++)
        {
            int a=scanner.nextInt();
            balance= a+balance;
        }
        System.out.println(balance);

    }
}
