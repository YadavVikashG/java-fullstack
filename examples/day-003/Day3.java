import java.util.Scanner; // Imports the Scanner class so we can read user input from the console.

public class Day3 {
    public static void main(String[] args) { // The main method runs when the program starts.
        Scanner scanner = new Scanner(System.in); // Creates a Scanner object linked to keyboard input.

        System.out.print("Enter the first number: "); // Prints a prompt without moving to the next line.
        double firstNumber = scanner.nextDouble(); // Reads the first number as a decimal number.

        System.out.print("Enter an operator (+, -, *, /): "); // Prints a prompt for the operator.
        String operator = scanner.next(); // Reads the chosen operator such as + or -.

        System.out.print("Enter the second number: "); // Asks for the second number.
        double secondNumber = scanner.nextDouble(); // Reads the second number from input.

        double result; // Declares a variable that will store the answer.

        switch (operator) { // Checks which operator the user entered.
            case "+": // If the operator is +, run this block.
                result = firstNumber + secondNumber; // Adds the two numbers.
                break; // Stops the switch block after this case.
            case "-": // If the operator is -, run this block.
                result = firstNumber - secondNumber; // Subtracts second from first.
                break; // Exits the case.
            case "*": // If the operator is *, run this block.
                result = firstNumber * secondNumber; // Multiplies the numbers.
                break; // Exits the case.
            case "/": // If the operator is /, run this block.
                if (secondNumber == 0) { // Checks whether dividing by zero would happen.
                    System.out.println("Error: division by zero is not allowed."); // Shows a clear error message.
                    scanner.close(); // Closes the Scanner to free resources.
                    return; // Exits the program early.
                }
                result = firstNumber / secondNumber; // Divides first by second.
                break; // Exits the switch.
            default: // If no valid operator matches, run this block.
                System.out.println("Invalid operator: " + operator); // Prints a message showing the bad operator.
                scanner.close(); // Closes the scanner.
                return; // Stops the program.
        }

        System.out.printf("%.2f %s %.2f = %.2f%n", firstNumber, operator, secondNumber, result); // Prints the calculation with 2 decimal places.

        int[] values = {7, 2, 9, 4}; // Creates an array of integers for the sum example.
        System.out.println("Array sum: " + sumArray(values)); // Calls the helper method and prints the total.

        scanner.close(); // Closes the scanner after all input is handled.
    } // End of main method.

    static int sumArray(int[] numbers) { // Defines a method that adds all numbers in an array.
        if (numbers.length == 0) { // Checks if the array is empty.
            throw new IllegalArgumentException("Array must not be empty."); // Stops with an exception if empty.
        }

        int total = 0; // Starts the running sum at zero.
        for (int value : numbers) { // Loops over each number in the array.
            total += value; // Adds each value to the running total.
        }
        return total; // Returns the final sum.
    } // End of sumArray method.
} // End of Day3 class.
