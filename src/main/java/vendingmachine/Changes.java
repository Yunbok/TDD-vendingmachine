package vendingmachine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Changes {

    private int amount;

    public Changes(int value) {
        this.amount = value;
    }
    public List<CoinSet> coin() {
        List<CoinSet> list = new ArrayList<>();

        if (amount == 20) {
            list.add(CoinSet._10_COIN);
            list.add(CoinSet._10_COIN);
            return list;
        }

        if (amount == 1000) {
            list.add(CoinSet._500_COIN);
            list.add(CoinSet._500_COIN);
            return list;
        }

        list.add(CoinSet.valueOf(amount));
        return list;
    }
}
