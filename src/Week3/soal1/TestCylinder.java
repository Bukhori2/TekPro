package Week3.soal1;

public class TestCylinder { // save as "TestCylinder.java"
    public static void main(String[] args) {

        // Declare and allocate a new instance of cylinder
        // with default color, radius, and height
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder:"
                + " radius=" + c1.getRadius()
                + " height=" + c1.getHeight()
                + " base area=" + c1.getArea()
                + " volume=" + c1.getVolume()
                + " color=" + c1.getColor());

        // Declare and allocate a new instance of cylinder
        // specifying height, with default color and radius
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder:"
                + " radius=" + c2.getRadius()
                + " height=" + c2.getHeight()
                + " base area=" + c2.getArea()
                + " volume=" + c2.getVolume()
                + " color=" + c2.getColor());

        // Declare and allocate a new instance of cylinder
        // specifying radius and height, with default color
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder:"
                + " radius=" + c3.getRadius()
                + " height=" + c3.getHeight()
                + " base area=" + c3.getArea()
                + " volume=" + c3.getVolume()
                + " color=" + c3.getColor());

        Cylinder c4 = new Cylinder(2.0, 10.0, "blue");
        System.out.println("Cylinder:"
                + " radius=" + c4.getRadius()
                + " height=" + c4.getHeight()
                + " base area=" + c4.getArea() // udah di override, bukan base area di Circle tapi surface area di Cylinder
                + " volume=" + c4.getVolume()
                + " color=" + c4.getColor());

        System.out.println("Testing:");
        System.out.println("Surface Area=" + c1.getArea());
        System.out.println("Volume=" + c1.getVolume());
        System.out.println(c1);
        System.out.println(c1.toString());

        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

    }
}


