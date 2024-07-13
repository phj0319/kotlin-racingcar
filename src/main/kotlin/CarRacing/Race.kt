package CarRacing

enum class RaceErrorMessage(val message: String) {
    NO_CARS("차량 없음");
}

class Race(carNames: List<String> = List(3) { "pobi" }, val racingCars: List<RacingCar> = carNames.map { RacingCar(it) }) {
    fun tryRace() {
        racingCars.forEach { racingCar -> racingCar.run() }
    }

    fun getWinners(): List<String> {
        val maxLength = racingCars.maxOfOrNull { it.progress }
        require(maxLength != null) { RaceErrorMessage.NO_CARS }
        val filteredCars = racingCars.filter { it.progress == maxLength }
        return filteredCars.map { it.carName }
    }
}
