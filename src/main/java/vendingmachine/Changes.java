package vendingmachine;

import java.util.Arrays;
import java.util.List;

public class Changes {

    private int amount;

    public Changes(int value) {
        this.amount = value;
    }
    public List<CoinSet> coin() {
        CoinSet coinSet = null;
        if (this.amount == 10) {
            coinSet = CoinSet._10_COIN;
        }
        if (this.amount == 50) {
            coinSet = CoinSet._50_COIN;
        }
        if (this.amount == 100) {
            coinSet = CoinSet._100_COIN;
        }
        if (this.amount == 500) {
            coinSet = CoinSet._500_COIN;
        }
        return Arrays.asList(coinSet);
    }
}
