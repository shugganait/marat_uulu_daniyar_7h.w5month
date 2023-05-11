package com

import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {
    var math: com.kg.testCalc.Math?=null

    @Before
    fun init() {
        math = com.kg.testCalc.Math()
    }

    @Test
    fun simpleAdd() {
        assertEquals("5", math?.add("3", "2"))
    }

    @Test
    fun symbolAdd() {
        assertEquals("Нельзя вводить буквы", math?.add("2dada", "22"))
    }

    @Test
    fun doubleAdd() {
        assertEquals("27.2", math?.add("25.2", "2.0"))
    }

    @Test
    fun simpleDivide() {
        assertEquals("2", math?.divide("4", "2"))
    }

    @Test
    fun zeroDivide() {
        assertEquals("Нельзя делить на ноль", math?.divide("2", "0"))
    }

    @Test
    fun emptyDivide(){
        assertEquals("Нельзя выполнить операцию с пустотой",math?.divide("12",""))
    }

    @Test
    fun negativeAdd(){
        assertEquals("-5",math?.add("-12","7"))
    }

    @After
    fun detach() {
        math = null
    }
}