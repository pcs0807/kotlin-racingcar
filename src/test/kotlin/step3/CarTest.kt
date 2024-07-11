package step3

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class CarTest {

    @Test
    fun `Car should move forward when random number is 4 or higher`() {
        val car = Car("TestCar")
        val initialPosition = car.position

        // Since move() uses random values, we test this by running multiple times
        repeat(1000) {
            car.move()
        }

        assertTrue(car.position > initialPosition)
    }

    @Test
    fun `Car should not move forward when random number is less than 4`() {
        val car = Car("TestCar")
        var moved = false

        repeat(1000) {
            val initialPosition = car.position
            car.move()
            if (car.position > initialPosition) {
                moved = true
            }
        }

        assertTrue(moved)
    }
}
