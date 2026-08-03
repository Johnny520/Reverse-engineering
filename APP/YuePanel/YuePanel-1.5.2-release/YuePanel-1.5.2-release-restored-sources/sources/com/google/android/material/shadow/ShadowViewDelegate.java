package com.google.android.material.shadow;

import Yue.InterfaceC6490;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public interface ShadowViewDelegate {
    float getRadius();

    boolean isCompatPaddingEnabled();

    void setBackgroundDrawable(@InterfaceC6490 Drawable drawable);

    void setShadowPadding(int i, int i2, int i3, int i4);
}
