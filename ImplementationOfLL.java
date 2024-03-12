class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LL {
    Node head = null;

    void addAtLast(int data) {
        Node newNode = new Node(data);
        Node cur = head;
        if (head == null) {
            head = newNode;
            return;
        }
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = newNode;

    }

    void insertionAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    void insertionAtAnywhere(int data, int pos) {
        Node newNode = new Node(data);
        Node cur = head;
        Node prev = null;
        if (head == null && pos > 1) {
            System.out.println("Insertion Not Possible");
            return;
        }
        while (pos > 1 && cur != null) {
            prev = cur;
            cur = cur.next;
            pos--;
        }
        if (pos == 1) {
            prev.next = newNode;
            newNode.next = cur;
        }
    }

    void display() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }

}

public class ImplementationOfLL {

    public static void main(String[] args) {
        LL list = new LL();
        list.insertionAtFirst(10);
        list.addAtLast(20);
        list.addAtLast(40);
        list.insertionAtAnywhere(50, 2);
        list.display();
    }
}
