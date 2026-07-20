class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q=new LinkedList<>();

        if(n==1)
        {
            return 1;
        }
        for(int i=1;i<=n;i++)
        {
            q.add(i);
        }
        int ans=0;

        while(!q.isEmpty())
        {
            int count=1;
            while(count<k)
            {
                int x=q.remove();
                q.add(x);
                count++;
            }
            if(count==k)
            {
                q.remove();
            }
            if(q.size()==1)
            {
                ans=q.peek();
            }
        }
        return ans;
    }
}