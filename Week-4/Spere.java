
import java.util.Scanner;

public class Spere {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the sphere
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Calculate the volume of the sphere
        double volume = (4 * Math.PI * Math.pow(radius, 3)) / 3;

        // Calculate the surface area of the sphere
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);

        // Print the volume and surface area of the sphere with four decimal places
        System.out.printf("Volume of the sphere: %.4f\n", volume);
        System.out.printf("Surface area of the sphere: %.4f\n", surfaceArea);
    }
}