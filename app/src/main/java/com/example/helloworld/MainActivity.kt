package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import java.security.KeyStore

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var textViewHello : TextView = TextView(this)
        var isEnglish : Boolean = true
        textViewHello .text = "Hello World!"

        var buttonTranslate = Button(this)

        buttonTranslate.text = "Traduzir"
        buttonTranslate.setOnClickListener {
            if (isEnglish) {
                textViewHello.text = "Olá Mundo!"
                isEnglish = false
            } else {
                textViewHello.text = "Hello World!"
                isEnglish = true
            }
        }

        var linearLayout = LinearLayout(this)
        linearLayout.addView(textViewHello)
        linearLayout.addView(buttonTranslate)

        setContentView(linearLayout)
    }
}