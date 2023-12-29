package palindromenumber

fun isPalindrome(x: Int): Boolean {
    if (x < 0) {
        return false
    }
    var temp = x
    val digits: ArrayList<Int> = ArrayList()
    while (temp > 0) {
        digits.add(temp % 10)
        temp /= 10
    }
    var left = 0
    var right = digits.size - 1
    while (left < right) {
        if (digits[left] != digits[right]) {
            return false
        }
        left++
        right--

    }
    return true
}