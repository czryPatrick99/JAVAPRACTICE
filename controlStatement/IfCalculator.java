package controlStatement;
import java.util.Scanner;


public class IfCalculator {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        double input1 = 0;
        double input2 = 0;
        char symbol;

        System.out.print("Enter Your First Number : ");
        input1 = sc.nextDouble();
        System.out.print("Enter Your Second Number : ");
        input2 = sc.nextDouble();
        System.out.print("Enter the symbol you want to Perform (/, %, +, -, *) : ");
        symbol = sc.next().charAt(0);

        if(symbol == '/'){
            System.out.println("Division of " + input1 + " from " + input2 + " is : " + (input1 / input2));
        }
        else if(symbol == '%'){
            if(input2 == 0){
                System.out.println("Error, division by zero (0) is not avialible. Try Again ");
            }
            else{
            System.out.println("Reminder of " + input1 + " from " + input2 + " is : " + (input1 % input2));
            }
        }
        else if(symbol == '+'){
            System.out.println("Addition of " + input1 + " with " + input2 + " is : " + (input1 + input2));
        }
        else if(symbol == '-'){
            System.out.println("Subtraction of " + input1 + " from " + input2 + " is : " + (input1 - input2));
        }
        else if(symbol == '*'){
            System.out.println("Multiplication of " + input1 + " with " + input2 + "is : " + (input1 * input2));
        }
        else{
            System.out.println("Entre a valid symbol. " + symbol + " is Invalid!");
        }



        sc.close();
    }
    
}
