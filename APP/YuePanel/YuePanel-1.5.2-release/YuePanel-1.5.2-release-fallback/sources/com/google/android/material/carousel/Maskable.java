package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes.dex */
interface Maskable {
    @Yue.InterfaceC4410
    android.graphics.RectF getMaskRectF();

    @Yue.InterfaceC2458(from = 0.0d, to = 1.0d)
    @java.lang.Deprecated
    float getMaskXPercentage();

    void setMaskRectF(@Yue.InterfaceC4410 android.graphics.RectF r1);

    @java.lang.Deprecated
    void setMaskXPercentage(@Yue.InterfaceC2458(from = 0.0d, to = 1.0d) float r1);

    void setOnMaskChangedListener(@Yue.InterfaceC4544 com.google.android.material.carousel.OnMaskChangedListener r1);
}
