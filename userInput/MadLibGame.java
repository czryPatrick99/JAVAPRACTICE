package userInput;
import java.util.Scanner;

public class MadLibGame {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String adjective1;
        String adjective2;
        String adjective3;
        String adjective4;
        
        String noun1;
        String noun2;
        String noun3;
        String noun4;

        String verb1;
        String Verb2;
        String verb3;
        String verb4;

        System.out.print("Enter an adjective: ");
        adjective1 = sc.nextLine();
        System.out.print("Enter another adjective: ");
        adjective2 = sc.nextLine();
        System.out.print("Enter a third adjective: ");
        adjective3 = sc.nextLine();
        System.out.print("Enter a fourth adjective: ");
        adjective4 = sc.nextLine();
        System.out.print("Enter a noun: ");
        noun1 = sc.nextLine();
        System.out.print("Enter another noun: ");
        noun2 = sc.nextLine();
        System.out.print("Enter a third noun: ");
        noun3 = sc.nextLine();
        System.out.print("Enter a fourth noun: ");
        noun4 = sc.nextLine();
        System.out.print("Enter a verb: ");
        verb1 = sc.nextLine();
        System.out.print("Enter another verb: ");
        Verb2 = sc.nextLine();
        System.out.print("Enter a third verb: ");
        verb3 = sc.nextLine();
        System.out.print("Enter a fourth verb: ");
        verb4 = sc.nextLine();

        System.out.println("=================================================");
        System.out.println("Here is your MadLib story: ");
        System.out.println("Once upon a time, there was a " + adjective1 + " " + noun1 + "." );
        System.out.println("who lived in a " + adjective2 + " " + noun2 );
        System.out.println("Every day, the " + noun1 + " would " + verb1 + " and " + verb3 + " with its " + adjective3 + " friends."); 
        System.out.println("One day, they decided to go on an adventure to find the legendary " + noun3 + "." );
        System.out.println("Along the way, they encountered a " + adjective4 + " " + noun4 + " who offered to help them.");
        System.out.println("Together, they " + Verb2 + " and " + verb4 + " until they finally found the " + noun3 + "." );
        System.out.println("It was a magical moment that they would never forget!");

sc.close();
    }
}
