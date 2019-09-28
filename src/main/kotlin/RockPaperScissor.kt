import enums.OptionsEnum
import enums.OptionsEnum.*
import enums.PlayerTypeEnum
import enums.PlayerTypeEnum.*
import exceptions.DrawException
import kotlin.random.Random

data class Player(val name: String, val type: PlayerTypeEnum)

data class ScoreBoard(var scoreP1: Int, var scoreP2: Int, var draw: Int)

class Matches(private val player1: Player, private val player2: Player) {

    var scoreBoard = ScoreBoard(0, 0, 0)

    fun autoPlay() {

        val opt1 = if (player1.type == MACHINE) randomOption() else ROCK
        val opt2 = if (player2.type == MACHINE) randomOption() else ROCK

        try {
            if (rockPaperScissor(opt1, opt2) == opt1) {
                scoreBoard.scoreP1 += 1
            } else {
                scoreBoard.scoreP2 += 1
            }
        }catch (e:DrawException){
            scoreBoard.draw += 1
        }

    }

    fun rockPaperScissor(option1: OptionsEnum, option2: OptionsEnum) = when {
        (option1 == ROCK && option2 == PAPER) ||
                (option1 == PAPER && option2 == ROCK) -> PAPER
        (option1 == ROCK && option2 == SCISSORS) ||
                (option1 == SCISSORS && option2 == ROCK) -> ROCK
        (option1 == PAPER && option2 == SCISSORS) ||
                (option1 == SCISSORS && option2 == PAPER) -> SCISSORS
        else -> throw DrawException()
    }

    fun randomOption() = OptionsEnum.values()[Random.nextInt(0, 3)]

}