package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import java.security.KeyStore

class MainActivity : AppCompatActivity() {
    var iterator : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Variaveis
        var textViewHello : TextView = TextView(this)
        var isEnglish : Boolean = true
        var iteratorView : TextView = TextView(this)
        var congratsMessage : TextView = TextView(this)
        var linearLayout = LinearLayout(this)
        var buttonTranslate = Button(this)

        // atribuir texto
        textViewHello .text = "Hello World!"
        congratsMessage.text = "\nParabéns, traduziste 100 vezes!"
        buttonTranslate.text = "Traduzir"

        buttonTranslate.setOnClickListener {
            iterator+= 1
            // Verificar Linguagem
            if (isEnglish) {
                textViewHello.text = "Olá Mundo!"
                isEnglish = false
            } else {
                textViewHello.text = "Hello World!"
                isEnglish = true
            }
            if (iterator == 100)
                linearLayout.addView(congratsMessage)
            iteratorView.text = "$iterator"
        }

        // layout
        linearLayout.addView(textViewHello)
        linearLayout.addView(buttonTranslate)
        linearLayout.addView(iteratorView)

        // Mostrar no ecra
        setContentView(linearLayout)
    }
}