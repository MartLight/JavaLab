import java.util.Scanner;

/**
 * Calculator
 *
 * A simple console calculator — a live demo for basic input, operators,
 * and a switch statement. Enter two numbers and an operator (+, -, *, /),
 * and it prints the result. Type "q" at the first prompt to quit.
 *
 * Also demonstrates:
 *  - a "static final" constant (QUIT_COMMAND) — final because its value
 *    never changes, static because it belongs to the class, not to any
 *    one calculation.
 *  - a "static" field (calculationsPerformed) — one shared counter that
 *    keeps its value across every loop iteration for as long as the
 *    program runs, instead of being reset each time.
 *
 * To run in IntelliJ: right-click this file -> Run 'Calculator.main()'.
 */
public class Calculator {

    static final String QUIT_COMMAND = "q";
    static int calculationsPerformed = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Simple Calculator ===");
        System.out.println("Enter '" + QUIT_COMMAND + "' at any time to quit.\n");

        while (true) {
            System.out.print("Enter first number: ");
            String firstEntry = input.next();
            if (firstEntry.equalsIgnoreCase(QUIT_COMMAND)) {
                break;
            }
            double first = Double.parseDouble(firstEntry);

            System.out.print("Enter an operator (+, -, *, /): ");
            String operator = input.next();

            System.out.print("Enter second number: ");
            double second = input.nextDouble();

            double result;
            boolean valid = true;

            switch (operator) {
                case "+":
                    result = first + second;
                    break;
                case "-":
                    result = first - second;
                    break;
                case "*":
                    result = first * second;
                    break;
                case "/":
                    if (second == 0) {
                        System.out.println("Cannot divide by zero.\n");
                        valid = false;
                        result = 0;
                    } else {
                        result = first / second;
                    }
                    break;
                default:
                    System.out.println("Unknown operator: " + operator + "\n");
                    valid = false;
                    result = 0;
            }

            if (valid) {
                calculationsPerformed++;
                System.out.println(first + " " + operator + " " + second + " = " + result + "\n");
            }
        }

        System.out.println("Goodbye! You performed " + calculationsPerformed + " calculation(s).");
        input.close();
    }
}
