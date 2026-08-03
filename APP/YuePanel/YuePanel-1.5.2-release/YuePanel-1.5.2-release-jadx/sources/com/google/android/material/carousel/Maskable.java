package com.google.android.material.carousel;

import Yue.InterfaceC4885;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.graphics.RectF;
import com.google.android.material.color.utilities.Contrast;

/* JADX INFO: loaded from: classes.dex */
interface Maskable {
    @InterfaceC6391
    RectF getMaskRectF();

    @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN)
    @Deprecated
    float getMaskXPercentage();

    void setMaskRectF(@InterfaceC6391 RectF rectF);

    @Deprecated
    void setMaskXPercentage(@InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN) float f);

    void setOnMaskChangedListener(@InterfaceC6490 OnMaskChangedListener onMaskChangedListener);
}
