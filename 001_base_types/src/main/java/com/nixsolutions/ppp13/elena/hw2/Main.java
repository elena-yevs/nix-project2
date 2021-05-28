package com.nixsolutions.ppp13.elena.hw2;

/**
 * This class demonstrates features of {@link MyBaseTypesUtil}.
 */
public class Main {

    private final BaseTypesUtil util;

    private Main() {
        this.util = new MyBaseTypesUtil();
    }

    private void division() {
        util.div("6.28", "2");
    }

    private void sorting() {
        util.sort(new int[]{ 7, 15, 10, 20 });
    }

    private void formatting() {
        util.format(1.618033988749894f, "RU");
    }

    public static void main(String[] args) {
        Main show = new Main();
        show.division();
        show.sorting();
        show.formatting();
    }
}
