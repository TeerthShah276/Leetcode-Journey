## Question: 136.Single Number

### Concept Learned
- XOR Operator

### What this question taught me
- How to actually remove duplicates using XOR operator 

class Solution {
    public int singleNumber(int[] nums) {
        int ans =0;
        for (int i = 0 ; i<nums.length;i++){
            ans ^= nums[i];
            // Values with more than one count will be removed
        }
        return ans ;
    }
}
