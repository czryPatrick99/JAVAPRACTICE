package arithmetic;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        double amountInUSD;
        double exchangeRate = 149.30; // Example exchange rate for USD to NPR
        double convertedAmount;

        System.out.println("Welcome to USD to NPR Currency Converter!");
        System.out.print(" Please enter the Amount you want to convert(USD): ");
        amountInUSD = sc.nextDouble();
        System.out.println("The Exchange Rate for USD to NPR is: " + exchangeRate);

        convertedAmount = amountInUSD * exchangeRate;

        System.out.println(" Performing Conversion");
        System.out.println("Converted Amount: " + convertedAmount);


        sc.close();
    }   
}
