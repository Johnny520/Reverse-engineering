package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class tc2 {

    /* JADX INFO: renamed from: α */
    public final p000.C1052zb f10315;

    /* JADX INFO: renamed from: β */
    public final float f10316;

    public tc2(android.graphics.Rect r5, float r6) {
            r4 = this;
            zb r0 = new zb
            int r1 = r5.left
            int r2 = r5.top
            int r3 = r5.right
            int r5 = r5.bottom
            r0.<init>(r1, r2, r3, r5)
            r4.<init>()
            r4.f10315 = r0
            r4.f10316 = r6
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            if (r5 == 0) goto Lb
            java.lang.Class r1 = r5.getClass()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            java.lang.Class<tc2> r2 = p000.tc2.class
            boolean r1 = r2.equals(r1)
            r2 = 0
            if (r1 != 0) goto L16
            return r2
        L16:
            r5.getClass()
            tc2 r5 = (p000.tc2) r5
            zb r1 = r4.f10315
            zb r3 = r5.f10315
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L26
            return r2
        L26:
            float r4 = r4.f10316
            float r5 = r5.f10316
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L2f
            return r0
        L2f:
            return r2
    }

    public final int hashCode() {
            r1 = this;
            zb r0 = r1.f10315
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            float r1 = r1.f10316
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "WindowMetrics(_bounds="
            r0.<init>(r1)
            zb r1 = r2.f10315
            r0.append(r1)
            java.lang.String r1 = ", density="
            r0.append(r1)
            float r2 = r2.f10316
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: α */
    public final android.graphics.Rect m5629() {
            r4 = this;
            zb r4 = r4.f10315
            r4.getClass()
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = r4.f13022
            int r2 = r4.f13023
            int r3 = r4.f13024
            int r4 = r4.f13025
            r0.<init>(r1, r2, r3, r4)
            return r0
    }
}
