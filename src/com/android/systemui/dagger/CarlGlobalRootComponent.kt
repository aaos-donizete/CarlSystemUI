package com.android.systemui.dagger

import com.android.systemui.CarGlobalRootComponent
import com.android.systemui.car.dagger.CarGlobalModule

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [GlobalModule::class, CarGlobalModule::class]
)
interface CarlGlobalRootComponent : CarGlobalRootComponent {

    @Component.Builder
    interface Builder : CarGlobalRootComponent.Builder {
        override fun build(): CarlGlobalRootComponent
    }
}