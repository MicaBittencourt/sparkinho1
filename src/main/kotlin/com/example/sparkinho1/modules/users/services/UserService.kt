package com.example.sparkinho1.modules.users.services

interface UserService {

    fun getUserList(): List<String>
    fun createUser(userName: String): String
    fun getUser(id: Int): String

}