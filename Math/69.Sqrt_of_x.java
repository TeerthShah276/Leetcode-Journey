## Question: 69.Sqrt(x) 

### Concept Learned
- Operators 

### What this question taught me
- How to square any number without using built-in function

class Solution {
    public int mySqrt(int x) {

        int r = 0;

        while((long)(++r) * r <= x);

        return --r;
    }
}
