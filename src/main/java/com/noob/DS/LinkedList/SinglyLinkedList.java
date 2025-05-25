package com.noob.DS.LinkedList;

public class SinglyLinkedList {
    Node head;
    Node tail;
    int size;

    public SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addLast(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void addFirst(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void addAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
        size++;
    }

    public int size(){
        return size;
    }

    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
    }


    static class Node {
        int data;
        Node next;
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addLast(10);
        singlyLinkedList.addLast(20);
        singlyLinkedList.addLast(30);
        singlyLinkedList.addLast(40);
        singlyLinkedList.addLast(50);
        singlyLinkedList.addFirst(5);
        singlyLinkedList.addFirst(3);
        singlyLinkedList.addFirst(4);
        singlyLinkedList.addFirst(15);

        singlyLinkedList.addAt(5, 134);
        singlyLinkedList.traverse();
    }
}


