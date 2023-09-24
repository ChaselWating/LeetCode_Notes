package pro_206;

public class Solution {
	
	//非递归
	public ListNode reverseList(ListNode head) {
		ListNode cur = head;	//应该从head开始，这样就相当于将null和head构造节点
		ListNode prev = null;	//让head指向null
		ListNode temp = null;
		while(cur != null) {
			temp = cur.next;
			cur.next = prev;
			prev = cur;
			cur = temp;
		}
		return prev;
    }
	
	//递归
	public ListNode reverseList_recur(ListNode head) {
		return reverse(null, head);
    }
	
	private ListNode reverse(ListNode prev, ListNode cur) {
		if(cur == null) {
			return prev;
		}
		
		ListNode temp = null;
		temp = cur.next;
		cur.next = prev;
		return reverse(cur, temp);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
