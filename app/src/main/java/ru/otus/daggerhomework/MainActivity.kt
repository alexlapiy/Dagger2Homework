package ru.otus.daggerhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.otus.daggerhomework.di.DaggerMainActivityComponent
import ru.otus.daggerhomework.di.MainActivityComponent

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    lateinit var component: MainActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        component = DaggerMainActivityComponent
            .factory()
            .create(this, (application as App).applicationComponent)
        super.onCreate(savedInstanceState)
    }
}