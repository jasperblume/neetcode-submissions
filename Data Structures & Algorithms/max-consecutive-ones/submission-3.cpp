class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int maxOnes = 0, cons = 0;
        for (int num : nums) {
            if (num == 0) {
                maxOnes = max(maxOnes, cons);
                cons = 0;
            } else {
                cons++;
            }
        }
        return max(maxOnes, cons);
    }
};