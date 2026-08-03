class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length;
        int ans = (n*(n+1))/2;
        int numm=0;
        for(int i=0; i<n; i++)
        {
            numm+=nums[i];
        }

        ans= ans-numm;
        return ans;
    }
}