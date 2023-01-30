package com.example.android53

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.android53.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: ViewModel
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        initialize()
        listeners()

        setContentView(binding.root)
    }

    private fun listeners() {
        binding.button.setOnClickListener {
            disincrease()


        }
        binding.button2.setOnClickListener {
            increase()

        }
        viewModel._count.observe(this) { count ->
            binding.textView.text = count.toString()

        }
        viewModel._Snack.observe(this){
            it.show()
        }
    }

    private fun initialize() {
        viewModel = ViewModelProvider(this)[ViewModel::class.java]
    }

    private fun disincrease() {
        viewModel.disincrease(binding.root)
    }

    private fun increase() {
        viewModel.increase(binding.root)
    }

}







