package custom_linkedlist;

public class LinkedList {

    public Node head;
    public Node tail;
    private int size;

    // --------------------------------------------------------------------------
    // 1. append(value) adds a new node containing value to the end of the list.
    // TODO: Refactor append() to take in only value.

    public Node append(LinkedList ll, int value) {

        Node new_node = new Node(value); // Create a new node.

        if (ll.head == null) { // Check if the linked list is empty.
            ll.head = new_node; // If empty, make the new node the head.
            ll.tail = ll.head;
        } else {
            ll.tail = ll.head;
            while (ll.tail.next != null) { // If the linked list is not empty, go to end of the list.
                ll.tail = ll.tail.next; // Reassign the current tail.
            }
            ll.tail.next = new_node; // Set the current tail's next to point to the new node.
            ll.tail = ll.tail.next; // Insert the new node at the tail.
        }
        ll.size++; // This keeps track of the linked list's size.
        return ll.head;
    }

    // --------------------------------------------------------------------------
    // 2. prepend(value) adds a new node containing value to the start of the list.
    // TODO: Refactor prepend() to take in only value.

    public Node prepend(int data, Node head) {

        Node newNode = new Node(data); // Create a new node

        if (head == null) { // Check if the linked list is empty.
            head = newNode; // If empty, make the new node the head.
        } else {
            newNode.next = head; // If the linked list is not empty, make the current head the next node.
            head = newNode; // Insert the new node at the head.
        }
        size++; // This keeps track of the linked list's size.
        return head;
    }

    // --------------------------------------------------------------------------
    // 3. size returns the total number of nodes in the list.
    public int size() {
        System.out.println("Total number of nodes: " + this.size);
        return this.size;
    }

    // --------------------------------------------------------------------------
    // 4. head returns the first node in the list.
    public Node head() {
        if (this.head != null) {
            System.out.println("The first node's address: " + this.head);
            System.out.println("The first node's value: " + this.head.value);
        } else {
            System.out.println("This list is empty. There is no head node.");
        }
        return this.head;
    }

    // --------------------------------------------------------------------------
    // 5. tail returns the last node in the list.
    public Node tail() {
        if (this.tail != null) {
            System.out.println("The last node's address: " + this.tail);
            System.out.println("The last node's value: " + this.tail.value);
        } else {
            System.out.println("This list is empty. There is no tail node.");
        }
        return this.tail;
    }

    // --------------------------------------------------------------------------
    // 6. at(index) returns the node at the given index.
    // TODO

    // --------------------------------------------------------------------------
    // 7. pop removes the last element from the list.
    // TODO

    // -------------------------------------------------------------------------------------------------
    // 8. contains?(value) returns true if the passed in value is in the list and otherwise returns false.
    // TODO

    // ---------------------------------------------------------------------------------
    // 9. find(value) returns the index of the node containing value, or nil if not found.
    // TODO

    // BONUS: print() prints the LinkedList that called it.
    public void print() {

        Node current = this.head; // Starting at the head, set a node to hold the current value to be printed.
        System.out.print("Linked List: ");

        while (current != null) { // Traverse through the LinkedList.
            System.out.print(current.value + " "); // Print the value of the current node.
            current = current.next; // Go to the next node.
        }
        System.out.print("\n");
    }

//    public static void main(String[] args) {
//    }

}