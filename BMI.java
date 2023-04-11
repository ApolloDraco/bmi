/* 
 *  Description: A program for computing the body mass index (BMI)
 *  The user enters weight, feet, and inches instead of just inches and then computes BMI 
*/

import java.util.Scanner;

public class BMI {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        // Input validation for weight
        double weight;
        do {
            System.out.print("Enter weight in pounds: ");
            weight = input.nextDouble();
            if (weight < 0) {
                System.out.println("Weight cannot be negative. Please enter a positive value.");
            }
        } while (weight < 0);

        // Input validation for height
        double height;
        do {
            System.out.print("Enter height in inches: ");
            height = input.nextDouble();
            if (height <= 0) {
                System.out.println("Height must be greater than zero. Please enter a valid value.");
            }
        } while (height <= 0);

        // Calculate BMI and format output
        double BMI = weight * 0.45359237 / (height * 0.0254 * height * 0.0254);
        System.out.printf("Body Mass Index is %.2f", BMI);
    }
}
