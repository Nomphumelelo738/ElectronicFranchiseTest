/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class RunApplication {
    
}
/*package Question2;*/
//<editor-fold defaultstate="collapsed" desc="comment">
/*import java.util.Scanner;*/
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="comment">
/*public class RunApplication {*/
//</editor-fold>
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the beverage type"); 
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");
        System.out.print("Choice: ");
        
        int choice = Integer.parseInt(scanner.nextLine().trim());

        String consoleType = "";
        switch (choice) {
            case 1: consoleType = "PS5"; break;
            case 2: consoleType = "XBOX"; break;
            case 3: consoleType = "SWITCH"; break;
            default: 
                System.out.println("Invalid choice. Defaulting to PS5.");
                consoleType = "PS5";
        }

        System.out.print("Enter the store: ");
        String storeName = scanner.nextLine();

        System.out.print("Enter the total sales of " + consoleType + " consoles for " + storeName + ": ");
        int totalSales = Integer.parseInt(scanner.nextLine().trim());

  

       

        scanner.close();
    }
