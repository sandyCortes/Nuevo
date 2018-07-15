package com.example.sandr.holamundo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainHola : AppCompatActivity() {
    private var txtUno: EditText? = null
    private var txtDos: EditText? = null
    private var uno: String? = null
    private var dos: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_hola)

        txtUno = findViewById<EditText>(R.id.txtUno)
        txtDos = findViewById<EditText>(R.id.txtDos)


    }
}