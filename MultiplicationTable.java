import java.util.Scanner;

/**
 * MultiplicationTable
 *
 * A live demo for the for loop. Asks for a number and prints its
 * multiplication table from 1 up to MAX_MULTIPLIER.
 *
 * Also demonstrates:
 *  - a "static final" constant (MAX_MULTIPLIER) — the upper bound is
 *    fixed and named once instead of being a "magic number" in the loop.
 *  - a "static" field (tablesGenerated) — a shared counter that keeps
 *    incrementing each time the loop below runs another table.
 *
 * To run in IntelliJ: right-click this file -> Run 'MultiplicationTable.main()'.
 */
public class MultiplicationTable {

    static final int MAX_MULTIPLIER = 12;
    static int tablesGenerated = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("\nMultiplication table for " + number + ":");
        for (int i = 1; i <= MAX_MULTIPLIER; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        tablesGenerated++;
        System.out.println("\n(Tables generated so far: " + tablesGenerated + ")");

        input.close();
    }
}
