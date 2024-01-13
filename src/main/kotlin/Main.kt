fun main() {
    val s1 = "Hello World"
    val s2 = "   fly me   to   the moon  "
    val s3 = "luffy is still joyboy"

    fun lengthOfLastWord(s: String): Int {
        return (s.trim().substring(s.trim().lastIndexOf(" ")+1, s.trim().length)).length
    }

    println(lengthOfLastWord(s3))
}

