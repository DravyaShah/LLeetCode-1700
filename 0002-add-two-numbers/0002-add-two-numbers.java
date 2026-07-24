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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1=l1;
        ListNode t2=l2;
        ArrayList<Integer> nl=new ArrayList<>();
        
        int carry=0;
        while(t1 != null || t2 != null || carry != 0)
        {
            int x=0;
            int y=0;
            if(t1 != null)
            {
                x=t1.val;
                t1=t1.next;
            }
            if(t2 != null)
            {
                y=t2.val;
                t2=t2.next;
            }
            int val=x+y+carry;
            carry=val/10;
            nl.add(val%10);
        }
        int n=nl.size();
        ListNode temp=new ListNode();
        ListNode l3=temp;
        for(int i=0;i<n;i++)
        {
            l3.next=new ListNode(nl.get(i));
            l3=l3.next;
        }
        return temp.next;
    }
}