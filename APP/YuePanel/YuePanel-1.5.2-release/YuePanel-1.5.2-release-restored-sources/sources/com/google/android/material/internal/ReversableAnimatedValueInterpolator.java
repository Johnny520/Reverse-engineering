package com.google.android.material.internal;

import Yue.InterfaceC6391;
import Yue.InterfaceC7144;
import android.animation.TimeInterpolator;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class ReversableAnimatedValueInterpolator implements TimeInterpolator {
    private final TimeInterpolator sourceInterpolator;

    public ReversableAnimatedValueInterpolator(@InterfaceC6391 TimeInterpolator timeInterpolator) {
        this.sourceInterpolator = timeInterpolator;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: of */
    public static TimeInterpolator m5058of(boolean z, @InterfaceC6391 TimeInterpolator timeInterpolator) {
        return z ? timeInterpolator : new ReversableAnimatedValueInterpolator(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return 1.0f - this.sourceInterpolator.getInterpolation(f);
    }
}
