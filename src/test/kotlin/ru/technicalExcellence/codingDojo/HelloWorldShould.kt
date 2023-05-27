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

    private fun testing(actual:Int, expected:Int) {
        assertEquals(expected, actual)
    }
    @Test
    fun test1() {
        println("Fixed Tests: movie")
        testing(movie(500, 15, 0.9), 43)
        testing(movie(100, 10, 0.95), 24)

    }

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

    fun movie(card:Int, ticket:Int, perc:Double) = generateSequence(1){it + 1}.
    first {
        ticket * it > ceil(card + ticket * perc * (1 - perc.pow(it)) / (1 - perc))
    }

}

