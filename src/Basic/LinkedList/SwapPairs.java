package Basic.LinkedList;

public class SwapPairs {

    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        while (head != null && head.next != null) {
            ListNode next = head.next.next;
            pre.next = head.next;
            pre = head;
            head.next.next = head;
            head.next = next;
            head = next;
        }
        return dummyHead.next;
    }
}
