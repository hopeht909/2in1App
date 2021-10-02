package com.example.a2in1app

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
     lateinit var numbersGameButton: Button
     lateinit var guessThePhraseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        numbersGameButton = findViewById(R.id.btNumbersGame)
        numbersGameButton.setOnClickListener {
           open(guessNumber())

        }
        guessThePhraseButton = findViewById(R.id.btGuessThePhrase)
        guessThePhraseButton.setOnClickListener {
            open(guessPhrase())


        }

    }
    private fun open(activity : Activity){
    val intent = Intent(this, activity::class.java)
    startActivity(intent)}
}