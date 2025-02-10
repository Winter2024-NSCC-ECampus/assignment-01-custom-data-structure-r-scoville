package custom_linkedlist;

public class LinkedList {

    public Node head;
    public Node tail;
    public int size = size();

    // --------------------------------------------------------------------------
    // 1. append(value) adds a new node containing value to the end of the list.
    // TODO: Refactor append() to take in only value.

    public Node append(int value) {

        Node new_node = new Node(value); // Create a new node.

        if (head == null) { // Check if the linked list is empty.
            head = new_node; // If empty, make the new node the head.
            tail = head;
        } else {
            tail = head;
            while (tail.next != null) { // If the linked list is not empty, go to end of the list.
                tail = tail.next; // Reassign the current tail.
            }
            tail.next = new_node; // Set the current tail's next to point to the new node.
            tail = tail.next; // Insert the new node at the tail.
        }
        System.out.println("New node successfully appended to linked list.");
        return head;
    }

    // --------------------------------------------------------------------------
    // 2. prepend(value) adds a new node containing value to the start of the list.
    // TODO: Refactor prepend() to take in only value.

    public Node prepend(int data) {

        Node newNode = new Node(data); // Create a new node

        newNode.next = head; // If the linked list is not empty, make the current head the next node.
        head = newNode; // Insert the new node at the head.
        System.out.println("New node successfully prepended to linked list.");
        return head;
    }

    // --------------------------------------------------------------------------
    // 3. size returns the total number of nodes in the list.

    public int size() {

        Node index = head; // Create a temporary node to loop through the LL.
        int count = 0; // Create a count variable to keep track of the size.

        while (index != null) { // Check if the LL is empty and loop through if not.
            index = index.next;
            count++; // Increment the count.
        }
        return count;
    }

    // --------------------------------------------------------------------------
    // 4. head returns the first node in the list.

    public Node head() {
        if (head != null) {
            System.out.println("The first node's address: " + head);
            System.out.println("The first node's value: " + head.value + "\n");
        } else {
            System.out.println("This list is empty. There is no head node. \n");
        }
        return head;
    }

    // --------------------------------------------------------------------------
    // 5. tail returns the last node in the list.

    public Node tail() {
        if (tail != null) {
            System.out.println("The last node's address: " + tail);
            System.out.println("The last node's value: " + tail.value + "\n");
        } else {
            System.out.println("This list is empty. There is no tail node. \n");
        }
        return tail;
    }

    // --------------------------------------------------------------------------
    // 6. at(index) returns the node at the given index.

    public Node at(int index) {

        Node currentNode = head; // Create a node to hold the value to iterate and return.
        int counter = 0;
        int indexRange = size() - 1; // Create a variable to hold the searchable index range.

        if (index > indexRange) { // Error handling for an out-of-bounds index request.
            System.out.println("The requested index is out of bounds. " +
                    "Please search for an index from 0 to " + indexRange +".");
            return null;
        } else { // Iterate through the nodes until the requested index is found.
            while (currentNode.next != null && counter < index) {
                currentNode = currentNode.next;
                counter++;
                if (counter == index)
                    break;
            }
            System.out.println("Node value at index " + index + ": " + currentNode.value);
            return currentNode;
        }
    }

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

        Node current = head; // Starting at the head, set a node to hold the current value to be printed.
        System.out.print("Linked List: ");

        while (current != null) { // Traverse through the LinkedList.
            System.out.print(current.value + " --> "); // Print the value of the current node.
            current = current.next; // Go to the next node.
        }
        System.out.print("null \n\n");
    }

}