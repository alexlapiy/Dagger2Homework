package ru.otus.daggerhomework

import android.content.Context
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import ru.otus.daggerhomework.di.ActivityContext
import ru.otus.daggerhomework.di.ApplicationContext
import javax.inject.Inject

class ViewModelProducer @Inject constructor(
    private val colorGenerator: ColorGenerator,
    private val colorFlow: MutableStateFlow<Int>,
    @ActivityContext private val context: Context
) : ViewModel() {

    fun generateColor() {
        viewModelScope.launch {
            colorFlow.value = colorGenerator.generateColor()
        }

        if (context !is FragmentActivity) throw RuntimeException("Здесь нужен контекст активити")
        Toast.makeText(context, "Color sent", Toast.LENGTH_LONG).show()
    }
}