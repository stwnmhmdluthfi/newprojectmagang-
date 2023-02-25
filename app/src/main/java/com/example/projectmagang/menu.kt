package com.example.projectmagang

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var Masuk: Button
    private lateinit var Izin: Button
    private lateinit var Histori: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        Masuk = findViewById(R.id.btnMasuk)
        Izin = findViewById(R.id.btnIzin)
        Histori = findViewById(R.id.btnHistori)

    }

}
