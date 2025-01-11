package com.example.crudapp

import kotlinx.coroutines.flow.Flow

class UserRepository(private val userDao: UserDAO) {

    suspend fun insertUser(user: User): Long = userDao.insertUser(user)

    suspend fun getAllUsers(): Flow<List<User>> = userDao.getAllUsers()

    suspend fun updateUser(user: User): Int = userDao.updateUser(user)

    suspend fun deleteUser(user: User): Int = userDao.deleteUser(user)
}