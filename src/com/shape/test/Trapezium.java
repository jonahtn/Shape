package com.shape.test;

public class Trapezium extends Shape{
    private final double a, b, height;

    public Trapezium(){
        this(1,1,1);
    }

    public Trapezium(double a, double b, double height){
        this.a = a;
        this.b = b;
        this.height = height;
    }

    public double area() {
        double s = (a+b)/2 * height;
        return Math.round(s);
    }

}
