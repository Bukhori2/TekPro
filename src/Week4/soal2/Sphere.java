package Week4.soal2;

/*The file Sphere.java contains a class for a sphere which is a descendant of Shape. A sphere has a radius and its area
(surface area) is given by the formula 4*PI*radius^2. Define similar classes for a rectangle and a cylinder. Both the
Rectangle class and the Cylinder class are descendants of the Shape class. A rectangle is defined by its length and
width and its area is length times width. A cylinder is defined by a radius and height and its area (surface area) is
PI*radius^2*height. Define the toString method in a way similar to that for the Sphere class.*/

public class Sphere extends Shape{
    private double radius; //radius in feet
    //----------------------------------
    // Constructor: Sets up the sphere.
    //----------------------------------
    public Sphere(double r) {
        super("Sphere");
        radius = r;
    }
    //-----------------------------------------
    // Returns the surface area of the sphere.
    //-----------------------------------------
    public double area() {
        return 4*Math.PI*radius*radius;
    }

    //-----------------------------------
    // Returns the sphere as a String.
    //-----------------------------------
    public String toString() {
        return super.toString() + " of radius " + radius;
    }
}
