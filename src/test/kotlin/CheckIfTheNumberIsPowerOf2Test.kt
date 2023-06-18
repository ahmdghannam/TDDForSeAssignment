import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class CheckIfTheNumberIsPowerOf2Test {

    private val checkIfTheNumberIsPowerOf2 = CheckIfTheNumberIsPowerOf2()

    @Test
    fun should_ReturnFalse_WhenNumberIsFive() {
        // given number 5
        val n = 5
        // when applying the function
        val res = checkIfTheNumberIsPowerOf2(n)
        // then the res is false
        assertFalse(res)
    }

    @Test
    fun should_ReturnFalse_WhenNumberIs70() {
        // given number70
        val n = 70
        // when applying the function
        val res = checkIfTheNumberIsPowerOf2(n)
        // then the res is false
        assertFalse(res)
    }

    @Test
    fun should_ReturnTrue_WhenNumberIs8() {
        // given number 8
        val n = 8
        // when applying the function
        val res = checkIfTheNumberIsPowerOf2(n)
        // then the res is true
        assertTrue(res)
    }

    @Test
    fun should_ReturnFalse_WhenNumberIsOdd() {
        // given an odd number
        val n = 17
        // when applying the function
        val res = checkIfTheNumberIsPowerOf2(n)
        // then the res is false
        assertFalse(res)
    }

}