package Basic.LinkedList;

public class GetIntersectionNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode h1 = headA;
        ListNode h2 = headB;
        while (headA != headB) {
            if (headA == null) {
                headA = h2;
            }
            else headA = headA.next;
            if (headB == null) {
                headB = h1;
            }
            else headB = headB.next;
        }
        return headA;
    }
}
