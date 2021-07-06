package com.example.myinfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.myinfo.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var aPerson : Person = Person("Ali", "12345", "ali@gmail.com", "123 Jalan ss123")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.personData = aPerson

        /*binding.Name.text = aPerson.name
        binding.IC.text = aPerson.ic
        binding.Email.text = aPerson.email
        binding.Address.text = aPerson.address*/

        binding.btnUpdate.setOnClickListener {

            aPerson.email = "xyz@gmail.com"

            binding.apply { invalidateAll() }


        }


    }
}