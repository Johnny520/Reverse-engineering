package com.google.android.material.internal;

/* JADX INFO: loaded from: classes.dex */
final class FadeThroughUtils {
    static final float THRESHOLD_ALPHA = 0.5f;

    private FadeThroughUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void calculateFadeOutAndInAlphas(@Yue.InterfaceC2458(from = 0.0d, to = 1.0d) float r6, float[] r7) {
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r1 = 0
            r2 = 1
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            if (r0 > 0) goto L14
            float r6 = r6 * r3
            float r4 = r4 - r6
            r7[r5] = r4
            r7[r2] = r1
            goto L1a
        L14:
            r7[r5] = r1
            float r6 = r6 * r3
            float r6 = r6 - r4
            r7[r2] = r6
        L1a:
            return
    }
}
