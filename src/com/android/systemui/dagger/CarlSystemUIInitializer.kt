package com.android.systemui.dagger

import android.content.Context
import com.android.systemui.CarSystemUIInitializer

class CarlSystemUIInitializer(context: Context) : CarSystemUIInitializer(context) {
    override fun getGlobalRootComponentBuilder() = DaggerCarlGlobalRootComponent.builder()!!
}