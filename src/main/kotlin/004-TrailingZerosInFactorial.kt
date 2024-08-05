package org.msd.leetcode.examples

/**
 * Given an integer n, return the number of trailing zeros in n!
 *
 * Example 1:
 * Input n = 3
 * Output: 0
 *
 * Example 2:
 * Input n = 5
 * Output = 1
 *
 * Example 3:
 * Input n = 25
 * Output = 6
 *
 * Tip: Count how many times 5 is a factor in 1 to n
 * tailingZeros = (input / 5) + (input / (5 * 5)) + (input / (5 * 5 * 5)) + etc...
 */

fun main() {
    println("Enter Input: (Integer) ")
    val input = readln().toInt()

    var count = 0
    var power = 1.0
    var i: Int
    do{
        i = input / Math.pow(5.0, power++).toInt()
        count += i
    }while(i > 0)

    println("The # of trailing zeros in $input factorial is $count")
}