package day02

import java.io.File
import java.util.*

fun problem1(): Int {
    val input = Scanner(File("day02/input.txt"))
    var horizontalPosition = 0
    var depth = 0
    var line: String
    while (input.hasNextLine()) {
        line = input.nextLine()
        if (line.contains("forward")) horizontalPosition += (line.filter { it.isDigit() }.toInt())
        else if (line.contains("up")) depth -= (line.filter { it.isDigit() }.toInt())
        else if (line.contains("down")) depth += (line.filter { it.isDigit() }.toInt())
    }
    input.close()
    return horizontalPosition * depth
}

fun problem2(): Int {
    val input = Scanner(File("day02/input.txt"))
    var horizontalPosition = 0
    var depth = 0
    var aim = 0
    var line: String
    while (input.hasNextLine()) {
        line = input.nextLine()
        if (line.contains("forward")) {
            horizontalPosition += (line.filter { it.isDigit() }.toInt())
            depth += (line.filter { it.isDigit() }.toInt() * aim)
        } else if (line.contains("up")) aim -= (line.filter { it.isDigit() }.toInt())
        else if (line.contains("down")) aim += (line.filter { it.isDigit() }.toInt())
    }
    input.close()
    return horizontalPosition * depth
}

fun main() {
    println(problem1())
    println(problem2())
}