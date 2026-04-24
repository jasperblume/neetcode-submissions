class Solution {
    public int removeDuplicates(int[] nums) {
        int p1 = 1;
        for (int p2 = 1; p2 < nums.length; p2++) {
            if (nums[p2] != nums[p2 - 1]) {
                nums[p1] = nums[p2];
                p1++;
            }
        }
        return p1;
    }
}