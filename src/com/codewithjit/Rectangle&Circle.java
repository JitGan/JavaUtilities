package com.codewithjit;
// Class 2
// Helper class extending Class 1
class Rectangle extends Shape {
    int length, width;
    // Constructor
    Rectangle(int length, int width, String name)
    {
        // Super keyword refers to current instance itself
        super(name);
        // this keyword refers to current instance itself
        this.length = length;
        this.width = width;
    }
    // Method 1
    // To draw rectangle
    @Override public void draw()
    {
        System.out.println("Rectangle has been drawn ");
    }
    // Method 2
    // To compute rectangle area
    @Override public double area()
    {
        return (length * width);
    }
}
// Class 3
// Helper class extending Class 1
class Circle extends Shape {
    double pi = 3.14;
    int radius;
    Circle(int radius, String name)
    {
        super(name);
        this.radius = radius;
    }
    @Override public void draw()
    {
        System.out.println("Circle has been drawn ");
    }
    @Override public double area()
    {
        return (pi * radius * radius);
    }
}
