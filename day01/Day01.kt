package day01

import java.io.File
import java.util.*

fun problem1(): Int {
    val input = Scanner(File("day01/input.txt"))
    var increases = 0
    var previousValue = input.nextInt()
    var currentValue : Int
    while (input.hasNextInt()) {
        currentValue = input.nextInt()
        if (currentValue > previousValue) increases++
        previousValue = currentValue
    }
    input.close()
    return increases
}

fun problem2(): Int {
    val input = Scanner(File("day01/input.txt"))
    var increases = 0
    val values = mutableListOf<Int>(input.nextInt(), input.nextInt(), input.nextInt())
    var previousSum : Int
    while (input.hasNextInt()) {
        previousSum = values.sum()
        values.removeAt(0)
        values.add(input.nextInt())
        if (values.sum() > previousSum) increases++
    }
    input.close()
    return increases
}

fun main() {
    println(problem1())
    println(problem2())
}