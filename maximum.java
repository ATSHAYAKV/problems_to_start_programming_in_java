import java.util.Scanner;
class maximum{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int arr[];
        arr = new int[10];
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
        System.out.println(max);
    }
}