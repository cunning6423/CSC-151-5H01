package bugged_02_cunninghamgabriel;


 /* This program...      //Your Block COMMENT Here  ////////////////////////////
 * 
 *
 */
import java.util.Scanner; 

public class Bugged_02_CunninghamGabriel{
    public static void main(String[] args) 
   {
        Scanner keyboard = new Scanner(System.in);
        double dollars, eurosPerDollar, grossEuros;
        double rate = 0.92 ,fee = 10 , netEuros;
        
        System.out.println("Welcome to the Dollars to Euros Converter.\n");            
        System.out.print("How many dollars do you want to convert? ");        
        dollars = keyboard.nextDouble();        
        System.out.print("What is the euros-per-dollar exchange rate? ");        
        eurosPerDollar = keyboard.nextDouble();        
        grossEuros = dollars * eurosPerDollar;        
        System.out.println(dollars + " Dollars => " + grossEuros + " Gross Euros.");
        System.out.print("\nWhat is the euros-per-dollar Fee Percentage % ? ");        
        rate = keyboard.nextDouble();     
        fee = grossEuros * rate/100;
        netEuros = grossEuros - fee;
        System.out.println(dollars + " \tDollars\n " + 
                eurosPerDollar + " \tEuros Per Dollar Exchange Rate\n" +
                grossEuros + " \tGross Euros\n" + rate + " \tFee Percentage %\n" +
                fee + " \tFee in Euros\n" + netEuros + " \tNet Euros\n");        
        
    }    
}
