package com.coinomi.core.coins;

import com.coinomi.core.Constants;

/**
 * @author Giannis Dzegoutanis
 */
public class PeercoinTest extends CoinType {
    public PeercoinTest() {
        id = "peercoin.test";

        addressHeader = 111;
        p2shHeader = 196;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };

        name = "Peercoin Test";
        symbol = "PPC";
        uriScheme = "peercoin"; // TODO verify, could be ppcoin?
        bip44Index = 1;
    }

    private static PeercoinTest instance;
    public static synchronized PeercoinTest get() {
        if (instance == null) {
            instance = new PeercoinTest();
        }
        return instance;
    }
}
