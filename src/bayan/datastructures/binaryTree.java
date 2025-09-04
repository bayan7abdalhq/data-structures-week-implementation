package bayan.datastructures;

public class BinaryTree<T> {
    private Node<T> root;

    private static class Node<T> {
        T data;
        Node<T> left, right;
        Node(T data) {
            this.data = data;
        }
    }

    public void setRoot(T data) {
        root = new Node<>(data);
    }

    public Node<T> getRoot() {
        return root;
    }

    public void addLeft(Node<T> parent, T data) {
        parent.left = new Node<>(data);
    }

    public void addRight(Node<T> parent, T data) {
        parent.right = new Node<>(data);
    }

    public void preorder(Node<T> node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void inorder(Node<T> node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public void postorder(Node<T> node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }
}
