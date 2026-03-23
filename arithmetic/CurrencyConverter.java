package arithmetic;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        double amountInUSD;
        double nplExchangeRate = 149.30; // Example exchange rate for USD to NPR
        double indExchangeRate = 82.50; // Example exchange rate for USD to INR
        double pakExchangeRate = 285.00; // Example exchange rate for USD to PKR
        double nprconvertedAmount;
        double indconvertedAmount;
        double pakconvertedAmount;

        System.out.println("Welcome to USD to NPR Currency Converter!");
        System.out.print(" Please enter the Amount you want to convert(USD): ");
        amountInUSD = sc.nextDouble();
        System.out.println("The Exchange Rate for USD to NPR is: " + nplExchangeRate);
        System.out.println("The Exchange Rate for USD to PKR is: " + pakExchangeRate);
        System.out.println("The Exchange Rate for USD to INR is: " + indExchangeRate);

        nprconvertedAmount = amountInUSD * nplExchangeRate;
        pakconvertedAmount = amountInUSD * pakExchangeRate;
        indconvertedAmount = amountInUSD * indExchangeRate;
        



        System.out.println(" Performing Conversion");
        System.out.println("Converted Amount For NPR: " + nprconvertedAmount);
        System.out.println("The Exchange Rate for USD to PKR is: " + pakExchangeRate);
        System.out.println("Converted Amount For PKR: " + pakconvertedAmount);
        System.out.println("The Exchange Rate for USD to INR is: " + indExchangeRate );
        System.out.println("Converted Amount For INR: " + indconvertedAmount);
        System.out.println("============================================================");
        System.out.println("Thank you for using the Currency Converter!");


        sc.close();
    }   
}
