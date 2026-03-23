package userInput;
import java.util.Scanner; // From this import we are importing the scanner for the user input
public class ProgramFive {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); // This is the scanner object that we are creating to take the user input
        System.out.print("Tell us your name : ");
        String userName = sc.nextLine(); // This is the method that we are using to take the user input
        System.out.println("So you said your name is  " + userName);
        sc.close(); // This is the method that we are using to close the scanner object
    }
    
}
