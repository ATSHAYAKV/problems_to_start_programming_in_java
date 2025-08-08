import java.util.Scanner;
class ATM{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int deposit , withdraw ;
        int balance = 1000;
        int choice;
        do{
        System.out.println("-----ATM-----"); 
        System.out.println("Choose 1 - check balance"); 
        System.out.println("Choose 2 - Deposit");
        System.out.println("Choose 3 - Withdraw");
        System.out.println("Choose 4 - Exit"); 
        System.out.println("Enter your choice");
        choice = s.nextInt();
        switch (choice) {
                
            case 1:
                    System.out.println("Your balance: "+balance);
                    break;
                case 2:
                    System.out.println("Enter the Deposit amount:");
                    deposit = s.nextInt();
                    if(deposit>0){
                        deposit  = balance+deposit;
                        balance = deposit;
                        System.out.println("The total balance:"+ deposit);
                    break;
                    }
                    else{
                        System.out.println("Invalid deposit amount");
                    break;
                    } 
                case 3:
                    System.out.println("Enter the Withdrawl amount");
                    withdraw = s.nextInt();
                    if(withdraw>=balance){
                        System.out.println("Invalid or Insufficent amount");
                    break;
                    }else{
                    withdraw = balance - withdraw;
                    balance = withdraw;
                    System.out.println("The total balance:"+withdraw);
                        break;
                }
                case 4:
                    System.out.println("Thankyou , Exiting...");
                } 
        }while(choice!=4);

    }
}