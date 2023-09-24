public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummyhead = new ListNode(-1, head);
		ListNode fast = dummyhead;
		ListNode slow = dummyhead;
		for(int i = 0; i < n; i++) {
			fast = fast.next;
		}
		while(fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return dummyhead.next;
    }
}
