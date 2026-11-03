import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        String operator = scanner.next();

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        double result;

        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if (secondNumber == 0) {
                    System.out.println("Error: division by zero is not allowed.");
                    scanner.close();
                    return;
                }
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Invalid operator: " + operator);
                scanner.close();
                return;
        }

        System.out.printf("%.2f %s %.2f = %.2f%n", firstNumber, operator, secondNumber, result);

        int[] values = {7, 2, 9, 4};
        System.out.println("Array sum: " + sumArray(values));

        scanner.close();
    }

    static int sumArray(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }

        int total = 0;
        for (int value : numbers) {
            total += value;
        }
        return total;
    }
}
