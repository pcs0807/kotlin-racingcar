package step4

import step4.ExceptionType.ERROR_TRY_COUNT

object InputView {
    private const val CAR_NAME = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)."
    private const val TRY_COUNT = "시도할 횟수는 몇 회인가요?"

    fun inputCarNames(): List<String> {
        println(CAR_NAME)
        return readLine()?.split(",")?.map { it.trim() } ?: emptyList()
    }

    fun inputTryCount(): Int {
        println(TRY_COUNT)
        return readLine()
            ?.takeIf { it.matches(Regex("\\d+")) }
            ?.toInt() ?: throw IllegalArgumentException(ERROR_TRY_COUNT)
    }
}

object ResultView {
    private const val WINNER = "%s가 최종 우승했습니다."

    fun printHistory(raceHistory: List<RoundSet>) {
        raceHistory.forEach { roundSet ->
            printPosition(roundSet)
        }
        println()
    }

    fun printPosition(roundSet: RoundSet) {
        roundSet.carList.forEach { car ->
            println("${car.name}: ${"-".repeat(car.position)}")
        }
        println()
    }

    fun printWinners(winners: String) {
        print(WINNER.format(winners))
    }
}
