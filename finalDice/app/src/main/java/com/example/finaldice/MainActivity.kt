package com.example.finaldice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button =findViewById(R.id.button)
        rollButton.setOnClickListener{
            diceRoll()
        }
    }
    class Dice(private val numSides: Int){
        fun roll(): Int{
            return (1..numSides).random()
        }
    }
    private fun diceRoll(){
        val dice=Dice(6)
        val rollDice=dice.roll()
        val diceImage: ImageView =findViewById((R.id.imageView))
        Toast.makeText(this, "You Rolled ${rollDice}", Toast.LENGTH_SHORT).show()
        if(rollDice==1) diceImage.setImageResource(R.drawable.dice_1)
        else if(rollDice==2) diceImage.setImageResource(R.drawable.dice_2)
        else if(rollDice==3) diceImage.setImageResource(R.drawable.dice_3)
        else if(rollDice==4) diceImage.setImageResource(R.drawable.dice_4)
        else if(rollDice==5) diceImage.setImageResource(R.drawable.dice_5)
        else diceImage.setImageResource(R.drawable.dice_6)
    }
}