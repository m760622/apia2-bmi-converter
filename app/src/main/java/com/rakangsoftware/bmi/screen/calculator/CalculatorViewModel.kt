package com.rakangsoftware.bmi.screen.calculator

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.databinding.BindingAdapter
import android.widget.TextView


class CalculatorViewModel : ViewModel() {

    val bmi: MutableLiveData<String> = MutableLiveData()

    val weight: MutableLiveData<String> = MutableLiveData()
    val height: MutableLiveData<String> = MutableLiveData()

    init {
        weight.value = "70"
        height.value = "170"
    }

    fun calculate() {
        val weight: Float = this.weight.value?.toFloat() ?: 0f
        val height: Float = (this.height.value?.toFloat() ?: 0f) / 100f;

        bmi.value = (weight / (height * height)).toInt().toString()
    }


}

