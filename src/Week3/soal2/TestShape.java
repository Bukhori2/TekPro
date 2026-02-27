package Week3.soal2;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        System.out.println(s1.toString());

        Circle circle = new Circle(2.5, "red", false);
        System.out.println(circle.toString());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(3.0, 4.0, "blue", true);
        System.out.println(rectangle.toString());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        Square square = new Square(5.0, "yellow", true);
        System.out.println(square.toString());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}
