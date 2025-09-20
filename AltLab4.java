// Alternative Interview Question for Lab 4
import java.util.Scanner; // Import the Scanner class for user input
import java.util.Random;   // Import Random for random sequence generation

public class AltLab4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);   // Create Scanner object for input
    
    //Section A: Generate (n) Random Numbers
    System.out.print("Number? ");             // Prompt the user for input
    int num = input.nextInt();                // Read an integer from user input

    Random rand = new random();                // Create Random object to generate random characters
    StringBuilder seq = new StringBuilder();   // Create StringBuilder to build the random sequence
    for (int i = 0; i < num; i++) {            // Loop (n) times to generate (n) random characters
            if (rand.nextBoolean()) {          // Each character generated is randomly chosen using rand.nextBoolean()
                seq.append((char)('A' + rand.nextInt(26))); // Uppercase letter
            } else {
                seq.append((char)('a' + rand.nextInt(26))); // Lowercase letter
            }
        }
    
    System.out.println(seq);                   // Output random sequence
  }
}
