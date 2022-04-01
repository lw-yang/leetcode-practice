package com.lwyang.linkedlist;

/**
 * @author yangliwei
 * <p>
 * ["MyLinkedList","addAtHead","deleteAtIndex","addAtHead","addAtHead","addAtHead","addAtHead","addAtHead","addAtTail","get","deleteAtIndex","deleteAtIndex"]
 * [[],[2],[1],[2],[7],[3],[2],[5],[5],[5],[6],[4]]
 */

public class DesignLinkedList_707 {

    public static void main(String[] args) {
        DesignLinkedList_707 list = new DesignLinkedList_707();
        list.addAtHead(2);
        list.deleteAtIndex(1);
        list.addAtHead(2);
        list.addAtHead(7);
        list.addAtHead(3);
        list.addAtHead(2);
        list.addAtHead(5);

        list.addAtTail(5);
        System.out.println(list.get(5));
        list.deleteAtIndex(6);
        list.deleteAtIndex(4);

    }

    Node virtual;

    static class Node {
        int value;
        Node next;

        public Node(int v) {
            this.value = v;
        }
    }

    public DesignLinkedList_707() {
        virtual = new Node(-1);
    }

    public int get(int index) {
        Node p = virtual;
        while (index >= 0) {
            if (p == null) {
                break;
            }
            p = p.next;
            index--;
        }
        return p == null ? -1 : p.value;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = virtual.next;
        virtual.next = node;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);
        Node p = virtual;
        while (p.next != null) {
            p = p.next;
        }
        p.next = node;
    }

    public void addAtIndex(int index, int val) {
        Node node = new Node(val);
        Node p = virtual;
        while (index > 0) {
            if (p == null) {
                break;
            }
            p = p.next;
            index--;
        }

        if (p != null) {
            node.next = p.next;
            p.next = node;
        }
    }

    public void deleteAtIndex(int index) {
        Node p = virtual.next;
        Node pre = virtual;
        while (index > 0) {
            if (p == null) {
                break;
            }
            p = p.next;
            pre = pre.next;
            index--;
        }
        if (p != null) {
            pre.next = p.next;
        }
    }
}
