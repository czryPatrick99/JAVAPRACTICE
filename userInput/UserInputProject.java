package userInput;
import java.util.Scanner;
public class UserInputProject {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("This is a project to Calculate the area of a Rectangle");
        System.out.println("");
        double width = 0;
        double height = 0;
        double area = 0;

        System.out.println("Wellcome to our area calculator");
        System.out.println("");
        System.out.print("Enter the width of the rectangle : ");
        width = sc.nextDouble();
        System.out.print("Enter the height of the rectangle : ");
        height = sc.nextDouble();
        area = width * height;
        System.out.println("The area of the rectangle is : " + area);
        sc.close();
    }
}
