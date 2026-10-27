class Solution {
    public int largestInteger(int n, int s) {
        // If sum is 0, the answer is 0
        if (s == 0) {
            return 0;
        }
        
        // If the maximum possible sum with n digits is less than s, it's impossible
        if (s > 9 * n) {
            return -1;
        }
        
        int result = 0;
        for (int i = 0; i < n; i++) {
            int digit = Math.min(9, s);
            result = result * 10 + digit;
            s -= digit;
        }
        
        return result;
    }
}