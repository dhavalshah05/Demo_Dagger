package com.example.demo_dagger.di.activity

import com.example.demo_dagger.MainActivity
import com.example.demo_dagger.di.presentation.PresentationComponent
import com.example.demo_dagger.di.presentation.PresentationModule
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [ActivityModule::class])
interface ActivityComponent {

    fun newPresentationComponent(presentationModule: PresentationModule): PresentationComponent

}