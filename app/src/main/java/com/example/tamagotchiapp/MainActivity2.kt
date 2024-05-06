package com.example.tamagotchiapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView


class MainActivity2 : AppCompatActivity() {


private lateinit var imageViewPetAction: ImageView
private lateinit var buttonFeed: Button
private lateinit var buttonClean: Button
private lateinit var buttonPlay: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize the UI elements
        imageViewPetAction = findViewById(R.id.imageViewPetAction)
        buttonFeed = findViewById(R.id.buttonFeed)
        buttonClean = findViewById(R.id.buttonClean)
        buttonPlay = findViewById(R.id.buttonPlay)

        // Set up the button click listeners
        buttonFeed.setOnClickListener {
            // Logic to handle feeding the pet
            feedPet()
        }

        buttonClean.setOnClickListener {
            // Logic to handle cleaning the pet
            cleanPet()
        }

        buttonPlay.setOnClickListener {
            // Logic to handle playing with the pet
            playWithPet()
        }
    }

    private fun feedPet() {
        // Update pet image to reflect feeding
        imageViewPetAction.setImageResource(R.drawable.feedind_dog)

    }

    private fun cleanPet() {
        // Update pet image to reflect cleaning
        imageViewPetAction.setImageResource(R.drawable.cleanning_dog)

    }

    private fun playWithPet() {
        // Update pet image to reflect playing
        imageViewPetAction.setImageResource(R.drawable.paying_dog)

    }
    }



