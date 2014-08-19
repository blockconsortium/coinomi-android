package com.coinomi.core.coins;

import com.coinomi.core.Constants;

/**
 * @author Giannis Dzegoutanis
 */
public class DarkcoinTest extends CoinType {
    public DarkcoinTest() {
        id = "darkcoin.test";

        addressHeader = 111;
        p2shHeader = 196;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };

        name = "Darkcoin Test";
        symbol = "DRK";
        uriScheme = "darkcoin";
        bip44Index = 1;
    }

    private static DarkcoinTest instance;
    public static synchronized DarkcoinTest get() {
        if (instance == null) {
            instance = new DarkcoinTest();
        }
        return instance;
    }
}
