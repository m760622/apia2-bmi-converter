package com.rakangsoftware.bmi.screen.splash

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.rakangsoftware.bmi.screen.calculator.CalculatorActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        CalculatorActivity.start(this, 3)
        finish()
    }
}
