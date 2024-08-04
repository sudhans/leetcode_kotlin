package org.msd.leetcode.examples

/**
 * Check if the given input is a palindrome or not
 *
 * Example 1:
 * Input x = 121
 * Output = true
 *
 * Example 2:
 * Input x = -121
 * Output = false
 *
 * Constraint: Solve without converting the integer to a string
 */
fun main () {

    println("Enter Input: (Integer) ")
    val input = readln().toInt()
    var x = input
    var y = 0
    var counter = 0.0
    var remainder: Int
    do {
       remainder = x % 10
       y = y * 10 + remainder
       x /= 10
       counter++
       println (" x = $x , y = $y, counter =  $counter")
    } while (x > 0)
    
   if (y == input) {
       println("Given number $input is a palindrome")
   } else {
       println("Given number $input is NOT a palindrome")
   }

}