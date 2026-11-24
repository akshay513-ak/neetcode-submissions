class Solution {
    public int lengthOfLongestSubstring(String s) {
    
        int l=0, r=0, size=-1;
        
        HashSet<Character>  set = new HashSet<>();

        while(r<s.length())
        {
            if(!set.add(s.charAt(r)))
            {
                if(size<(r-l))
                {
                    size = (r-l); 
                }
                set.remove(s.charAt(l++));
            }
            else
            {
                r++;
            }
        }
        if(set.size()<size)
        {
       return size;
        }
        else
        {
            return set.size();
        }
    }
}
