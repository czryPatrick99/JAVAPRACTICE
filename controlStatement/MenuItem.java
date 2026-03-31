package controlStatement;

import java.util.Scanner;

public class MenuItem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;

        System.out.println("--- Welcome To Java Hotel & Restaurant ---");
        System.out.println(" ");
        System.out.println("====MENU ITEM====PRICE====");
        System.out.println("[1] Coke[500 ML]  90 Rs");
        System.out.println("[2] Chowmin       60 Rs");
        System.out.println("[3] Steam MoMo    130 Rs");
        System.out.println("[4] Egg MoMo      120 Rs");

        System.out.print("Entre Your Choice : ");
        option = sc.nextInt();


        if(option == 1){
            System.out.println(" The Coke[500 ML] Has Been ordered succesfully ");
        }
        else if(option == 2){
            System.out.println(" The Chowmin Has Been Ordered Succesfully ");
        }
        else if(option == 3){
            System.out.println(" The Steam MoMo Has Been ordered Successfully ");
        }
        else if(option == 4){
            System.out.println(" The Egg MoMo Has Been ordered Successfully ");
        }
        else{
            System.out.println("Invalid Option! Please Enter a Valid Option.");
        }
        sc.close();
    }
    
}
