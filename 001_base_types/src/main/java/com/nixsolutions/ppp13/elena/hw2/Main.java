package com.nixsolutions.ppp13.elena.hw2;

/**
 * This class demonstrates features of {@link MyBaseTypesUtil}.
 */
public class Main {

    private final BaseTypesUtil util;

    private Main() {
        this.util = new MyBaseTypesUtil();
    }

    private void sum() {
        util.plus("26.02", "2.03");
    }
    private void subtraction(){
        util.minus("80.54", "60.33");
    }

    private void multiplication() {
        util.mul("2.45", "4.89");
    }

    private void division() {
        util.div("6.28", "2");
    }

    private void sorting() {
        util.sort(new int[]{7, 15, 10, 20});
    }

    private void formatting() {
        util.format(1.618033988749894f, "RU");
    }

    public static void main(String[] args) {
        Main show = new Main();
        show.division();
        show.sorting();
        show.formatting();
        show.multiplication();
        show.subtraction();
        show.sum();
    }
}
