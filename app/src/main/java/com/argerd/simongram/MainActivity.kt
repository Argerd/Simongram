package com.argerd.simongram

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.argerd.simongram.login.LoginFragment

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager
            .beginTransaction()
            .addToBackStack(null)
            .add(R.id.fragmentContainer, LoginFragment(), "LOGIN")
            .commit()
    }
}