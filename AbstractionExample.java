abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle area: " + rectangle.area());

        Circle circle = new Circle(5);
        System.out.println("Circle area: " + circle.area());
    }
}
