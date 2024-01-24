package com.example.appdev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.appdev.databinding.ActivityMainBinding
import java.util.Random


class MainActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonRoll.setOnClickListener{
            Toast.makeText(this,"Button clicked",Toast.LENGTH_SHORT).show()
            rollDice()
        }



    }
    private fun rollDice() {

           val randomInt=  Random().nextInt(6) + 1
           var text: Int =randomInt
           val diceImage:ImageView=findViewById(R.id.dice_Image)
           val drawableResource=when(randomInt){
               1->R.drawable.dice_1
               2->R.drawable.dice_2
               3 -> R.drawable.dice_3
               4 -> R.drawable.dice_4
               5 -> R.drawable.dice_5
               else->R.drawable.dice_6

           }
          diceImage.setImageResource(drawableResource)


    }
}