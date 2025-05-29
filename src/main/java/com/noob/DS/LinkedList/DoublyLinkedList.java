package com.noob.DS.LinkedList;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addLast(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.prev = null;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }

    public void addFirst(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.prev = null;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }

    public void removeFirst() {
        head = head.next;
        head.prev = null;
        size--;
    }

    public void removeLast() {
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    public void removeAt(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
        size--;
    }

    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" <-> ");
            }
            temp = temp.next;
        }
    }

    static class Node {
        int data;
        Node next;
        Node prev;
    }

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addLast(10);
        doublyLinkedList.addLast(20);
        doublyLinkedList.addLast(30);
        doublyLinkedList.addLast(40);
        doublyLinkedList.addLast(50);
        doublyLinkedList.addFirst(5);
        doublyLinkedList.addFirst(3);
        doublyLinkedList.addFirst(4);
        doublyLinkedList.addFirst(15);
        doublyLinkedList.traverse();
    }
}
