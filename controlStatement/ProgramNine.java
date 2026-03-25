package controlStatement;

import java.util.Scanner;

public class ProgramNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;

        System.out.print("Enter your first number : ");
        number1 = sc.nextInt();
        System.out.print("Enter your Second number : ");
        number2 = sc.nextInt();

        if(number1 > number2){
            System.out.println("The First Number You typed " + number1 + " is greater than the secont number " + number2);
        }
        else{
            System.out.println("The Second Number You Typed " + number2 + " is greater than the First Number " + number1);
        }

        sc.close();

    }
}
