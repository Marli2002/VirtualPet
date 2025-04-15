package com.example.virtualpet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment

class FeedFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_feed, container, false)
        val feedButton = view.findViewById<Button>(R.id.feedButton)
        val petImage = view.findViewById<ImageView>(R.id.petImageView)
        petImage.setImageResource(R.drawable.feed)
        feedButton.setOnClickListener {
            PetStats.feed()
        }
        return view
    }
}