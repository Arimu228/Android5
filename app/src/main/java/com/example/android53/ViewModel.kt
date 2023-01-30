package com.example.android53

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.material.snackbar.BaseTransientBottomBar.LENGTH_LONG
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.snackbar.Snackbar.make

class ViewModel : ViewModel() {
    var variable = 0
    val _count: MutableLiveData<Int> = MutableLiveData()
    val _Snack: MutableLiveData<Snackbar> = MutableLiveData()


    fun increase(view: View) {

        variable++
        _count.value = variable
        if (variable > 10) {
            _Snack.value = make( view, "вы достигли предела", LENGTH_LONG)
        }
    }

    fun disincrease(view: View) {
        variable--
        _count.value = variable

        if (variable < 0) {
            _Snack.value = make( view, "вы достигли предела", LENGTH_LONG)
        }
    }


}