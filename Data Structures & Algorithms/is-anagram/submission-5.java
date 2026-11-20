class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length())
        {
            return false;
        }
        else
        {
            HashMap<Character, Integer> m = new HashMap<>();

            for(char ch: s.toCharArray())
            {
                m.put(ch, m.getOrDefault(ch,0)+1);
            }

            for(char ch: t.toCharArray())
            {
                m.put(ch, m.getOrDefault(ch,0)-1);
            }

            for(Integer i: m.values())
            {
                if(i!=0)
                {
                    return false;
                }
            }
        }
        
       return true;
    }
}
