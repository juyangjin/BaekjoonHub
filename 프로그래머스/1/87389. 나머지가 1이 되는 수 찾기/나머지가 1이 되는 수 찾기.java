class Solution {
    public int solution(int n) {
        int answer= 0;
        
        for(int i=n-1; i>0; i--){       
            answer = n % i == 1 ? i : answer;
        }
        return answer;
    }
}