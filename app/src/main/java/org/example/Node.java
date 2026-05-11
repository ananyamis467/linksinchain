package org.example;

public class Node {
    private Link data;
    private Node nextNode;

    public Node(Link data) {
        this.data = data;
        this.nextNode = null;
    }

    public Node(Link data, Link attachAfter) {
        this.data = data;
        this.nextNode = null;
    }

    // ------------------------------------------------------------------ 
    //  Package-visible helpers used by SinglyLinkedList                   
    // ------------------------------------------------------------------ 

    /** Returns the Link stored in this node. */
    Link getData() {
        return data;
    }

    /** Returns the next node, or null if this is the tail. */
    public Node next() {
        return nextNode;
    }

    /** Sets the next pointer (used by the list during insertion). */
    void setNext(Node node) {
        this.nextNode = node;
    }

    @Override
    public String toString() {
        return "Node{" + data.getMaterial() + "}";
    }
}
