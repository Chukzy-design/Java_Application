import java.util.Scanner;

public class SumDifferenceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        // Accept 10 numbers from the user
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        int sum6to9 = numbers[5] + numbers[6] + numbers[7] + numbers[8];

        int sum4to10 = numbers[3] + numbers[4] + numbers[5] + numbers[6] + numbers[7] + numbers[8] + numbers[9];

        int difference = sum4to10 - sum6to9;

        // Display results
        System.out.println("Sum of 6th to 9th numbers: " + sum6to9);
        System.out.println("Sum of 4th to 10th numbers: " + sum4to10);
        System.out.println("Difference (Sum4to10 - Sum6to9): " + difference);

        input.close();
    }
}
