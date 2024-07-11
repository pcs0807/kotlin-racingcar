package step3

class RaceGame(private val cars: List<Car>, private val rounds: Int) {

    fun runRace() {
        for (round in 1..rounds) {
            println("실행 결과")
            for (car in cars) {
                car.move()
                println("-".repeat(car.getPosition()) + car.name)
            }
            println()
        }
    }
}
