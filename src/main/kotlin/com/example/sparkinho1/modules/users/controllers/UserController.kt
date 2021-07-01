package com.example.sparkinho1.modules.users.controllers

import com.example.sparkinho1.modules.users.services.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")

class UserController (
    private val userService: UserService
        ){

    @GetMapping
    fun getUserList(): List<String> = userService.getUserList()

    @PostMapping
    fun createUser(userName: String): String = userService.createUser(userName)

}


