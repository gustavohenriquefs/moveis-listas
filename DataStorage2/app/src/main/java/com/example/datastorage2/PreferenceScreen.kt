package com.example.datastorage2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlinx.coroutines.launch

@Composable
fun PreferenceScreen() {
    val context = LocalContext.current
    val viewModel: PreferencesViewModel = viewModel(factory = PreferenceViewModelFactory(context))

    val scope = rememberCoroutineScope()

    var inputValue by remember {
        mutableStateOf("")
    }

    val savedValue by viewModel.readValue.collectAsState(initial = "")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedTextField(
            value = inputValue,
            onValueChange = { inputValue = it },
            label = { Text("Digite aqui") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                scope.launch {
                    viewModel.saveValue(inputValue, context)
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Salvar preferências")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text("Valor salvo: $savedValue", style = MaterialTheme.typography.bodyLarge)
    }
}

@Preview(backgroundColor = 0xFFF0EAE2, showBackground = true)
@Composable
fun PreferenceScreenPreview() {
    PreferenceScreen()
}