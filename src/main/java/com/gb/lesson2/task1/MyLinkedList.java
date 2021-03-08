package com.gb.lesson2.task1;

import java.util.Arrays;
import java.util.NoSuchElementException;


// Реализован односвязный список
public class MyLinkedList<T> {
    private Node head;
    private int size;


    public void add(T value){
        if(head == null){
            this.head = new Node(value);
        }else{
            Node temp = head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));
        }
        size++;
    }

    public T get(int index){
        int currentIndex = 0;
        Node temp = head;

        while(temp != null){
            if(currentIndex == index){
                return (T) temp.getValue();
            }else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
        throw new IllegalArgumentException();
    }

    public T getFirst() {
        Node temp = head;
        if (temp != null) {
            return (T) head.getValue();
        }
        throw new NoSuchElementException();
    }

    public void remove(int index){
        int currentIndex = 0;
        Node temp = head;

        while(temp != null){
            if (index == 0){
                head = head.getNext();
                size--;
                return;
            }else if(currentIndex == index - 1){
                temp.setNext(temp.getNext().getNext());
                size--;
                return;
            }else {
                temp = temp.getNext();
                currentIndex++;
            }
        }

    }

    public T removeFirst() {
        T temp = getFirst();
        head = head.getNext();
        size--;
        return temp;
    }

    public final int indexOf(T item) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.getValue().equals(item)) {
                return index;
            }
            current = current.getNext();
            index++;
        }
        return -1;
    }

    public boolean contains(T item) {
        return indexOf(item) > -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        T[] array = (T[]) new Object[size];
        int index = 0;
        Node temp = head;
        while (temp != null){
            array[index++] = (T) temp.getValue();
            temp = temp.getNext();
        }
        return Arrays.toString(array);
    }

    private static class Node<T>{
        private T value;
        private Node next;

        public Node(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
