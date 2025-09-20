// Part 3 of Lab Project
import java.util.Scanner;  // Import Scanner for user input
import java.util.Random;   // Import Random for random sequence generation

public class J104_4 {                       // Define class J104_4
  public static void main(String[] args) {  // Define main Method
    Scanner input = new Scanner(System.in); // Create Scanner object for input
    System.out.print("? ");                 // Prompt user for input
    String input = input.nextLine().toUpperCase().trim(); // Read input, convert to uppercase, and trim whitespace

    // Validate if input length is exactly 2 alphabet characters
    if (input.length() != 2 || !Character.isLetter(input.charAt(0)) || !Character.isLetter(input.charAt(1))) {
    // Check if input is not 2 and if the first and second characters are not letters
      System.out.println("Invalid Input: Try Again"); // Output error message
      return; // Exit the method early if invalid input
    }
    
    char c1 = input.charAt(0);  // First input character
    char c2 = input.charAt(1);  // Second input character

    Random rand = new random();               // Create Random object to generate random numbers
    StringBuilder seq = new StringBuilder();  // Create StringBuilder to build the random sequence
    for (int i = 0; i < 5; i++)               // Loop 5 times to generate 5 random uppercase letters
      // Generate a random number betweeb 0-25, add 'A' to get an uppercase letter, and append that letter to the sequence
      seq.append((char)('A' + rand.nextInt(26)));

    // Compare user input with generated sequence
    boolean first = c1 == seq.charAt(0);  // Compare first input to first character of sequence
    boolean second = c2 == seq.charAt(4); // Compare second input to last character of sequence

    // Output result based on comparisons
    if (first && second)
      System.out.println("Both are correct.");
    else if (first)
      System.out.println("The first one is correct.");
    else if (second)
      System.out.println("The second one is correct.");
    else
      System.out.println("Both are wrong");
    
    // Output the generated sequence
    System.out.println("Generated sequence: " + seq);
  }
}
