package com.example.datastorage2

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.map

val Context.dataStore by preferencesDataStore("user_prefs")

suspend fun savePreference(context: Context, key: String, value: String) {
    val dataStoreKey = stringPreferencesKey(key);

    context.dataStore.edit { preference ->
        preference[dataStoreKey] = value
    }
}

fun readPreference(context: Context, key: String): Flow<String> {
    val dataStoreKey = stringPreferencesKey(key)

    return context.dataStore.data.filter {
        it.contains(dataStoreKey)
    }.map {preferences ->
        preferences[dataStoreKey] ?: ""
    }
}