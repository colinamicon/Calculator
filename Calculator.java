import java.util.Scanner;

public class Calculator {

    // METHODS
    // * multiplication
    public static double multiplication(double a, double b) {
        b = a * b;
        return b;
    }

    // / division 
    public static double division(double a, double b) {
        b = a / b;
        return b;
    }

    // + addition
    public static double addition(double a, double b) {
        b = a + b;
        return b;
    }

    // - subtraction
    public static double subtraction(double a, double b) {
        b = a - b;
        return b;
    }

    public static void main(String args[]) {

        Scanner scnr = new Scanner(System.in);
        System.out.printf("Enter a starting value: %n(enter a blank line anytime %nto stop the calculator and %nstore the final value): ");
        double userInput = scnr.nextDouble();

        double finalValue = 0;
        char operator;

        // Enter an operator, since there cant be two in a row, ask for another number
        // continue this loop until they enter a blank line
        // finalValue always being updated, replace userInput with finalValue to store it for next loop
        // %f = print double

        while (scnr.nextLine() != "") {
            System.out.printf("DEBUG: finalValue = %f%n", finalValue);
            System.out.printf("%nEnter an operator: ");
            operator = scnr.next().charAt(0);
            // * multiplication
            if (operator == '*') {
                System.out.print("DEBUG: Multiplication");
                System.out.printf("%nEnter another value: ");
                finalValue = scnr.nextDouble();
                finalValue = multiplication(finalValue, userInput);
                userInput = finalValue;
            }
            // / division
            else if (operator == '/') {
                System.out.print("DEBUG: Division");
                System.out.printf("%nEnter another value: ");
                finalValue = scnr.nextDouble();
                finalValue = division(userInput, finalValue);
                userInput = finalValue;
            }
            // + addition
            else if (operator == '+') {
                System.out.print("DEBUG: Addition");
                System.out.printf("%nEnter another value: ");
                finalValue = scnr.nextDouble();
                finalValue = addition(userInput, finalValue);
                userInput = finalValue;
            }
            // - subtraction
            else if (operator == '-') {
                System.out.print("DEBUG: Subtraction");
                System.out.printf("%nEnter another value: ");
                finalValue = scnr.nextDouble();
                finalValue = subtraction(userInput, finalValue);
                userInput = finalValue;
            }            

            // if empty finalValue = userInput (last value)
            else if (scnr.nextLine().isEmpty()) {
                finalValue = userInput;
                System.out.printf("Final: %f", finalValue);
                System.out.printf("%nGoodbye!%n");
                break;
            }

        }

        scnr.close();

    }

}

// While user inputs number (a)
// Operator
// Display number and operation on screen
// User inputs b
// Operator
// Display number and operation on screen
// (infinity)
// if blank line, finalValue = last value

// + addition
// - subtraction
// * multiplication
// / division

// PEMDAS:
// Parentheses
// Exponents
// Multiplication
// Divison
// Addition
// Subtraction

// TODO: Add %, (), ^, sqrt(), pi, sine, cosine, trig, 
// TODO: Add css styling - Java Swing? 
// TODO: Hosting 