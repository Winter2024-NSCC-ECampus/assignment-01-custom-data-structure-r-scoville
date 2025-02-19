package custom_linkedlist;

public class Node {

    public int value;
    Node next;

    // Constructor
    Node(int value) {
        this.value = value;
        this.next = null; // Note: this should initialize by default to null.
    }

}