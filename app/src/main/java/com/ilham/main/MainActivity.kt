package com.ilham.main

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btnPassingData: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnPassingData = findViewById(R.id.btnPassingData)

        // untuk 1 screen terdiri dari 1 main activity dan 1 file xml layout
        // untuk widget yang dipakai, harus dideklarasi dahulu
        // kita deklarasi findviewby id

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnPassingData.setOnClickListener() {
            val intentMenu5 = Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(intentMenu5)
        }
    }
}