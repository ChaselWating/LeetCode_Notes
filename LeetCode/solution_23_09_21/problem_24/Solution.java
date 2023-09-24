public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
	
	//利用双指针，但好像不太对
	public ListNode swapPairs0(ListNode head) {
		ListNode prev = head;
		ListNode cur = head.next;
		while(cur != null || prev != null) {
			prev.next = cur.next;
			cur.next = prev;
			prev = prev.next;
			cur = prev.next;
		}
    }
	
	//利用虚拟头节点，用一个指针解决问题
	public ListNode swapPairs(ListNode head) {
		ListNode dummyhead = new ListNode(0, head);
		ListNode cur = dummyhead;
		while(cur.next != null && cur.next.next != null) {
			ListNode temp  = cur.next;
			ListNode temp1 = cur.next.next.next;
			cur.next = cur.next.next;
			cur.next.next = temp;
			temp.next = temp1;
			cur = temp;
		}
		return dummyhead.next;
	}
	
}
