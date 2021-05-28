package com.nixsolutions.ppp13.elena.hw2;

/**
 * Utility functions for the basic operations.
 */
public interface BaseTypesUtil {

    /**
     * Выполняет умножение двух чисел произвольных типов.
     *
     * @param value1 первый множитель
     * @param value2 второй множитель
     * @return результат умножения отформатированный по умолчанию
     */
    String mul(String value1, String value2);

    /**
     * Выполняет деление деление двух чисел произвольных типов.
     *
     * @param value1 делимое
     * @param value2 делитель
     * @return результат деления отформатированный по умолчанию
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
     * @param n        число для форматного вывода
     * @param language код языка по стандарту ISO 639, две или три буквы
     * @return строку представления числа в данном языке
     */
    String format(float n, String language);
}
