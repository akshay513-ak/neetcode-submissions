class Solution {
    public int maxArea(int[] heights) {
        int i=0, j = heights.length-1;
        int max=0;
        while(i<j)
        {
            int k=0;
            if(heights[i]>heights[j])
            {
                k = (j-i)*heights[j];
                j--;
            }
            else
            {
                k = (j-i)*heights[i];
                i++;
            }
            if(k>max)
            {
                max=k;
            }
        }
        return max;
    }
}
