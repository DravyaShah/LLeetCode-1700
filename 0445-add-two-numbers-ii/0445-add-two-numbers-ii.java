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
        Stack<Integer> a=new Stack<>();
        Stack<Integer> b=new Stack<>();
        ListNode t1=l1;
        ListNode t2=l2;
        ArrayList<Integer> nl=new ArrayList<>();

        while(t1 != null)
        {
            a.push(t1.val);
            t1=t1.next;
        }
        while(t2 != null)
        {
            b.push(t2.val);
            t2=t2.next;
        }

        int carry=0;
        while(!a.isEmpty() || !b.isEmpty() || carry != 0)
        {
            int x=0;
            int y=0;
            if(!a.isEmpty())
            {
                x=a.pop();
            }

            if(!b.isEmpty())
            {
                y=b.pop();
            }
            int val=x+y+carry;
            carry=val/10;
            nl.add(val%10);
        }
        int n=nl.size();
        ListNode temp=new ListNode(nl.get(n-1));
        ListNode l3=temp;
        for(int i=nl.size()-2;i>=0;i--) 
        {
            ListNode nn=new ListNode(nl.get(i));
            l3.next=nn;
            l3=nn;
        }
        return temp;
    }
}