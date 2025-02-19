package custom_linkedlist;

public class LinkedList {

    public Node head;

    // --------------------------------------------------------------------------
    // 1. append(value) adds a new node containing value to the end of the list.

    public Node append(int value) {
        Node newNode = new Node(value);
        Node currentNode = head;
        if (head == null) { // Check if the linked list is empty.
            head = newNode; // If empty, make the new node the head.
        } else {
            while (currentNode.next != null) { // If the linked list is not empty, go to end of the list.
                currentNode = currentNode.next; // Reassign the current tail.
            }
            currentNode.next = newNode; // Set the current tail's next to point to the new node.
        }
        return head;
    }


    // --------------------------------------------------------------------------
    // 2. prepend(value) adds a new node containing value to the start of the list.

    public Node prepend(int value) {
        Node newNode = new Node(value);
        newNode.next = head; // If the linked list is not empty, make the current head the next node.
        head = newNode; // Insert the new node at the head.
        return head;
    }


    // --------------------------------------------------------------------------
    // 3. size returns the total number of nodes in the list.

    public int size() {
        Node index = head;
        int count = 0;
        while (index != null) { // Check if the LL is empty and loop through if not.
            index = index.next;
            count++; // Increment the count.
        }
        return count;
    }


    // --------------------------------------------------------------------------
    // 4. head returns the first node in the list.

    public Node head() {
        if (head != null) { // Check for an empty list.
            return head;
        } else {
            return null;
        }
    }


    // --------------------------------------------------------------------------
    // 5. tail returns the last node in the list.

    public Node tail() {
        Node currentNode = head; // Begin at the start of the list.
        if (currentNode != null) { // Check for an empty list.
            while (currentNode.next != null) { // Iterate through the list if it is not empty.
                currentNode = currentNode.next;
            }
            return currentNode;
        } else {
            return null;
        }
    }


    // --------------------------------------------------------------------------
    // 6. at(index) returns the node at the given index.

    public Node at(int index) {
        Node currentNode = head;
        int counter = 0;
        int indexRange = size() - 1;
        if (index > indexRange) { // Error handling for an out-of-bounds index request.
            System.out.println("The requested index is out of bounds. " +
                    "Please search for an index from 0 to " + indexRange +".");
            currentNode = null;
        } else { // Iterate through the nodes until the requested index is found.
            while (currentNode.next != null && counter < index) {
                currentNode = currentNode.next;
                counter++;
                if (counter == index)
                    break;
            }
        }
        return currentNode; // Return the node at the given index if it exists.
    }


    // --------------------------------------------------------------------------
    // 7. pop removes the last element from the list.

    public Node pop() {
        if (head != null) { // Check if the list contains any nodes.
            Node currentNode = head;
            Node prevNode = currentNode;
            while (currentNode.next != null) { // Iterate through the linked list to find the last node.
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
            prevNode.next = null; // Set the second-last node to be the new tail.
            return currentNode; // Return the popped node.
        } else {
            System.out.println("There is no node to pop. This linked list is empty.");
            return null; // We have no node to return.
        }
    }


    // -------------------------------------------------------------------------------------------------
    // 8. contains?(value) returns true if the passed in value is in the list and otherwise returns false.

    public boolean contains(int value) {
        boolean containsValue = false; // Create variable to hold the return.
        Node currentNode = head; // Create variable to hold the current node as the function iterates.
        int listSize = size();
        // Iterate through the linked list and compare each node value to the value requested.
        for (int i = 0; i < listSize; i++) {
            if (currentNode.value == value) {
                containsValue = true; // If the value is found, return true.
                break;
            } else if (currentNode.next != null) {
                currentNode = currentNode.next;
            }
        }
        return containsValue; // If the value is not in the list, return false.
    }


    // ---------------------------------------------------------------------------------
    // 9. find(value) returns the index of the node containing value, or nil if not found.

    public Integer find(Integer value) { // Returning Integer allows us to return null in Java, whereas int does not.
        Integer index = 0;
        Node currentNode = head;
        int listSize = size();
        if (head == null) { // Check if the linked list is empty.
            System.out.println("The linked list is empty. There is nothing to find. :(");
        } else {
            // Iterate through the linked list and compare each node value to the requested value.
            for (int i = 0; i < listSize; i++) {
                if (currentNode.value == value) {
                    break;
                } else if (currentNode.next != null) {
                    currentNode = currentNode.next;
                    index++;
                } else {
                    return null;
                }
            }
        }
        return index;
    }


    // ---------------------------------------------------------------------------------
    // BONUS: printLL() prints the LinkedList that called it.

    public void printLL() {
        Node current = head; // Starting at the head, set a node to hold the current value to be printed.
        while (current != null) { // Traverse through the LinkedList.
            System.out.print(current.value + " --> "); // Print the value of the current node.
            current = current.next; // Go to the next node.
        }
        System.out.print("null \n");
    }

}