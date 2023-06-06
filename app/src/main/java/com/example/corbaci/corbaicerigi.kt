package com.example.corbaci

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_corbaicerigi.*

class corbaicerigi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_corbaicerigi)
        val intent = intent
        var corbaisim = findViewById<TextView>(R.id.corbaisim)

        val gelenVeri = intent.getStringExtra( "git")
        corbaisim.text =gelenVeri

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {

                if (seekBar.progress == 2) {
                    var uyari = AlertDialog.Builder(this@corbaicerigi)
                    uyari.setCancelable(false)
                    uyari.setTitle("Uyarı!")
                    uyari.setMessage("Bu kadar tuz istediğinize emin misiniz?")
                    uyari.setIcon(R.drawable.tuzz)
                    uyari.setPositiveButton("Evet") { DialogInterface, i ->
                        Toast.makeText(applicationContext, "Bol Tuzlu Çorba", Toast.LENGTH_SHORT).show()
                    }
                    uyari.setNegativeButton("Hayır") { DialogInterface, i ->
                        seekBar.progress=1
                    }
                    uyari.create().show()

                }
            }
            override fun onStartTrackingTouch(p0: SeekBar?) {
            }
            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })
        seekBar2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {

                if (seekBar2.progress == 2) {
                    var uyari = AlertDialog.Builder(this@corbaicerigi)
                    uyari.setCancelable(false)
                    uyari.setTitle("Uyarı!")
                    uyari.setMessage("Bu kadar acı istediğinize emin misiniz?")
                    uyari.setIcon(R.drawable.biber)
                    uyari.setPositiveButton("Evet") { DialogInterface, i ->
                        Toast.makeText(applicationContext, "Bol Acılı Çorba", Toast.LENGTH_SHORT).show()
                    }
                    uyari.setNegativeButton("Hayır") { DialogInterface, i ->
                        seekBar2.progress=1
                    }
                    uyari.create().show()

                }
            }
            override fun onStartTrackingTouch(p0: SeekBar?) {
            }
            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })




        var nane = findViewById<Switch>(R.id.nane)
        var yag = findViewById<Switch>(R.id.yag)
        var kitir = findViewById<Switch>(R.id.kitir)
        var limon = findViewById<Switch>(R.id.limon)
        var tozbiber = findViewById<Switch>(R.id.tozbiber)
        var dil = findViewById<Switch>(R.id.dil)
        var krema = findViewById<Switch>(R.id.krema)
        var sarimsak= findViewById<Switch>(R.id.sarimsak)
        var sirke = findViewById<Switch>(R.id.sirke)
        var beyin= findViewById<Switch>(R.id.beyin)
        var terbiye = findViewById<Switch>(R.id.terbiye)
        var kasar= findViewById<Switch>(R.id.kasar)
        var siparisbutonu = findViewById<Button>(R.id.siparisbutonu)
        var seekBar = findViewById<SeekBar>(R.id.seekBar)
        var seekBar2 = findViewById<SeekBar>(R.id.seekBar2)


        if(gelenVeri == "Ezogelin Çorbası"){
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            tozbiber.visibility = View.VISIBLE
        }
        if( gelenVeri == "Düğün Çorbası"){
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            tozbiber.visibility = View.VISIBLE
        }
        if(gelenVeri == "Mercimek Çorbası"){
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            tozbiber.visibility = View.VISIBLE
        }
        if(gelenVeri == "Brokoli Çorbası"){
            krema.visibility = View.VISIBLE

        }
        if(gelenVeri == "Kelle-Paça Çorbası"){
            sarimsak.visibility = View.VISIBLE
            dil.visibility = View.VISIBLE
            beyin.visibility = View.VISIBLE
            sirke.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
        }
        if(gelenVeri == "Yayla Çorbası"){
            nane.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            tozbiber.visibility = View.VISIBLE
        }
        if(gelenVeri == "Şehriye Çorbası"){
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            tozbiber.visibility = View.VISIBLE
        }
        if(gelenVeri == "Domates Çorbası"){
            nane.visibility = View.VISIBLE
            terbiye.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            kasar.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            tozbiber.visibility = View.VISIBLE
        }
        if(gelenVeri == "Tarhana Çorbası"){
            yag.visibility = View.VISIBLE
            tozbiber.visibility = View.VISIBLE
        }
        if(gelenVeri == "Mantar Çorbası"){
            krema.visibility = View.VISIBLE
        }
        if(gelenVeri == "İşkembe Çorbası"){
            sarimsak.visibility = View.VISIBLE
            sirke.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            tozbiber.visibility = View.VISIBLE
        }
        if(gelenVeri == "Tavuk Çorbası"){
            krema.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
        }
        siparisbutonu.setOnClickListener {
            var sipariss =corbaisim.text.toString()
            var tuzmiktari = seekBar.progress.toString()
            var acımiktari =seekBar2.progress.toString()
            var sarimsakmiktari=sarimsak.isChecked.toString()
            var nanemiktari=nane.isChecked.toString()
            var dilmiktari=dil.isChecked.toString()
            var terbiyemiktari=terbiye.isChecked.toString()
            var sirkemiktari=sirke.isChecked.toString()
            var kremamiktari=krema.isChecked.toString()
            var yagmiktari=yag.isChecked.toString()
            var kasarmiktari=kasar.isChecked.toString()
            var kitirmiktari=kitir.isChecked.toString()
            var limonmiktari=limon.isChecked.toString()
            var bibermiktari=tozbiber.isChecked.toString()
            var beyinmiktari=beyin.isChecked.toString()
            var extraistek=istek.text.toString()


            val uyar = AlertDialog.Builder(this)
            uyar.setTitle("Uyarı!")
            uyar.setMessage("Sparişiniz Hazırlanacak. Devam Etmek İstiyor musunuz?")
            uyar.setIcon(R.drawable.corbaci)

            uyar.setNeutralButton("TEKRAR KONTROL ETMEK İSTİYORUM") { DialogInterface, i ->

            }
            uyar.setPositiveButton("EVET") { DialogInterface, i ->
                Handler().postDelayed({
                    var gecis = Intent(applicationContext, siparis::class.java)
                    gecis.putExtra("siparis",sipariss )
                    gecis.putExtra("tuzmiktari",tuzmiktari )
                    gecis.putExtra("acımiktari",acımiktari )
                    gecis.putExtra("sarimsakmiktari",sarimsakmiktari )
                    gecis.putExtra("nanemiktari",nanemiktari )
                    gecis.putExtra("dilmiktari",dilmiktari )
                    gecis.putExtra("terbiyemiktari",terbiyemiktari )
                    gecis.putExtra("sirkemiktari",sirkemiktari )
                    gecis.putExtra("kremamiktari",kremamiktari )
                    gecis.putExtra("yagmiktari",yagmiktari )
                    gecis.putExtra("kasarmiktari",kasarmiktari )
                    gecis.putExtra("kitirmiktari",kitirmiktari )
                    gecis.putExtra("limonmiktari",limonmiktari )
                    gecis.putExtra("bibermiktari",bibermiktari )
                    gecis.putExtra("beyinmiktari",beyinmiktari )
                    gecis.putExtra("extraistek",extraistek )
                    startActivity(gecis)
                    finish()
                }, 2000)
            }
            uyar.create().show()

        }
    }
}