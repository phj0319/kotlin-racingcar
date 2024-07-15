import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import racingcar.domain.RandomGenerator

class RandomGeneratorTest {
    @Test
    fun `램덤 숫자 생성 잘 되니?`() {
        val random = RandomGenerator.run()

        Assertions.assertThat(random).isLessThanOrEqualTo(9)
        Assertions.assertThat(random).isGreaterThanOrEqualTo(0)
    }
}
