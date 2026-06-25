## Question: 217 - Contains Duplicate 

### Concept Learned
- Time Complexity O(n)
- TLE in O(n2)

### What this question taught me
- How to check whether array  has a duplicate or not 

import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        
        for (int i =1 ;i<nums.length;i++){
                if(nums[i] == nums [i-1]){
                    return true ;
                }
            
        }
        return false;
    }
}
