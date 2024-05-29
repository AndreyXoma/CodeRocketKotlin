package org.example

import java.time.LocalDate

/**
 * Модель пользователя
 *
 * @author andreyXoma - 29.05.2024 - 17:08
 */
data class User(
    val fullName: String?,
    val gender: String?,
    val birthday: LocalDate?,
    val phone: String?,
    val salary: Double?,
)
