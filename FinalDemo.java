/**
 * FinalDemo
 *
 * A live demo for the three things "final" can lock down in Java:
 *   1. a final VARIABLE  -> its value can only be assigned once
 *   2. a final METHOD    -> a subclass is not allowed to override it
 *   3. a final CLASS     -> no class is allowed to extend it at all
 *
 * The commented-out lines below are left in on purpose: uncommenting
 * any one of them and trying to compile is the fastest way to show the
 * class the exact compiler error "final" causes.
 *
 * To run in IntelliJ: right-click this file -> Run 'FinalDemo.main()'.
 */
public class FinalDemo {

    // 1. final variable: this is a constant. It can be assigned once, right
    //    here. The line below it would NOT compile if uncommented.
    static final int MAX_SCORE = 100;
    // static { MAX_SCORE = 50; } // <- compile error: cannot assign a value to final variable

    public static void main(String[] args) {
        System.out.println("MAX_SCORE is a final constant: " + MAX_SCORE);

        Vehicle car = new Car();
        car.describe();  // Vehicle's final method - Car is not allowed to change this
        car.honk();       // Car's own overridden version of a normal (non-final) method

        System.out.println("5 squared, via a final class's method: " + UtilityBox.square(5));

        // The next line would NOT compile if uncommented, because
        // UtilityBox above is a final class and cannot be extended:
        // class MyBox extends UtilityBox { }
    }
}

// A normal class with one final method and one normal method.
class Vehicle {

    // 2. final method: no subclass of Vehicle can override describe().
    final void describe() {
        System.out.println("This is a vehicle. Every vehicle describes itself the same way.");
    }

    void honk() {
        System.out.println("Generic honk!");
    }
}

class Car extends Vehicle {
    // Overriding describe() here would be a compile error, because it's
    // final in Vehicle -- try uncommenting this and see IntelliJ's error:
    //
    // @Override
    // void describe() { System.out.println("A car describes itself differently."); }

    @Override
    void honk() {
        System.out.println("Car says: Beep beep!");
    }
}

// 3. final class: no other class is allowed to extend UtilityBox at all.
final class UtilityBox {
    static int square(int n) {
        return n * n;
    }
}
