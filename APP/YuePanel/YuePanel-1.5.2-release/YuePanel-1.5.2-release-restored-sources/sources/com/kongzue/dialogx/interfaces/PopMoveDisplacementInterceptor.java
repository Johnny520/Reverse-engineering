package com.kongzue.dialogx.interfaces;

import android.animation.ValueAnimator;
import android.view.View;
import com.kongzue.dialogx.interfaces.BaseDialog;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PopMoveDisplacementInterceptor<D extends BaseDialog> {
    public boolean animUpdater(int i, D d, View view, float f, float f2, float f3, ValueAnimator valueAnimator, int i2, boolean z) {
        return false;
    }

    public float resetAnimY(int i, D d, float f, float f2, int i2, int i3, boolean z) {
        return f2;
    }
}
