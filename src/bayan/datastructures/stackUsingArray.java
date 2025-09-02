package bayan.datastructures;

import java.util.EmptyStackException;

public class ArrayStack<T> {

    private T[] arr;
    private int size;

    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        arr = (T[]) new Object[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(T elem) {
        if (size == arr.length) throw new RuntimeException("Stack is full");
        arr[size++] = elem;
    }

    public T pop() {
        if (isEmpty()) throw new EmptyStackException();
        T elem = arr[--size];
        arr[size] = null; // تنظيف الذاكرة
        return elem;
    }

    public T peek() {
        if (isEmpty()) throw new EmptyStackException();
        return arr[size - 1];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        for (int i = 0; i < size; i++) {
            sb.append(arr[i]).append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
