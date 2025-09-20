fun main() {
    print("Выберите задачу (1-6): ")
    val choice = readLine()?.toIntOrNull() ?: 0

    if (choice == 1) {

        // ЗАДАЧА 1
        println("Введите строку:")
        val input = readLine() ?: ""

        if (input == "") {
            println("Строка пустая!")
        } else {
            var result = ""
            var count = 1

            for (i in 1 until input.length) {
                if (input[i] == input[i - 1]) {
                    count = count + 1
                } else {
                    result = result + input[i - 1]
                    if (count > 1) {
                        result = result + count
                    }
                    count = 1
                }
            }

            result = result + input[input.length - 1]
            if (count > 1) {
                result = result + count
            }

            println("Результат: $result")
        }

    } else if (choice == 2) {

        // ЗАДАЧА 2
        println("Введите строку:")
        val input = readLine() ?: ""

        for (c in input.toSet()) {
            var count = 0
            for (i in input) {
                if (i == c) {
                    count = count + 1
                }
            }
            println("$c - $count")
        }

    } else if (choice == 3) {

        // ЗАДАЧА 3
        println("Введите число:")
        val n = readLine()?.toIntOrNull() ?: 0

        var number = n
        var result = ""

        if (number == 0) {
            result = "0"
        }

        while (number > 0) {
            val bit = number % 2
            result = bit.toString() + result
            number = number / 2
        }

        println("В двоичной системе: $result")

    } else if (choice == 4) {

        // ЗАДАЧА 4
        println("Введите число 1:")
        val a = readLine()?.toDoubleOrNull() ?: 0.0

        println("Введите число 2:")
        val b = readLine()?.toDoubleOrNull() ?: 0.0

        println("Введите операцию (+, -, *, /):")
        val op = readLine() ?: ""

        var result = 0.0

        if (op == "+") {
            result = a + b
        } else if (op == "-") {
            result = a - b
        } else if (op == "*") {
            result = a * b
        } else if (op == "/") {
            if (b != 0.0) {
                result = a / b
            } else {
                println("Ошибка: деление на ноль")
                return
            }
        } else {
            println("Неизвестная операция")
            return
        }

        println("Результат: $result")

    } else if (choice == 5) {

        // ЗАДАЧА 5
        println("Введите число n:")
        val n = readLine()?.toIntOrNull() ?: 0

        println("Введите основание x:")
        val x = readLine()?.toIntOrNull() ?: 0

        var value = 1
        var y = 0
        var found = false

        while (value <= n && x > 1) {
            if (value == n) {
                println("Да, n = x^$y")
                found = true
                break
            }
            y = y + 1
            value = value * x
        }

        if (!found) {
            println("Целочисленный показатель не существует")
        }

    } else if (choice == 6) {

        // ЗАДАЧА 6
        println("Введите первую цифру:")
        val a = readLine()?.toIntOrNull() ?: 0

        println("Введите вторую цифру:")
        val b = readLine()?.toIntOrNull() ?: 0

        if (a % 2 == 1 && b % 2 == 0) {
            println("Можно составить число: " + (b * 10 + a))
        } else if (b % 2 == 1 && a % 2 == 0) {
            println("Можно составить число: " + (a * 10 + b))
        } else {
            println("Создать нечетное число нельзя")
        }

    } else {
        println("Нет такой задачи!")
    }
}
