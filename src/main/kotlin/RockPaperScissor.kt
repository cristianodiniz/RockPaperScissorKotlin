import enums.Options
import enums.Options.*
import exceptions.DrawException

fun RockPaperScissor(option1: Options, option2: Options) = when {
    (option1 == ROCK && option2 == PAPER) ||
            (option1 == PAPER && option2 == ROCK) -> PAPER
    (option1 == ROCK && option2 == SCISSORS) ||
            (option1 == SCISSORS && option2 == ROCK) -> ROCK
    (option1 == PAPER && option2 == SCISSORS) ||
            (option1 == SCISSORS && option2 == PAPER) -> SCISSORS
    else -> throw DrawException()
}