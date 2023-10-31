package com.example.lab10_ppm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab10_ppm.databinding.ActivityMainBinding
import com.google.android.gms.location.FusedLocationProviderClient

class MainActivity : AppCompatActivity() {

    lateinit var mFusedLocationProviderClient: FusedLocationProviderClient
    lateinit var binding: ActivityMainBinding

    val PERMISSION_ID = 42
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater )
        setContentView(binding.root )
    }
}