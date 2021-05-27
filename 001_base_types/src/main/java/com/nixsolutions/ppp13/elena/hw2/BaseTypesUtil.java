package com.nixsolutions.ppp13.elena.hw2;

/**
 * Utility functions for the basic operations.
 */
public interface BaseTypesUtil {

    /**
     * Divides two numbers with arbitrary type and precision.
     *
     * @param value1 the divisor
     * @param value2 the divider
     * @return the result of the division, no special formatting is applied
     */
    String div(String value1, String value2);

    /**
     * Метод возвращает отсортированный массив, который подается на вход.
     *
     * @param array исходный массив, остаётся без изменений после вызова этого метода
     * @return отсортированный массив
     */
    int[] sort(int[] array);
}
