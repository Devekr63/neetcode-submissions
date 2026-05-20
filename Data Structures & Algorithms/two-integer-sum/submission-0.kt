class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Long, Int>()

        for(i in 0 until nums.size){
            val a = nums[i].toLong()
            val b = target.toLong() - a
            if(map.contains(b)) return arrangeValue(i, map[b]?:-1)
            map.put(a, i)
        }

        return intArrayOf()
    }

    fun arrangeValue(a: Int,b: Int): IntArray{
        if(a>b) return intArrayOf(b,a)
        return intArrayOf(a,b)
    }
}