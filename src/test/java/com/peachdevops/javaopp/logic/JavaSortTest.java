package com.peachdevops.javaopp.logic;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {

    @Test
    void sort() {
        JavaSort<Integer> javaSort = new JavaSort<>();

        List<Integer> actual = javaSort.sort(List.of(1, 5, 6, 3, 2));

        assertEquals(List.of(1,2,3,5,6), actual);
    }
}