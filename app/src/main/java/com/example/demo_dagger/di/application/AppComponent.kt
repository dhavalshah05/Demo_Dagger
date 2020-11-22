package com.example.demo_dagger.di.application

import com.example.demo_dagger.di.activity.ActivityComponent
import com.example.demo_dagger.di.activity.ActivityModule
import dagger.Component

@AppScope
@Component(modules = [AppModule::class])
interface AppComponent {

    fun newActivityComponent(activityModule: ActivityModule): ActivityComponent

}