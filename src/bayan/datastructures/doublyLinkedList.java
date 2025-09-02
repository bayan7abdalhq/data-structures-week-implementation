package bayan.datastructures;

public class DoublyLinkedList<T> implements Iterable<T> {
    private Node<T> head = null, tail = null;
    private int size = 0;

    private static class Node<T> {
        T data;
        Node<T> prev, next;
        Node(T data, Node<T> prev, Node<T> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }

    public void addFirst(T elem) {
        Node<T> node = new Node<>(elem, null, head);
        if (isEmpty()) tail = node;
        else head.prev = node;
        head = node;
        size++;
    }

    public void addLast(T elem) {
        Node<T> node = new Node<>(elem, tail, null);
        if (isEmpty()) head = node;
        else tail.next = node;
        tail = node;
        size++;
    }

    public T removeFirst() {
        if (isEmpty()) throw new RuntimeException("Empty list");
        T data = head.data;
        head = head.next;
        size--;
        if (isEmpty()) tail = null;
        else head.prev = null;
        return data;
    }

    public T removeLast() {
        if (isEmpty()) throw new RuntimeException("Empty list");
        T data = tail.data;
        tail = tail.prev;
        size--;
        if (isEmpty()) head = null;
        else tail.next = null;
        return data;
    }

    public T peekFirst() { return isEmpty() ? null : head.data; }
    public T peekLast() { return isEmpty() ? null : tail.data; }

    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<>() {
            Node<T> trav = head;
            public boolean hasNext() { return trav != null; }
            public T next() { T data = trav.data; trav = trav.next; return data; }
        };
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        Node<T> trav = head;
        while (trav != null) { sb.append(trav.data).append(", "); trav = trav.next; }
        sb.append("]");
        return sb.toString();
    }
}
