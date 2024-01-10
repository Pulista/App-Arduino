package com.rodrigo.apparduino

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val btnClick: Button = findViewById(R.id.btn_led)
        val btnClick2: Button = findViewById(R.id.btn_led2)

        btnClick.setOnClickListener {
            Log.i("test", "LED acesso!")
        }

        btnClick2.setOnClickListener {
            Log.i("test", "LED apagado!")
        }

    }
}