package com.gb.lesson1.task3;

public class Test {
    public static void main(String[] args) {
        Shape triangle = new Triangle(10, 11, 5);
        System.out.println(triangle.area());
        System.out.println(triangle.perimeter());

        Shape circle = new Circle(5);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());

        Shape square = new Square(2);
        System.out.println(square.area());
        System.out.println(square.perimeter());
    }



}
