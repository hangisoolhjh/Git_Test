package com.example.gittestproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        qweads()
    }

    private fun qweads() {
        func1()
        Log.e("qweasd", "QWeas")
    }

    private fun func1() {
        Log.e("qweasd", "QWeas")
    }

    private fun qweads1() {
        Log.e("qweasd", "QWeas")
    }

    private fun qwead2s() {
        Log.e("qweasd", "QWeas")
    }
}