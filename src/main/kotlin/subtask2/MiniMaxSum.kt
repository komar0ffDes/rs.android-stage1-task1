package subtask2

import kotlin.math.max

class MiniMaxSum {

    fun getResult(input: IntArray): IntArray {
        val min = input.min()
        val max = input.max()
        var minOut = 0
        var maxOut = 0
        for(x in input) {
            if(x != max) minOut += x
            if( x != min) maxOut += x
        }
        return intArrayOf(minOut,maxOut)
    }
}
