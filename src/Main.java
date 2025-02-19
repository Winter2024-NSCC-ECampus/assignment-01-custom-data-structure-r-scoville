import custom_linkedlist.LinkedList;
import custom_linkedlist.Node;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        // Create an empty list.
        LinkedList ll = new LinkedList();

        // Test head() and tail() on an empty list.
        // ll.head();
        // ll.tail();

        // 1. Append a new node to the end of the list.
        System.out.println("1. APPEND:");
        Node newNode = ll.append(2);
        if (newNode != null) {
            System.out.println("Success! A new node with a value of '" + newNode.value + "' was appended to the linked list.");
        } else {
            System.out.println("Error: No node was appended.");
        }
        ll.printLL();

        System.out.println("______________________________________");

        // 2. Prepend a new node to the start of the list.
        System.out.println("2. PREPEND:");
        newNode = ll.prepend(1);
        if (newNode != null) {
            System.out.println("Success! A new node with a value of '" + newNode.value + "' was prepended to the linked list.");
        } else {
            System.out.println("Error: No node was prepended.");
        }
        ll.printLL();

        System.out.println("______________________________________");

        // Test the append() method again, now that the linked list is populated.
        System.out.println("APPEND (TEST 2):");
        ll.append(33);
        ll.append(400);
        ll.printLL();

        System.out.println("______________________________________");

        // 3. Size: return the total number of nodes in the list.
        System.out.println("3. SIZE:");
        System.out.println("Total number of nodes: " + ll.size());

        System.out.println("______________________________________");

        // 4. Head: return the first node in the list (both the address and the value).
        System.out.println("4. HEAD:");
        Node head = ll.head();
        if (head == null) {
            System.out.println("This list is empty. There is no head node.");
        } else {
            System.out.println("The first node's address: " + head);
            System.out.println("The first node's value: " + head.value);
        }

        System.out.println("______________________________________");

        // 5. Tail: return the last node in the list.
        System.out.println("5. TAIL:");
        Node tail = ll.tail();
        if (head == null) {
            System.out.println("This list is empty. There is no tail node.");
        } else {
            System.out.println("The last node's address: " + tail);
            System.out.println("The last node's value: " + tail.value);
        }

        System.out.println("______________________________________");

        // 6. At: return the node at the given index.
        System.out.println("6. AT:");

        // Tests to return the node at a valid index.
        int index = 0;
        newNode = ll.at(index);
        System.out.println("Node value at index " + index + ": " + newNode.value);

        index = 1;
        newNode = ll.at(index);
        System.out.println("Node value at index " + index + ": " + newNode.value);

        index = 2;
        newNode = ll.at(index);
        System.out.println("Node value at index " + index + ": " + newNode.value);

        index = 3;
        newNode = ll.at(index);
        System.out.println("Node value at index " + index + ": " + newNode.value);

        // Testing an invalid index request
        index = 4;
        ll.at(index);

        System.out.println("______________________________________");

        // 7. Pop: remove the last element from the list.
        System.out.println("7. POP:");
        newNode = ll.pop();
        System.out.println("Popped node:");
        System.out.println("- Value: " + newNode.value);
        System.out.println("- Address: " + newNode);
        System.out.println("Updated linked list:");
        ll.printLL();

        System.out.println("______________________________________");

        // 8. Contains?: return true if the passed-in value is in the list. Otherwise, return false.
        System.out.println("8. CONTAINS:");

        // Test to return true
        int value = 1;
        boolean containsValue = ll.contains(value);
        System.out.println("The linked list contains the value '" + value + "': " + containsValue);

        // Test to return false.
        value = 100;
        containsValue = ll.contains(value);
        System.out.println("The linked list contains the value '" + value + "': " + containsValue);

        System.out.println("______________________________________");

        // 9. Find: return the index of the node containing the value, or nil if not found.
        System.out.println("9. FIND:");

        // Test to return a valid index
        int requestedValue = 2;
        Integer returnedIndex = ll.find(requestedValue);
        if (returnedIndex == null) {
            System.out.println("The value '" + requestedValue + "' was not found.");
        } else {
            System.out.println("Success! The value '" + requestedValue + "' was found at index " + returnedIndex + ".");
        }

        // Test to return a value not found.
        requestedValue = 200;
        returnedIndex = ll.find(requestedValue);
        if (returnedIndex == null) {
            System.out.println("The value '" + requestedValue + "' was not found.");
        } else {
            System.out.println("Success! The value '" + requestedValue + "' was found at index " + returnedIndex + ".");
        }

    }
}