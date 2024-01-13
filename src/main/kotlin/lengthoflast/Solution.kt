package lengthoflast

fun lengthOfLastWord(s: String): Int {
    val trimmed = s.trim()
    return (trimmed.substring(trimmed.lastIndexOf(" ") + 1, trimmed.length)).length
}