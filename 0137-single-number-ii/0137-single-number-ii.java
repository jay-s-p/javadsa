class Solution {
    public int singleNumber(int[] nums) {
        int []arr= new int[32];
        for(int i=0; i<nums.length; i++)
        {
            int num= nums[i];
            int j=0;
            for( j =0; j<32; j++)
            {
                arr[j]= (arr[j]+ (num&1)%3);
                num=num>>1;
                // j++;
            }
        }
        // System.out.println(Arrays.toString(arr));
        long ans=0;
        for(int i=31; i>-1; i--)
        {
            // ans |= ((arr[i]%3) << i);
           ans= (ans<<1)+(arr[i]%3);
            // ans= ans<<1;
            
        }

        return (int)ans;
    }
}