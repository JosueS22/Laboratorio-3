package com.example.josue.aplicaciondecontactos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addbutton = findViewById<Button>(R.id.Boton1)

        addbutton.setOnClickListener {
            startActivity(Intent(this, CrearContacto::class.java))
        }
    }


}
