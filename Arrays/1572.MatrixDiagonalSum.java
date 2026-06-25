## Question: 1572. Matrix Diagonal Sum

### Concept Learned
- Sum of Primary and Secondary Diagonal 

### What this question taught me
- How to not repeat sum of centre element

class Solution {
    public int diagonalSum(int[][] mat) {

        int n = mat.length;
        int sum = 0;

        for(int i = 0; i < n; i++) {
            sum += mat[i][i];
            sum += mat[i][n - 1 - i];
        }

        if(n % 2 == 1) {
            sum -= mat[n / 2][n / 2];
        }

        return sum;
    }
}
