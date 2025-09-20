// Part 5 of Lab Project
import java.util.Scanner;  // Import Scanner for user input

public class J104_5 {                           // Define class J104_5
    public static void main(String[] args) {    // Define main Method
        Scanner input = new Scanner(System.in); // Create Scanner object for input

        System.out.print("x1: ");               // Prompt user for input
        double x1 = input.nextDouble();
        System.out.print("y1: ");
        double y1 = input.nextDouble();
        System.out.print("x2: ");
        double x2 = input.nextDouble();
        System.out.print("y2: ");
        double y2 = input.nextDouble();

        double dx = x2 - x1;                   // Calculate distance
        double dy = y2 - y1;
        double distance = Math.sqrt((dx * dx) + (dy * dy));
        double roundDistance = Math.round((distance * 100) / 100.0);
        int intDistance = (int) distance;

        String category;                       // Determine distance category
        if (distance < 5) {
            category = "Short Distance";
        } else if (distance <= 15) {
            category = "Medium Distance";
        } else {
            category = "Long Distance";
        }

        String quadrant;                       // Determine quadrant
        if (dx == 0 && dy == 0) {
            quadrant = String.format("at the same point as (%.2f, %.2f)", x1, y1);
        } else if (dx == 0) {
            quadrant = String.format("on the Y axis relative to (%.2f, %.2f)", x1, y1);
        } else if (dy == 0) {
            quadrant = String.format("on the X axis relative to (%.2f, %.2f)", x1, y1);
        } else if (dx > 0 && dy > 0) {
            quadrant = "Quadrant I";
        } else if (dx < 0 && dy > 0) {
            quadrant = "Quadrant II";
        } else if (dx < 0 && dy < 0) {
            quadrant = "Quadrant III";
        } else {
            quadrant = "Quadrant IV";
        }

        // Output results
        System.out.println("=======================================");
        System.out.printf("Distance between (%.2f, %.2f) and (%.2f, %.2f): %.2f (%d)\n", x1, y1, x2, y2, roundDistance, intDistance);
        System.out.printf("Integer part: (%d)\n", intDistance);
        System.out.printf("Category: %s\n", category);
        System.out.printf("Point (%.2f, %.2f) is in %s\n", x2, y2, quadrant);
    }
}
