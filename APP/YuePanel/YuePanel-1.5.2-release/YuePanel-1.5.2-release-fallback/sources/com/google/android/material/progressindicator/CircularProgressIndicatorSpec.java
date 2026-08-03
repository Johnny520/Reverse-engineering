package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes.dex */
public final class CircularProgressIndicatorSpec extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec {
    public int indicatorDirection;

    @Yue.InterfaceC4992
    public int indicatorInset;

    @Yue.InterfaceC4992
    public int indicatorSize;

    public CircularProgressIndicatorSpec(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.circularProgressIndicatorStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public CircularProgressIndicatorSpec(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3, @Yue.InterfaceC0642 int r4) {
            r1 = this;
            int r0 = com.google.android.material.progressindicator.CircularProgressIndicator.DEF_STYLE_RES
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public CircularProgressIndicatorSpec(@Yue.InterfaceC4410 android.content.Context r10, @Yue.InterfaceC4544 android.util.AttributeSet r11, @Yue.InterfaceC0642 int r12, @Yue.InterfaceC6018 int r13) {
            r9 = this;
            r9.<init>(r10, r11, r12, r13)
            android.content.res.Resources r0 = r10.getResources()
            int r1 = com.google.android.material.R.dimen.mtrl_progress_circular_size_medium
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r10.getResources()
            int r2 = com.google.android.material.R.dimen.mtrl_progress_circular_inset_medium
            int r1 = r1.getDimensionPixelSize(r2)
            int[] r4 = com.google.android.material.R.styleable.CircularProgressIndicator
            r8 = 0
            int[] r7 = new int[r8]
            r2 = r10
            r3 = r11
            r5 = r12
            r6 = r13
            android.content.res.TypedArray r11 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r2, r3, r4, r5, r6, r7)
            int r12 = com.google.android.material.R.styleable.CircularProgressIndicator_indicatorSize
            int r12 = com.google.android.material.resources.MaterialResources.getDimensionPixelSize(r10, r11, r12, r0)
            int r13 = r9.trackThickness
            int r13 = r13 * 2
            int r12 = java.lang.Math.max(r12, r13)
            r9.indicatorSize = r12
            int r12 = com.google.android.material.R.styleable.CircularProgressIndicator_indicatorInset
            int r10 = com.google.android.material.resources.MaterialResources.getDimensionPixelSize(r10, r11, r12, r1)
            r9.indicatorInset = r10
            int r10 = com.google.android.material.R.styleable.CircularProgressIndicator_indicatorDirectionCircular
            int r10 = r11.getInt(r10, r8)
            r9.indicatorDirection = r10
            r11.recycle()
            r9.validateSpec()
            return
    }

    public int getIndicatorTrackGapSizeDegree() {
            r6 = this;
            int r0 = r6.indicatorTrackGapSize
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r1 = r6.indicatorSize
            int r2 = r6.indicatorInset
            int r2 = r2 * 2
            int r1 = r1 - r2
            int r2 = r6.trackThickness
            int r1 = r1 - r2
            r2 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r4 = (double) r1
            double r4 = r4 * r2
            int r1 = r6.trackCornerRadius
            int r0 = r0 + r1
            double r0 = (double) r0
            double r4 = r4 / r0
            r0 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r0 = r0 / r4
            long r0 = java.lang.Math.round(r0)
            int r0 = (int) r0
            return r0
    }
}
