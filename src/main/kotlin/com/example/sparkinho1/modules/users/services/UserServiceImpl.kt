package com.example.sparkinho1.modules.users.services

import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService {
    override fun getUserList(): List<String> {
        return listOf("Michele")
    }

    override fun createUser(userName: String): String {
       return userName
    }

    override fun getUser(id: Int): String {
        return "Michele"
    }
}