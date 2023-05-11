package com.kg.testCalc

class Math {
    fun add(a: String, b: String): String {
        var result = ""

        if ((!isNumeric(a) || !isNumeric(b)) && !(a.contains(".") || b.contains(".")) && !(a.contains("-") || b.contains("-"))) {
            result = "Нельзя вводить буквы"
        } else {
            result = (a.toBigDecimal() + b.toBigDecimal()).toString()
        }

        return result
    }

    fun divide(a: String, b: String): String {
        var result = ""

        if (a == "0" || b == "0") {
            result = "Нельзя делить на ноль"
        } else if(a.isEmpty() || b.isEmpty()) {
            result = "Нельзя выполнить операцию с пустотой"
        } else {
            result = (a.toBigDecimal() / b.toBigDecimal()).toString()
        }

        return result
    }


    fun isNumeric(str: String) = str.all { it in '0'..'9' }
}