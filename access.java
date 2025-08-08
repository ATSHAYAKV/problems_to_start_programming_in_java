import java.util.Scanner;
class access{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        boolean isStudent;
        boolean hasId;
        String option;
        String option2 ;
        System.out.println("Tell whether you are Student :(yes/no)");
        option = (String)s.next();
        System.out.println("Tell whether you are Student :(yes/no)");
        option2 = (String)s.next();
        if(option.equals("yes")){
            isStudent = true;
        }else{
            isStudent = false;
        }
        if(option2.equals("yes")){
            hasId = true;
        }else{
            hasId = false;
        }
        if(isStudent == true && hasId == true){
            System.err.println("Permission Granted");
        } 
        else{
            System.err.println("Not allowed");
        }
    }
}