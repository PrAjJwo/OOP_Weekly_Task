
import java.util.Scanner;
import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Step 1: Prompt the user for the number of sides for two dice
        System.out.print("How many sides does die 1 have?  ");
        int sides1 = scanner.nextInt();
        System.out.print("How many sides does die 2 have?  ");
        int sides2 = scanner.nextInt();

        // Step 2: Roll the dice three times
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < 3; i++) {
            int roll1 = random.nextInt(sides1) + 1;
            int roll2 = random.nextInt(sides2) + 1;
            sum1 += roll1;
            sum2 += roll2;
            System.out.println("Roll " + (i + 1) + ": Die 1: " + roll1 );
            System.out.println("Roll " + (i + 1) + ", Die 2: " + roll2);
        }

        // Step 3: Output the sum and average for each die
        double average1 = (double) sum1 / 3;
        double average2 = (double) sum2 / 3;
        System.out.println("Sum for Die 1: " + sum1 + ", Average for Die 1: " + average1);
        System.out.println("Sum for Die 2: " + sum2 + ", Average for Die 2: " + average2);

        scanner.close();
    }
}