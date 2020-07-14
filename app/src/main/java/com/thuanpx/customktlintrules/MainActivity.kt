package com.thuanpx.customktlintrules

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    companion object {
        fun newInstance() = MainActivity()
        val test = 5
        val test2 = 10
        val test3 = 11
    }
}
