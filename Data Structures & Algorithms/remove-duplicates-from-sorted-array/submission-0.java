class Solution {
    public int removeDuplicates(int[] nums) {
        int unique = 1;
        int length = nums.length - 1;
        for (int i = 0; i < length; i++) {
            if (nums[i] == nums[i + 1]) {
                for (int j = i; j < length; j++) {
                    nums[j] = nums[j + 1];
                }
                length--;
                i--;
            } else {
                unique++;
            }
        }
        return unique;
    }
}