package custom_linkedlist;

public class LinkedList {

    public Node head;
    public Node tail;

    // --------------------------------------------------------------------------
    // 1. append(value) adds a new node containing value to the end of the list.
    // TODO: Refactor append() to take in only value.

    public Node append(int value) {

        Node new_node = new Node(value); // Create a new node.

        if (this.head == null) { // Check if the linked list is empty.
            this.head = new_node; // If empty, make the new node the head.
            this.tail = this.head;
        } else {
            this.tail = this.head;
            while (this.tail.next != null) { // If the linked list is not empty, go to end of the list.
                this.tail = this.tail.next; // Reassign the current tail.
            }
            this.tail.next = new_node; // Set the current tail's next to point to the new node.
            this.tail = this.tail.next; // Insert the new node at the tail.
        }
        System.out.println("New node successfully appended to linked list.");
        return this.head;
    }

    // --------------------------------------------------------------------------
    // 2. prepend(value) adds a new node containing value to the start of the list.
    // TODO: Refactor prepend() to take in only value.

    public Node prepend(int data) {

        Node newNode = new Node(data); // Create a new node

        newNode.next = this.head; // If the linked list is not empty, make the current head the next node.
        this.head = newNode; // Insert the new node at the head.

        System.out.println("New node successfully prepended to linked list.");
        return this.head;
    }

    // --------------------------------------------------------------------------
    // 3. size returns the total number of nodes in the list.

    public int size() {
        Node index = this.head; // Create a temporary node to loop through the LL.
        int count = 0; // Create a count variable to keep track of the size.
        while (index != null) { // Check if the LL is empty and loop through if not.
            index = index.next;
            count++; // Increment the count.
        }
        System.out.println("Total number of nodes: " + count + "\n");
        return count;
    }

    // --------------------------------------------------------------------------
    // 4. head returns the first node in the list.

    public Node head() {
        if (this.head != null) {
            System.out.println("The first node's address: " + this.head);
            System.out.println("The first node's value: " + this.head.value + "\n");
        } else {
            System.out.println("This list is empty. There is no head node. \n");
        }
        return this.head;
    }

    // --------------------------------------------------------------------------
    // 5. tail returns the last node in the list.

    public Node tail() {
        if (this.tail != null) {
            System.out.println("The last node's address: " + this.tail);
            System.out.println("The last node's value: " + this.tail.value + "\n");
        } else {
            System.out.println("This list is empty. There is no tail node. \n");
        }
        return this.tail;
    }

    // --------------------------------------------------------------------------
    // 6. at(index) returns the node at the given index.

//    public Node at(int index) {
//        Node currentNode = this.head;
//
//        return currentNode;
//    }

    // --------------------------------------------------------------------------
    // 7. pop removes the last element from the list.
    // TODO

    // -------------------------------------------------------------------------------------------------
    // 8. contains?(value) returns true if the passed in value is in the list and otherwise returns false.
    // TODO

    // ---------------------------------------------------------------------------------
    // 9. find(value) returns the index of the node containing value, or nil if not found.
    // TODO

    // ---------------------------------------------------------------------------------
    // BONUS: printLL() prints the LinkedList that called it.

    public void printLL() {

        Node current = this.head; // Starting at the head, set a node to hold the current value to be printed.
        System.out.print("Linked List: ");

        while (current != null) { // Traverse through the LinkedList.
            System.out.print(current.value + " "); // Print the value of the current node.
            current = current.next; // Go to the next node.
        }
        System.out.print("\n\n");
    }

}