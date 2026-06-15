class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        maxOnes = currMax = 0
        for num in nums:
            if num == 0:
                maxOnes = max(currMax, maxOnes)
                currMax = 0
            else:
                currMax += 1
        
        return max(currMax, maxOnes)
            