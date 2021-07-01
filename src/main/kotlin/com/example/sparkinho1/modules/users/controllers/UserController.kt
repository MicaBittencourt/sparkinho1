package com.example.sparkinho1.modules.users.controllers

import com.example.sparkinho1.modules.users.services.UserService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")

class UserController (
    private val userService: UserService
        ){

    @GetMapping
    fun getUserList(): List<String> = userService.getUserList()

    @PostMapping
    fun createUser(@RequestBody userName: String): String = userService.createUser(userName)

    @GetMapping("{id}")
    fun getUser(@PathVariable id: Int): String = userService.getUser(id)

}


