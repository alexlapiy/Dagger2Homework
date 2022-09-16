package ru.otus.daggerhomework.di.di_modules

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import ru.otus.daggerhomework.*
import ru.otus.daggerhomework.di.FragmentScope
import ru.otus.daggerhomework.di.ViewModelKey

@Module
interface FragmentProducerModule {

    @Binds
    @IntoMap
    @ViewModelKey(ViewModelProducer::class)
    fun bindsViewModelProducer(viewModel: ViewModelProducer): ViewModel

    @Binds
    @FragmentScope
    fun bindsColorGenerator(implementation: ColorGeneratorImpl): ColorGenerator
}