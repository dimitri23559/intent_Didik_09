 package com.example.intent_didik_09

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intentButton: Button = findViewById(R.id.buttonintent)
        intentButton.setOnClickListener(ViewDetail())
    }

     private fun ViewDetail(): View.OnClickListener? {
         val intent = Intent (this, DetailActivity::class.java)
         startActivity(intent)
     }
}