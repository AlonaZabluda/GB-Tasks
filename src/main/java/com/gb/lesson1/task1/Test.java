package com.gb.lesson1.task1;

public class Test {
    public static void main(String[] args) {
        Person person = Person.newBuilder().setFirstName("John").setLastName("Smith").setAge(31).build();
        System.out.println(person.toString());

    }
}
