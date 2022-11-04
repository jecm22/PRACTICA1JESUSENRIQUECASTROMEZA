package com.amaurypm.esprimo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.amaurypm.esprimo.databinding.ActivityResultBinding

class Result : AppCompatActivity() {

    private lateinit var binding : ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras
        val res = bundle?.getDouble("resultado")

        if (res != null) {
            binding.val1.text = res.toString()
        }
    }
}