package com.nixsolutions.ppp13.elena.hw2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("MyBaseTypesUtil should")
class MyBaseTypesUtilTest {

    private BaseTypesUtil util;

    @BeforeEach
    void createUtil() {
        util = new MyBaseTypesUtil();
    }

    @Nested
    @DisplayName("divide")
    class Division {

        @Test
        void integerNumbers() {
            assertEquals("4", util.div("8", "2"));
        }

        @Test
        void floatingPointNumbers() {
            assertEquals("3.14", util.div("6.28", "2"));
        }
    }
}
