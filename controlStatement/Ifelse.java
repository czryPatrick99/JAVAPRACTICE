package controlStatement;
import java.util.Scanner;
public class Ifelse {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;

        System.out.print("Enter Your First Number : ");
        number1 = sc.nextInt();
        System.out.print("Enter Your Second Number :");
        number2 = sc.nextInt();
        System.out.print("Enter Your First Number : ");
        number3 = sc.nextInt();
        System.out.print("Enter Your Fourth Number : ");
        number4 = sc.nextInt();

        if(number1 > number2 && number1 > number3 && number1 > number4){
            System.out.println("First Number Entered IS the GREATEST amoung All : " + number1);
        }
        if(number2 > number1 && number2 > number3 && number2 > number4){
            System.out.println("Second Number You Entered is the GREATEST amoung ALL : ");
        }
        if(number3 > number2 && number3 > number2 && number1 > number4){
            System.out.println("Third Number You Entered is the GREATEST amoung ALL : " + number3);
        }
        if(number1 > number2 && number1 > number3 && number1 > number4){
            System.out.println("Fourth Number You Entered is the GREATEST amoung ALL : + Number4");
        }
        
        sc.close();
    }
}
