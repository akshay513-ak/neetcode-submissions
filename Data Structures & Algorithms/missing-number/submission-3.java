class Solution {
    public int missingNumber(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        
        for(int i=0; i<nums.length; i++)
        {
            set.add(nums[i]);
        }
        Integer c=0;
        Iterator itr = set.iterator();
        
        while(itr.hasNext())
        {
            if(itr.next()!=c)
            {
                return c;
            }
            c++;
        }
        return c;
    }
}
