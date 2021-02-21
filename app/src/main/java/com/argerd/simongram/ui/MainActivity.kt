package com.argerd.simongram.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.argerd.simongram.R
import com.argerd.simongram.ui.login.phone.LoginPhoneFragment

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private companion object {
        const val PHOTO_LOGIN_FRAGMENT = "photoLogin"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager
            .beginTransaction()
            .addToBackStack(null)
            .add(R.id.fragmentContainer, LoginPhoneFragment(), PHOTO_LOGIN_FRAGMENT)
            .commit()
    }
}