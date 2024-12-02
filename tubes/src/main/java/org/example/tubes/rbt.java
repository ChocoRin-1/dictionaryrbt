package org.example.tubes;

import java.util.ArrayList;
import java.util.List;

public class rbt<Key extends Comparable<Key>, Value> {
    private static final boolean RED = true;
    private static final boolean BLACK = false;

    private Node<Key, Value> root;

    // Check if a node is red
    private boolean isRed(Node<Key, Value> node) {
        if (node == null)
            return false;
        return node.color == RED;
    }

    // Rotate left
    private Node<Key, Value> rotateLeft(Node<Key, Value> h) {
        Node<Key, Value> x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }

    // Rotate right
    private Node<Key, Value> rotateRight(Node<Key, Value> h) {
        Node<Key, Value> x = h.left;
        h.left = x.right;
        x.right = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }

    // Flip colors
    private void flipColors(Node<Key, Value> h) {
        h.color = RED;
        h.left.color = BLACK;
        h.right.color = BLACK;
    }

    // Add a key-value pair to the tree with a gimmick
    public void put(Key key, Value value, String descriptionENG, String descriptionIND) {
        root = put(root, key, value, descriptionENG, descriptionIND);
        root.color = BLACK;
    }

    public void putNode(Node<Key, Value> node) {
        root = putNodeHelper(root, node);
        root.color = BLACK;
    }

    private Node<Key, Value> putNodeHelper(Node<Key, Value> h, Node<Key, Value> node) {
        if (h == null)
            return node;

        int cmp = node.key.compareTo(h.key);
        if (cmp < 0)
            h.left = putNodeHelper(h.left, node);
        else if (cmp > 0)
            h.right = putNodeHelper(h.right, node);
        else {
            h.value = node.value; // Update value if key already exists
           
        }

        // Balance the tree
        if (isRed(h.right) && !isRed(h.left))
            h = rotateLeft(h);
        if (isRed(h.left) && isRed(h.left.left))
            h = rotateRight(h);
        if (isRed(h.left) && isRed(h.right))
            flipColors(h);

        return h;
    }


    // Helper method to recursively put a key-value pair in the tree
    private Node<Key, Value> put(Node<Key, Value> h, Key key, Value value, String descriptionENG, String descriptionIND) {
        if (h == null)
            return new Node<>(key, value, RED, descriptionENG, descriptionIND);

        int cmp = key.compareTo(h.key);
        if (cmp < 0)
            h.left = put(h.left, key, value, descriptionENG, descriptionIND);
        else if (cmp > 0)
            h.right = put(h.right, key, value, descriptionENG, descriptionIND);
        else {
            h.value = value; // Update value if key already exists
           
        }

        // Balance the tree
        if (isRed(h.right) && !isRed(h.left))
            h = rotateLeft(h);
        if (isRed(h.left) && isRed(h.left.left))
            h = rotateRight(h);
        if (isRed(h.left) && isRed(h.right))
            flipColors(h);

        return h;
    }

    // Get the value of a key
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

    // Check if the tree contains a key
    public boolean containsKey(Key key) {
        return get(key) != null;
    }

    public List<Node<Key, Value>> searchBySubstring(String substring) {
        List<Node<Key, Value>> results = new ArrayList<>();
        searchBySubstring(root, substring, results);
        return results;
    }
    
    // Helper method for the in-order traversal search
    private void searchBySubstring(Node<Key, Value> node, String substring, List<Node<Key, Value>> results) {
        if (node == null)
            return;
    
        // In-order traversal
        searchBySubstring(node.left, substring, results);
    
        // Ensure case-insensitive comparison and handle nulls
        if (node.key != null && node.key.toString().toLowerCase().contains(substring.toLowerCase())) {
            results.add(node);
        }
    
        searchBySubstring(node.right, substring, results);
    }
    
    public List<Node<Key, Value>> searchByValueSubstrings(String substring) {
        List<Node<Key, Value>> results = new ArrayList<>();
        searchByValueSubstring(root, substring, results);
        return results;
    }
    
    private void searchByValueSubstring(Node<Key, Value> node, String substring, List<Node<Key, Value>> results) {
        if (node == null)
            return;
    
        searchByValueSubstring(node.left, substring, results);
        
        // Ensure case-insensitive comparison and handle nulls
        if (node.value != null && node.value.toString().toLowerCase().contains(substring.toLowerCase())) {
            results.add(node);
        }
    
        searchByValueSubstring(node.right, substring, results);
    }
    


    // // Search for keys that contain a substring
    // public List<Node<Key, Value>> searchBySubstring(String substring) {
    //     List<Node<Key, Value>> results = new ArrayList<>();
    //     searchBySubstring(root, substring, results);
    //     // System.out.println(results);
    //     return results;
    // }

    // // Helper method for the in-order traversal search
    // private void searchBySubstring(Node<Key, Value> node, String substring, List<Node<Key, Value>> results) {
    //     if (node == null)
    //         return;

    //     // In-order traversal
    //     searchBySubstring(node.left, substring, results);

    //     // Check if the key contains the substring
    //     if (node.key.toString().contains(substring)) {
    //         results.add(node);
    //     }

    //     searchBySubstring(node.right, substring, results);
    // }

    // public List<Node<Key, Value>> searchByValueSubstrings(String subsString) {
    //     List<Node<Key, Value>> results = new ArrayList<>();
    //     searchByValueSubstring(root, subsString, results);
    //     return results;
    // }

    // private void searchByValueSubstring(Node<Key, Value> node, String substring, List<Node<Key, Value>> results) {
    //     if (node == null)
    //         return;

    //     searchByValueSubstring(node.left, substring, results);
    //     if (node.value.toString().contains(substring)) {
    //         results.add(node);
    //     }

    //     searchByValueSubstring(node.right, substring, results);
    // }
}
