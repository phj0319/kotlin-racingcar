package racingcar

import racingcar.domain.Race
import racingcar.domain.RacingCar
import racingcar.view.InputView
import racingcar.view.ResultView

fun main() {
    val pair = InputView.run()
    val carNames = pair.first
    val numberOfRace = pair.second
    val racingCars: List<RacingCar> = carNames.map { RacingCar(it) }
    val race = Race(racingCars)

    ResultView.showStart()
    repeat(numberOfRace) {
        race.tryAffterRandom()
        ResultView.showRaceSnapShot(race)
    }
    ResultView.showResult(race)
}
