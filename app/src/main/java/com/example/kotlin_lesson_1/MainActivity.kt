package com.example.kotlin_lesson_1

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    private var number2:Int=6
    private var number1:Int=6
    private var text:String="<В> магазине <осталось> 123 яблока а <может> и больше кто <знает> ? "
    private var tvText: TextView? =null
    private var tvText2: TextView? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvText=findViewById(R.id.tvText)
        tvText2=findViewById(R.id.tvText2)
       var subText:String=text.substringAfter('<')
        var subText2:String=subText.substringBefore('>')
        var subText3:String=text.substringAfter('>')
        var subText4:String=subText3.substringAfter('<')
        var subText5:String=subText4.substringBefore('>')

        for(n in 0..text.length){

        }

       tvText?.setText(subText2)
        tvText2?.setText(subText5)

    }


}