import java.util.LinkedList;
package bayan.datastructures;

class HashNode<K, V> {
    K key;
    V value;

    HashNode(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

public class HashTable<K, V> {
    private LinkedList<HashNode<K, V>>[] table;
    private int capacity;

    public HashTable(int capacity) {
        this.capacity = capacity;
        table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        for (HashNode<K, V> node : table[index]) {
            if (node.key.equals(key)) {
                node.value = value; 
                return;
            }
        }
        table[index].add(new HashNode<>(key, value));
    }

    public V get(K key) {
        int index = getIndex(key);
        for (HashNode<K, V> node : table[index]) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }

    public void remove(K key) {
        int index = getIndex(key);
        HashNode<K, V> toRemove = null;
        for (HashNode<K, V> node : table[index]) {
            if (node.key.equals(key)) {
                toRemove = node;
                break;
            }
        }
        if (toRemove != null) {
            table[index].remove(toRemove);
        }
    }

    public void printTable() {
        for (int i = 0; i < capacity; i++) {
            System.out.print(i + ": ");
            for (HashNode<K, V> node : table[i]) {
                System.out.print("[" + node.key + " => " + node.value + "] ");
            }
            System.out.println();
        }
    }
}
