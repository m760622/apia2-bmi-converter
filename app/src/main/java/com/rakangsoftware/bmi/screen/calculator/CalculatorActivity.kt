package com.rakangsoftware.bmi.screen.calculator

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.rakangsoftware.bmi.R
import kotlinx.android.synthetic.main.calculator_activity.*

class CalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculator_activity)
    }

    fun onCalculate(view: View?) {
        println("Clicked!!! $view")
    }

    companion object {
        fun start(context: Context, id: Int) {
            val intent = Intent(context, CalculatorActivity::class.java)
            intent.putExtra("id", id)
            context.startActivity(intent)
        }
    }
}
