package racingcar

import racingcar.domain.Race
import racingcar.domain.RacingCar
import racingcar.view.InputView
import racingcar.view.ResultView

fun main() {
    val inputParameters = InputView.run()
    val racingCars: List<RacingCar> = inputParameters.carNames.map { RacingCar(it) }
    val race = Race(racingCars)

    ResultView.showStart()
    repeat(inputParameters.numberOfRace) {
        race.tryAffterRandom()
        ResultView.showRaceSnapShot(race)
    }
    ResultView.showResult(race)
}
