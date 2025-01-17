import java.util.Scanner;

public class Calculator {
   private Scanner scanner;

    // Constructor to initialize the scanner
    public Calculator() {
        scanner = new Scanner(System.in);
    }

    // Start method to display options and perform calculations
    public void start() {
        while (true) {
            System.out.println("\n=== Simple Calculator ===");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");

            System.out.print("\nSelect operation (1-5): ");
            int choice = scanner.nextInt();

            // Exit if user chooses 5
            if (choice == 5) {
                System.out.println("Thank you for using the calculator!");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            String operation = "";

            // Perform the selected operation
            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    operation = "+";
                    break;
                case 2:
                    result = subtract(num1, num2);
                    operation = "-";
                    break;
                case 3:
                    result = multiply(num1, num2);
                    operation = "*";
                    break;
                case 4:
                    if (num2 != 0) {
                        result = divide(num1, num2);
                        operation = "/";
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                        continue; // If division by zero, continue to the next loop iteration
                    }
                    break;
                default:
                    System.out.println("Invalid choice! Please select 1-5.");
                    continue; // If an invalid choice is made, continue to the next loop iteration
            }

            // Output the result
            System.out.printf("%.2f %s %.2f = %.2f%n", num1, operation, num2, result);
        }

        // Close the scanner object at the end of the program
        scanner.close();
    }

    // Method to add two numbers
    private double add(double a, double b) {
        return a + b;
    }

    // Method to subtract two numbers
    private double subtract(double a, double b) {
        return a - b;
    }

    // Method to multiply two numbers
    private double multiply(double a, double b) {
        return a * b;
    }

    // Method to divide two numbers
    private double divide(double a, double b) {
        return a / b;
    }

    // Main method to run the calculator
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.start();
    }
}
