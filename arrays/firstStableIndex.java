import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            List<Integer> l1=new ArrayList<>();
            List<Integer> l2=new ArrayList<>();
            for(int j=0;j<=i;j++)
                l1.add(nums[j]);
            for(int j=i;j<=n-1;j++)
                l2.add(nums[j]);
            int ins=Collections.max(l1)-Collections.min(l2);
            if(ins<=k)
                return i;
        }
        return -1;
    }
}
