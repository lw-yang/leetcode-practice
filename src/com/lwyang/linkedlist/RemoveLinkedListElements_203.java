package com.lwyang.linkedlist;

/**
 * @author yangliwei
 */

public class RemoveLinkedListElements_203 {
    public static void main(String[] args) {
        ListNode f = new ListNode(1);
        f.next = new ListNode(6);
        f.next.next = new ListNode(3);
        f.next.next.next = new ListNode(4);
        f.next.next.next.next = new ListNode(5);
        f.next.next.next.next.next = new ListNode(6);

        ListNode p = f;
        while (p != null) {
            System.out.println(p.val);
            p = p.next;
        }
        ListNode re = removeElements(f, 6);
        System.out.println();
        System.out.println();
        System.out.println();
        while (re != null) {
            System.out.println(re.val);
            re = re.next;
        }
    }

    static ListNode removeElements(ListNode head, int val) {
        ListNode virtual = new ListNode(-1, head);
        ListNode p = head;
        ListNode q = virtual;
        while (p != null) {
            if (p.val == val) {
                q.next = p.next;
                p = p.next;
            } else {
                p = p.next;
                q = q.next;
            }
        }


        return virtual.next;
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
