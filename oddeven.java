class oddeven{
    public static void main(String args[]){
        int arr[] = {12,3,56,73,23,16,90,33,56};
        int even=0;
        int odd=0;
        for(int i =0; i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("The even numbers in the array  " + even);
        System.out.println("The even numbers in the array  " + odd);
        
    }
}