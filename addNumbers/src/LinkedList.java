class LinkedList {
    private ListNode head;
    public ListNode getHead() {
        return head;
    }

    // Setter for head
    public void setHead(ListNode head) {
        this.head = head;
    }

    // Function to add a new node to the linked list
    public void addNode(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode; // If the list is empty, set the new node as the head
        } else {
            ListNode temp = head;
            while (temp.next != null) { // Traverse to the end of the list
                temp = temp.next;
            }
            temp.next = newNode; // Append the new node at the end
        }
    }

    // Function to print all the data values in the linked list
    public void printList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        ListNode temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
