class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<String, MutableList<String>>()
        val result = mutableListOf<List<String>>()

        for(str in strs){
            val count = charCountStr(str)
            if(map.contains(count)) map[count]?.add(str)
            else map.put(count, mutableListOf(str)) 
        }

        for((_, value) in map){
            result.add(value)
        }

        return result
    }

    private fun charCountStr(toCount: String): String{
        val charCountList = MutableList<Int>(26) {0}

        for(char in toCount){
            charCountList[char - 'a']++
        }

        return listToStr(charCountList)
    }

    private fun listToStr(list: List<Int>): String{
        var str = StringBuilder("")
        
        for(i in list) str.append(i).append("_")
        println(str.toString())

        return str.toString()
    }
}
