package com.example.demo_dagger.base

import androidx.fragment.app.Fragment
import com.example.demo_dagger.di.presentation.PresentationComponent
import com.example.demo_dagger.di.presentation.PresentationModule

abstract class BaseFragment: Fragment() {

    protected val presentationComponent: PresentationComponent by lazy {
        val activityComponent = (requireActivity() as BaseActivity).activityComponent
        activityComponent.newPresentationComponent(PresentationModule())
    }

}