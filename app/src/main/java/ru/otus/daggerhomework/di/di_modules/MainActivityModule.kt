package ru.otus.daggerhomework.di.di_modules

import dagger.Module
import dagger.Provides
import kotlinx.coroutines.flow.MutableStateFlow
import ru.otus.daggerhomework.di.ActivityScope

@Module
class MainActivityModule {
    @ActivityScope
    @Provides
    fun provideColorStateFlow(): MutableStateFlow<Int> = MutableStateFlow(0)
}