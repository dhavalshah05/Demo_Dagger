package com.example.demo_dagger

import android.content.SharedPreferences
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.demo_dagger.base.BaseActivity
import com.example.demo_dagger.di.presentation.viewmodel.ViewModelFactory
import javax.inject.Inject

class MainActivity : BaseActivity() {

    companion object {
        private const val TAG = "DAGGER_DEBUG"
    }

    @Inject
    lateinit var preference: SharedPreferences

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        presentationComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)
        mainViewModel.demoMethod()
    }

}