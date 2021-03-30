package com.aoinc.w7d2_c_dependencyinjection

import android.app.Application
import com.aoinc.w7d2_c_dependencyinjection.dep_inj.DIComponent
import com.aoinc.w7d2_c_dependencyinjection.dep_inj.DIModule
import com.aoinc.w7d2_c_dependencyinjection.dep_inj.DaggerDIComponent
import com.aoinc.w7d2_c_dependencyinjection.util.DIAppSingleton

class DIApplication : Application() {

    lateinit var diComponent: DIComponent

    override fun onCreate() {
        super.onCreate()

        diComponent = DaggerDIComponent
            .builder()
            .dIModule(DIModule(applicationContext))
            .build()

        DIAppSingleton.diComponent = diComponent
    }
}