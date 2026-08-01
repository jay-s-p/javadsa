class Solution {
    public void rotate(int[] nums, int k) {
        int l= nums.length;
        k= k%l;
        int m= l-k-1;
        int i=0; 
        while(i<m)
        {
            nums[i] = nums[i] ^ nums[m];
            nums[m] = nums[i] ^ nums[m];
            nums[i] = nums[i] ^ nums[m];

            i++;m--;

        }
        i = l-k; m=l-1;
          while(i<m)
        {
            nums[i] = nums[i] ^ nums[m];
            nums[m] = nums[i] ^ nums[m];
            nums[i] = nums[i] ^ nums[m];

            i++;m--;

        }

        i=0; m=l-1;
         while(i<m)
        {
            nums[i] = nums[i] ^ nums[m];
            nums[m] = nums[i] ^ nums[m];
            nums[i] = nums[i] ^ nums[m];

            i++;m--;

        }


    }
}