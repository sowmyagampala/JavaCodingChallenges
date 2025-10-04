package CodingChallenges;

public class MaximumNumberIn3NumbersUsingTernary {
    public static void main(String[] args) {
        int a=123,b=34,c=89;
        int  result = a>b ? (a>c ? a: c):(b>c ? b:c);
        System.out.println(result);
    }
}
