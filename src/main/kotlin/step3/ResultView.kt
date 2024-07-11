package step3

object ResultView {

    fun getWinners(cars: List<Car>): String {
        val maxPosition = cars.maxByOrNull { it.getPosition() }!!.getPosition()
        val winners = cars.filter { it.getPosition() == maxPosition }.joinToString(", ") { it.name }
        return winners
    }
}
