

import enums.Options.*
import exceptions.DrawException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test


internal class MainKtTest {

    @Test
    fun the_application_should_run() {
        main(emptyArray());
    }


    @Test
    fun should_return_paper() {
        val expected = PAPER
        var result = RockPaperScissor(ROCK, PAPER)
        assertEquals(expected, result)
        result = RockPaperScissor(PAPER, ROCK)
        assertEquals(expected, result)
    }

    @Test
    fun should_return_rock() {
        val expected = ROCK
        var result = RockPaperScissor(ROCK, SCISSORS)
        assertEquals(expected, result)
        result = RockPaperScissor(SCISSORS, ROCK)
        assertEquals(expected, result)
    }

    @Test
    fun should_return_scissor() {
        val expected = SCISSORS
        var result = RockPaperScissor(PAPER, SCISSORS)
        assertEquals(expected, result)
        result = RockPaperScissor(SCISSORS, PAPER)
        assertEquals(expected, result)
    }

    @Test
    fun should_return_draw_exception() {
        assertThrows(DrawException::class.java) {
            RockPaperScissor(SCISSORS,SCISSORS)
        }
    }


}