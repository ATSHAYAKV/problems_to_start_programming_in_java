import java.util.Scanner;
class search{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int arr[];
        arr = new int[5];
        for(int i =0;i<5;i++){
            arr[i]= s.nextInt();
        }
        int number = s.nextInt();
        int position=0;
        int i =0;
        while(i<arr.length){
            if(number!=arr[i]){
                i++;
            }else{
                position = i;
                i++;
            }
        }
        System.out.println(position);
    }
}