package com.knockknock.jpa.domain.category;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.assertj.core.api.Assertions.assertThatCode;

class CategoryTest {

    @Test
    void create_success() {
        assertThatCode(() -> new Category(1L, "가전", null, null))
                .doesNotThrowAnyException();
    }
}