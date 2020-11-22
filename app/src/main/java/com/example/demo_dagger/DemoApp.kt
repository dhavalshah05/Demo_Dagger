package com.example.demo_dagger

import android.app.Application
import com.example.demo_dagger.di.application.AppComponent
import com.example.demo_dagger.di.application.AppModule
import com.example.demo_dagger.di.application.DaggerAppComponent

class DemoApp : Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
    }

}