package com.example.projectmagang

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    private lateinit var nama: EditText
    private lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        nama=findViewById(R.id.inputNama)
        password=findViewById(R.id.inputPassword)

        val login=findViewById<Button>(R.id.btnMasuk)
        login.setOnClickListener{
            val mls=Intent(this, Menu::class.java)
            mls.putExtra("nama anda",nama.text.toString())
            mls.putExtra("password anda",password.text.toString())
            startActivity(mls)
        }
    }
}
