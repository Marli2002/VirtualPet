package com.example.virtualpet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment

class SleepFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sleep, container, false)
        val sleepButton = view.findViewById<Button>(R.id.sleepButton)
        val petImage = view.findViewById<ImageView>(R.id.petImageView)
        petImage.setImageResource(R.drawable.sleep)
        sleepButton.setOnClickListener {
            PetStats.sleep()
        }
        return view
    }
}