package com.example.android53

import android.text.BoringLayout.make
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.material.snackbar.Snackbar

class ViewModel : ViewModel() {
    var variable = 0
    val _count: MutableLiveData<Int> = MutableLiveData()






    fun increase() {
        variable++
        _count.value = variable
    }

    fun disincrease() {
        variable--
        _count.value = variable
    }


}