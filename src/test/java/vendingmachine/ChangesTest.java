package vendingmachine;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ChangesTest {

    @ParameterizedTest
    @CsvSource({"10,_10_COIN", "50,_50_COIN", "100,_100_COIN", "500,_500_COIN"})
    void _n원이_남아_있다면_n짜리_동전_1개를_돌려_준다(int value, CoinSet coin) {
        Changes changes = new Changes(value);
        List<CoinSet> coinSet = changes.coin();
        assertThat(coinSet).containsExactlyInAnyOrder(coin);

    }

    @Test
    void _10원이_남아_있다면_10짜리_동전_1개를_돌려_준다() {
        Changes changes = new Changes(10);
        List<CoinSet> coinSet = changes.coin();

        assertThat(coinSet).containsExactlyInAnyOrder(CoinSet._10_COIN);

    }

    @Test
    void _50원이_남아_있다면_50짜리_동전_1개를_돌려_준다() {
        Changes changes = new Changes(50);
        List<CoinSet> coinSet = changes.coin();
        assertThat(coinSet).containsExactlyInAnyOrder(CoinSet._50_COIN);

    }


    @Test
    void _100원이_남아_있다면_100짜리_동전_1개를_돌려_준다() {
        Changes changes = new Changes(100);
        List<CoinSet> coinSet = changes.coin();
        assertThat(coinSet).containsExactlyInAnyOrder(CoinSet._100_COIN);

    }

    @Test
    void _500원이_남아_있다면_500짜리_동전_1개를_돌려_준다() {
        Changes changes = new Changes(500);
        List<CoinSet> coinSet = changes.coin();
        assertThat(coinSet).containsExactlyInAnyOrder(CoinSet._500_COIN);

    }
}

