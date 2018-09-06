package com.rakangsoftware.bmi.screen.calculator

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.rakangsoftware.bmi.R
import kotlinx.android.synthetic.main.calculator_activity.*

class CalculatorActivity : AppCompatActivity() {

    var viewModel: CalculatorViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculator_activity)

        viewModel = ViewModelProviders.of(this).get(CalculatorViewModel::class.java)

        viewModel?.bmi?.observe(this, object : Observer<Float> {
            override fun onChanged(bmiValue: Float?) {
                bmi_result.text = bmiValue?.toInt().toString()
            }
        })
    }

    fun onCalculate(view: View?) {
        val height = (calculate_height_input.text.toString().toFloatOrNull() ?: 170f) * 0.01f
        val weight = calculate_weight_input.text.toString().toFloatOrNull() ?: 80f

        viewModel?.calculate(height, weight)
    }

    companion object {
        fun start(context: Context, id: Int) {
            val intent = Intent(context, CalculatorActivity::class.java)
            intent.putExtra("id", id)
            context.startActivity(intent)
        }
    }
}
