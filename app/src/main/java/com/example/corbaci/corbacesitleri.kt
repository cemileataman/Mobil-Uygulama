package com.example.corbaci

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class corbacesitleri : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_corbacesitleri)

        var ezogelin = findViewById<RadioButton>(R.id.ezogelin)
        var dugun = findViewById<RadioButton>(R.id.dugun)
        var mercimek = findViewById<RadioButton>(R.id.mercimek)
        var brokoli = findViewById<RadioButton>(R.id.brokoli)
        var kellepaca = findViewById<RadioButton>(R.id.kellepaca)
        var yayla = findViewById<RadioButton>(R.id.yayla)
        var sehriye = findViewById<RadioButton>(R.id.sehriye)
        var domates = findViewById<RadioButton>(R.id.domates)
        var tarhana = findViewById<RadioButton>(R.id.tarhana)
        var mantar = findViewById<RadioButton>(R.id.mantar)
        var iskembe = findViewById<RadioButton>(R.id.iskembe)
        var tavuk = findViewById<RadioButton>(R.id.tavuk)
        var corba = findViewById<CheckBox>(R.id.corba)
        var liste = findViewById<RadioGroup>(R.id.radioGroup)
        var devam = findViewById<Button>(R.id.button)

        liste.visibility = View.INVISIBLE
        devam.visibility = View.INVISIBLE

        corba.setOnCheckedChangeListener { compoundButton, b ->
            if (b == true) {
                liste.visibility = View.VISIBLE
                devam.visibility = View.VISIBLE

            } else {
                liste.visibility = View.INVISIBLE
                devam.visibility = View.INVISIBLE

            }
        }
        var tasarim = layoutInflater.inflate(R.layout.toast, null)
        var toastyazi = tasarim.findViewById<TextView>(R.id.toasttext)
        var c = 0;
        devam.setOnClickListener {
            if (c == 0) {
                val uyari = AlertDialog.Builder(this)
                uyari.setTitle("Uyarı!")
                uyari.setMessage("Lütfen seçim yapınız")
                uyari.setIcon(R.drawable.corbaci)

                uyari.setNeutralButton("TEKRAR DENE") { DialogInterface, i ->

                }.show()

            }
        }

        ezogelin.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                devam.setOnClickListener {
                    var icerik = "Ezogelin Çorbası"
                    toastyazi.text = "Ezogelin Çorbası Güzel Seçim  Lütfen Bekleyiniz"
                    var toastozel = Toast(applicationContext)
                    toastozel.view = tasarim
                    toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                    toastozel.duration = Toast.LENGTH_SHORT
                    toastozel.show()
                    Handler().postDelayed({
                        var gecis = Intent(applicationContext, corbaicerigi::class.java)
                        gecis.putExtra("git", icerik)
                        startActivity(gecis)
                        finish()
                    }, 3000)
                }
                c = 1
            }
        }
        dugun.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                devam.setOnClickListener {
                    var icerik = "Düğün Çorbası"
                    toastyazi.text = "Düğün Çorbası Güzel Seçim  Lütfen Bekleyiniz"
                    var toastozel = Toast(applicationContext)
                    toastozel.view = tasarim
                    toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                    toastozel.duration = Toast.LENGTH_SHORT
                    toastozel.show()
                    Handler().postDelayed({
                        var gecis = Intent(applicationContext, corbaicerigi::class.java)
                        gecis.putExtra("git", icerik)
                        startActivity(gecis)
                        finish()
                    }, 3000)
                }
                c = 1
            }
        }
        mercimek.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                devam.setOnClickListener {
                    var icerik = "Mercimek Çorbası"
                    toastyazi.text = "Mercimek Çorbası Güzel Seçim  Lütfen Bekleyiniz"
                    var toastozel = Toast(applicationContext)
                    toastozel.view = tasarim
                    toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                    toastozel.duration = Toast.LENGTH_SHORT
                    toastozel.show()
                    Handler().postDelayed({
                        var gecis = Intent(applicationContext, corbaicerigi::class.java)
                        gecis.putExtra("git", icerik)
                        startActivity(gecis)
                        finish()
                    }, 3000)
                }
                c = 1
            }
        }
        brokoli.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                devam.setOnClickListener {
                    var icerik = "Brokoli Çorbası"
                    toastyazi.text = "Brokoli Çorbası Güzel Seçim  Lütfen Bekleyiniz"
                    var toastozel = Toast(applicationContext)
                    toastozel.view = tasarim
                    toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                    toastozel.duration = Toast.LENGTH_SHORT
                    toastozel.show()
                    Handler().postDelayed({
                        var gecis = Intent(applicationContext, corbaicerigi::class.java)
                        gecis.putExtra("git", icerik)
                        startActivity(gecis)
                        finish()
                    }, 3000)
                }
                c = 1
            }
        }
        kellepaca.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                devam.setOnClickListener {
                    var icerik = "Kelle-Paça Çorbası"
                    toastyazi.text = "Kelle-Paça Çorbası Güzel Seçim  Lütfen Bekleyiniz"
                    var toastozel = Toast(applicationContext)
                    toastozel.view = tasarim
                    toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                    toastozel.duration = Toast.LENGTH_SHORT
                    toastozel.show()
                    Handler().postDelayed({
                        var gecis = Intent(applicationContext, corbaicerigi::class.java)
                        gecis.putExtra("git", icerik)
                        startActivity(gecis)
                        finish()
                    }, 3000)
                }
                c = 1
            }
        }
        yayla.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                devam.setOnClickListener {
                    var icerik = "Yayla Çorbası"
                    toastyazi.text = "Yayla Çorbası Güzel Seçim  Lütfen Bekleyiniz"
                    var toastozel = Toast(applicationContext)
                    toastozel.view = tasarim
                    toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                    toastozel.duration = Toast.LENGTH_SHORT
                    toastozel.show()
                    Handler().postDelayed({
                        var gecis = Intent(applicationContext, corbaicerigi::class.java)
                        gecis.putExtra("git", icerik)
                        startActivity(gecis)
                        finish()
                    }, 3000)
                }
                c = 1
            }
        }
        sehriye.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                devam.setOnClickListener {
                    var icerik = "Şehriye Çorbası"
                    toastyazi.text = "Şehriye Çorbası Güzel Seçim  Lütfen Bekleyiniz"
                    var toastozel = Toast(applicationContext)
                    toastozel.view = tasarim
                    toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                    toastozel.duration = Toast.LENGTH_SHORT
                    toastozel.show()
                    Handler().postDelayed({
                        var gecis = Intent(applicationContext, corbaicerigi::class.java)
                        gecis.putExtra("git", icerik)
                        startActivity(gecis)
                        finish()
                    }, 3000)
                }
                c = 1
            }
        }
        domates.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                devam.setOnClickListener {
                    var icerik = "Domates Çorbası"
                    toastyazi.text = "Domates Çorbası Güzel Seçim  Lütfen Bekleyiniz"
                    var toastozel = Toast(applicationContext)
                    toastozel.view = tasarim
                    toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                    toastozel.duration = Toast.LENGTH_SHORT
                    toastozel.show()
                    Handler().postDelayed({
                        var gecis = Intent(applicationContext, corbaicerigi::class.java)
                        gecis.putExtra("git", icerik)
                        startActivity(gecis)
                        finish()
                    }, 3000)
                }
                c = 1
            }
        }
        tarhana.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                devam.setOnClickListener {
                    var icerik = "Tarhana Çorbası"
                    toastyazi.text = "Tarhana Çorbası Güzel Seçim  Lütfen Bekleyiniz"
                    var toastozel = Toast(applicationContext)
                    toastozel.view = tasarim
                    toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                    toastozel.duration = Toast.LENGTH_SHORT
                    toastozel.show()
                    Handler().postDelayed({
                        var gecis = Intent(applicationContext, corbaicerigi::class.java)
                        gecis.putExtra("git",icerik)
                        startActivity(gecis)
                        finish()
                    }, 3000)
                }
                c = 1
            }
        }
        mantar.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                devam.setOnClickListener {
                    var icerik = "Mantar Çorbası"
                    toastyazi.text = "Mantar Çorbası Güzel Seçim  Lütfen Bekleyiniz"
                    var toastozel = Toast(applicationContext)
                    toastozel.view = tasarim
                    toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                    toastozel.duration = Toast.LENGTH_SHORT
                    toastozel.show()
                    Handler().postDelayed({
                        var gecis = Intent(applicationContext, corbaicerigi::class.java)
                        gecis.putExtra("git", icerik)
                        startActivity(gecis)
                        finish()
                    }, 3000)
                }
                c = 1
            }
        }
        iskembe.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                devam.setOnClickListener {
                    var icerik = "İşkembe Çorbası"
                    toastyazi.text = "İşkembe Çorbası Güzel Seçim  Lütfen Bekleyiniz"
                    var toastozel = Toast(applicationContext)
                    toastozel.view = tasarim
                    toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                    toastozel.duration = Toast.LENGTH_SHORT
                    toastozel.show()
                    Handler().postDelayed({
                        var gecis = Intent(applicationContext, corbaicerigi::class.java)
                        gecis.putExtra("git", icerik)
                        startActivity(gecis)
                        finish()
                    }, 3000)
                }
                c = 1
            }
        }
        tavuk.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                devam.setOnClickListener {
                    var icerik = "Tavuk Çorbası"
                    toastyazi.text = "Tavuk Çorbası Güzel Seçim  Lütfen Bekleyiniz"
                    var toastozel = Toast(applicationContext)
                    toastozel.view = tasarim
                    toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                    toastozel.duration = Toast.LENGTH_SHORT
                    toastozel.show()
                    Handler().postDelayed({
                        var gecis = Intent(applicationContext, corbaicerigi::class.java)
                        gecis.putExtra("git", icerik)
                        startActivity(gecis)
                        finish()
                    }, 3000)
                }
                c = 1
            }
        }






    }

}

        
        
        




