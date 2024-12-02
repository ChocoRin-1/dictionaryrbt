package org.example.tubes;

public class NodeGimmick<Key extends Comparable<Key>, Value> extends Node<Key, Value> {
    ValueFunction gimmick;
    private Key key;

    // Constructor untuk GimmickNode
    public NodeGimmick(Key key, Value value, String descriptionENG, String descriptionIND, ValueFunction gimmick) {
        super(key, value, true, descriptionENG, descriptionIND);
        this.gimmick = gimmick;
        this.key = key;
    }

    @FunctionalInterface
    public interface ValueFunction<Key extends Comparable<Key>> {
        Object apply(Key key);
    }

    public void getGimmick() {
        gimmick.apply(key);
    }
    
        
    
}
