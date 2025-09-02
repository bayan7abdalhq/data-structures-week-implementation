package bayan.datastructures;

public class CircularLinkedList<T> implements Iterable<T> {
    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) { this.data = data; }
    }

    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }

    public void add(T elem) {
        Node<T> node = new Node<>(elem);
        if (isEmpty()) {
            head = tail = node;
            tail.next = head;
        } else {
            tail.next = node;
            tail = node;
            tail.next = head;
        }
        size++;
    }

    public T removeFirst() {
        if (isEmpty()) throw new RuntimeException("Empty list");
        T data = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
        size--;
        return data;
    }

    public T peek() { return isEmpty() ? null : head.data; }

    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<>() {
            Node<T> trav = head;
            boolean firstPass = true;
            public boolean hasNext() { return trav != null && (firstPass || trav != head); }
            public T next() { T data = trav.data; trav = trav.next; firstPass = false; return data; }
        };
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";
        StringBuilder sb = new StringBuilder("[ ");
        Node<T> trav = head;
        do { sb.append(trav.data).append(", "); trav = trav.next; } while(trav != head);
        sb.append("]");
        return sb.toString();
    }
}
