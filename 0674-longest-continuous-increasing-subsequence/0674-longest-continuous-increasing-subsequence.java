class Solution {
    public int findLengthOfLCIS(int[] nums) {
       int L_sub=1;
       int Max_Len = 1;
       for(int i = 1; i<nums.length;i++)
       {
        if (nums[i]>nums[i-1])
        {
            L_sub++;
        }
        else{
            L_sub = 1;
        }
        Max_Len =Math.max(Max_Len,L_sub);
       }
       return Max_Len;
    }
}