package com.android.systemui.dagger

import android.content.Context
import com.android.systemui.CarSystemUIAppComponentFactory
import com.android.systemui.SystemUIInitializer

class CarlSystemUIAppComponentFactory : CarSystemUIAppComponentFactory() {
    override fun createSystemUIInitializer(context: Context): SystemUIInitializer {
        return super.createSystemUIInitializer(context)
    }
}