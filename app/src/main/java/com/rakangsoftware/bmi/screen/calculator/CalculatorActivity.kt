package com.rakangsoftware.bmi.screen.calculator

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.rakangsoftware.bmi.R
import com.rakangsoftware.bmi.databinding.CalculatorActivityBinding
import kotlinx.android.synthetic.main.calculator_activity.*

class CalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel = ViewModelProviders.of(this).get(CalculatorViewModel::class.java)

        val binding: CalculatorActivityBinding = DataBindingUtil.setContentView(this, R.layout.calculator_activity)
        binding.setLifecycleOwner(this)
        binding.viewModel = viewModel;
    }

    companion object {
        fun start(context: Context, id: Int) {
            val intent = Intent(context, CalculatorActivity::class.java)
            intent.putExtra("id", id)
            context.startActivity(intent)
        }
    }
}
