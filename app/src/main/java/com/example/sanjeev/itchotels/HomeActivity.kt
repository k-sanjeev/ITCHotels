package com.example.sanjeev.itchotels

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.sanjeev.itchotels.R.id.buttonBrowse

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        //Test

        val btnBrowse: Button =findViewById<Button>(R.id.buttonBrowse)
        btnBrowse.setOnClickListener {

            var intent:Intent= Intent(applicationContext, RecyclerViewActivity::class.java)
            startActivity(intent)
        }
    }
}
