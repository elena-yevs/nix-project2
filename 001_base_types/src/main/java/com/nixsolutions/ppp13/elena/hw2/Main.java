package com.nixsolutions.ppp13.elena.hw2;

/**
 * This class demonstrates features of {@link MyBaseTypesUtil}.
 */
public class Main {

    private final BaseTypesUtil util;

    private Main() {
        this.util = new MyBaseTypesUtil();
    }

    /**
     * Demonstrates division function.
     */
    private String division() {
        return util.div("6.28", "2");
    }

    public static void main(String[] args) {
        Main show = new Main();
        show.division();
    }
}
