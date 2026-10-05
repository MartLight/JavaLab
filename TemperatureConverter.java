import java.util.Scanner;

/**
 * TemperatureConverter
 *
 * A quick, one-formula demo — good for showing methods with parameters
 * and a return value. Converts between Celsius and Fahrenheit based on
 * a menu choice.
 *
 * Also demonstrates a "static final" constant: ABSOLUTE_ZERO_CELSIUS is
 * a physical fact that never changes, so it's declared once, up top, as
 * static (belongs to the class) and final (can't be reassigned) — and
 * the two conversion methods are themselves "static": they don't need
 * an object to run, since they only work with the value they're given.
 *
 * To run in IntelliJ: right-click this file -> Run 'TemperatureConverter.main()'.
 */
public class TemperatureConverter {

    static final double ABSOLUTE_ZERO_CELSIUS = -273.15;

    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Temperature Converter ===");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option (1 or 2): ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = input.nextDouble();
            if (celsius < ABSOLUTE_ZERO_CELSIUS) {
                System.out.println("That's below absolute zero (" + ABSOLUTE_ZERO_CELSIUS + "C) - not physically possible.");
            } else {
                double fahrenheit = celsiusToFahrenheit(celsius);
                System.out.println(celsius + "C = " + fahrenheit + "F");
            }
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = input.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.println(fahrenheit + "F = " + celsius + "C");
        } else {
            System.out.println("Please choose 1 or 2.");
        }

        input.close();
    }
}
