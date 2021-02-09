package Basic.LinkedList;

public class RotateRight {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        ListNode n = head;
        int cnt = 0;
        while (n != null) {
            cnt ++;
            n = n.next;
        }
        k %= cnt;
        if (k == 0) return head;
        ListNode fast = head;
        for (int i=0; i<k; i++) {
            fast = fast.next;
        }
        ListNode slow = head;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        fast.next = head;
        ListNode newHead = slow.next;
        slow.next = null;
        return newHead;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
