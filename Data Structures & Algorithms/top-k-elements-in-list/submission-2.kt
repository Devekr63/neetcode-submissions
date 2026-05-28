class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val freqCount = mutableMapOf<Int, Int>()
        val minHeap = PriorityQueue<Int>{
            a, b -> freqCount[a]!! - freqCount[b]!!
        }

        val result = mutableListOf<Int>()

        for(num in nums){
            if(!freqCount.contains(num)) freqCount[num] = 0
            else freqCount.put(num, freqCount[num]!! + 1)
        }

        for(num in freqCount.keys){
            minHeap.offer(num)
            while(minHeap.size>k){
                minHeap.poll()
            }
        }

        while(!minHeap.isEmpty()){
            result.add(minHeap.poll())
        }

        return result.toIntArray()
    }
}

