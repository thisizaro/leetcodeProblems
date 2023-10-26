/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode getMiddle(ListNode p){
        ListNode t= p,h =p;
        while(h.next != null && h.next.next != null)
        {
            t = t.next;
            h = h.next.next;
        }
        return t;
    }
    

    public ListNode reverse(ListNode head){
        
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }


    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
        {
            return true;
        }

        ListNode newHead = getMiddle(head);
        newHead = reverse(newHead.next);   //the newHead.next is important

        while(newHead != null)
        {
            if(head.val != newHead.val)
            {
                return false;
            }
            head = head.next;
            newHead = newHead.next;
        }
        return true;
    }
}
