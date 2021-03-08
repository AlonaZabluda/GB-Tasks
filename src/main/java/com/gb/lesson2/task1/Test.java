package com.gb.lesson2.task1;

public class Test {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>(){{
            add("First");
            add("Second");
            add("Third");
        }};
        System.out.println(list);
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list.indexOf("Third"));
        System.out.println(list.contains("Second"));
        System.out.println(list.size());
    }
}
