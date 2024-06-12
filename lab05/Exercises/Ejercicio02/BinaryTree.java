import java.util.*;

public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root;

    private static class Node<T> {
        T data;
        Node<T> left, right;

        Node(T data) {
            this.data = data;
            left = right = null;
        }
    }
    public BinaryTree() {
        root = null;
    }

    // Método para insertar un nuevo nodo en el árbol
    public void insert(T data) {
        root = insertRec(root, data);
    }

    // Método recursivo 
    private Node<T> insertRec(Node<T> root, T data) {
        if (root == null) {
            root = new Node<>(data);
            return root;
        }

        if (data.compareTo(root.data) < 0) {
            root.left = insertRec(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }
    public void inorder() {
        inorderRec(root);
    }

    // Método recursivo para imprimir el árbol en orden
    private void inorderRec(Node<T> root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
    public boolean isEmpty() {
        return root == null;
    }
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        // Simula la inserción de 100 datos
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            tree.insert(rand.nextInt(1000)); 
        }
        // Imprimir el árbol en orden
        tree.inorder();
    }
}