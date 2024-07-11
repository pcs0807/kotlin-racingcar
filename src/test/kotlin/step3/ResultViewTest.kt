package step3

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ResultViewTest {

    @Test
    fun `ResultView should correctly determine the winners`() {
        val cars = listOf(
            Car("Car1").apply { position = 5 },
            Car("Car2").apply { position = 3 },
            Car("Car3").apply { position = 5 }
        )

        val winners = ResultView.getWinners(cars)

        assertEquals("Car1, Car3", winners)
    }
}
