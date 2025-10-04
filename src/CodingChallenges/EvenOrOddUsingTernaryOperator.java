package CodingChallenges;

import java.net.StandardSocketOptions;
import java.sql.SQLOutput;

public class EvenOrOddUsingTernaryOperator {
    public static void main(String[] args) {
        int a=123;
        String result =(a%2==0)? "Even ":"Odd";
        System.out.println(result);
    }
}
