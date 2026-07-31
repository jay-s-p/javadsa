
class Solution {
    public int maxSubArray(int[] nums) {
        long ans=nums[0];
        long sum=0;
        if(nums.length ==1)return nums[0];
        for(int i=0; i<nums.length; i++)
        {

            sum=nums[i]+sum;
            if(sum < 0){
                
                ans = Math.max(ans, sum);
                sum=0;continue;
            }
            // sum+=nums[i];
           ans = Math.max(ans,sum);
        }
        return (int)ans;
    }
}