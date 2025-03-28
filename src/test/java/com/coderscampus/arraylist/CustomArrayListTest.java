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
        CustomList<Integer> customList = new CustomArrayList<>();
        // Act
        customList.add(10);
        // Assert
        // Expectation - There should be an Integer w/ value 10 stored in the first index of customList
        assertEquals(10, customList.get(0));
        assertEquals(1, customList.getSize());
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