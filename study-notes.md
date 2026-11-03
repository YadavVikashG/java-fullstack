# Java Study Notes and Daily Reminder

## Rule for every future day

For every new lesson day:

1. Read the lesson in `curriculum/days/day-XXX.md`.
2. Create or update the matching Java example in `examples/day-XXX/DayX.java`.
3. Add comments explaining each important line of code.
4. Explain the purpose of variables, operators, loops, conditions, and methods in plain English.
5. Compile and run the program to verify it works.
6. Write a brief summary in this file so it is easy to review later.
7. Keep the explanation simple enough to teach back out loud.

## Reminder for future work

Do not skip the line-by-line explanation. This helps with:

- remembering syntax
- understanding logic
- interviews and teaching
- debugging later
- learning by explaining, not just copying

## Day 3 example: line-by-line explanation

File: `examples/day-003/Day3.java`

```java
import java.util.Scanner;
```
- Brings in the `Scanner` class so the program can read user input from the keyboard.

```java
public class Day3 {
```
- Declares the Java class. The class name must match the file name.

```java
public static void main(String[] args) {
```
- The main method is where Java starts running the program.

```java
Scanner scanner = new Scanner(System.in);
```
- Creates a `Scanner` object connected to console input.

```java
System.out.print("Enter the first number: ");
```
- Prints a prompt without moving to a new line.

```java
double firstNumber = scanner.nextDouble();
```
- Reads the user's first value as a decimal number and stores it in a variable.

```java
System.out.print("Enter an operator (+, -, *, /): ");
```
- Asks the user for the operation symbol.

```java
String operator = scanner.next();
```
- Reads the operator as a String, such as `+` or `-`.

```java
double secondNumber = scanner.nextDouble();
```
- Reads the second value as a decimal number.

```java
double result;
```
- Declares a variable that will store the answer.

```java
switch (operator) {
```
- Checks the value of `operator` against several possible cases.

```java
case "+":
    result = firstNumber + secondNumber;
    break;
```
- If the operator is `+`, add the values together.

```java
case "-":
    result = firstNumber - secondNumber;
    break;
```
- If the operator is `-`, subtract the second number from the first.

```java
case "*":
    result = firstNumber * secondNumber;
    break;
```
- If the operator is `*`, multiply the values.

```java
case "/":
    if (secondNumber == 0) {
        System.out.println("Error: division by zero is not allowed.");
        scanner.close();
        return;
    }
    result = firstNumber / secondNumber;
    break;
```
- If the operator is `/`, first prevent division by zero.
- Then divide the first number by the second number.
- `return` exits the program early when the input is invalid.

```java
default:
    System.out.println("Invalid operator: " + operator);
    scanner.close();
    return;
```
- Handles any operator that is not supported.

```java
System.out.printf("%.2f %s %.2f = %.2f%n", firstNumber, operator, secondNumber, result);
```
- Prints the calculation in a clear format with two decimal places.

```java
int[] values = {7, 2, 9, 4};
```
- Creates an integer array with four values.

```java
System.out.println("Array sum: " + sumArray(values));
```
- Calls `sumArray` and prints the total.

```java
static int sumArray(int[] numbers) {
```
- Defines a helper method that accepts an integer array and returns an integer total.

```java
if (numbers.length == 0) {
    throw new IllegalArgumentException("Array must not be empty.");
}
```
- Checks for an empty array and stops with a clear error if needed.

```java
int total = 0;
```
- Starts the running total at zero.

```java
for (int value : numbers) {
    total += value;
}
```
- Loops through every element in the array and adds it to the running total.

```java
return total;
```
- Sends the final sum back to the caller.

## Quick learning habit

After each day, say this out loud:

- What did the program do?
- Why did each line matter?
- What would happen if the input changed?
- What is the output of the program?

This habit will make future Java lessons much easier to remember.
