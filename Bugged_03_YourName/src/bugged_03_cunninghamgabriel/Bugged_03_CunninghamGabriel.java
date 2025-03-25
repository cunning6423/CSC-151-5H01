package bugged_03_cunninghamgabriel;

/**
 * This program...      //Your Block COMMENT Here  ////////////////////////////
 * 
 *
 */ 
import java.util.Scanner;
public class Bugged_03_CunninghamGabriel{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Dollars to Euros Converter.\n"); 
        decideConvertor();
   }
       
    public static void exchangeToEuros(){
        Scanner keyboard = new Scanner(System.in);
        String choice = null;
        do{
               System.out.print("How many dollars do you want to convert?\nEnter: ");        
               double dollars = keyboard.nextDouble();
               System.out.print("\nWhat is the euros-per-dollar Fee Percentage % ?\nEnter: ");
               double rate = keyboard.nextDouble(); 
               double fee = dollars * (rate/100);
               double netDollars = dollars - fee;
               System.out.print("\nWhat is the euros-per-dollar exchange rate?\nEnter: ");        
               double eurosPerDollar = keyboard.nextDouble();

               double netEuros = netDollars * eurosPerDollar;        
               System.out.print("\nThank you for using the Dollars to Euros Converter.\n");	
               System.out.print(dollars + " \tInital Dollars\n" + "------------------------------\n" +
                       rate + " \tFee Percentage %\n" +
                       fee + " \tFee in Dollars\n" + 
                       netDollars+ "\tDollars Before Conversion\n"+
                       eurosPerDollar + " \tEuros Per Dollar Exchange Rate\n");
               System.out.print("==============================\n");
               System.out.printf("%.2f",netEuros );
               System.out.print(" \tNet Euros\n");
               System.out.println("\nDo you want to run the program again?");
               choice = keyboard.next();

           }
           while(choice.equalsIgnoreCase("Yes"));{
               System.out.println("\nCongratulations! You have converted to Euros!");        
           }  
 }
    public static void exchangeToDollars(){
        Scanner keyboard = new Scanner(System.in);
        String choice = null;
        do{
               System.out.print("How many Euros do you want to convert?\nEnter: ");        
               double euros = keyboard.nextDouble();
               System.out.print("\nWhat is the euros-per-dollar Fee Percentage % ?\nEnter: ");
               double rate = keyboard.nextDouble(); 
               double fee = euros * (rate/100);
               double netEuros = euros - fee;
               System.out.print("\nWhat is the dollar-per-euros exchange rate?\nEnter: ");        
               double dollarsPerEuro = keyboard.nextDouble();

               double netDollars = netEuros / dollarsPerEuro;        
               System.out.print("\nThank you for using the Dollars to Euros Converter.\n");	
               System.out.print(euros + " \tInital Dollars\n" + "------------------------------\n" +
                       rate + " \tFee Percentage %\n" +
                       fee + " \tFee in Dollars\n" + 
                       netEuros+ "\tEuros Before Conversion\n"+
                       dollarsPerEuro + " \tDollars Per Euros Exchange Rate\n");
               System.out.print("==============================\n");
               System.out.printf("%.2f",netDollars );
               System.out.print(" \tNet Dollars\n");
               System.out.println("\nDo you want to run the program again?");
               choice = keyboard.next();

           }
           while(choice.equalsIgnoreCase("Yes"));{
               System.out.println("\nCongratulations! You have converted to Dollars!");        
           }  
    }
    public static void noConversion(){
        System.out.println("Thank you for your patronage!\nWork with you soon");
    }
    // This is because i be stupid:
    public static void decideConvertor(){
        Scanner keyboard = new Scanner(System.in);
        int choice;
        System.out.println("Convert Dollars to Euros!\t(Enter 1)");
        System.out.println("Convert Euros to Dollars!\t(Enter 2)");
        System.out.println("Don't want to convert!\t\t(Enter 3)");
        System.out.print("Enter: ");
        choice = keyboard.nextInt();
        System.out.println();
        switch(choice){
            case 1: 
                exchangeToEuros();
                break;
            
            case 2: 
                exchangeToDollars();
                break;
            case 3:
                noConversion();
                break;
            
            default:
                System.out.println("Invalid input. Try Again");
                break;
        }
    }
    
    private static String next() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

