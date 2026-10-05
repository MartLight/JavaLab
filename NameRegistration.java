import java.util.Scanner;

/**
 * NameRegistration
 *
 * A tiny registration demo — a live demo for reading input with Scanner,
 * String concatenation, and simple variables. Asks for a name, an ID,
 * and a programme, then prints a registration confirmation.
 *
 * Also demonstrates:
 *  - a "static final" constant (INSTITUTION) — fixed for every
 *    registration, so it's both static (one shared value) and final
 *    (never reassigned).
 *  - a "static" field (registrationsThisSession) — shared by the whole
 *    class, incremented every time someone registers, so it keeps
 *    counting across loop iterations instead of resetting.
 *
 * To run in IntelliJ: right-click this file -> Run 'NameRegistration.main()'.
 */
public class NameRegistration {

    static final String INSTITUTION = "Faculty of Computer Engineering";
    static int registrationsThisSession = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Student Registration: " + INSTITUTION + " ===\n");

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your student ID: ");
        String studentId = input.nextLine();

        System.out.print("Enter your programme: ");
        String programme = input.nextLine();

        registrationsThisSession++;

        System.out.println("\n--- Registration Confirmed ---");
        System.out.println("Name:      " + name);
        System.out.println("ID:        " + studentId);
        System.out.println("Programme: " + programme);
        System.out.println("\nWelcome, " + name + "! You are now registered.");
        System.out.println("(Registration #" + registrationsThisSession + " this session.)");

        input.close();
    }
}
