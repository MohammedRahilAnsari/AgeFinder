package com.practice.agefinder

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContextCompat
import java.util.*
import com.practice.agefinder.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        buttonGetClicked()
    }

    @SuppressLint("SetTextI18n")
    private fun buttonGetClicked() {
        binding.btncal.setOnClickListener {

            val useryear = Integer.parseInt(binding.etyear.text.toString())
            val currentyear = Calendar.getInstance().get(Calendar.YEAR)
            val userAge = currentyear - useryear
            val year = binding.etyear.text.toString().trim()
            /*
            if (year.isEmpty()) {
                Toast.makeText(this, "Field is Empty ", Toast.LENGTH_LONG).show()
            }*/
            if (year.isNotEmpty()) {
                binding.tvCalDob.text = "Your Age is $userAge Years"
            }
        }
    }

}