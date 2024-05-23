package com.adso.examen

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.adso.examen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.BtnKm.setOnClickListener { KmConversion() }
        binding.BtnCm.setOnClickListener { CmConversion() }
        binding.BtnMm.setOnClickListener { MmConversion() }
        binding.BtnDk.setOnClickListener { DamConversion() }
    }

    private fun KmConversion() {
        val metros = binding.Metros.text.toString().toDoubleOrNull() ?: return
        val km = metros / 1000
        Toast.makeText(this, "$metros metros son $km km", Toast.LENGTH_SHORT).show()
    }

    private fun CmConversion() {
        val metros = binding.Metros.text.toString().toDoubleOrNull() ?: return
        val cm = metros * 100
        Toast.makeText(this, "$metros metros son $cm cm", Toast.LENGTH_SHORT).show()
    }

    private fun MmConversion() {
        val metros = binding.Metros.text.toString().toDoubleOrNull() ?: return
        val mm = metros * 1000
        Toast.makeText(this, "$metros metros son $mm mm", Toast.LENGTH_SHORT).show()
    }

    private fun DamConversion() {
        val metros = binding.Metros.text.toString().toDoubleOrNull() ?: return
        val dam = metros * 0.1
        Toast.makeText(this, "$metros metros son $dam decametros", Toast.LENGTH_SHORT).show()

    }

}
