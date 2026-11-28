class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[2*nums.length];
        int j=0;
        for(int i=0; i<arr.length; i++)
        {
            if(i>=nums.length)
            {
                arr[i]=nums[j];
                j++;
            }
            else
            {
                arr[i] = nums[i];
            }
        }
        return arr;
    }
}