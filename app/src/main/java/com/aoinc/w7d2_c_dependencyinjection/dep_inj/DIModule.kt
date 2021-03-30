package com.aoinc.w7d2_c_dependencyinjection.dep_inj

import android.content.Context
import com.aoinc.w7d2_c_dependencyinjection.util.DIAlertDialog
import dagger.Module
import dagger.Provides

@Module
class DIModule(val context: Context) {

    @Provides
    fun getDIAlertDialog(): DIAlertDialog = DIAlertDialog(context)
}