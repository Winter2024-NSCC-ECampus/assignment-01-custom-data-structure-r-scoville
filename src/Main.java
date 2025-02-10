import custom_linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {

        // Create an empty list.
        LinkedList ll = new LinkedList();

        // Test head() and tail() on an empty list.
        // ll.head();
        // ll.tail();

        // 1. Append a new node to the end of the list.
        ll.head = ll.append(2);
        ll.printLL();

        // 2. Prepend a new node to the start of the list.
        ll.head = ll.prepend(1);
        ll.printLL();

        // Test the append() method again, now that the linked list is populated.
         ll.append(3);
         ll.append(4);
         ll.printLL();

        // 3. Size: return the total number of nodes in the list.
        ll.size();

        // 4. Head: return the first node in the list (both the address and the value).
        ll.head();

        // 5. Tail: return the last node in the list.
        ll.tail();

        // 6. At: return the node at the given index.

        // 7. Pop: remove the last element from the list.

        // 8. Contains?: return true if the passed-in value is in the list. Otherwise, return false.

        // 9. Find: return the index of the node containing the value, or nil if not found.

    }
}