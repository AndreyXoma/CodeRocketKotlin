package org.example

import java.io.BufferedReader
import java.io.FileNotFoundException
import java.io.FileReader
import java.io.IOException
import java.time.LocalDate
import java.time.format.DateTimeFormatter

/**
 * Сервис чтения и записи в файл
 * @author andreyXoma - 29.05.2024 - 17:11
 */
class FileScrapper {

    private val users = mutableListOf<User>()

    fun start() {
        readFile()
        println("Кол-во мужчин ${getCountMen()}; Кол-во женщин ${getCountWomen()}")
        println("Кол-во пользователей у которых возраст болльше 25: ${getUserByAge(filterAge)}")
        println("Средняя зп: ${getAverageSalary()}")
        println("Кол-во женщин, у которых присутствует номер телефона: ${getCountWomenHavePhoneNumber()}")
    }

    private fun readFile() {
        try {
            val bufferedReader = BufferedReader(FileReader(fileName))
            while (bufferedReader.ready()) {
                val line = bufferedReader.readLine()
                val split = splitStringArray(line, ';')
                saveUser(split)
            }
            users.forEach { println(it) }
        } catch (e: FileNotFoundException) {
            throw RuntimeException(e)
        } catch (e: IOException) {
            throw RuntimeException(e)
        }
    }

    private fun saveUser(str: List<String>) {
        if (str.isNotEmpty()) {
            var user = User(
                str[0],
                str[1],
                LocalDate.parse(str[2], DateTimeFormatter.ofPattern("dd.MM.yyyy")),
                str[3],
                str[4].toDoubleOrNull()
            )
            users.add(user)
        }
    }

    private fun splitStringArray(str: String, separator: Char): List<String> {
        val res = mutableListOf<String>()
        var count = 1
        var startPos = 0

        str.forEach {
            if (it == separator) count++
        }

        for (i in str.indices) {
            if (str[i] == separator) {
                res.add(str.substring(startPos until i))
                startPos = i + 1
            }
        }

        res.add(str.substring(startPos until str.length))

        return res
    }

    private fun getCountWomen(): Int =
         users.count { it.gender.equals("жен")}

    private fun getCountMen(): Int =
        users.count { it.gender.equals("муж") }

    private fun getUserByAge(age: Int): Int =
        users.count { LocalDate.now().year - (it.birthday?.year ?: 0) > age }

    private fun getAverageSalary() =
        users.stream().mapToDouble { it.salary ?: 0.0 }.average().asDouble

    private fun getCountWomenHavePhoneNumber() =
        users.filter { it.gender.equals("жен") }.count { it.phone?.isNotEmpty() ?: true }


    companion object {
        const val filterAge = 25
        const val fileName = "data.txt"
    }
}