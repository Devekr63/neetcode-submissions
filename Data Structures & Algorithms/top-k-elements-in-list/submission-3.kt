class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val freqCount = mutableMapOf<Int, Int>()
        val maxHeap = PriorityQueue<Int>{
            a,b -> freqCount[b]!! - freqCount[a]!!
        }

        val result = mutableListOf<Int>()

        for(num in nums){
            if(!freqCount.contains(num)) freqCount[num] = 0
            else freqCount[num] = freqCount[num]!! + 1
        }

        for(num in freqCount.keys){
            maxHeap.offer(num)
        }

        for(i in 0 until k){
            result.add(maxHeap.poll())
        }

        return result.toIntArray()
    }
}
