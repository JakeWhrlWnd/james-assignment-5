package com.coderscampus.arraylist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayListTest {

    // Test-Driven Development Methodology
    // Step 1 - Write a failing test
    // Step 2 - Write the business logic to make the test pass
    // Step 3 - Refactor your code
    // Rinse and repeat Steps 1 - 3

    // Three A's - "ARRANGE, ACT, ASSERT"
    // Arrange - set things up
    // Act - calling the method
    // Assert - expected behavior/actual behavior

    @Test
    void add() {
        // Arrange
        CustomList<Integer> sut = new CustomArrayList<>();
        // Act
        sut.add(10);
        Integer expectedResult = sut.get(0);
        Integer expectedSize = sut.getSize();
        // Assert
        // Expectation - There should be an Integer w/ value 10 stored in the first index of customList
        assertEquals(10, expectedResult);
        assertEquals(1, expectedSize);
    }

    @Test
    void should_add_11_items_to_list() {
        // Arrange
        CustomList<Integer> sut = new CustomArrayList<>(); // System Under Test - used when testing
        // Act
        for (int i = 1; i <= 100000; i++) {
            sut.add(i);
        }
//        for (int i = 1; i < 22; i++) {
//            sut.add(i);
//        }
//        sut.add(1); sut.add(2); sut.add(3); sut.add(4);
//        sut.add(5); sut.add(6); sut.add(7); sut.add(8);
//        sut.add(9); sut.add(10); sut.add(11);
        // Assert
//        for (int i = 0; i < 10; i++) {
//            assertEquals(i + 1, sut.get(i));
//        }
//        assertEquals(11, sut.getSize());
//        for (int i = 0; i < 21; i++) {
//            assertEquals(i + 1, sut.get(i));
//        }
//        assertEquals(21, sut.getSize());
        for (int i = 0; i < 99999; i++) {
            assertEquals(i + 1, sut.get(i));
        }
        assertEquals(100000, sut.getSize());
    }

    @Test
    void getSize() {
        fail("Not yet implemented");
    }

    @Test
    void get() {
        fail("Not yet implemented");
    }
}