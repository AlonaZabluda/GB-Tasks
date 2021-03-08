package com.gb.lesson2.task2;

public class Test {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>(12){{
            add(4);
            add(1);
            add(7);
            add(3);
            add(5);
        }};

        list.add(1, 11);
        System.out.println(list);
        list.remove((Integer) 1);
        System.out.println(list);
        list.set(4, 12);
        System.out.println(list.indexOf(5));
    }
}
