class Solution {
    public int trap(int[] height) {
        int i=0, j=height.length-1;
        int lm=height[i], rm = height[j], w=0;

        while(i<j)
        {
            if(height[i]<=height[j])
            {
                int min = lm;

                if(min>rm)
                {
                    min=rm;
                }
                w+=min-height[i];
                i++;
                if(lm<height[i])
                {
                    lm=height[i];
                }
            }
            else
            {
                int min = lm;
                if(min>rm)
                {
                    min=rm;
                }
                w+= min-height[j];
                j--;
                if(rm<height[j])
                {
                    rm = height[j];
                }
            }
        }
        return w;
    }
}
