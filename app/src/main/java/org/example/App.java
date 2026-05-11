package org.example;

//driver
public class App {

    public static void main(String[] args) {

        // --- Build Link objects 
        Link gold   = new Link("Gold");
        Link silver = new Link("Silver");
        Link bronze = new Link("Bronze");

        // --- Build the list 
        SinglyLinkedList list = new SinglyLinkedList();

        Node nodeOne   = list.append(gold);          // HEAD: [Gold]
        Node nodeTwo   = list.insertAfter(silver, gold);   // [Gold] -> [Silver]
        Node nodeThree = list.insertAfter(bronze, silver); // [Gold] -> [Silver] -> [Bronze]

        // --- Traverse from HEAD 
        System.out.println("Full traversal:");
        list.traverse();

        // --- Manual traversal via next()
        System.out.println("\nManual traversal starting from nodeOne:");
        Node retrievedTwo   = nodeOne.next();   // Silver node
        Node retrievedThree = nodeTwo.next();   // Bronze node

        System.out.println("nodeOne      -> " + nodeOne.getData().getMaterial());
        System.out.println("retrievedTwo -> " + retrievedTwo.getData().getMaterial());
        System.out.println("retrievedThree -> " + retrievedThree.getData().getMaterial());

        // --- Confirm tail 
        System.out.println("\nnodeThree.next() is null: " + (nodeThree.next() == null));
    }
}
