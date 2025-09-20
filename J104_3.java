// Part 2 of Lab Project
import java.util.Scanner; // Import the Scanner class for user input

public class J104_3 {                          // Create J104_3 class
  public static void main(String[] args) {     // Create main method
    Scanner input = new Scanner(System.in);    // Create Scanner object for input
    System.out.print("Day (1) or Time (2)? "); // Prompt the user for input
    int choice = input.nextInt();              // Read an integer from user input
    
    if (choice == 1) {                         // If the choice equals 1...
      System.out.print("Days? ");              // Prompt the user for days
      int num1 = input.nextInt();
      
      int years = num1 / 365;                  // Calculate years and months
      int months = (num1 % 365) / 30;
      int days = (num1 % 365) % 30;
      
      System.out.println("Your day is " + years + " " + months + " and " + days);
      
    } else if (choice == 2) {                  // Else if the choice equals 2...
      System.out.print("Seconds? ");           // Prompt the user for seconds
      int num2 = input.nextInt();
      
      int hours = num2 / 3600;                 // Calculate hours and minutes
      int minutes = (num2 % 3600) / 60;
      int seconds = (num2 % 3600) % 60;
      
      System.out.println("Your time is " + hours + " " + minutes + " and " + seconds);
      
    } else {                                   // Else output error
      System.out.println("Invalid Input");
    }
  }
}
