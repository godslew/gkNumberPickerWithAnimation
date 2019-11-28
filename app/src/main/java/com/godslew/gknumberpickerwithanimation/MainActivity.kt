package com.godslew.gknumberpickerwithanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.godslew.gknumberpickerwithanimation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupView()

    }

    private fun setupView() {
        with(binding) {
            pick.displayedValues = listOf(1,2,3,4,5,6,7,8,9,10,11).map { it.toString() }.toTypedArray()
            buttonUp.setOnClickListener {
                pick.animateChange(true)
            }

            buttonDown.setOnClickListener {
                pick.animateChange(false)
            }
        }
    }
}
