import java.util.Scanner;  // Needed for the Scanner class

/**
 * the first JAVA program for the semester 
 * 
 * modified by ---> Bhuwan Upadhyaya
 * date---->1/19/2024
 * 
 * 
 * This program calculates the user's gross pay.
 * First this program will ask user about the numbers of our worked 
 * 
 * Second the program will ask user for the payrate
 * after the program is run it will calculate the gross pay.


*/

public class Pay  // the class called public class is accessible from other class outside its package
{
   public static void main(String[] args)  //entry point for any java program. actual code goes inside the curly {}
   {
      // Create a Scanner object to read from the keyboard.
      Scanner keyboard = new Scanner(System.in);

      // Identifier declarations
      double hours;  // Number of hours worked
      double rate;   // Hourly pay rate
      double pay;    // Gross pay

      // Display prompts and get input.
      System.out.print("How many hours did you work? ");
      hours = keyboard.nextDouble();
      System.out.print("How much are you paid per hour? ");
      rate = keyboard.nextDouble();

      // Perform the calculations.
      if(hours <= 40)
         pay = hours * rate;
      else
         pay = (hours - 40) * (1.5 * rate) + 40 * rate; // regular pay plus + extra hours times extra pay rate.

      // Display results.
      System.out.println("You earned $" + pay);
   }
}