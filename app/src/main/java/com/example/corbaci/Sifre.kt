package com.example.corbaci

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.View.VISIBLE
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.SeekBar
import android.widget.TextView

class Sifre : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sifre)
        var harfbir = findViewById<TextView>(R.id.harfbir)
        var harfiki = findViewById<TextView>(R.id.harfiki)
        var harfuc = findViewById<TextView>(R.id.harfuc)
        var harfdort =findViewById<TextView>(R.id.harfdort)
        var harfbes = findViewById<TextView>(R.id.harfbes)
        var harfalti = findViewById<TextView>(R.id.harfalti)

        var tikbir = findViewById<ImageView>(R.id.tikbir)
        var tikiki = findViewById<ImageView>(R.id.tikiki)
        var tikuc = findViewById<ImageView>(R.id.tikuc)
        var tikdort = findViewById<ImageView>(R.id.tikdort)
        var tikbes = findViewById<ImageView>(R.id.tikbes)
        var tikalti = findViewById<ImageView>(R.id.tikalti)
        var progressBar = findViewById<ProgressBar>(R.id.progressBar)

        tikbir.visibility = View.INVISIBLE
        tikiki.visibility = View.INVISIBLE
        tikuc.visibility = View.INVISIBLE
        tikdort.visibility = View.INVISIBLE
        tikbes.visibility = View.INVISIBLE
        tikalti.visibility = View.INVISIBLE
        progressBar.visibility = View.INVISIBLE




        harfbir.setOnClickListener {
            if (tikbir.visibility == View.INVISIBLE) {
                tikbir.visibility = VISIBLE
            }
        }
        harfiki.setOnClickListener {
            if (tikbir.visibility == VISIBLE) {
                tikiki.visibility = VISIBLE
            }
        }
        harfuc.setOnClickListener {
            if (tikbir.visibility == VISIBLE && tikiki.visibility == VISIBLE) {
                tikuc.visibility = VISIBLE
            }
        }
        harfdort.setOnClickListener {
            if (tikbir.visibility == VISIBLE && tikiki.visibility == VISIBLE
                && tikuc.visibility == VISIBLE ) {
                tikdort.visibility = VISIBLE
            }
        }
        harfbes.setOnClickListener {
            if ( tikdort.visibility == VISIBLE && tikuc.visibility == VISIBLE) {
                tikbes.visibility = VISIBLE
            }
        }
        harfalti.setOnClickListener {
            if ( tikdort.visibility == VISIBLE && tikbes.visibility == VISIBLE ) {
                tikalti.visibility = VISIBLE
                progressBar.visibility = VISIBLE
                Handler().postDelayed({
                    var gecis= Intent(this,corbacesitleri:: class.java)
                    startActivity(gecis)
                    finish()
                },3000)
            }
        }











    }
}