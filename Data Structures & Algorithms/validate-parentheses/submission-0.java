class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        if(s.length()%2!=0)
        {
            return false;
        }

        for(char ch: s.toCharArray())
        {
            if(ch=='(' || ch=='{' || ch == '[')//({[]})
                st.push(ch);

            else if(ch==')'  || ch==']'  || ch=='}'){
                char pop = '\u0000';
                if(!st.isEmpty())
                     pop = st.pop();
                if(ch==')' && pop!='('  || ch==']' && pop!='[' || ch=='}' && pop!='{')
                    return false;
            }
        }

        return st.empty(); 

    }
}
