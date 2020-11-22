package com.example.demo_dagger

import android.content.SharedPreferences
import android.util.Log
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor (
    private val sharedPreferences: SharedPreferences
): ViewModel() {

    companion object {
        private const val TAG = "VIEW_MODEL_DEBUG"
    }

    init {
        Log.d(TAG, "$sharedPreferences")
    }

    fun demoMethod() {

    }
}