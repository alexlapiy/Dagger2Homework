package ru.otus.daggerhomework.di.di_modules

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import ru.otus.daggerhomework.ViewModelReceiver
import ru.otus.daggerhomework.di.ViewModelKey

@Module
interface FragmentReceiverModule {

    @Binds
    @IntoMap
    @ViewModelKey(ViewModelReceiver::class)
    fun bindsViewModelReceiver(viewModel: ViewModelReceiver): ViewModel
}