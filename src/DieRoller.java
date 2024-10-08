import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean continueRolling = true;

        while (continueRolling) {
            System.out.printf("%-4s %-5s %-5s %-5s %-5s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------------------------");

            int rollCount = 0;
            int die1, die2, die3;

            do {
                rollCount++;
                die1 = random.nextInt(6) + 1; // Generates a number between 1 and 6
                die2 = random.nextInt(6) + 1;
                die3 = random.nextInt(6) + 1;

                int sum = die1 + die2 + die3;
                System.out.printf("%-4d %-5d %-5d %-5d %-5d%n", rollCount, die1, die2, die3, sum);
            } while (!(die1 == die2 && die2 == die3)); // Check for a triple

            System.out.println("You rolled a three: " + die1 + " " + die2 + " " + die3);
            System.out.print("Do you want to continue? (yes/no): ");
            String response = scanner.next();
            continueRolling = response.equalsIgnoreCase("yes");
        }

        scanner.close();
        System.out.println("Thank you!");
    }
}
