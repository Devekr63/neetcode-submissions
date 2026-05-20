class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false

        val counter = mutableMapOf<Char, Int>()

        for(i in 0 until s.length){
            counter[s[i]] = counter.getOrDefault(s[i], 0) + 1
            counter[t[i]] = counter.getOrDefault(t[i], 0) - 1
        }

        println(counter)

        for((_, count) in counter){
            if(count !=0 ) return false 
        }

        return true
    }
}
