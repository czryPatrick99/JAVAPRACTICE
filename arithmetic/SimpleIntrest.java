package arithmetic;
import java.util.Scanner;
public class SimpleIntrest {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double principalAmount; 
        double annualInterestRate; 
        int timeInYears; 

        System.out.print("Enter the principal amount: ");
        principalAmount = sc.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        annualInterestRate = sc.nextDouble();

        System.out.print("Enter the time (in years): ");
        timeInYears = sc.nextInt();

        // Calculate simple interest
        double simpleInterest = (principalAmount * annualInterestRate * timeInYears) / 100;

        System.out.println("Principal Amount: " + principalAmount);
        System.out.println("Annual Interest Rate: " + annualInterestRate + "%");
        System.out.println("Time: " + timeInYears + " years");
        System.out.println("Simple Interest: " + simpleInterest);

        sc.close();

    }
}
