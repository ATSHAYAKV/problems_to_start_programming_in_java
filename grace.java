import java.util.Scanner;

class grace {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = 5;
        int arr[] = new int[size];
        int g = 0;
        int grace = 0;
        int totgrace = 0;

        System.out.print("Enter the  5 subject marks: ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        for (int i = 0; i < size; i++) {
            if (arr[i] > 30 && arr[i] <= 34) {
                g++;
                grace = 35 - arr[i];
                totgrace += grace;
            }
        }

        int finalTotal = sum + totgrace;
        System.err.println("Total Marks: "+sum);
        System.out.println("Total Marks (after grace): " + finalTotal);
        System.err.println("Grace marks for marks between 31 - 34");

        float percentage = (float) finalTotal / size;
        System.err.println("Your Percentage: " + percentage);

        if (g > 0) {
            System.err.println("Passed with grace marks");
        }
    }
}
