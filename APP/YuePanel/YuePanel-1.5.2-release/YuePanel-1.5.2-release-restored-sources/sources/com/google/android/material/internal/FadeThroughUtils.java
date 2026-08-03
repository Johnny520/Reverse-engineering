package com.google.android.material.internal;

import Yue.InterfaceC4885;
import com.google.android.material.color.utilities.Contrast;

/* JADX INFO: loaded from: classes.dex */
final class FadeThroughUtils {
    static final float THRESHOLD_ALPHA = 0.5f;

    private FadeThroughUtils() {
    }

    public static void calculateFadeOutAndInAlphas(@InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN) float f, float[] fArr) {
        if (f <= 0.5f) {
            fArr[0] = 1.0f - (f * 2.0f);
            fArr[1] = 0.0f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = (f * 2.0f) - 1.0f;
        }
    }
}
