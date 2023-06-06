package com.example.corbaci

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ad =findViewById<TextView>(R.id.isim)
        object :CountDownTimer(4400,70){
            var a=1
            override fun onTick(p0: Long) {
                ad.setTextSize(a.toFloat())
                a = a + 1
            }
            override fun onFinish() {

                var gecis= Intent(applicationContext,Sifre:: class.java)
                startActivity(gecis)
                finish()
            }
        }.start()

    }
}