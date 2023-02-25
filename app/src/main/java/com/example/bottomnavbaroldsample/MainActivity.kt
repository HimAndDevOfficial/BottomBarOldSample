package com.example.bottomnavbaroldsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.bottomnavbaroldsample.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.bottomNav.setOnItemSelectedListener { item ->
            when(item.itemId) {

                R.id.menu_home -> {
                    binding.textNormal.text="Home"
                }

                R.id.menu_user -> {
                    binding.textNormal.text="User"
                }

                R.id.menu_notification -> {
                    binding.textNormal.text="Notification"
                }
            }
            true
        }
    }
}












/*
      supportFragmentManager.commit {
            add<HomeFragment>(R.id.fragmentContainerView,"homeFragment")

                setReorderingAllowed(true)
                    .addToBackStack("hello")
        }
 */