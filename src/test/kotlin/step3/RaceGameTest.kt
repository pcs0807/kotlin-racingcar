package step3

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class RaceGameTest {

    @Test
    fun `RaceGame should correctly run the race`() {
        val cars = List(3) { Car("Car${it + 1}") }
        val game = RaceGame(cars, 5)

        game.runRace()

        // As we use randomness, we just ensure cars have moved and race is completed
        cars.forEach { car ->
            assertTrue(car.position > 0)
        }
    }
}
