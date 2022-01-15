package com.example.a1201zadanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var licznik = 1;

        findViewById<Button>(R.id.btnlewy).setOnClickListener {
            if(licznik == 1)
                licznik = 4;
            else
                licznik -= 1;

            if(licznik == 1)
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.kot);
            else if(licznik == 2)
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.pies);
            else if(licznik == 3)
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.t34);
            else if(licznik == 4)
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.tirpitz);
        }

        findViewById<Button>(R.id.btnprawy).setOnClickListener {
            if(licznik == 4)
                licznik = 1;
            else
                licznik += 1;

            if(licznik == 1)
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.kot);
            else if(licznik == 2)
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.pies);
            else if(licznik == 3)
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.t34);
            else if(licznik == 4)
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.tirpitz);
        }

        findViewById<Button>(R.id.rotprawbtn).setOnClickListener {
            var rotacja = findViewById<EditText>(R.id.rotacja).text;
            findViewById<ImageView>(R.id.obraz).rotation = rotacja.toString().toFloat();
        }

        findViewById<Button>(R.id.rotlewobtn).setOnClickListener {
            var rotacja = "-" + findViewById<EditText>(R.id.rotacja).text;
            findViewById<ImageView>(R.id.obraz).rotation = rotacja.toString().toFloat();
        }

        findViewById<Button>(R.id.skalabtn).setOnClickListener {
            var skala = findViewById<EditText>(R.id.skala).text;
            findViewById<ImageView>(R.id.obraz).scaleX = skala.toString().toFloat();
            findViewById<ImageView>(R.id.obraz).scaleY = skala.toString().toFloat();
        }

        findViewById<Button>(R.id.przezbtn).setOnClickListener {
            var przezroczystosc = findViewById<EditText>(R.id.przezr).text;
            findViewById<ImageView>(R.id.obraz).alpha = przezroczystosc.toString().toFloat();
        }
    }
}