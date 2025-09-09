package CodingChallenges;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String reversal ="";
        int strLength = a.length();
        for ( int i= (strLength-1); i>=0; i--) {
            reversal = reversal + a.charAt(i);
        }
        if (a.equals(reversal)){
            System.out.println(a + "is a palindrome string");
        }
        else{
            System.out.println(a +  "is  not a palindrome string");
        }

    }
}
