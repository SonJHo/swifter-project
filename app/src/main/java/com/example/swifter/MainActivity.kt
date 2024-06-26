package com.example.swifter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swifter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnSetGesture.setOnClickListener{
            val intent = Intent(this, SettingJesture::class.java) //intent:다음페이지로 넘어가겟다 의도
            startActivity(intent)
        }
    }
}