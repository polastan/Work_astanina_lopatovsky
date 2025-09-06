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
fun main() {
    print("Введите выражение (Число1 Число2 Операция): .")
    val input = readLine() ?: ""
    if (input.isEmpty()) {
        println ("Вы ничего не ввели!")
        return
    }
    val parts = input.split("")
    if (parts.size !=3) {
        println("Ошибка: нужно ввести в формате Число1 Число2 Операция")
        return
    }
    val num1 = parts[0].toDoubleOrNull()
    val num2 = parts[1].toDoubleOrNull()
    val op = parts[2]

    if (num1 == null || num2 == null) {
        println("Ошибка: числа должны быть вещественными или целыми")
        return
    }
    val result = when (op) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2!=0.0) num1 / num2 else
        {
            println ("Ошибка: деление на ноль!")
            return
        }
        else -> {
            println("Ошибка: неизвестная операция $op")
            return
        }
    }
    println ("Результат: $result")
}

// Задача 5

