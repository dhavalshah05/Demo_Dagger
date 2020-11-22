package com.example.demo_dagger.di.presentation

import com.example.demo_dagger.MainActivity
import com.example.demo_dagger.di.presentation.viewmodel.ViewModelModule
import dagger.Subcomponent

@PresentationScope
@Subcomponent(modules = [PresentationModule::class, ViewModelModule::class])
interface PresentationComponent {

    fun inject(mainActivity: MainActivity)

}