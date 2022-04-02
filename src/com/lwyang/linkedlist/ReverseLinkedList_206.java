package com.lwyang.linkedlist;

/**
 * @author yangliwei
 */

public class ReverseLinkedList_206 {


    static  ListNode reverseList(ListNode head) {
        ListNode result = new ListNode(-1, null);
        while (head != null) {
            result.next = new ListNode(head.val, result.next);

            head = head.next;
        }
        return result.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
