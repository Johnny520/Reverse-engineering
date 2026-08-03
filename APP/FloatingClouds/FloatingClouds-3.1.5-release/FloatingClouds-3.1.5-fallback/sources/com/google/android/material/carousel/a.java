package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static float a(float r1, float r2, int r3) {
            int r3 = r3 + (-1)
            r0 = 0
            int r3 = java.lang.Math.max(r0, r3)
            float r3 = (float) r3
            float r3 = r3 * r2
            float r3 = r3 + r1
            return r3
    }

    public static float b(float r0, float r1, int r2) {
            if (r2 <= 0) goto L7
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r1 = r1 + r0
            return r1
        L7:
            return r0
    }

    public static float c(float r0, float r1, float r2, int r3) {
            if (r3 <= 0) goto L7
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            float r2 = r2 + r1
            return r2
        L7:
            return r0
    }
}
