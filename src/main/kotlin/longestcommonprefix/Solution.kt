package longestcommonprefix

fun longestCommonPrefix(strs: Array<String>): String {
    var prefix = strs[0]
    for (i in 1..strs.size - 1) {
        while (strs[i].indexOf(prefix) != 0) {
            prefix = prefix.substring(0, prefix.length - 1)
            if (prefix == "") return ""
        }
    }
    return prefix
}