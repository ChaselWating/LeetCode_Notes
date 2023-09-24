package pro_203;
public class pro_203 {
	
	//不添加dummyNode节点
	public ListNode removeElements0(ListNode head, int val) {
		//头节点元素值为val 使用while而不是if
		//且要加上head!=null否则会报错，这是因为有可能head一开始为空
		while (head != null && head.val == val) {
			head = head.next;
		}
		//空链表情况放在while面，考虑到前面都等于val后直接为空的情况
		if (head == null) {
	        return head;
	    }
		ListNode current = head;
		while (current.next != null) {
			if (current.next.val == val) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
		return head;
	}
	
	//添加dummyNode节点
	public ListNode removeElements(ListNode head, int val) {
		// 空链表情况
		if (head == null) {
	        return head;
	    }
		//为了不让dummynode=val
		ListNode dummyNode = new ListNode(val-1, head);
		//ListNode dummyNode = new ListNode(-1, head);
		ListNode p = dummyNode;
		while (p.next != null) {
			if (p.next.val == val) {
				p.next = p.next.next;
			} else {
				p = p.next;
			}
		}
		return dummyNode.next;
	}

	public static void main(String[] args) {
//		ListNode head = 

	}

}
