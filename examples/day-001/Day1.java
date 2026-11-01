public class Day1 { // Declares a class named Day1; the file name must also be Day1.java.
    public static void main(String[] args) { // Java starts running this program from the main method.
        String studentName = "Alex"; // Creates a String variable and stores the student's name.
        String learningGoal = "Become a Java full-stack developer"; // Stores the student's learning goal.
        String funFact = "I enjoy solving puzzles"; // Stores one fun fact to display.

        System.out.println("Student: " + studentName); // Prints a label followed by the student's name.
        System.out.println("Goal: " + learningGoal); // Prints a label followed by the learning goal.
        System.out.println("Fun fact: " + funFact); // Prints a label followed by the fun fact.

        int[] numbers = {4, -2, 9, 3}; // Creates an integer array containing four numbers.
        System.out.println("Maximum value: " + findMaximum(numbers)); // Calls findMaximum and prints the returned value.
    } // Ends the main method.

    static int findMaximum(int[] numbers) { // Declares a method that accepts an int array and returns an int.
        if (numbers.length == 0) { // Checks whether the array has no elements.
            throw new IllegalArgumentException("Array must not be empty"); // Stops with a clear error because an empty array has no maximum.
        } // Ends the empty-array check.

        int maximum = numbers[0]; // Starts by treating the first array value as the largest seen so far.
        for (int index = 1; index < numbers.length; index++) { // Starts at index 1 and visits each remaining array index.
            if (numbers[index] > maximum) { // Checks whether the current value is larger than the current maximum.
                maximum = numbers[index]; // Updates maximum when a larger value is found.
            } // Ends the comparison.
        } // Ends the loop after all array values have been checked.
        return maximum; // Sends the largest value back to the caller.
    } // Ends the findMaximum method.
} // Ends the Day1 class.