package baseball

import camp.nextstep.edu.missionutils.Randoms
import camp.nextstep.edu.missionutils.Console

fun Numbergenerator(): MutableList<Int> {
    val computerNumber: MutableList<Int> = mutableListOf()
    while (computerNumber.size < 3) {
        val randomNumber = Randoms.pickNumberInRange(1, 9)
        if (!computerNumber.contains(randomNumber)) {
            computerNumber.add(randomNumber)
        }
    }
    return computerNumber
}
fun playerInput():String {
    print("숫자를 입력해주세요 : ")
    val playerAnswer = readLine()!!
    if (playerAnswer.length != 3){
        throw IllegalArgumentException()
    }
    return playerAnswer
}


fun main() {
    /*var computerNumber = Numbergenerator()
    println(computerNumber)*/
}
