package com.google.android.material.progressindicator;

import Yue.InterfaceC6391;
import Yue.InterfaceC7144;
import Yue.InterfaceC8392;
import android.content.ContentResolver;
import android.provider.Settings;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class AnimatorDurationScaleProvider {
    private static float defaultSystemAnimatorDurationScale = 1.0f;

    @InterfaceC8392
    public static void setDefaultSystemAnimatorDurationScale(float f) {
        defaultSystemAnimatorDurationScale = f;
    }

    public float getSystemAnimatorDurationScale(@InterfaceC6391 ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}
