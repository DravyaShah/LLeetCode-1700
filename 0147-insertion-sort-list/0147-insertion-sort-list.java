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
    public ListNode insertionSortList(ListNode head) {
        ArrayList<Integer> a=new ArrayList<>();
        ListNode temp=head;

        while(temp != null)
        {
            a.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(a);

        temp=head;
        for(int i=0;i<a.size();i++)
        {
            temp.val=a.get(i);
            temp=temp.next;
        }
        return head;
    }
}