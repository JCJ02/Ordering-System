/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordering_system;

//Imports
import java.util.Scanner;

public class Ordering_System {
    
 
    // Initialize global variables
    public static int mealQuantity, drinkQuantity, chooseMeals, chooseDrinks, again;
    public static double mealPrice, drinkPrice, total_mealPrice, total_drinkPrice, total_price;
    public static String options, receipt, orderAgain;
    
    
    public static void greetings() {
        System.out.println("+====================================================+");
        System.out.println("|                                                    |");
        System.out.println("|                      Welcome                       |");
        System.out.println("|                        To                          |");
        System.out.println("|                JACOBE's RESTAURANT                 |");
        System.out.println("|                                                    |");
    }

    public static void menu() {
        // Menu
        
        greetings();
        
        System.out.println("+====================================================+");
        System.out.println("|                                                    |");
        System.out.println("|                       MENU                         |");
        System.out.println("|                                                    |");
        System.out.println("|       MEALS                             PRICE      |");
        System.out.println("| 1. PARES BAGNET                     ₱45.00 PESOS   |");
        System.out.println("| 2. PARES BEEF                       ₱45.00 PESOS   |");
        System.out.println("| 3. PARES BAGNET w/RICE              ₱65.00 PESOS   |");
        System.out.println("| 4. PARES BEEF w/RICE                ₱65.00 PESOS   |");
        System.out.println("| 5. CHICKEN MAMI w/RICE              ₱65.00 PESOS   |");
        System.out.println("| 6. TAPSILOG                         ₱40.00 PESOS   |");
        System.out.println("| 7. LONGSILOG                        ₱40.00 PESOS   |");
        System.out.println("| 8. HOTSILOG                         ₱40.00 PESOS   |");
        System.out.println("| 9. TOCILOG                          ₱40.00 PESOS   |");
        System.out.println("| 10. PORKSILOG                       ₱45.00 PESOS   |");
        System.out.println("| 11. EXIT                                           |");
        System.out.println("|                                                    |");
        System.out.println("|      DRINKS                            PRICE       |");
        System.out.println("| 1. ICED TEA 1 CUP                   ₱10.00 PESOS   |");
        System.out.println("| 2. COCA-COLA 1.5 LITERS             ₱65.00 PESOS   |");
        System.out.println("| 3. ROYAL 1.5 LITERS                 ₱65.00 PESOS   |");
        System.out.println("| 4. SPRITE 1.5 LITER                 ₱65.00 PESOS   |");
        System.out.println("| 5. ICE CUBE 1 BAG                   ₱15.00 PESOS   |");
        System.out.println("| 6. EXIT                                            |");
        System.out.println("|                                                    |");
        System.out.println("+====================================================+"); 
        
    }
    
    
    
    public static void orderMeals() {
        
        menu();
        
        // Instantiate scanner
        Scanner scanner = new Scanner(System.in);
          
        System.out.println("\nGOOD DAY! Ma'am/Sir!\n");
        
        System.out.println("Instruction: Choose your order in MEALS only.");
        System.out.print("What is/are your order Ma'am/Sir? ");
        chooseMeals = scanner.nextInt();

        System.out.print("How many order do you want Ma'am/Sir? ");
        mealQuantity = scanner.nextInt();
        
        if(chooseMeals == 11) {
            System.out.println("\nTHANK YOU!\n");
            System.exit(0);
            
        }

        
        switch(chooseMeals) {
            case 1:
                mealPrice = 45.00;
                break;
            case 2: 
                mealPrice = 45.00;
                break;
            case 3: 
                mealPrice = 65.00;
                break;
            case 4:
                mealPrice = 65.00;
                break;
            case 5:
                mealPrice = 65.00;
                break;
            case 6:
                mealPrice = 40.00;
                break;
            case 7:
                mealPrice = 40.00;
                break;
            case 8:
                mealPrice = 40.00;
                break;
            case 9:
                mealPrice = 40.00;
                break;
            case 10:
                mealPrice = 45.00;
                break;           
            default:
                if(chooseMeals < 11) {
                    System.out.println("INVALID ORDER!!!");
                }
                break;
           
        }
        
        orderDrinks();
        orderAgain();
        receipts();
        
        
    }
    
    public static void orderDrinks() {
        
        // Instantiate scanner
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nDo you want drinks Ma'am/Sir? Type Y for YES or N for NO. ");
        options = scanner.nextLine();
        
        if(options.equalsIgnoreCase("Y")) {
            System.out.println("\nInstruction: Choose your order in DRINKS only.");
            System.out.print("What is/are your order Ma'am/Sir? ");
            chooseDrinks = scanner.nextInt();
            
            System.out.print("How many drinks do you want Ma'am/Sir? ");
            drinkQuantity = scanner.nextInt();
        
            switch(chooseDrinks) {
                case 1:
                    drinkPrice = 10.00;
                    break;
                case 2:
                    drinkPrice = 65.00;
                    break;
                case 3:
                    drinkPrice = 65.00;
                    break;
                case 4:
                    drinkPrice = 65.00;
                    break;
                case 5:
                    drinkPrice = 15.00;
                    break;
            }
        }else if(options.equalsIgnoreCase("N")) {
            //
        } else {
            System.out.println("INVALID INPUT!");
        }
 
    }
    
    public static void orderAgain() {
        
        //Instantiate scanner
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nDo you want to order again? Type Y for YES, and N for NO. ");
        orderAgain = scanner.nextLine();
        
        if(orderAgain.equalsIgnoreCase("Y")) {
            orderMeals();
            orderDrinks();
            receipts();
        } else if(orderAgain.equalsIgnoreCase("N")) {
            receipts();
            System.out.println("\nTHANK YOU!\n");
            System.exit(0);
        } else {
            System.out.println("INVALID INPUT!");
        }
        
        
        
    }
    
    public static void receipts() {
        
        //Instantiate scanner
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nDo you want receipt Ma'am/Sir? Type Y for YES or N for NO. ");
        receipt = scanner.nextLine();
        
        if(receipt.equalsIgnoreCase("Y")) {
            
            // Formula        
            total_mealPrice = mealPrice * mealQuantity;
            total_drinkPrice = drinkPrice * drinkQuantity;
            total_price = total_mealPrice + total_drinkPrice;
            
            
            
            System.out.println("\n+=====================================+");
            System.out.println("                                       ");
            System.out.println("                RECEIPT                ");
            System.out.println("\n        MEALS                        ");
            System.out.println("        Price: " + mealPrice);
            System.out.println("        Quantity: " + mealQuantity);
            System.out.println("        Total Meal Price: " + total_mealPrice);
            System.out.println("\n        DRINKS                       ");
            System.out.println("        Price: " + drinkPrice);
            System.out.println("        Quantity: " + drinkQuantity);
            System.out.println("        Total Drinks Price: " + total_drinkPrice);
            System.out.println("\n        Total Price: " + total_price);
            System.out.println("                                       ");
            System.out.println("+=====================================+\n");
     
            
        } else if(receipt.equalsIgnoreCase("N")) {
            System.out.println("\nTHANK YOU!\n");
            System.exit(0);
        } else {
            System.out.println("\nINVALID RECEIPT!\n");
        }
        
    }
    
    
    public static void main(String[] args) {
        // Ordering System
        orderMeals();
        
        
    }
    
}
