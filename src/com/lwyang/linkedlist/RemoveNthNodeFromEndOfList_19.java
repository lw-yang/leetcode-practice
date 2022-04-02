package com.lwyang.linkedlist;

/**
 * @author yangliwei
 */

public class RemoveNthNodeFromEndOfList_19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1, head);
        ListNode pre = dummy;
        ListNode p = dummy;

        while (p.next != null) {
            p = p.next;
            if (n <= 0) {
                pre = pre.next;
            }
            n--;
        }
        if (pre.next != null) {
            pre.next = pre.next.next;
        }

        return dummy.next;
    }

    static class ListNode {
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
