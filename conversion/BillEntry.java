package conversion;
import java.util.Scanner;
public class BillEntry {
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String productName;
    int price = 0;
    double sellPrice;

    int vat = 13;
    double vatAmount;
    double amount;
    


    System.out.println("Wellcome to our XYZ Store");
    System.out.println("");
    System.out.print("Enter Your Name of your Product : ");
    productName = sc.nextLine();
    System.out.print("Entre the price of Product : ");
    price = sc.nextInt();
    sellPrice = (double) price;

    System.out.println("To your Product : " + productName + " with the price : " + price + " we will add " + vat + "% GST" );
    amount = (sellPrice * vat)/100;
    vatAmount = (sellPrice + amount);
    System.out.println("The amount after GST is : " + vatAmount );

    sc.close();

}
    
}
