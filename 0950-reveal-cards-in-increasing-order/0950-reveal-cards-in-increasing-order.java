class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n=deck.length;
        Queue<Integer> q=new LinkedList<>();
        int a[]=new int[n];

        for(int i=0;i<n;i++)
        {
            q.add(i);
        }

        int j=0;
        int count=0;
        while(!q.isEmpty())
        {
            if(count==0)
            {
                a[q.peek()]=deck[j];
                q.remove();
                j++;
                count++;
            }
            if(!q.isEmpty() && count==1)
            {
                int x=q.remove();
                q.add(x);
                count=0;
            }
        }
        return a;
    }
}