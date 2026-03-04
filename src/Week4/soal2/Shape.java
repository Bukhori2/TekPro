package Week4.soal2;
/*
* Write an abstract class Shape with the following properties:
An instance variable shapeName of type String
An abstract method area()
A toString method that returns the name of the shape*/
abstract public class Shape {
    String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }
    public abstract double area();

    public String toString() {
        return "Shape: " + shapeName;
    }
}
