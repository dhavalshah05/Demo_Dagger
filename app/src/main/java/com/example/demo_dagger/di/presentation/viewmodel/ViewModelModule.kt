package com.example.demo_dagger.di.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.example.demo_dagger.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun provideMainViewModel(viewModel: MainViewModel): ViewModel

}