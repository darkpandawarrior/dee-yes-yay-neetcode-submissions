class Solution {
    fun rob(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        if (nums.size == 1) return nums[0]
        return maxOf(robRange(nums, 0, nums.size - 2), robRange(nums, 1, nums.size - 1))
    }
    fun robRange(nums: IntArray, start: Int, end: Int) : Int{
        var prev1 = 0
        var prev2 = 0

        for(i in start..end){
            var current = maxOf(prev2 + nums[i], prev1)
            prev2 = prev1
            prev1 = current
        }
        return prev1
    }
}
