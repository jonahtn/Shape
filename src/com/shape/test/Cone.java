package com.shape.test;

public class Cone extends Shape{
    private final double radius, height;

    public Cone(){
        this(1,1);
    }

    public Cone(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    public double area() {
        double a = 3.14*radius*radius;
        double volume = a*height/3;
        return Math.round(volume);
    }

}