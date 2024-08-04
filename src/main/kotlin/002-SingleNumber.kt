package org.msd.leetcode.examples

/**
 * Given a non-empty array of integers nums, every element appears twice except for one.
 * Find the single one
 * Implement a solution with a linear runtime complexity and use only constant extra space
 *
 * Input: nums = [2, 2, 1]
 * Output: 1
 *
 * Input: nums = [4, 1, 2, 1, 2]
 * Output: 4
 */

fun main() {
    val num = listOf(4, 1, 2, 1, 2)
    val map = mutableMapOf<Int, Int>()
    num.forEach { number ->
        if (map.contains(number)) {
            map.remove(number)
        } else {
            map[number] = number
        }
    }

    println("Single Number is ${map.values.first()}")

}