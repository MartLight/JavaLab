/**
 * AbstractShapeDemo
 *
 * A live demo for abstract classes. Shape is abstract: it defines what
 * every shape MUST be able to do (compute an area) without saying HOW,
 * and it cannot be instantiated directly ("new Shape()" would not
 * compile). Circle and Rectangle are concrete subclasses that each
 * supply their own area() logic.
 *
 * To run in IntelliJ: right-click this file -> Run 'AbstractShapeDemo.main()'.
 */
public class AbstractShapeDemo {
    public static void main(String[] args) {
        // The line below would NOT compile if uncommented, because Shape
        // is abstract and has no complete implementation of area():
        // Shape s = new Shape();

        Shape[] shapes = {
            new Circle(3.0),
            new Rectangle(4.0, 5.0)
        };

        for (Shape shape : shapes) {
            shape.describe();   // each shape fills in area() differently
        }
    }
}

// abstract: cannot be instantiated on its own, and forces every subclass
// to implement area().
abstract class Shape {
    abstract double area();

    // A normal (non-abstract) method can still live here and be shared
    // by every subclass.
    void describe() {
        System.out.println(getClass().getSimpleName() + " has area: " + area());
    }
}

class Circle extends Shape {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private final double width;
    private final double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}
