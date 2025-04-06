package simpleCalculator;

import java.util.Scanner;  // Import the Scanner class

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner calculator = new Scanner (System.in); // Create a Scanner object
        
        System.out.println("Choose the first number: ");
        double firstNumber = calculator.nextDouble(); // Read user input
        
        System.out.println("Choose the second number: ");
        double secondNumber = calculator.nextDouble(); 
        
        System.out.println("Enter operation (add, subtract, multiply, divide): ");
        calculator.nextLine(); // Handle the leftover newline from nextDouble() calls
        String operation = calculator.nextLine();

        double result;
        switch (operation.toLowerCase()) {
            case "add":
                result = firstNumber + secondNumber;
                System.out.println("The result is: " + result);
                break;
            case "subtract":
                result = firstNumber - secondNumber;
                System.out.println("The result is: " + result);
                break;
            case "multiply":
                result = firstNumber * secondNumber;
                System.out.println("The result is: " + result);
                break;
            case "divide":
                if (secondNumber == 0) {
                    System.out.println("Dividing a number by zero is an invalid mathematical operation");
                } else {
                result = firstNumber / secondNumber;
                System.out.println("The result is: " + result);
                }
                break;
            default:
                System.out.println("Invalid Operations");

        }
        calculator.close(); // Close the scanner to prevent resource leaks

	}
}
