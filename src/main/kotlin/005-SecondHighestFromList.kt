package org.msd.leetcode.examples

fun main() {
    val input = listOf(10, 20, 13, 33, 17, 21)

    input
        .distinct()
        .sortedDescending()
        .drop(1)
        .firstOrNull()
        ?.let {
            println(" Second Highest Number is $it") // 20
        } ?: println ("We need a list with at least 2 numbers")
}