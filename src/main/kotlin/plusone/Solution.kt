package plusone

fun plusOne(digits: IntArray): IntArray {
    for (i in digits.size - 1 downTo 0) {
        if (digits[i] != 9) {
            digits[i]++
            return digits
        } else {
            digits[i] = 0
            if (i == 0) {
                val newDigits = IntArray(digits.lastIndex + 2)
                newDigits[0] = 1
                return newDigits
            }
        }
    }
    return digits
}