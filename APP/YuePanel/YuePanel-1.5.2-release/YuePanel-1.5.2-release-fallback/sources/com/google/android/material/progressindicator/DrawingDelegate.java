package com.google.android.material.progressindicator;

import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* JADX INFO: loaded from: classes.dex */
abstract class DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> {
    S spec;

    public static class ActiveIndicator {

        @Yue.InterfaceC1230
        int color;

        @Yue.InterfaceC2458(from = 0.0d, to = 1.0d)
        float endFraction;

        @Yue.InterfaceC4992
        int gapSize;

        @Yue.InterfaceC2458(from = 0.0d, to = 1.0d)
        float startFraction;

        public ActiveIndicator() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public DrawingDelegate(S r1) {
            r0 = this;
            r0.<init>()
            r0.spec = r1
            return
    }

    public abstract void adjustCanvas(@Yue.InterfaceC4410 android.graphics.Canvas r1, @Yue.InterfaceC4410 android.graphics.Rect r2, @Yue.InterfaceC2458(from = -1.0d, to = 1.0d) float r3, boolean r4, boolean r5);

    public abstract void drawStopIndicator(@Yue.InterfaceC4410 android.graphics.Canvas r1, @Yue.InterfaceC4410 android.graphics.Paint r2, @Yue.InterfaceC1230 int r3, @Yue.InterfaceC3281(from = 0, to = 255) int r4);

    public abstract void fillIndicator(@Yue.InterfaceC4410 android.graphics.Canvas r1, @Yue.InterfaceC4410 android.graphics.Paint r2, @Yue.InterfaceC4410 com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator r3, @Yue.InterfaceC3281(from = 0, to = 255) int r4);

    public abstract void fillTrack(@Yue.InterfaceC4410 android.graphics.Canvas r1, @Yue.InterfaceC4410 android.graphics.Paint r2, @Yue.InterfaceC2458(from = 0.0d, to = 1.0d) float r3, @Yue.InterfaceC2458(from = 0.0d, to = 1.0d) float r4, @Yue.InterfaceC1230 int r5, @Yue.InterfaceC3281(from = 0, to = 255) int r6, @Yue.InterfaceC4992 int r7);

    public abstract int getPreferredHeight();

    public abstract int getPreferredWidth();

    public void validateSpecAndAdjustCanvas(@Yue.InterfaceC4410 android.graphics.Canvas r2, @Yue.InterfaceC4410 android.graphics.Rect r3, @Yue.InterfaceC2458(from = 0.0d, to = 1.0d) float r4, boolean r5, boolean r6) {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            r0.validateSpec()
            r1.adjustCanvas(r2, r3, r4, r5, r6)
            return
    }
}
