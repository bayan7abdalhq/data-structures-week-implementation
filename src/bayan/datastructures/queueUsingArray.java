package bayan.datastructures;

import java.util.NoSuchElementException;

public class ArrayQueue<T> {

    private T[] arr;
    private int front = 0;
    private int rear = 0;
    private int size = 0;
    private int capacity;

    @SuppressWarnings("unchecked")
    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void offer(T elem) {
        if (isFull()) throw new RuntimeException("Queue is full");
        arr[rear] = elem;
        rear = (rear + 1) % capacity;
        size++;
    }

    public T poll() {
        if (isEmpty()) throw new NoSuchElementException("Queue is empty");
        T elem = arr[front];
        arr[front] = null;
        front = (front + 1) % capacity;
        size--;
        return elem;
    }

    public T peek() {
        if (isEmpty()) throw new NoSuchElementException("Queue is empty");
        return arr[front];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        for (int i = 0; i < size; i++) {
            sb.append(arr[(front + i) % capacity]).append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
