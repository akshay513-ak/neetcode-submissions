class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int i=0, j=0,c=0;
        boolean found = false;

        HashMap<Character, Integer> sub = new HashMap<>();

        for(char ch: s1.toCharArray())
            sub.put(ch, sub.getOrDefault(ch,0)+1);

        HashMap<Character, Integer> main = new HashMap<>();

        for(j=0; j<s2.length(); j++)
        {
            char ch = s2.charAt(j);

            if(sub.containsKey(ch))
            {
                main.put(ch, main.getOrDefault(ch,0)+1);

                if(sub.get(ch) == main.get(ch))
                    c++;
                if(c==sub.size())
                {
                    return true;
                }
            }
            if(j>=s1.length()-1)
            {
                char ch1 = s2.charAt(i);
                if(sub.containsKey(ch1))
                {

                    if(sub.get(ch1)== main.get(ch1))
                        c--;
                    main.put(ch1, main.getOrDefault(ch1,0)-1);
                    
                }
                i++;
            }
            
        }
        return false;
    }
}
