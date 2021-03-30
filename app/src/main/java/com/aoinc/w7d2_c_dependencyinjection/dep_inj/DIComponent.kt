package com.aoinc.w7d2_c_dependencyinjection.dep_inj

import com.aoinc.w7d2_c_dependencyinjection.view.MainActivity
import dagger.Component

@Component(modules = [DIModule::class])
interface DIComponent {

    // now able to inject the main activity
    fun inject(mainActivity: MainActivity)
}