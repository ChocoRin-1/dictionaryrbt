package org.example.tubes;

import java.util.ArrayList;
import java.util.List;

public class rbt<Key extends Comparable<Key>, Value> {
    private static final boolean RED = true;
    private static final boolean BLACK = false;

   

    private Node<Key, Value> root;

    private boolean isRed(Node<Key, Value> node) {
        if (node == null)
            return false;
        return node.color == RED;
    }

    private Node<Key, Value> rotateLeft(Node<Key, Value> h) {
        Node<Key, Value> x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }

    private Node<Key, Value> rotateRight(Node<Key, Value> h) {
        Node<Key, Value> x = h.left;
        h.left = x.right;
        x.right = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }

    private void flipColors(Node<Key, Value> h) {
        h.color = RED;
        h.left.color = BLACK;
        h.right.color = BLACK;
    }

    public void put(Key key, Value value, String description) {
        root = put(root, key, value, description);
        root.color = BLACK;
    }

    private Node<Key, Value> put(Node<Key, Value> h, Key key, Value value, String description) {
        if (h == null)
            return new Node(key, value, RED, description);
        int cmp = key.compareTo(h.key);
        if (cmp < 0)
            h.left = put(h.left, key, value, description);
        else if (cmp > 0)
            h.right = put(h.right, key, value, description);
        else
            h.value = value;

        if (isRed(h.right) && !isRed(h.left))
            h = rotateLeft(h);
        if (isRed(h.left) && isRed(h.left.left))
            h = rotateRight(h);
        if (isRed(h.left) && isRed(h.right))
            flipColors(h);

        return h;
    }

    public Value get(Key key) {
        Node<Key, Value> x = root;
        while (x != null) {
            int cmp = key.compareTo(x.key);
            if (cmp < 0)
                x = x.left;
            else if (cmp > 0)
                x = x.right;
            else
                return x.value;
        }
        return null;
    }

    public boolean containsKey(Key key) {
        return get(key) != null;
    }

    public List<Node<Key, Value>> searchBySubstring(String substring) {
        List<Node<Key, Value>> results = new ArrayList<>();
        searchBySubstring(root, substring, results);
        return results;
    }

    private void searchBySubstring(Node<Key, Value> node, String substring, List<Node<Key, Value>> results) {
        if (node == null)
            return;

        // Lakukan in-order traversal
        searchBySubstring(node.left, substring, results);

        // Periksa apakah key mengandung substring
        if (node.key.toString().contains(substring)) {
            results.add(node);
        }

        searchBySubstring(node.right, substring, results);
    }

}