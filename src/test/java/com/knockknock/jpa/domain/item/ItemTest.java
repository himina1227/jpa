package com.knockknock.jpa.domain.item;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;
import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void create_success() {
        assertThatCode(() -> new Item(1L, BigDecimal.valueOf(1000L), LocalDateTime.now()))
                .doesNotThrowAnyException();
    }
}