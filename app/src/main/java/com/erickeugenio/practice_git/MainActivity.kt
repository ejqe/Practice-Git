package com.erickeugenio.practice_git

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("SECOND COMMIT - STABLE")
        println("Fourth Commit here")
        println("Experimental Commit 1")

        println("Change 1")

        println("Change 2")
    }
}