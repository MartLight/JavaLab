/**
 * StaticVsInstanceDemo
 *
 * A live demo for the difference between a static field (shared by every
 * object of the class — one copy, total) and an instance field (each
 * object gets its own separate copy). Creates three Counter objects and
 * shows how their instance counts stay independent while the static
 * count keeps climbing across all of them.
 *
 * To run in IntelliJ: right-click this file -> Run 'StaticVsInstanceDemo.main()'.
 */
public class StaticVsInstanceDemo {

    public static void main(String[] args) {
        Counter a = new Counter("A");
        Counter b = new Counter("B");

        a.increment();
        a.increment();
        a.increment();
        b.increment();

        System.out.println("Counter " + a.name + " -> instance count: " + a.instanceCount);
        System.out.println("Counter " + b.name + " -> instance count: " + b.instanceCount);
        System.out.println("Total increments across ALL counters (static): " + Counter.totalCount);

        Counter c = new Counter("C");
        c.increment();
        System.out.println("\nAfter creating a third counter and incrementing it once:");
        System.out.println("Counter " + a.name + " -> instance count: " + a.instanceCount + "  (unchanged)");
        System.out.println("Counter " + c.name + " -> instance count: " + c.instanceCount);
        System.out.println("Total increments across ALL counters (static): " + Counter.totalCount);
    }
}

// A helper class in the same file (not public) so this demo stays one file.
class Counter {
    // static: belongs to the Counter CLASS itself. There is only ONE copy,
    // and every object shares it.
    static int totalCount = 0;

    // instance fields: each object gets its OWN separate copy.
    String name;
    int instanceCount = 0;

    Counter(String name) {
        this.name = name;
    }

    void increment() {
        instanceCount++;   // only changes THIS object's copy
        totalCount++;      // changes the one shared copy
    }
}
