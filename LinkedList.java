package DataStructures;

public class LinkedList {
    Node head;
    public static class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void prepend(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void append(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
            currNode.next = newNode;
    }

    public void printList(){

        if (head == null){
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.prepend("am");
        list.prepend("i");


        // Print the LinkedList
        list.printList();

        list.append("Sharad");
        list.printList();
    }
}

