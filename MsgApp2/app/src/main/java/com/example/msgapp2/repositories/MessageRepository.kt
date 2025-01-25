package com.example.msgapp2.repositories

import com.example.msgapp2.dao.MessageDao
import com.example.msgapp2.model.Message
import kotlinx.coroutines.flow.Flow

class MessageRepository(private val dao: MessageDao) {
    val allMessages: Flow<List<Message>> = dao.getAllMessages()

    suspend fun addMessage(content: String) {
        val message = Message(content=content, timestamp = System.currentTimeMillis())

        dao.insertMessage(message)
    }
}