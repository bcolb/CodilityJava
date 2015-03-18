// https://codility.com/programmers/lessons/5

import java.util.Stack;

class Solution {
    public int solution(String S) {
        if(S.length() == 0) return 1;
        Stack<Character> st = new Stack<Character>();
        for(int i = 0; i < S.length(); i++) {
          char c = S.charAt(i);
          if(c == '(') {
            st.push(c);    
          } else {
            if(st.empty()) return 0;
            char b = st.pop();
            
            if(b != '(') return 0;
          }
        }
        if(!st.empty()) return 0;
        return 1;
    }
}
