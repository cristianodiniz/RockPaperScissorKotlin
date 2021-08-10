import enums.OptionsEnum
import enums.OptionsEnum.*
import enums.PlayerTypeEnum.HUMAN
import enums.PlayerTypeEnum.MACHINE
import exceptions.DrawException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test


class RockPaperScissorKtTest {

    private val player1 = Player("P1", HUMAN)
    private val player2 = Player("P2", MACHINE)
    private val matches = Matches(player1, player2)

    @Test
    fun `Given a empty array of the application should run without errors`() {
        main(emptyArray())
    }

    @Test
    fun `Given a match between ROCK and PAPER the winner must be PAPER`() {
        val expected = PAPER
        var result = matches.rockPaperScissor(ROCK, PAPER)
        assertEquals(expected, result)
        result = matches.rockPaperScissor(PAPER, ROCK)
        assertEquals(expected, result)
    }

    @Test
    fun `Given a match between ROCK and SCISSORS the winner must be ROCK`() {
        val expected = ROCK
        var result = matches.rockPaperScissor(ROCK, SCISSORS)
        assertEquals(expected, result)
        result = matches.rockPaperScissor(SCISSORS, ROCK)
        assertEquals(expected, result)
    }

    @Test
    fun `Given a match between PAPER and SCISSORS the winner must be SCISSORS`() {
        val expected = SCISSORS
        var result = matches.rockPaperScissor(PAPER, SCISSORS)
        assertEquals(expected, result)
        result = matches.rockPaperScissor(SCISSORS, PAPER)
        assertEquals(expected, result)
    }

    @Test
    fun `Given a match between SCISSORS and SCISSORS should return a DrawException`() {
        assertThrows(DrawException::class.java) {
            matches.rockPaperScissor(SCISSORS, SCISSORS)
        }
    }

    @Test
    fun `When calling the method randomOption should return a ROCK, PAPER or SCISSORS`() {
        val map = mutableMapOf<OptionsEnum, Boolean>()
        for (i in 1..10) {
            map[matches.randomOption()] = true
        }
        assert(map.containsKey(ROCK))
        assert(map.containsKey(PAPER))
        assert(map.containsKey(SCISSORS))
    }

    @Test
    fun `Given 3 matches between player1 and player2 in the of the matches should be a winner or a draw`() {
        val matches = Matches(player1, player2)
        for (i in 1..3) {
            matches.autoPlay()
        }
        assert(matches.scoreBoard.scoreP1 != matches.scoreBoard.scoreP2 || matches.scoreBoard.draw > 0  )
    }
}