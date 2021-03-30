package com.aoinc.w7d2_c_dependencyinjection.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aoinc.w7d2_c_dependencyinjection.R
import com.aoinc.w7d2_c_dependencyinjection.util.DIAlertDialog
import com.aoinc.w7d2_c_dependencyinjection.util.DIAppSingleton
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var diDiAlert: DIAlertDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DIAppSingleton.diComponent?.inject(this).also {
            diDiAlert.displayMessage("It worked!")
        }
    }
}