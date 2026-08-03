package com.google.android.material.drawable;

import Yue.C4535;
import Yue.InterfaceC6391;
import Yue.InterfaceC7144;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class ScaledDrawableWrapper extends C4535 {
    private final int height;
    private final int width;

    public ScaledDrawableWrapper(@InterfaceC6391 Drawable drawable, int i, int i2) {
        super(drawable);
        this.width = i;
        this.height = i2;
    }

    @Override // Yue.C4535, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.height;
    }

    @Override // Yue.C4535, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.width;
    }
}
