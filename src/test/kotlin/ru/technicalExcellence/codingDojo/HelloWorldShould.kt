package ru.technicalExcellence.codingDojo

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class HelloWorldShould {

//    @Test
//    fun returnHelloWorld() {
//        val expected = "Hello World!"
//
//        val actual = HelloWorld().helloWorld();
//
//        assertEquals(expected, actual)
//    }

    private fun test(actual: String, expected: String) = assertEquals(expected, actual)

    @Test
    fun exampleTests() {
        test(geometricSequenceElements(2, 3, 5), "2, 6, 18, 54, 162")
        test(geometricSequenceElements(2, 2, 10), "2, 4, 8, 16, 32, 64, 128, 256, 512, 1024")
        test(geometricSequenceElements(1, -2, 10), "1, -2, 4, -8, 16, -32, 64, -128, 256, -512")
    }

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

    fun geometricSequenceElements(a: Int, r: Int, n: Int): String =
        sequence {
            var e = a
            repeat(n) {
                yield(e)
                e *= r
            }
        }.joinToString(", ")
}

