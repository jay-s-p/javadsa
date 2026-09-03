class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int n= numbers.length-1;
        for(int i=0; i<n+1; i++)
        {
            int j=i+1;
            int k= n;
            int t= target-numbers[i];

            while(j<=k)
            {
                int mid = (j+k)/2;

                if(numbers[mid]==t)
                {
                    return new int[]{i+1, mid+1};
                }

                else if(numbers[mid]>t)k=mid-1;
                else j=mid+1;
            }
        }
        return new int[]{};

    }
}