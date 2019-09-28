import enums.OptionsEnum
import enums.OptionsEnum.*
import enums.PlayerTypeEnum.*
import exceptions.DrawException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test


internal class MainKtTest {

    private val player1 = Player("P1", HUMAN)
    private val player2 = Player("P2", MACHINE)
    private val matches = Matches(player1, player2)

    @Test
    fun the_application_should_run() {
        main(emptyArray());
    }


    @Test
    fun should_return_paper() {
        val expected = PAPER
        var result = matches.rockPaperScissor(ROCK, PAPER)
        assertEquals(expected, result)
        result = matches.rockPaperScissor(PAPER, ROCK)
        assertEquals(expected, result)
    }

    @Test
    fun should_return_rock() {
        val expected = ROCK
        var result = matches.rockPaperScissor(ROCK, SCISSORS)
        assertEquals(expected, result)
        result = matches.rockPaperScissor(SCISSORS, ROCK)
        assertEquals(expected, result)
    }

    @Test
    fun should_return_scissor() {
        val expected = SCISSORS
        var result = matches.rockPaperScissor(PAPER, SCISSORS)
        assertEquals(expected, result)
        result = matches.rockPaperScissor(SCISSORS, PAPER)
        assertEquals(expected, result)
    }

    @Test
    fun should_return_draw_exception() {
        assertThrows(DrawException::class.java) {
            matches.rockPaperScissor(SCISSORS, SCISSORS)
        }
    }

    @Test
    fun should_generate_at_less_one_option_of_each() {

        val list = ArrayList<OptionsEnum>()
        for (i in 1..1000) {
            list.add(matches.randomOption())
        }

        assert(list.filter { it == ROCK }.size >= 0)
        assert(list.filter { it == PAPER }.size >= 0)
        assert(list.filter { it == SCISSORS }.size >= 0)

    }

    @Test
    fun should_play_have_one_winner_or_draw(){

        val matches = Matches(player1,player2)
        for (i in 1..501) {
            matches.autoPlay()
        }
        assert(matches.scoreBoard.scoreP1 != matches.scoreBoard.scoreP2)
    }

}