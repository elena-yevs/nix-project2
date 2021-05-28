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
     * Метод деления двух чисел произвольного типа и произвольной размерности.
     *
     * <p>Результат не должен специально форматироваться.
     *
     * <p>Частное округляется в соответствии с режимом mode.
     *
     * @param value1 делимое, число, подвергаемое делению
     * @param value2  делитель, число, на которое делим делимое
     * @return quotient - частное, результат деления двух чисел
     */
    @Override
    public String div(String value1, String value2) {
        LOG.debug("Dividing {} by {}.", value1, value2);
        BigDecimal dividend = new BigDecimal(value1);
        BigDecimal divisor = new BigDecimal(value2);
        BigDecimal result = dividend.divide(divisor);
        String output = result.toString();
        LOG.debug("The result is: {}", output);
        return output;
    }

    @Override
    public int[] sort(int[] array) {
        LOG.debug("Passed to sort: {}", array);
        int[] sorted = Arrays.copyOf(array, array.length);
        Arrays.sort(sorted);
        LOG.debug("Sorted: {}", sorted);
        return sorted;
    }

    @Override
    public String format(float n, String language) {
        LOG.debug("Formatting {} using language {}...", n, language);
        Locale locale = new Locale(language);
        String result = String.format(locale, "%f", n);
        LOG.debug("Formatted: {}", result);
        return result;
    }
}
