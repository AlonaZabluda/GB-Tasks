package com.gb.lesson1.task2;

abstract class Car {
    // private Engine engine
    private Engine engine;
    private String color;
    private String name;


    protected void start() {
        System.out.println("Car starting");
    }

/*
Я бы поменяла название метода open() на isOpened() с типом возвращаемого значения boolean.
 */
    protected boolean isOpened(){
        return true;
    }

    protected void open(){
        System.out.println("Car is open");
    };

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}