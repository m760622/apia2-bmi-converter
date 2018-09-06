package com.rakangsoftware.bmi.screen.calculator

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class CalculatorViewModel : ViewModel() {

    val bmi: MutableLiveData<Float> = MutableLiveData()

    fun calculate(height: Float, weight: Float) {
        bmi.value = (weight / (height * height));
    }

}