package com.example.sparkinho1.modules.users.services

import com.example.sparkinho1.modules.users.User
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService {
    override fun getUserList(): List<User> {
        return mapa.values.toList()
    }

    override fun createUser(userName: User): User {
        ids += 1
        userName.id = ids
        mapa[ids] = userName
       return userName
    }

    override fun getUser(id: Int): User? {
        return mapa[id]
    }

    override fun deleteUser(id: Int) {
        mapa.remove(id)

    }
    val mapa = HashMap<Int, User>()
    var ids = 0


}