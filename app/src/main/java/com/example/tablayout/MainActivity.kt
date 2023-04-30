package com.example.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tablayout.databinding.ActivityMainBinding

lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
binding = ActivityMainBinding.inflate(layoutInflater)
        binding.Tabs.addTab(binding.Tabs.newTab().setText("Chats"))
        binding.Tabs.addTab(binding.Tabs.newTab().setText("Calls"))
        binding.Tabs.addTab(binding.Tabs.newTab().setText("Status"))

    }
}