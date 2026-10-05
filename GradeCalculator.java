import java.util.Scanner;

/**
 * GradeCalculator
 *
 * A live demo for if / else if / else branching. Asks for a numeric
 * score (0-100) and prints the matching letter grade. Enter -1 to quit.
 *
 * Also demonstrates "static final" constants: the grade boundaries are
 * declared once, up top, as static (belonging to the class) and final
 * (never reassigned) — the classic Java way to name a fixed cutoff
 * instead of scattering "magic numbers" through the logic below.
 *
 * To run in IntelliJ: right-click this file -> Run 'GradeCalculator.main()'.
 */
public class GradeCalculator {

    static final int A_CUTOFF = 90;
    static final int B_CUTOFF = 80;
    static final int C_CUTOFF = 70;
    static final int D_CUTOFF = 60;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Grade Calculator ===");
        System.out.println("Enter a score from 0-100 (or -1 to quit).\n");

        while (true) {
            System.out.print("Score: ");
            int score = input.nextInt();

            if (score == -1) {
                break;
            }

            char grade;
            if (score >= A_CUTOFF) {
                grade = 'A';
            } else if (score >= B_CUTOFF) {
                grade = 'B';
            } else if (score >= C_CUTOFF) {
                grade = 'C';
            } else if (score >= D_CUTOFF) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("Score " + score + " -> Grade " + grade + "\n");
        }

        System.out.println("Goodbye!");
        input.close();
    }
}
