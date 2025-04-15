package com.example.virtualpet

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.fragment.app.Fragment

class NormalFragment : Fragment() {
    private lateinit var healthBar: ProgressBar
    private lateinit var happinessBar: ProgressBar
    private lateinit var energyBar: ProgressBar
    private val handler = Handler(Looper.getMainLooper())

    private val decayRunnable = object : Runnable {
        override fun run() {
            PetStats.decay()
            updateStats()
            handler.postDelayed(this, 3000) // decay every 3 seconds
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_normal, container, false)
        val petImage = view.findViewById<ImageView>(R.id.petImageView)
        healthBar = view.findViewById(R.id.healthBar)
        happinessBar = view.findViewById(R.id.happinessBar)
        energyBar = view.findViewById(R.id.energyBar)
        petImage.setImageResource(R.drawable.normal)
        updateStats()
        return view
    }

    private fun updateStats() {
        healthBar.progress = PetStats.health
        happinessBar.progress = PetStats.happiness
        energyBar.progress = PetStats.energy
    }

    override fun onResume() {
        super.onResume()
        handler.post(decayRunnable)
    }

    override fun onPause() {
        super.onPause()
        handler.removeCallbacks(decayRunnable)
    }
}
