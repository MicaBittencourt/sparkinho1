package com.example.sparkinho1.modules.users
import java.time.LocalDate


class User (
    var id: Int,
    val name: String,
    val office: String,
    val company: String,
    val admission: LocalDate,
    val birthday: LocalDate,
    val email: String,
    val state: String

)