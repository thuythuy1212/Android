package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    lateinit var diceImage_1: ImageView
    lateinit var diceImage_2: ImageView
    lateinit var diceImage_3: ImageView
    lateinit var resultPoint: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton:Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}
        diceImage_1 = findViewById(R.id.dice_image_1)
        diceImage_2 = findViewById(R.id.dice_image_2)
        diceImage_3 = findViewById(R.id.dice_image_3)
        resultPoint = findViewById(R.id.result_point)
    }


    private fun rollDice(){

        val randomNum_1 = listOf(6,7,9,11).random()
        val randomNum_2 = listOf(6,7,9,11).random()
        val randomNum_3 = listOf(6,7,9,11).random()

        fun dice_1(){
            val drawableDice = when(randomNum_1){
                6 -> R.drawable.dice_1
                6 -> R.drawable.dice_2
                6 -> R.drawable.dice_3
                7 -> R.drawable.dice_4
                9 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            diceImage_1.setImageResource(drawableDice)
        }

        fun dice_2(){
            val drawableDice = when(randomNum_2){
                6 -> R.drawable.dice_1
                6 -> R.drawable.dice_2
                6 -> R.drawable.dice_3
                7 -> R.drawable.dice_4
                9 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            diceImage_2.setImageResource(drawableDice)
        }

        fun dice_3(){
            val drawableDice = when(randomNum_3){
                6 -> R.drawable.dice_1
                6 -> R.drawable.dice_2
                6 -> R.drawable.dice_3
                7 -> R.drawable.dice_4
                9 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            diceImage_3.setImageResource(drawableDice)
        }
        dice_1()
        dice_2()
        dice_3()
        var point: Int = randomNum_1+randomNum_2+randomNum_3
        resultPoint.text = "Your last point: $point"
                Toast.makeText(this, "Dice point: "+point, Toast.LENGTH_SHORT).show()

    }
}