package com.myapplication

import MainView
import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import getName

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MainView()
            Toast.makeText(this@MainActivity, getName(),Toast.LENGTH_LONG).show()
        }
    }
}

