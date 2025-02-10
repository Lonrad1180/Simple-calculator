import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.println("Welcome to Simple Calculator!");

        // Loop for continuous calculations
        while (true) {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;

            // Perform the operation based on the operator
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    // Handle division by zero
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error! Division by zero.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid operator. Please try again.");
                    continue;
            }

            // Output the result
            System.out.println("Result: " + result);

            // Ask user if they want to perform another calculation
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String userResponse = scanner.next();
            if (userResponse.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using the calculator!");
                break;
            }
        }

        scanner.close();
    }
}
