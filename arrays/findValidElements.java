import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> list =new ArrayList<>();
        int n=nums.length;
        list.add(nums[0]);
        for(int i=1;i<n-1;i++){
            int flag1=1;
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j])
                    flag1=1;
                else{
                    flag1=0;
                    break;
                }
            }
            int flag2=1;
            for(int j=i+1;j<n;j++){
                if(nums[i]>nums[j])
                    flag2=1;
                else{
                    flag2=0;
                    break;
                }
            }
            if(flag1==1||flag2==1)
                list.add(nums[i]);
        }
        if(n!=1)
            list.add(nums[n-1]);
        return list;
    }
}