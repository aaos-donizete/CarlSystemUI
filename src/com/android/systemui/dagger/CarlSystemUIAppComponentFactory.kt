package com.android.systemui.dagger

import android.content.Context
import com.android.systemui.CarSystemUIAppComponentFactory

class CarlSystemUIAppComponentFactory : CarSystemUIAppComponentFactory() {
    override fun createSystemUIInitializer(
        context: Context
    ) = CarlSystemUIInitializer(context)
}