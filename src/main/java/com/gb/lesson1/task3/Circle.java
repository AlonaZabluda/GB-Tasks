package com.gb.lesson1.task3;

public class Circle extends Shape{
    private static final double PI = Math.PI;

    public Circle(double radius) {
        super(radius);
    }

    double perimeter() {
        return 2 * PI * getSideA();
    }

    double area() {
        return PI * Math.pow(getSideA(), 2);
    }
}
