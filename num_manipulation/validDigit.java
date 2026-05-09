package num_manipulation;

class Solution {
    public boolean validDigit(int n, int x) {
        int n1=n;
        int flag=0;
        while(n>0){
            int dig=n%10;
            if(dig==x){
                flag=1;
                break;
            }
            n=n/10;
        }
        while(n1>=10){
            n1=n1/10;
        }
        return (n1!=x && flag==1);
    }
}