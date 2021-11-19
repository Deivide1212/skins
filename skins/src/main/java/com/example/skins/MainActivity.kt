package com.example.skins

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*
import kotlin.random.Random as Random1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun drawn1(view: View){
        var texto = findViewById(R.id.numberdrawn1) as TextView
        var numberdrawn1 = Random().nextInt(11)
        texto.setText("number drawn is: $numberdrawn1 ")
    }
}