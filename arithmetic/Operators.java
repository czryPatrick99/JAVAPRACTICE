package arithmetic;

public class Operators {
    public static void main(String [] args){
        int number1 = 10;
        int number2 = 20;


        int add = number1 + number2; // int number1 += number2;

        int subt = number1 - number2; // int number1-= number2;

        int divide = number2 / number1; // int number2 /= number1;

        int modls = number1 % number2; // int number1 %= number2;

        int multiply = number1 * number2; // int number1 *= number2;


        // Addition operation
        System.out.println("Addition of number1 (10) with number2(20) : " + add);

        // Subtraction operation
        System.out.println("Subtraction of number1 (10) with number2(20) : " + subt);


        // Multiplication operation
        System.out.println("Multiplication of number1 (10) with number2 (20) : " + multiply);

        // Division operation
        System.out.println("Division of number2 (20) with number1 (10) : " + divide);

        // Modules operation
        System.out.println("Reminder after division of number1 (10) with number1 (20) : " + modls);

        // Increment operation
        System.out.println("Increased value is : " + ++number2); //pre increment 

        System.out.println("Increased value is : " + number2++); //post increment


    }
    
}
