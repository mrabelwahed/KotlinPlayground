package play

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int , Int>()
        val result  = IntArray(2);
        for(i in nums.indices){
            val  x = target - nums[i]
            if(!map.containsKey(x))
                map[nums[i]] = i
            else
            {

                result[0] = map[x]!!
                result[1] = i
                break;
            }
        }
        return result
    }


}

fun main() {
    val sol = Solution()
    val a = intArrayOf(2,7,11,15)
    val target = 9
    sol.twoSum(a,target).forEach {
        print(it)
    }
}