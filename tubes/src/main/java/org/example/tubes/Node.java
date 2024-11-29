package org.example.tubes;

public class Node<Key extends Comparable<Key>, Value> {
    Key key;
    Value value;
    String descriptionENG,descriptionIND;
    Node<Key, Value> left, right;
    boolean color;

    Node(Key key, Value value, boolean color, String descriptionENG, String descriptionIND) {
        this.key = key;
        this.value = value;
        this.color = color;
        this.descriptionENG = descriptionENG;
        this.descriptionIND = descriptionIND;
    }
}

// public class Node {
//     String key, value;
//     Node left, right, parent;
//     boolean red;

//     public Node(String key,String value) {
//         this.key = key;
//         this.red = true; 
//         this.value = value;
//     }

//     public void setRight(Node right) {
//         this.right = right;
//     }

//     public void setLeft(Node left) {
//         this.left = left;
//     }

//     public void setParent(Node parent) {
//         this.parent = parent;
//     }

//     public void setRed(boolean red) {
//         this.red = red;
//     }

//     public Node getRight() {
//         return right;
//     }

//     public Node getLeft() {
//         return left;
//     }

//     public Node getParent() {
//         return parent;
//     }

//     public String getKey() {
//         return key;
//     }

//     public String getValue() {
//         return value;
//     }

//     public boolean isRed() {
//         return red;
//     }

// }

