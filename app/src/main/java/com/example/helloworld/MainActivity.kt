package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("mainActivity","${div(8,2)}")
    }

    fun div(num1: Int, num2:Int){
        val div = num1/num2
        if (num2 != 0){
            Log.d("mainActivity",div.toString())
        } else{
            Log.d("mainActivity","invalid number")
        }
    }
}