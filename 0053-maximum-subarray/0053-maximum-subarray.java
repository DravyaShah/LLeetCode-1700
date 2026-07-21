class Solution {
    public int maxSubArray(int[] nums) {
        int ms=Integer.MIN_VALUE;
        int curr=0;
        int n=nums.length;

        for(int i=0;i<n;i++)
        {
            curr=curr+nums[i];

            if(curr > ms)
            {
                ms=curr;
            }
            if(curr < 0)
            {
                curr=0;
            }
        }
        return ms;
    }
}