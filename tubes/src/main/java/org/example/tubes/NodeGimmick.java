package org.example.tubes;

public class NodeGimmick<Key extends Comparable<Key>, Value> extends Node<Key, Value> {
    Runnable gimmick;

    // Constructor untuk GimmickNode
    public NodeGimmick(Key key, Value value, boolean color, String descriptionENG, String descriptionIND, Runnable gimmick) {
        super(key, value, color, descriptionENG, descriptionIND);
        this.gimmick = gimmick;
    }

    // Metode untuk menjalankan gimmick
    public void executeGimmick() {
        if (gimmick != null) {
            gimmick.run();
        } else {
            System.out.println("No gimmick to execute for key: " + key);
        }
    }
}
