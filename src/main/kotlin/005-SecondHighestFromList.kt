package org.msd.leetcode.examples

fun main() {
    val input = listOf(10, 15, 20, 12, 13, 8, 1, 30)

    input.stream()
        .distinct()
        .sorted { a, b -> b - a }
        .skip(1)
        .findFirst()
        .ifPresent {
            println(" Second Highest Number is $it") // 20
        }
}