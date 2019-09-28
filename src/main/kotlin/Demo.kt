import enums.PlayerTypeEnum

fun main(args: Array<String>) {
    println("*************************************")
    println("*****| Rock,Paper, and Scissor |*****")
    println("*************************************")

    val player1 = Player("John Doe", PlayerTypeEnum.HUMAN)
    val player2 = Player("Hector", PlayerTypeEnum.MACHINE)
    val matches = Matches(player1, player2)

    println("*************************************")
    println("Player 1 : " + player1.name)
    println("Player 2 : " + player2.name)
    println("*************************************")

    for (i in 1..100) {
        val log = matches.autoPlay()
        println("round #$i - $log")

    }

    println("*************************************")
    println("*************** Score ***************")
    println("${player1.name} : ${matches.scoreBoard.scoreP1}")
    println("${player2.name} : ${matches.scoreBoard.scoreP2}")
    println("Draw : ${matches.scoreBoard.draw}")
    println("************** Result ***************")

    if (matches.scoreBoard.scoreP1 == matches.scoreBoard.scoreP2){
        println("The game was a draw")
    }else if(matches.scoreBoard.scoreP1 >= matches.scoreBoard.scoreP2){
        println("${player1.name} won")
    }else{
        println("${player2.name} won")
    }
    println("*************************************")

}