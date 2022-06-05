package com.codewithjit;
import java.io.*;
// Class 1
// Helper abstract class
abstract class Shape {
    String objectName = " ";
    // Constructor of this class
    Shape(String name) { this.objectName = name; }
    // Non-abstract methods
    // Having as default implementation
    public void moveTo(int x, int y)
    {
        System.out.println(this.objectName + " " + "has been moved to" + " x = " + x + " and y = " + y);
    }
    // Abstract methods which will be
    // implemented by its subclass(es)
    abstract public double area();
    abstract public void draw();
}

// Main class
class Main {
    public static void main(String[] args)
    {
        // Creating the Object of Rectangle class
        // and using shape class reference.
        Shape rect = new Rectangle(2, 3, "Rectangle");
        System.out.println("Area of rectangle: " + rect.area());
        rect.moveTo(1, 2);
        System.out.println(" ");
        // Creating the Objects of circle class
        Shape circle = new Circle(2, "Circle");
        System.out.println("Area of circle: " + circle.area());
        circle.moveTo(2, 4);

    }
}

