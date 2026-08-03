package com.google.android.material.drawable;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
public class ScaledDrawableWrapper extends Yue.C2016 {
    private final int height;
    private final int width;

    public ScaledDrawableWrapper(@Yue.InterfaceC4410 android.graphics.drawable.Drawable r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1)
            r0.width = r2
            r0.height = r3
            return
    }

    @Override // Yue.C2016, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            int r0 = r1.height
            return r0
    }

    @Override // Yue.C2016, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            int r0 = r1.width
            return r0
    }
}
