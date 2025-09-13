// Задача 1
/*fun main() {
    print ("Введите строку: ")
    val input = readLine() ?: ""

    if (input.isEmpty()) {
        println("Строка пуста!")
        return
    }

    val result = StringBuilder()
    var count = 1

    for (i in 1 until input.length) {
        if (input [i] == input [i-1]) {
            count++
    } else {
        result.append(input[i-1])
        if (count > 1) result.append(count)
        count = 1
    }

}
result.append(input.last())
        if (count > 1) result.append(count)

        println("Peзультат: $result")
}*/

// Задача 2
/*fun main() {
    print ("Введите строку: ")
    val input = readLine() ?: ""

    if (input.isEmpty()) {
        println("Строка пуста!")
        return
    }
    val counts = mutableMapOf<Char,Int>()
    for (ch in input) {
        counts[ch]=counts.getOrDefault(ch,0)+1
    }
    val sortedKeys = counts.keys.sorted()
    for (key in sortedKeys) {
        println("$key - ${counts[key]}")
    }
}*/

// Задача 3
/*fun main() {
    print("Введите натуральное число: ")
    val input = readLine() ?: ""

    if (input.isEmpty()) {
        println("Вы ничего не ввели!")
        return
    }
    val number = input.toIntOrNull()
    if (number == null || number < 0) {
        println("Введите корректное натуральное число!")
        return
    }
    val binary = Integer.toBinaryString(number)
    println ("В двоичной системе: $binary")
}*/

// Задача 4
/*
 fun main() {
    print("Введите выражение (ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ): ")
    val input = readLine() ?: ""
    if (input.isEmpty()) {
        println("Вы ничего не ввели!")
        return
    }
    val parts = input.trim().split(Regex("\\s+"))

    if (parts.size != 3) {
        println("Ошибка: нужно ввести ровно 3 элемента через пробел (ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ)")
        return
    }

    val num1 = parts[0].toDoubleOrNull()
    val num2 = parts[1].toDoubleOrNull()
    val op = parts[2]

    if (num1 == null || num2 == null) {
        println("Ошибка: первые два значения должны быть числами")
        return
    }

    val result = when (op) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) num1 / num2 else {
            println("Ошибка: деление на ноль!")
            return
        }
        else -> {
            println("Ошибка: неизвестная операция '$op'")
            return
        }
    }

    val output = if (result % 1.0 == 0.0) result.toLong().toString() else result.toString()
    println("Результат: $output")
}
*/

// Задача 5
/*
fun main() {
    print("Введите число n: ")
    val n = readLine()!!.toInt()

    print("Введите основание степени x: ")
    val x = readLine()!!.toInt()

    var y = 0
    var value = 1
    var found = false

    while (value <= n) {
        if (value == n) {
            print("Целочисленный показатель существует: y = $y")
            found = true
            break
        }
        y = y + 1
        value = value * x
    }

    if (!found) {
        println("Целочисленный показатель не существует")
    }
}
*/

// Задача 6
fun main() {
    println("Введите первую цифру: ")
    val a = readLine()!!.toInt()

    println("Введите вторую цифру: ")
    val b = readLine()!!.toInt()

    if (a == b) {
        println("Цифры должны быть различными")
        return
    }

    if (a % 2 == 1) {
        val number = b * 10 + a
        println("Можно составить число: $number")
    } else if (b % 2 == 1) {
        val number = a * 10 + b
        println("Можно составить число: $number")
    } else {
        println("Создать нечетное число невозможно")
    }
}



