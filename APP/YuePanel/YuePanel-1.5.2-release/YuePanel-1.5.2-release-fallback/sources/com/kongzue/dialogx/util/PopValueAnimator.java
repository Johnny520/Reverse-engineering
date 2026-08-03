package com.kongzue.dialogx.util;

/* JADX INFO: loaded from: classes2.dex */
public class PopValueAnimator extends android.animation.ValueAnimator {
    float endValue;
    float startValue;

    public PopValueAnimator() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.kongzue.dialogx.util.PopValueAnimator ofFloat(float... r1) {
            com.kongzue.dialogx.util.PopValueAnimator r0 = new com.kongzue.dialogx.util.PopValueAnimator
            r0.<init>()
            r0.setFloatValues(r1)
            return r0
    }

    public float getEndValue() {
            r1 = this;
            float r0 = r1.endValue
            return r0
    }

    public float getStartValue() {
            r1 = this;
            float r0 = r1.startValue
            return r0
    }

    @Override // android.animation.ValueAnimator
    public void setFloatValues(float... r3) {
            r2 = this;
            int r0 = r3.length
            r1 = 1
            if (r0 <= r1) goto Lf
            r0 = 0
            r0 = r3[r0]
            r2.startValue = r0
            int r0 = r3.length
            int r0 = r0 - r1
            r0 = r3[r0]
            r2.endValue = r0
        Lf:
            super.setFloatValues(r3)
            return
    }
}
