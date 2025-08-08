
import java.util.Scanner;

class arrusingfor{
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements");
        for(int i =0;i<size;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("The array elements");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
         
    }
}