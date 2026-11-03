public class Day2 {
    public static void main(String[] args) { // Java starts program execution from the main method.
        String studentName = "Alex"; // Stores a text value for the student's name.
        int age = 20; // Stores an integer value for age.
        long studentId = 9876543210L; // Stores a larger integer value; L marks it as a long.
        int graduationYear = 2028; // Stores the year the student will graduate.
        boolean enrolled = true; // Stores a true/false value about enrollment status.
        char gradeLevel = 'S'; // Stores a single character, like 'S' or 'A'.
        double gpa = 3.82; // Stores a decimal value with floating-point precision.

        System.out.println("Student: " + studentName); // Prints the label and the student name.
        System.out.println("Age: " + age + " years"); // Prints the age with extra text.
        System.out.println("Student ID: " + studentId); // Prints the student ID.
        System.out.println("Graduation year: " + graduationYear); // Prints the graduation year.
        System.out.println("Currently enrolled: " + enrolled); // Prints a boolean value as true/false.
        System.out.println("Grade level: " + gradeLevel); // Prints the character value.
        System.out.println("GPA: " + gpa); // Prints the GPA as a decimal number.

        System.out.println(); // Prints a blank line to separate sections.
        System.out.println("Summary: " + studentName + " is " + age // Starts a long summary string.
                + " years old, will graduate in " + graduationYear // Adds more text and the graduation year.
                + ", and is currently enrolled: " + enrolled + "."); // Finishes the summary with enrollment status.

        int[] numbers = {4, -2, 9, 3, 8, 7}; // Creates an integer array with several values.
        System.out.println("Even values: " + countEvenValues(numbers)); // Calls the helper method and prints the result.
    } // End of main method.

    static int countEvenValues(int[] numbers) { // Defines a method that counts only even numbers in an array.
        int evenCount = 0; // Starts the count at zero.

        for (int value : numbers) { // Loops through each number in the array.
            if (value % 2 == 0) { // Checks if the value is divisible by 2 with no remainder.
                evenCount++; // Increases count by 1 when it finds an even number.
            } // Ends the if check.
        } // Ends the loop after visiting all array values.

        return evenCount; // Returns the total number of even values.
    } // End of countEvenValues method.
} // End of Day2 class.
