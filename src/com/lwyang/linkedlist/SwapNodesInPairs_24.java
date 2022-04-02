package com.lwyang.linkedlist;

/**
 * @author yangliwei
 */

public class SwapNodesInPairs_24 {

    static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1, head);
        ListNode start = dummy;
        while (start.next != null && start.next.next != null) {
            ListNode p1 = start.next;
            ListNode p2 = p1.next;
            ListNode nextStart = p2.next;

            p2.next = p1;
            start.next = p2;
            p1.next = nextStart;

            start = p1;
        }
        return dummy.next;
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
