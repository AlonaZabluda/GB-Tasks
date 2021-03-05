package com.gb.lesson1.task3;

public class Triangle extends Shape{

    public Triangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }

    double perimeter() {
        return getSideA() + getSideB() + getSideC();
    }

    double area() {
        double s = (perimeter()) / 2;
        return Math.sqrt(s * (s - getSideA()) * (s - getSideB()) * (s - getSideC()));
    }
}
