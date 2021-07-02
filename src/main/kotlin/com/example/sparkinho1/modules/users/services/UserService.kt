package com.example.sparkinho1.modules.users.services

import com.example.sparkinho1.modules.users.User

interface UserService {

    fun getUserList(): List<User>
    fun createUser(userName: User): User
    fun getUser(id: Int): User?
    fun deleteUser(id: Int)

}