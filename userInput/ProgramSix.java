package userInput;
import java.util.Scanner;

public class ProgramSix {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("This is a project of user Input");
        System.out.println("");
        
        System.out.println("Enter The Following Details for the form");
        System.out.println("");

        System.out.print("Enter Your First Name :");
        String firstName = sc.next();
        sc.nextLine();

        System.out.print("Enter Your Last Name :");
        String lastName = sc.next();
        sc.nextLine();

        System.out.print("Enter Your DOB : ");
        String dob = sc.nextLine();

        System.out.print("Mention Your Education Qualification : ");
        String education = sc.nextLine();

        System.out.println("");
        System.out.println("Check Your Filled Details : ");
        System.out.println("Your Name is : " + firstName + " " + lastName);
        System.out.println("Your Date of birth (DOB) is : " + dob );
        System.out.println("Your education Qualification is :" + education);

        sc.close();
    }
    
}
