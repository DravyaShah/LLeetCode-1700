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
    public ListNode swapNodes(ListNode head, int k) {
        int len=0;
        ListNode temp=head;

        while(temp != null)
        {
            len++;
            temp=temp.next;
        }
        if(len==1)
        {
            return head;
        }
        temp=head;

        int x=0;
        int y=0;
        int count=1;
        while(temp != null)
        {
            if(count==k)
            {
                x=temp.val;
            }
            if(count==len-k+1)
            {
                y=temp.val;
            }
            temp=temp.next;
            count++;
        }

        ListNode a=new ListNode();
        ListNode l=a;
        int c=1;
        while(head != null)
        {
            if(c==k)
            {
                l.next=new ListNode(y);
            }
            else if(c==len-k+1)
            {
                l.next=new ListNode(x);
            }
            else
            {
                l.next=new ListNode(head.val);
            }
            head=head.next;
            l=l.next;
            c++;
        }
        return a.next;
    }
}