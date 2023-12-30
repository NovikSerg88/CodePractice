package romantointeger

fun romanToInt(s: String): Int {
    val map = hashMapOf<Char, Int>(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var result = 0
    var prev = 0

    for (i in s.length - 1 downTo 0) {
        val cur = map[s[i]] ?: 0
        if (cur < prev) {
            result -= cur
        } else {
            result += cur
        }
        prev = cur
    }
    return result
}