package com.example.mydice

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

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
        val rollFirstDice=dice.roll()
        val rollSecondDice=dice.roll()
        val rollThirdDice=dice.roll()
        val diceImage1: ImageView =findViewById((R.id.imageView))
        val diceImage2: ImageView =findViewById((R.id.imageView2))
        val diceImage3: ImageView =findViewById((R.id.imageView3))
        Toast.makeText(this, "Dices Rolled!", Toast.LENGTH_SHORT).show()
        when(rollFirstDice) {
            1 -> diceImage1.setImageResource(R.drawable.dice_1)
            2 -> diceImage1.setImageResource(R.drawable.dice_2)
            3 -> diceImage1.setImageResource(R.drawable.dice_3)
            4 -> diceImage1.setImageResource(R.drawable.dice_4)
            5 -> diceImage1.setImageResource(R.drawable.dice_5)
            else -> diceImage1.setImageResource(R.drawable.dice_6)
        }

        when(rollSecondDice) {
            1 -> diceImage2.setImageResource(R.drawable.dice_1)
            2 -> diceImage2.setImageResource(R.drawable.dice_2)
            3 -> diceImage2.setImageResource(R.drawable.dice_3)
            4 -> diceImage2.setImageResource(R.drawable.dice_4)
            5 -> diceImage2.setImageResource(R.drawable.dice_5)
            else -> diceImage2.setImageResource(R.drawable.dice_6)
        }
        when(rollThirdDice) {
            1 -> diceImage3.setImageResource(R.drawable.dice_1)
            2 -> diceImage3.setImageResource(R.drawable.dice_2)
            3 -> diceImage3.setImageResource(R.drawable.dice_3)
            4 -> diceImage3.setImageResource(R.drawable.dice_4)
            5 -> diceImage3.setImageResource(R.drawable.dice_5)
            else -> diceImage3.setImageResource(R.drawable.dice_6)
        }
    }
}
