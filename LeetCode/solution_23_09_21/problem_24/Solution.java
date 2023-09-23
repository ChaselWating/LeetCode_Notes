class ListNode{
	int val;
	ListNode next;
    ListNode(){}
	ListNode(int val){
		this.val = val;
	}
}

public class Solution {
	public ListNode swapPairs(ListNode head) {
		ListNode prev = head;
		ListNode cur = head.next;
		while(cur != null || prev != null) {
			prev.next = cur.next;
			cur.next = prev;
			prev = prev.next;
			cur = prev.next;
		}
    }
}
