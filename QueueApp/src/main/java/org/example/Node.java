package org.example;

public class Node<T> {
    private Node next = null;
    private T value;

    public Node getNext() {
        return next;
    }

    public Node(T value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

