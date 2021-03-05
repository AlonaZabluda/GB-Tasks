package com.gb.lesson1.task3;

public class Square extends Shape{

    public Square(double side) {
        super(side);
    }

    double perimeter() {
        return 4 * getSideA();
    }

    double area() {
        return Math.pow(getSideA(), 2);
    }
}
