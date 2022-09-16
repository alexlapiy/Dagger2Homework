package ru.otus.daggerhomework.di

import dagger.Component
import ru.otus.daggerhomework.FragmentReceiver
import ru.otus.daggerhomework.di.di_modules.FragmentReceiverModule

@FragmentScope
@Component(dependencies = [MainActivityComponent::class], modules = [FragmentReceiverModule::class])
interface FragmentReceiverComponent {

    fun inject(fragment: FragmentReceiver)
}