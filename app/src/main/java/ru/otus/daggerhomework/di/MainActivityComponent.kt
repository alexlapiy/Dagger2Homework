package ru.otus.daggerhomework.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import kotlinx.coroutines.flow.MutableStateFlow
import ru.otus.daggerhomework.di.di_modules.MainActivityModule

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [MainActivityModule::class])
interface MainActivityComponent {

    @ActivityContext
    fun provideActivityContext(): Context

    @ApplicationContext
    fun provideApplicationContext(): Context

    fun provideColorStateFlow(): MutableStateFlow<Int>

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance @ActivityContext activity: Context,
            applicationComponent: ApplicationComponent
        ): MainActivityComponent
    }
}