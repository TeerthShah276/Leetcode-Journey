## Question: 1.Two Sum

### Concept Learned
- Time Complexity O(n2)

### What this question taught me
- How to actually print values store in array , not just the output 

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0 ; i<nums.length ; i++){
            for(int j = i+1 ;j<nums.length ; j++){
                if(nums[i] + nums[j] == target){
                    //Check every value to achieve target
                return new int[] {i,j};
                
            }
        }
        }
        return new int[] {} ;
    
}
}
