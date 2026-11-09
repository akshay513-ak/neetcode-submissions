class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch1 = s.toCharArray();

        Arrays.sort(ch1);

        String sorted1 = new String(ch1);

        char[] ch2 = t.toCharArray();

        Arrays.sort(ch2);

        String sorted2 = new String(ch2);

        if(Arrays.equals(ch1,ch2))
        {
            return true;
        }
       return false;
    }
}
