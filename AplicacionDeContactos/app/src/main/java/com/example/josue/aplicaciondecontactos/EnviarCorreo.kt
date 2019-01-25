package com.example.josue.aplicaciondecontactos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EnviarCorreo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enviar_correo)

        val returnbutton = findViewById<Button>(R.id.Regresar1)

        returnbutton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }


}
