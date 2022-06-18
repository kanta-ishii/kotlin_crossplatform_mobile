package org.meicode.myapplication

import kotlin.test.Test
import kotlin.test.assertTrue

class CommonGreetingTest {

    @Test
    fun testExample() {
        assertTrue(Greeting().greeting().contains("Guess"), "Check 'Guess' is mentioned")
    }
}