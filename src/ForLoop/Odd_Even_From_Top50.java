package ForLoop;

public class Odd_Even_From_Top50 {
    public static void main(String[] args) {
        for (int i = 0; i <50 ; i++) {
            if(i%2==0){
                System.out.println("Even ->" +i);
            }
            else{
                System.out.println("Odd ->"+i);
            }
        }
    }
}
