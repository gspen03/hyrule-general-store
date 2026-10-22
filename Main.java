//import inventory.mushrooms.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        boolean loop = true;

        System.out.println("Hi! Welcome to the Hyrule General Store!");

        while(loop)
        {
            
            System.out.println("-----------------------");
            System.out.println("Please choose an option from our menu:");
            System.out.println("1. View Inventory");
            System.out.println("2. Exit");
            System.out.println("-----------------------");

            int choice = sc.nextInt();

            switch(choice) {
            case 1:
                System.out.print("Our inventory:\nMushrooms\n");
                break;
            case 2:
                System.out.println("See you next time!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice: please pick a number listed in the menu.");
            }

            System.out.println("Make another selection? (y/n)");
            String s = sc.next();

            loop = s.equalsIgnoreCase("y");
        }
        sc.close();
    }

}