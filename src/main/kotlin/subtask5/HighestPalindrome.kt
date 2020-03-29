package subtask5

class HighestPalindrome {

    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        val charArr = digitString.toCharArray()
        var count = 0
        for (i in charArr.indices) {
            if (i > charArr.size / 2) break

            if (charArr[i] != charArr[charArr.size - i - 1]) {
                if (charArr[i] == '0') {
                    charArr[i] = '9'
                }
                charArr[charArr.size - i - 1] = charArr[i]
                count++
            } else if (count > k) {
                return "-1"
            }
        }
        return String(charArr)
    }
}
