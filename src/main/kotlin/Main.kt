import java.util.*

fun main() {

    val s = "(){}[]"

    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        for (i in s.indices) {
            val char = s[i]
            if (char == '(' || char == '{' || char == '[') {
                stack.push(char)
            } else {
                if (stack.isEmpty()) {
                    return false
                }
                val stackPop = stack.pop()
                if ((char == '}' && stackPop != '{') ||
                    (char == ']' && stackPop != '[') ||
                    (char == ')' && stackPop != '(')
                ) {
                    return false
                }
            }
        }
        return stack.empty()
    }
    println(isValid(s))
}
