class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val countHash = mutableMapOf<Char, Int>()

        for(ch in s){
            countHash[ch] = countHash.getOrDefault(ch, 0) + 1
        }

        for(ch in t){
            countHash[ch] = countHash.getOrDefault(ch, 0) - 1
        }

        for((key, value) in countHash){
            if(value != 0) return false
        }

        return true
    }
}
