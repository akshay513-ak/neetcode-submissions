class Solution {
    public int characterReplacement(String s, int k) {
        int i=0, j=0, maxFreq = 0, Longsub=0;
		HashMap<Character, Integer> m = new HashMap<>();
		
		for(j=0; j<s.length(); j++)
		{
			char ch = s.charAt(j);
			
			m.put(ch, m.getOrDefault(ch,0)+1);
			
			if( maxFreq< m.get(ch))
			{
				maxFreq = m.get(ch);
			}
			
			if((j-i+1)-maxFreq <= k)
			{
				
				if(Longsub < j-i+1)
					Longsub = j-i+1;
			}
			
			while((j-i+1)-maxFreq> k)
			{
				char ch1 = s.charAt(i);
				
				m.put(ch1, m.getOrDefault(ch1, 0)-1);
				i++;
			}
		}
        return Longsub;
    }
}
