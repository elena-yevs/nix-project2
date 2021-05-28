package com.nixsolutions.ppp13.elena.hw2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Locale;

/**
 * Реализация интерфейса базовых утилитных операций.
 */
public final class MyBaseTypesUtil implements BaseTypesUtil {

    private static final Logger LOG = LogManager.getLogger(BaseTypesUtil.class);

    /**
     * Вычитание двух чисел произвольного типа и произвольной размерности.
     *
     * @param value1 уменьшаемое, число от которого отнимаем часть
     * @param value2 вычитаемое, число, которое отнимаем от уменьшаемого
     * @return difference - разность, результат вычитания одного числа из другого
     */
    @Override
    public String minus(String value1, String value2) {
        LOG.debug("Decrease {} by {}.", value1, value2);
        BigDecimal minuend = new BigDecimal(value1);
        BigDecimal subtrahend = new BigDecimal(value2);
        BigDecimal difference = minuend.subtract(subtrahend);
        String output = difference.toString();
        LOG.debug("The result is: {}.", output);
        return output;
    }

    /**
     * Умножение двух чисел произвольного типа и произвольной размерности.
     *
     * <p>Результат не должен специально форматироваться.
     *
     * @param value1 первый множитель, число, которое умножаем
     * @param value2 второй множитель, число на которое умножаем
     * @return product - произведение, результат умножения двух чисел
     */
    @Override
    public String mul(String value1, String value2) {
        LOG.debug("Multiply {} by {}.", value1, value2);
        BigDecimal multiplier = new BigDecimal(value1);
        BigDecimal multiplicand = new BigDecimal(value2);
        BigDecimal product = multiplier.multiply(multiplicand);
        String output = product.toString();
        LOG.debug("The result is: {}.", output);
        return output;
    }

    /**
     * Метод деления двух чисел произвольного типа и произвольной размерности.
     *
     * <p>Результат не должен специально форматироваться.
     *
     * <p>Частное округляется в соответствии с режимом mode.
     *
     * @param value1 делимое, число, подвергаемое делению
     * @param value2 делитель, число, на которое делим делимое
     * @return quotient - частное, результат деления двух чисел
     */
    @Override
    public String div(String value1, String value2) {
        LOG.debug("Dividing {} by {}.", value1, value2);
        BigDecimal dividend = new BigDecimal(value1);
        BigDecimal divisor = new BigDecimal(value2);
        BigDecimal result = dividend.divide(divisor);
        String output = result.toString();
        LOG.debug("The result is: {}.", output);
        return output;
    }

    @Override
    public int[] sort(int[] array) {
        LOG.debug("Passed to sort: {}.", array);
        int[] sorted = Arrays.copyOf(array, array.length);
        Arrays.sort(sorted);
        LOG.debug("Sorted: {}.", sorted);
        return sorted;
    }

    @Override
    public String format(float n, String language) {
        LOG.debug("Formatting {} using language {}...", n, language);
        Locale locale = new Locale(language);
        String result = String.format(locale, "%f", n);
        LOG.debug("Formatted: {}.", result);
        return result;
    }
}
