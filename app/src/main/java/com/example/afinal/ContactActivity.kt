package com.example.afinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.afinal.databinding.ActivityContact2Binding

class ContactActivity : AppCompatActivity() {
    private lateinit var binding: ActivityContact2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContact2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}