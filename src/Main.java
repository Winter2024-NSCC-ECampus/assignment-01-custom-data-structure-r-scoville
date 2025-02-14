import custom_linkedlist.LinkedList;

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
        ll.head = ll.append(2);
        ll.printLL();

        // 2. Prepend a new node to the start of the list.
        System.out.println("2. PREPEND:");
        ll.head = ll.prepend(1);
        ll.printLL();

        // Test the append() method again, now that the linked list is populated.
        System.out.println("APPEND (TEST 2):");
        ll.append(33);
        ll.append(400);
        ll.printLL();

        // 3. Size: return the total number of nodes in the list.
        System.out.println("3. SIZE:");
        ll.size();
        System.out.println("Total number of nodes: " + ll.size() + "\n");

        // 4. Head: return the first node in the list (both the address and the value).
        System.out.println("4. HEAD:");
        ll.head();

        // 5. Tail: return the last node in the list.
        System.out.println("5. TAIL:");
        ll.tail();

        // 6. At: return the node at the given index.
        System.out.println("6. AT:");
        ll.at(0); // Test to return the node at a valid index.
        ll.at(1); // "
        ll.at(2); // "
        ll.at(3); // "
        ll.at(4); // Test to return out-of-bounds.
        System.out.println("");

        // 7. Pop: remove the last element from the list.
        System.out.println("7. POP:");
        ll.pop();
        ll.pop();

        // 8. Contains?: return true if the passed-in value is in the list. Otherwise, return false.
        System.out.println("8. CONTAINS:");
        ll.contains(1); // Test to return true.
        ll.contains(2); // Test to return true.
        ll.contains(100); // Test to return false.

        // 9. Find: return the index of the node containing the value, or nil if not found.
        System.out.println("9. FIND:");
        ll.find(1); // Test to return a valid index.
        ll.find(2); // Test to return a valid index.
        ll.find(200); // Test to return a value not found.

    }
}