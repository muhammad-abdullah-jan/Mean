package mean;
import java.util.Scanner;

public class Mean5
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of terms
        System.out.print("Enter the number of terms you want to find the mean for: ");
        int n = scanner.nextInt();

        // Create an array to store the terms
        int[] X = new int[n];
        int sum = 0;

        // Input loop to get the terms from the user and calculate the sum
        for (int i = 0; i < n; i++) {
            System.out.print("Enter term " + (i + 1) + ": ");
            X[i] = scanner.nextInt();
            sum += X[i];
        }

        // Calculate and display the mean
        double mean = (double) sum / n;
        System.out.println("Mean of " + n + " terms is: " + mean);

        // Close the scanner
        scanner.close();
    }
}
