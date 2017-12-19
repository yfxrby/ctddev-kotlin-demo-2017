import org.junit.Assert.assertEquals
import org.junit.Test

class MainTest {
    @Test
    fun testEasy() {
        assertEquals(3, solve(5, arrayOf(1, 2, 5, 4, 3)))
    }

    @Test
    fun testDec() {
        assertEquals(1, solve(5, arrayOf(5, 4, 3, 2, 1)))
    }

    @Test
    fun testInc() {
        assertEquals(5, solve(5, arrayOf(1, 2, 3, 4, 5)))
    }
}