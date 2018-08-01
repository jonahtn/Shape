package com.shape.test;

public class TestShape {
    public static void main(String[] args) {

        //Rectangle
        double width = 2, length = 6;
        Shape rectangle = new Rectangle(width, length);
        System.out.println("Rectangle\n" + "Width:" + width + "\nLength: " + length
                + "\nArea: " + rectangle.area() + "\n");

        //Square
        double side = 5;
        Shape square = new Square(side);
        System.out.println("Square\n" + "Width:" + side + "\nArea: " + square.area() + "\n");

        //Trapezium
        double a = 3, b = 5, height = 5;
        Shape trapz = new Trapezium(a, b, height);
        System.out.println("Trapezium\n" + "Length A:" + a + "\nLength B: " + b + "\nHeight: " + height
                + "\nArea: " + trapz.area() + "\n");

        //Cone
        double radius = 7, heightC = 10;
        Shape cone = new Cone(radius, heightC);
        System.out.println("Cone\n" + "Radius:" + radius + "\nHeight: " + heightC
                + "\nArea: " + cone.area() + "\n");
    }
}