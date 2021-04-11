package com.gb.lesson1.task2;

public interface Movable {

    /*
    Прописала дефолтную реализацию в ИФ для сокращения дублирующего кода.
    Если представить, что движение большинства объектов можно высчитать по одной формуле.
     */

    default void move(){
        System.out.println("Car is moving");
    };

}
