import kotlin.math.log

class CheckIfTheNumberIsPowerOf2 {
    operator fun invoke(n: Int): Boolean {
        if (n == 0) return false
        val logResult = log(n.toDouble(), 2.0)
        return logResult - logResult.toInt() < 0.0000000001
    }
}