package com.example.sparkinho1.modules.users.controllers

import com.example.sparkinho1.modules.users.User
import com.example.sparkinho1.modules.users.services.UserService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")

class UserController (
    private val userService: UserService
        ){

    @GetMapping
    fun getUserList(): List<User> = userService.getUserList()

    @PostMapping
    fun createUser(@RequestBody userName: User): User = userService.createUser(userName)

    @GetMapping("{id}")
    fun getUser(@PathVariable id: Int): User? = userService.getUser(id)

    @DeleteMapping("{id}")
    fun deleteUser(@PathVariable id: Int) = userService.deleteUser(id)

}


