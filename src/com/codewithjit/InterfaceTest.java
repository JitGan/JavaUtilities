package com.codewithjit;
import java.io.*;
interface Shape2 {
    void draw();
    double area();
}
// Class 1
// Helper class
class Square implements Shape2 {
    int len, wid;
    // constructor
    Square(int len, int wid)
    {
        this.len = len;
        this.wid = wid;
    }
    @Override public void draw()
    {
        System.out.println("Square has been drawn ");
    }
    @Override public double area()
    {
        return (double)(len * wid);
    }
}
// Class 2
class Circle2 implements Shape2 {
    double pii = 3.14;
    int rad;
    Circle2(int rad) { this.rad = rad; }
    @Override public void draw()
    {
        System.out.println("Circle has been drawn ");
    }
    @Override public double area()
    {
        return (double)((pii * rad * rad));
    }
}
// Main class
class GFG {
    public static void main(String[] args)
    {
        // Creating the Object of Rectangle class
        // and using shape interface reference.
        Shape2 rect = new Square(2, 3);
        System.out.println("Area of square: " + rect.area());
        // Creating the Objects of circle class
        Shape2 circle = new Circle2(2);
        System.out.println("Area of circle: " + circle.area());
    }
}
