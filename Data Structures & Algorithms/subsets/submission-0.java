class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> main = new ArrayList<>();

        int k = (int)Math.pow(2,nums.length);
        
        for(int i=0; i<k ; i++)
        {
            List<Integer> sub = new ArrayList<>();
            int temp=i;
            int ind=0;

            while(temp>0)
            {
                if(temp%2==1)
                {
                    sub.add(nums[ind]);
                }
                ind++;
                temp/=2;
            }
           main.add(sub);
        }
        return main;
    }
}
