package com.example.actividadamigos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        var botonLista:Button = findViewById(R.id.btnLista)
        var botnCredor:Button = findViewById(R.id.btnCreador)

        botonLista.setOnClickListener {
            val i = Intent(this,MainActivity::class.java)
            startActivity(i)
        }
        botnCredor.setOnClickListener {
            val i = Intent(this,Desarrollador::class.java)
            startActivity(i)
        }
    }
}