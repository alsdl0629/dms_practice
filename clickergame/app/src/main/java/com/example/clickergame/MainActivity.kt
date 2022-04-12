package com.example.clickergame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var plus: Button
    lateinit var minus: Button
    lateinit var reset: Button
    lateinit var result: TextView

    val a: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus = findViewById(R.id.btPlus)
        minus = findViewById(R.id.btMinus)
        reset = findViewById(R.id.btReset)
        result = findViewById(R.id.tvResult)

        result.text = a.toString()

        plus.setOnClickListener {
            var b: Int

            b = result.text.toString().toInt()

            b += 1

            result.text = b.toString()
        }
        minus.setOnClickListener {
            var b: Int

            b = result.text.toString().toInt()

            b -= 1

            result.text = b.toString()
        }
        reset.setOnClickListener {
            var b: Int

            b = result.text.toString().toInt()

            b = 0

            result.text = b.toString()
        }
    }
}