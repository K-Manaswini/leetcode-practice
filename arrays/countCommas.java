class Solution {
    public int countCommas(int n) {
        int c=0;
        if(n<1000)
            return c;
        else{
            c=0;
            for(int i=1000;i<=n;i++){
                c+=1;
            }
            return c;
        }
    }
}
