package com.google.android.material.progressindicator;

import Yue.InterfaceC3897;
import Yue.InterfaceC4885;
import Yue.InterfaceC5459;
import Yue.InterfaceC6391;
import Yue.InterfaceC6844;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.material.color.utilities.Contrast;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* JADX INFO: loaded from: classes.dex */
abstract class DrawingDelegate<S extends BaseProgressIndicatorSpec> {
    S spec;

    public static class ActiveIndicator {

        @InterfaceC3897
        int color;

        @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN)
        float endFraction;

        @InterfaceC6844
        int gapSize;

        @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN)
        float startFraction;
    }

    public DrawingDelegate(S s) {
        this.spec = s;
    }

    public abstract void adjustCanvas(@InterfaceC6391 Canvas canvas, @InterfaceC6391 Rect rect, @InterfaceC4885(from = -1.0d, m1796to = Contrast.RATIO_MIN) float f, boolean z, boolean z2);

    public abstract void drawStopIndicator(@InterfaceC6391 Canvas canvas, @InterfaceC6391 Paint paint, @InterfaceC3897 int i, @InterfaceC5459(from = 0, m2228to = 255) int i2);

    public abstract void fillIndicator(@InterfaceC6391 Canvas canvas, @InterfaceC6391 Paint paint, @InterfaceC6391 ActiveIndicator activeIndicator, @InterfaceC5459(from = 0, m2228to = 255) int i);

    public abstract void fillTrack(@InterfaceC6391 Canvas canvas, @InterfaceC6391 Paint paint, @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN) float f, @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN) float f2, @InterfaceC3897 int i, @InterfaceC5459(from = 0, m2228to = 255) int i2, @InterfaceC6844 int i3);

    public abstract int getPreferredHeight();

    public abstract int getPreferredWidth();

    public void validateSpecAndAdjustCanvas(@InterfaceC6391 Canvas canvas, @InterfaceC6391 Rect rect, @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN) float f, boolean z, boolean z2) {
        this.spec.validateSpec();
        adjustCanvas(canvas, rect, f, z, z2);
    }
}
