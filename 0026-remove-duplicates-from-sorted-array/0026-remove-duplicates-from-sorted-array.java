class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1; int element=nums[0];
        for(int i=0 ; i<nums.length; i++){
            if(nums[i]!=element){
               
                nums[j]=nums[i];
                element=nums[j];
                 j++;
            }
        }
        return j;
    }
}