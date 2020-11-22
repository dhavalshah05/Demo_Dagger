package com.example.demo_dagger.base

import androidx.appcompat.app.AppCompatActivity
import com.example.demo_dagger.DemoApp
import com.example.demo_dagger.di.activity.ActivityComponent
import com.example.demo_dagger.di.activity.ActivityModule
import com.example.demo_dagger.di.presentation.PresentationComponent
import com.example.demo_dagger.di.presentation.PresentationModule

abstract class BaseActivity : AppCompatActivity() {

    val activityComponent: ActivityComponent by lazy {
        val appComponent = (application as DemoApp).appComponent
        appComponent.newActivityComponent(ActivityModule(this))
    }

    protected val presentationComponent: PresentationComponent by lazy {
        activityComponent.newPresentationComponent(PresentationModule())
    }

}