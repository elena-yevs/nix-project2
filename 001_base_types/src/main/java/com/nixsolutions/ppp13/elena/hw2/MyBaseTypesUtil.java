package com.nixsolutions.ppp13.elena.hw2;

public final class MyBaseTypesUtil implements BaseTypesUtil {

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
}
