import java.util.Random;
import java.util.Scanner;
public class Guess{
    public static void main(String[] args){
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int num1 = r.nextInt(100);
        while(true){
            System.out.println("Guess the number");
            int n1= s.nextInt();
            if(n1>num1){
                System.out.println("You enterd greater number");
            }else if(n1<num1){
                System.out.println("You enterd a smaller number");
            }
            if(num1==n1){
                System.out.println("Your have guess the number");
            }
        }
    }
        

}
