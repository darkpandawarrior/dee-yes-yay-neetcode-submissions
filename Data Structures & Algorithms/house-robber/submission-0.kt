class Solution {
    fun rob(nums: IntArray): Int {
        if(nums.size == 0) return 0
        if(nums.size == 1) return nums[0]

        var prev1 = 0
        var prev2 = 0
        for(num in nums){
            var current = maxOf(prev2 + num, prev1)
            prev2 = prev1
            prev1 = current
        }
        return prev1
    }
}
