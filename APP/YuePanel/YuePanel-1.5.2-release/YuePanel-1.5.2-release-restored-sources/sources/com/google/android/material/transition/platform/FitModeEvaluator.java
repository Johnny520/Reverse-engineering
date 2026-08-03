package com.google.android.material.transition.platform;

import Yue.InterfaceC7113;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(21)
interface FitModeEvaluator {
    void applyMask(RectF rectF, float f, FitModeResult fitModeResult);

    FitModeResult evaluate(float f, float f2, float f3, float f4, float f5, float f6, float f7);

    boolean shouldMaskStartBounds(FitModeResult fitModeResult);
}
