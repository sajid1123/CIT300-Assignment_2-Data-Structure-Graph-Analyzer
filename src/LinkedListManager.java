public class LinkedListManager {
    private static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    private Node head;

    public void insert(int value) {
        Node node = new Node(value);
        if (head == null) head = node;
        else {
            Node current = head;
            while (current.next != null) current = current.next;
            current.next = node;
        }
        System.out.println(value + " inserted into the linked list.");
    }

    public boolean delete(int value) {
        if (head == null) return false;
        if (head.data == value) {
            head = head.next;
            return true;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == value) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int search(int value) {
        Node current = head;
        int position = 0;
        while (current != null) {
            if (current.data == value) return position;
            current = current.next;
            position++;
        }
        return -1;
    }

    public void display() {
        if (head == null) System.out.println("Linked list is empty.");
        else System.out.println("Linked List: " + displayString());
    }

    public String displayString() {
        if (head == null) return "[]";
        StringBuilder b = new StringBuilder("[");
        Node current = head;
        while (current != null) {
            b.append(current.data);
            if (current.next != null) b.append(" -> ");
            current = current.next;
        }
        return b.append("]").toString();
    }
}
