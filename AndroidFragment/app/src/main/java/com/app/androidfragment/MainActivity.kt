package com.app.androidfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.app.androidfragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var fragment = FirstFragment()

        var manager:FragmentManager = supportFragmentManager
        var transaction:FragmentTransaction = manager.beginTransaction()
        transaction.add(R.id.fragment_container, fragment)
        transaction.commit()

    }
}