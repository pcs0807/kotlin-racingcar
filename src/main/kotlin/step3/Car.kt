package step3

class Car(val name: String) {
    var position: Int = 0

    fun move() {
        val moveForward = (0..9).random() >= 4
        if (moveForward) {
            position++
        }
    }

    fun getPosition(): Int {
        return position
    }
}
