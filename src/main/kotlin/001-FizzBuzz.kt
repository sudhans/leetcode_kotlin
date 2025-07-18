package org.msd.leetcode.examples

/**
 * Given an integer n, return a string array where,
 * array[i] == "FizzBuzz", if i is divisible by 3 and 5,
 * array[i] == "Fizz" if i is divisible by 3,
 * array[i] == "Buzz" if i is divisible by 5
 * array[i] == i (as string) if none of the above is true
 *
 * Examples:
 * Input n =3;
 * Output: ["1", "2", "Fizz"];
 *
 * Input: n = 5;
 * Output: ["1", "2", "Fizz", "4", "Buzz"];
 */
    fun main() {
        println("Enter Input: (Integer) ")
        val input = readln().toInt()
        val output = mutableListOf<String>()
        for (i in 1..input) {
            if (i % 15 == 0) {
                output.add("FizzBuzz")
                continue
            }
            if (i % 3 == 0) {
                output.add("Fizz")
                continue
            }
            if (i % 5 == 0) {
                output.add("Buzz")
                continue
            }

            output.add("$i")

        }

    println(output)
    }
