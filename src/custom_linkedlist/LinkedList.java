package custom_linkedlist;

public class LinkedList {

        LLNode head;
        LLNode tail;

        // --------------------------------------------------------------------------
        // #append(value) adds a new node containing value to the end of the list.
        // TODO

        // --------------------------------------------------------------------------
        // #prepend(value) adds a new node containing value to the start of the list.

        LLNode prepend(int key, LLNode head) {
                LLNode temp = new LLNode(key);
                if(head == null) {
                        head = temp;
                } else {
                        temp.next = head;
                        head = temp;
                }
                return head;
        }

        // --------------------------------------------------------------------------
        // #size returns the total number of nodes in the list.
        // TODO

        // --------------------------------------------------------------------------
        // #head returns the first node in the list.
        // TODO

        // --------------------------------------------------------------------------
        // #tail returns the last node in the list.
        // TODO

        // --------------------------------------------------------------------------
        // #at(index) returns the node at the given index.
        // TODO

        // --------------------------------------------------------------------------
        // #pop removes the last element from the list.
        // TODO

        // -------------------------------------------------------------------------------------------------
        // #contains?(value) returns true if the passed in value is in the list and otherwise returns false.
        // TODO

        // ---------------------------------------------------------------------------------
        // #find(value) returns the index of the node containing value, or nil if not found.
        // TODO

        public static void main(String[] args) {
                System.out.println("End of program");
        }

}