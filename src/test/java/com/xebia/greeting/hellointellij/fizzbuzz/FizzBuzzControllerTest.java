package com.xebia.greeting.hellointellij.fizzbuzz;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzControllerTest {
    private  FizzBuzzController controller;

    @Before
    public void setUp() throws Exception {
        controller = new FizzBuzzController();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testFizzbuzz() {
       FizzBuzzModel model =  controller.fizzbuzz();
        // BAD TEST, JUST FOR DEMO
       assertEquals(100,model.getEntries().size());
    }

    @Test
    public void testWordInput() {
        assertEquals("1",controller.getWordForNumber(1));
        assertEquals("2",controller.getWordForNumber(2));
        assertEquals("Fizz",controller.getWordForNumber(3));
        assertEquals("4",controller.getWordForNumber(4));
        assertEquals("Buzz",controller.getWordForNumber(5));
        assertEquals("Fizz",controller.getWordForNumber(6));
        assertEquals("FizzBuzz",controller.getWordForNumber(15));
    }
}