package CodingChallenges;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a= sc.nextLine();
        String Rev ="";
        int len=a.length();
        for( int i=(len-1);i>=0;i--)
        {
            Rev=Rev +a.charAt(i);
        }
        System.out.println(Rev);
    }
}
