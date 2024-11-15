package com.example.homework4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainOptionMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_option_menu)

        val pizzaPartyButton = findViewById<Button>(R.id.pizza_party_button)
        pizzaPartyButton.setOnClickListener { view: View ->
            val intent = Intent(this, PizzaParty::class.java)
            startActivity(intent)
        }

        val lightsOutButton = findViewById<Button>(R.id.lights_out_button)
        lightsOutButton.setOnClickListener { view: View ->
            val intent = Intent(this, LightsOut::class.java)
            startActivity(intent)
        }
    }
} 