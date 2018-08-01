package com.shape.test;

public class Square extends Shape{
    private final double width;

    public Square(){
        this(1);
    }

    public Square(double width){
        this.width = width;
    }

    public double area() {
        return width*width;
    }
    

}