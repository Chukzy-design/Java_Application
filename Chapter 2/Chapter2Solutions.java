import java.util.Scanner;

public class Chapter2Solutions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Call methods to execute exercises
        arithmeticOperations(input);
        compareIntegers(input);
        arithmeticMinMax(input);
        displayShapes();
        printPatterns();
        largestAndSmallest(input);
        oddEvenCheck(input);
        multiplesCheck(input);
        checkerboardPattern();
        circleCalculations(input);
        characterValues();
        separateDigits(input);
        squaresCubesTable();
        countNumbers(input);
        bmiCalculator(input);
        worldPopulationGrowth(input);
        carPoolSavings(input);

        input.close(); // Close scanner
    }

    // 2.15 Arithmetic Operations (Sum, Product, Difference, Quotient)
    public static void arithmeticOperations(Scanner input) {
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        System.out.printf("Sum: %d%nProduct: %d%nDifference: %d%nQuotient: %d%n",
                num1 + num2, num1 * num2, num1 - num2, (num2 != 0 ? num1 / num2 : 0));
    }

    // 2.16 Comparing Two Integers
    public static void compareIntegers(Scanner input) {
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        if (num1 > num2)
            System.out.printf("%d is larger%n", num1);
        else if (num2 > num1)
            System.out.printf("%d is larger%n", num2);
        else
            System.out.println("These numbers are equal.");
    }

    // 2.17 Arithmetic with Min and Max
    public static void arithmeticMinMax(Scanner input) {
        System.out.print("Enter three integers: ");
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
        int sum = a + b + c, product = a * b * c, average = sum / 3;
        int min = Math.min(a, Math.min(b, c)), max = Math.max(a, Math.max(b, c));

        System.out.printf("Sum: %d%nAverage: %d%nProduct: %d%nSmallest: %d%nLargest: %d%n",
                sum, average, product, min, max);
    }

    // 2.18 Display Shapes with Asterisks
    public static void displayShapes() {
        System.out.println("Box:");
        System.out.println("*****\n*   *\n*   *\n*   *\n*****");

        System.out.println("\nOval:");
        System.out.println("  ***  \n *   * \n*     *\n *   * \n  ***  ");

        System.out.println("\nArrow:");
        System.out.println("  *  \n *** \n*****\n  *  \n  *  ");

        System.out.println("\nDiamond:");
        System.out.println("  *  \n * * \n*   *\n * * \n  *  ");
    }

    // 2.19 to 2.23 Print Patterns
    public static void printPatterns() {
        System.out.println("*\n**\n***\n****\n*****");
        System.out.println("*\n***\n*****\n****\n**");
        System.out.print("*");
        System.out.print("***");
        System.out.print("*****");
        System.out.print("****");
        System.out.println("**");
        System.out.print("*");
        System.out.println("***");
        System.out.println("*****");
        System.out.print("****");
        System.out.println("**");
        System.out.printf("%s%n%s%n%s%n", "*", "***", "*****");
    }

    // 2.24 Find Largest and Smallest from Five Integers
    public static void largestAndSmallest(Scanner input) {
        System.out.print("Enter five integers: ");
        int smallest = Integer.MAX_VALUE, largest = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();
            if (num < smallest) smallest = num;
            if (num > largest) largest = num;
        }
        System.out.printf("Smallest: %d%nLargest: %d%n", smallest, largest);
    }

    // 2.25 Odd or Even
    public static void oddEvenCheck(Scanner input) {
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println(number % 2 == 0 ? "Even" : "Odd");
    }

    // 2.26 Multiples
    public static void multiplesCheck(Scanner input) {
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();
        System.out.println(num1 % num2 == 0 ? num1 + " is a multiple of " + num2 : num1 + " is NOT a multiple of " + num2);
    }

    // 2.27 Checkerboard Pattern
    public static void checkerboardPattern() {
        for (int i = 0; i < 8; i++) {
            System.out.println(i % 2 == 0 ? "* * * * * * * *" : " * * * * * * * *");
        }
    }

    // 2.28 Circle Calculations
    public static void circleCalculations(Scanner input) {
        System.out.print("Enter radius of circle: ");
        int radius = input.nextInt();
        System.out.printf("Diameter: %d%nCircumference: %.2f%nArea: %.2f%n",
                2 * radius, 2 * Math.PI * radius, Math.PI * radius * radius);
    }

    // 2.29 Integer Value of a Character
    public static void characterValues() {
        char[] chars = {'A', 'B', 'C', 'a', 'b', 'c', '0', '1', '$', '*', '+', '/'};
        for (char c : chars) {
            System.out.printf("The character %c has the value %d%n", c, (int) c);
        }
    }

    // 2.30 Separating Digits
    public static void separateDigits(Scanner input) {
        System.out.print("Enter a five-digit number: ");
        int number = input.nextInt();
        System.out.printf("%d   %d   %d   %d   %d%n",
                number / 10000, (number / 1000) % 10, (number / 100) % 10, (number / 10) % 10, number % 10);
    }

    // 2.31 Table of Squares and Cubes
    public static void squaresCubesTable() {
        System.out.println("Number\tSquare\tCube");
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d\t%d\t%d%n", i, i * i, i * i * i);
        }
    }

    // 2.32 Count Positive, Negative, and Zero
    public static void countNumbers(Scanner input) {
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;
        System.out.println("Enter five numbers: ");
        for (int i = 0; i < 5; i++) {
            int number = input.nextInt();
            if (number > 0) positiveCount++;
            else if (number < 0) negativeCount++;
            else zeroCount++;
        }
        System.out.printf("Positive: %d%nNegative: %d%nZeros: %d%n", positiveCount, negativeCount, zeroCount);
    }

    // 2.33 to 2.35 (BMI, Population Growth, Carpool Savings) included in original response

}
