package com.example.frenchteatcherapp

import android.annotation.SuppressLint
import android.content.Context
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    private var mediaPlayer: MediaPlayer = MediaPlayer()
    @SuppressLint("ResourceAsColor", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val screen: View = findViewById(R.id.screen)
        val textView: TextView = findViewById(R.id.textView)
        val btn1: Button = findViewById(R.id.button)
        val btn2: Button = findViewById(R.id.button2)
        val btn3: Button = findViewById(R.id.button3)
        val btn4: Button = findViewById(R.id.button4)
        val btn5: Button = findViewById(R.id.button5)

        btn1.setOnClickListener{
            // usando o setBackgroundColor para mudar a cor do background
            // OBS: temos que passar o contextcompact como parametro para poder acessar a cor
            screen.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow))
            soundEffect(this, R.raw.yellow)
        }

        btn2.setOnClickListener{
            screen.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
            soundEffect(this, R.raw.red)
        }

        btn3.setOnClickListener{
            screen.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
            soundEffect(this, R.raw.green)
        }

        btn4.setOnClickListener{
            screen.setBackgroundColor(ContextCompat.getColor(this, R.color.purple_500))
            soundEffect(this, R.raw.purple)
        }

        btn5.setOnClickListener{
            screen.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
            textView.setTextColor(ContextCompat.getColor(this, R.color.white))
            soundEffect(this, R.raw.black)
        }
    }

    private fun soundEffect(context: Context, cor: Int) {
        mediaPlayer = MediaPlayer.create(
            context,
            cor
        )
        mediaPlayer.start()
    }
}