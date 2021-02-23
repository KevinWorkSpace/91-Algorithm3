package Basic.LinkedList;

public class SortedListToBST {

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return new TreeNode(head.val);
        ListNode fast = head;
        ListNode slow = head;
        ListNode pre = null;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            pre = slow;
            slow = slow.next;
        }
        ListNode next = slow.next;
        TreeNode root = new TreeNode(slow.val);
        if (slow != head) {
            pre.next = null;
            root.left = sortedListToBST(head);
        }
        root.right = sortedListToBST(next);
        return root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
}
