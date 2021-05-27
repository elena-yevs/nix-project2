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
     * Возвращает отсортированный массив, который подается на вход.
     *
     * @param array исходный массив, остаётся без изменений после вызова этого метода
     * @return отсортированный массив
     */
    int[] sort(int[] array);

    /**
     * Форматирует число с плавающей точкой в соответсвии с локалью для указанного языка.
     *
     * @param n число для форматного вывода
     * @param language код языка по стандарту ISO 639, две или три буквы
     * @return строку представления числа в данном языке
     */
    String format(float n, String language);
}
