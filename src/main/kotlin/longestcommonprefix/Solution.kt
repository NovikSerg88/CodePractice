package longestcommonprefix

fun longestCommonPrefix1(strs: Array<String>): String {
    var prefix = strs[0]
    for (i in 1..strs.size - 1) {
        while (strs[i].indexOf(prefix) != 0) {
            prefix = prefix.substring(0, prefix.length - 1)
            if (prefix == "") return ""
        }
    }
    return prefix
}

/*another solution*/
fun longestCommonPrefix2(strs: Array<String>): String {
    var prefix = strs[0]
    for (i in 0 until prefix.length) {
        val char = prefix[i]
        for (str in strs) {
            if (i >= str.length || str[i] != char) {
                return if (i == 0) ""
                else prefix.substring(0, i)
            }
        }
    }
    return prefix
}