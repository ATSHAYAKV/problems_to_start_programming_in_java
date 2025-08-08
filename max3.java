import java.util.Scanner;
class max3{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1,n2,n3;
        System.err.println("Enter the three numbers");
        n1= s.nextInt();
        n2 = s.nextInt();
        n3= s.nextInt();
        if(n1>n2){
            if(n1>n3){
                System.out.println("Maximum:"+n1);
            }
        }else{
            if(n2>n1 && n2>n3){
                System.out.println("Maximum:"+n2);
            }else{
                System.err.println("Maximum:"+n3);
            }
        }
    }
}