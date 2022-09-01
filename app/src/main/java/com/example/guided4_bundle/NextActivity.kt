package com.example.guided4_bundle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.textfield.TextInputEditText

class NextActivity : AppCompatActivity() {
    private lateinit var nama : EditText
    private lateinit var nim : EditText
    private lateinit var fakultas : EditText
    private lateinit var prodi : EditText
    private lateinit var mBundle: Bundle

    lateinit var vNama : String
    lateinit var vNim : String
    lateinit var vFakultas : String
    lateinit var vProdi : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        getBundle()
        setText()
    }

    fun getBundle(){
        //mengambil bundle dari activity sebelumnya menggunakan key register
        mBundle = intent.getBundleExtra("register")!!
        //mengambil data dari Bundle
        vNama = mBundle.getString("nama")!!
        vNim = mBundle.getString("nim")!!
        vFakultas = mBundle.getString("fakultas")!!
        vProdi = mBundle.getString("prodi")!!
    }

    fun setText(){
        nama = findViewById(R.id.ptNama)
        nama.setText(vNama)
        nim = findViewById(R.id.ptNim)
        nim.setText(vNim)
        fakultas = findViewById(R.id.ptFakultas)
        fakultas.setText(vFakultas)
        prodi = findViewById(R.id.ptProdi)
        prodi.setText(vProdi)
    }
}