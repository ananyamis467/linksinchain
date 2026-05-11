package org.example;

public class SinglyLinkedList {

    private Node head;

    /* Creates an empty list */
    public SinglyLinkedList() {
        this.head = null;
    }

    // ------------------------------------------------------------------ 
    //  Insertion                                                           
    // ------------------------------------------------------------------ 
    public Node append(Link link) {
        Node newNode = new Node(link);

        if (head == null) {
            head = newNode;
            return newNode;
        }

        // Walk to the tail and attach
        Node current = head;
        while (current.next() != null) {
            current = current.next();
        }
        current.setNext(newNode);
        return newNode;
    }

    public Node insertAfter(Link link, Link attachAfter) {
        Node current = head;

        while (current != null) {
            if (current.getData() == attachAfter) {
                Node newNode = new Node(link);
                newNode.setNext(current.next());
                current.setNext(newNode);
                return newNode;
            }
            current = current.next();
        }

        System.out.println("Warning: attachAfter Link not found in list.");
        return null;
    }

    // ------------------------------------------------------------------ 
    //  Traversal                                                           
    // ------------------------------------------------------------------ 

    public void traverse() {
        System.out.print("HEAD -> ");
        Node current = head;
        while (current != null) {
            System.out.print("[" + current.getData().getMaterial() + "]");
            if (current.next() != null) {
                System.out.print(" -> ");
            }
            current = current.next();
        }
        System.out.println(" -> NULL");
    }
}
