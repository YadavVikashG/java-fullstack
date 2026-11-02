public class Day2 {
    public static void main(String[] args) {
        String studentName = "Alex";
        int age = 20;
        long studentId = 9876543210L;
        int graduationYear = 2028;
        boolean enrolled = true;
        char gradeLevel = 'S';
        double gpa = 3.82;

        System.out.println("Student: " + studentName);
        System.out.println("Age: " + age + " years");
        System.out.println("Student ID: " + studentId);
        System.out.println("Graduation year: " + graduationYear);
        System.out.println("Currently enrolled: " + enrolled);
        System.out.println("Grade level: " + gradeLevel);
        System.out.println("GPA: " + gpa);

        System.out.println();
        System.out.println("Summary: " + studentName + " is " + age
                + " years old, will graduate in " + graduationYear
                + ", and is currently enrolled: " + enrolled + ".");

        int[] numbers = {4, -2, 9, 3, 8, 7};
        System.out.println("Even values: " + countEvenValues(numbers));
    }

    static int countEvenValues(int[] numbers) {
        int evenCount = 0;

        for (int value : numbers) {
            if (value % 2 == 0) {
                evenCount++;
            }
        }

        return evenCount;
    }
}
