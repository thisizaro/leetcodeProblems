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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // TRY1
        // if(list1 == null)
        // {
        //     return list2;
        // }
        // if(list2 == null)
        // {
        //     return list1;
        // }


        // ListNode l1 = list1, l2 = list2;
        // while(l2 != null)
        // {
        //     if(l1.val <= l2.next.val)
        //     {   
        //         ListNode temp = l2.next;
        //         l2.next = l1;
        //         l1 = l1.next;
        //         l2.next.next = temp;
        //     }
        //     l2 = l2.next;
        // }
        // return list2;

        //TRY2
        // ListNode finalNode = null;
        // ListNode p = finalNode;

        // while(list1 != null && list2 != null)
        // {
        //     if(list1 == null)
        //     {
        //         p.next = list2;
        //         p = p.next;
        //         list2 = list2.next;
        //     }
        //     else if(list2 == null)
        //     {
        //         p.next = list1;
        //         p = p.next;
        //         list1 = list1.next;
        //     }

        //     else
        //     {
        //         if(list1.val < list2.val)
        //         {
        //             p.next = list1;
        //             p = p.next;
        //             list1 = list1.next;
        //         }
        //         else
        //         {
        //             p.next = list2;
        //             p = p.next;
        //             list2 = list2.next;
        //         }
        //     }
        // }

        // return finalNode;


        ListNode finalNode = new ListNode(0);
        ListNode p = finalNode;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                p.next = list1;
                list1 = list1.next;
            } else {
                p.next = list2;
                list2 = list2.next;
            }
            p = p.next;
        }

        if (list1 != null) {
            p.next = list1;
        } else {
            p.next = list2;
        }

        return finalNode.next; 
    }
}
