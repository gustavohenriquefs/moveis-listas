package com.example.msgapp2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.room.Room
import com.example.msgapp2.dao.AppDataBase
import com.example.msgapp2.repositories.MessageRepository
import com.example.msgapp2.ui.theme.MsgAppTheme
import com.example.msgapp2.ui.theme.view.MessageApp
import com.example.msgapp2.viewmodel.MessageViewModel
import com.example.msgapp2.viewmodel.MessageViewModelFactory


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val db = Room.databaseBuilder(
            applicationContext,
            AppDataBase::class.java,
            "messages-db"
        ).fallbackToDestructiveMigration().build()

        val repository = MessageRepository(db.messageDao())

        setContent {
            MsgAppTheme {
                val viewModel: MessageViewModel =
                    viewModel(factory = MessageViewModelFactory(repository))

                MessageApp(viewModel)
            }
        }
    }
}
