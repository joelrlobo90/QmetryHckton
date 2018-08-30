package com.temp.junit.temptestcase;

//import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */

public class FirstTestTest 
{
	
	@BeforeAll
    static void beforeAll() {
        System.out.println("Before all First test methods");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Before each First test method");
    }

    @AfterEach
    void afterEach() {
        System.out.println("After each First test method");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After all First test methods");
    }

    @Test
    @DisplayName("First test")
    void firstTest() {
        System.out.println("First test First method");
    }

    @Test
    @DisplayName("Second test")
    void secondTest() {
        System.out.println("Second test First method");
    }
}
