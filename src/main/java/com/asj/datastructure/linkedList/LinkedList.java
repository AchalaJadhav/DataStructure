package com.asj.datastructure.linkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    public void addNode(int data){
        Node addNode = new Node(data);

        if (head == null){
            head = addNode;
        }else {
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = addNode;
        }
    }

    public void deleteNode(int data){
        if(head == null){
            return;
        }

        if (head.data == data){
            head = head.next;
            return;
        }

        Node currentNode = head;
        while (currentNode != null && currentNode.next != null){
            if (currentNode.next.data == data){
                currentNode.next = currentNode.next.next;
            }
            currentNode = currentNode.next;
        }
    }

    // Print the linked list
    public void printList() {
        Node current = head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addNode(3);
        list.addNode(4);
        list.printList();

        list.deleteNode(4);
        list.printList();
    }
}
