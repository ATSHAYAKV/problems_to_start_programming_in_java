import java.util.Scanner;
class MaximumElementInArray{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int arr[];
        arr = new int[10];
        System.err.println("Enter the array 10 elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int i =0;
        int max = arr[0];
        while(i<arr.length){
            if(max >arr[i]){
                i++;
                }
            else{
                max=arr[i];
                i++;
                }
        }
        System.out.println("The max element in the array"+max);
    }
}