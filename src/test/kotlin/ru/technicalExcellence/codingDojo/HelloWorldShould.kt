package ru.technicalExcellence.codingDojo

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.math.ceil
import kotlin.math.pow
import kotlin.math.roundToInt
import kotlin.properties.Delegates

class HelloWorldShould {

//    @Test
//    fun returnHelloWorld() {
//        val expected = "Hello World!"
//
//        val actual = HelloWorld().helloWorld();
//
//        assertEquals(expected, actual)
//    }

//    private fun test(actual: String, expected: String) = assertEquals(expected, actual)
//
//    @Test
//    fun exampleTests() {
//        test(geometricSequenceElements(2, 3, 5), "2, 6, 18, 54, 162")
//        test(geometricSequenceElements(2, 2, 10), "2, 4, 8, 16, 32, 64, 128, 256, 512, 1024")
//        test(geometricSequenceElements(1, -2, 10), "1, -2, 4, -8, 16, -32, 64, -128, 256, -512")
//    }

//    fun geometricSequenceElements(a: Int, r: Int, n: Int): String =
//        LongArray(n) { i -> a * r.toDouble().pow(i.toDouble()).toLong() }.joinToString(", ")


//    fun geometricSequenceElements(a: Int, r: Int, n: Int): String =
//        sequence {
//            var e = a
//            while (true) {
//                this.yield(e)
//                e *= r
//            }
//        }.take(n).joinToString(separator = ", ")

//    fun geometricSequenceElements(a: Int, r: Int, n: Int): String =
//        sequence {
//            var e = a
//            repeat(n) {
//                yield(e)
//                e *= r
//            }
//        }.joinToString(", ")

//    fun geometricSequenceElements(a: Int, r: Int, n: Int): String =
//        generateSequence(a) { it * r }
//            .take(n)
//            .joinToString(", ")

//    private fun testing(actual:Int, expected:Int) {
//        assertEquals(expected, actual)
//    }
//    @Test
//    fun test1() {
//        println("Fixed Tests: movie")
//        testing(movie(500, 15, 0.9), 43)
//        testing(movie(100, 10, 0.95), 24)
//
//    }

//    fun movie(card:Int, ticket:Int, perc:Double):Int {
//        var n = 0
//        var aSum = 0
//        var bSum = 0
//        while (aSum<=bSum) {
//            n++
//            aSum = ticket * n
//            bSum = card + generateSequence(ticket * perc) { it * perc }.take(n).sum().roundToInt()
//        }
//        return n
//    }

//    fun movie(card:Int, ticket:Int, perc:Double):Int {
//        var n = 0
//        var aSum = 0
//        var bSum = card.toDouble()
//        var current = ticket * perc
//        while (aSum <= ceil(bSum).toInt()) {
//            n++
//            aSum += ticket
//            bSum += current
//            current *= perc
//        }
//        return n
//    }

//    fun movie(card:Int, ticket:Int, perc:Double) = generateSequence(1){it + 1}.
//    first {
//        ticket * it > ceil(card + ticket * perc * (1 - perc.pow(it)) / (1 - perc))
//    }

    @Test
    fun `ATM Payment Possible`() {
        assertEquals(4, count(770))
        assertEquals(1, count(10))
    }

    @Test
    fun `ATM Payment Impossible`() {
        assertEquals(-1, count(125))
        assertEquals(-1, count(238))
    }

//    fun count(number: Int): Int {
//        val n = when {
//            number % 10 == 0 -> number / 500 +
//                                number % 500 / 200 +
//                                number % 500 % 200 / 100 +
//                                number % 500 % 200 % 100 / 50 +
//                                number % 500 % 200 % 100 % 50 / 20 +
//                                number % 500 % 200 % 100 % 50 % 20 / 10
//            else -> -1
//        }
//        return n
//    }

//    fun count(number: Int): Int = when {
//        number % 10 == 0 -> number / 500 +
//                number % 500 / 200 +
//                number % 500 % 200 / 100 +
//                number % 500 % 200 % 100 / 50 +
//                number % 500 % 200 % 100 % 50 / 20 +
//                number % 500 % 200 % 100 % 50 % 20 / 10
//
//        else -> -1
//    }

    fun count(number: Int) = if (number % 10 > 0) -1 else listOf(500, 200, 100, 50, 20, 10)
        .fold(listOf(number, 0)) { acc, i -> listOf(acc[0] % i, acc[1] + acc[0] / i) }[1]

//    val values = listOf(500, 200, 100, 50, 20, 10)
//
//    fun count(amount: Int): Int {
//        val (a, k) = values.fold(Pair(amount, 0)){ (a, k), v -> Pair(a % v, k + a / v) }
//        return if (a == 0) k else -1
//    }
}
