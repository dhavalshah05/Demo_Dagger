package com.example.demo_dagger.di.activity

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: AppCompatActivity) {

    @Provides
    fun provideActivity(): AppCompatActivity = activity

    @Provides
    fun provideSharedPreference(activity: AppCompatActivity): SharedPreferences {
        return activity.getSharedPreferences("ABC", Context.MODE_PRIVATE)
    }

}