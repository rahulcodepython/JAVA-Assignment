import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Input operation
        System.out.println("Choose an operation: +, -, *, /");
        char operation = scanner.next().charAt(0);

        double result;

        // Perform operation based on user's choice
        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("The sum is: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("The difference is: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("The product is: " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The quotient is: " + result);
                } else {
                    System.out.println("Error! Division by zero.");
                }
                break;

            default:
                System.out.println("Invalid operation!");
                break;
        }

        scanner.close();
    }
}
