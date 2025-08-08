
import java.util.Scanner;

class grade{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = 5;
        int arr[] = new int [size];
        System.out.print("Enter the subject marks");
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        int sum =0;
        for(int i =0;i<size;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
        float Percentage = sum / size;
        if(Percentage>= 85){
            System.out.println("Grade A");
        }else if(Percentage>=65){
            System.out.println("Grade B");
        }else{
            System.out.println("Grade C");
        }

    }
}