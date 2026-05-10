package hashmaps;

class Solution {
    public int mirrorFrequency(String s) {
        char arr[]=s.toCharArray();
        int freq[]=new int[128];
        for(char c:arr)
            freq[c]++;
        int sum=0;
        int visited[]=new int[128];
        for(char c:arr){
            if(visited[c]==1)
                continue;
            char m;
            if(Character.isDigit(c)){
                m=(char)('9'-(c-'0'));
            }
            else{
                m=(char)('z'-(c-'a'));
            }
            sum+=Math.abs(freq[c]-freq[m]);
            visited[c]=1;
            visited[m]=1;
        }
        return sum;
    }
}