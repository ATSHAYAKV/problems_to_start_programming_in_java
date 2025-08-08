import java.util.Scanner;

class prime{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number;
        System.out.println("Enter the number:");
        number = s.nextInt();
        boolean b = true;
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0){
                b=false;
            }
        }
         if(b){
                System.out.println("It is a prime number");
            }else{
                System.out.println("It is not a prime number");
            }

    }
}