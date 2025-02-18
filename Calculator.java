import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Choose operation (+ or -):");
        char operation = scanner.next().charAt(0);

        double result = 0;
        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else {
            System.out.println("Invalid operation! Use + or -.");
            System.exit(1);
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}
