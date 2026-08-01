package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public interface z91 {
    /* JADX INFO: renamed from: α */
    static void m7119(p000.z91 r12, p000.wo1 r13) {
            x2 r12 = (p000.C0969x2) r12
            android.graphics.RectF r0 = r12.f12000
            if (r0 != 0) goto Ld
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r12.f12000 = r0
        Ld:
            android.graphics.RectF r0 = r12.f12000
            r0.getClass()
            float r1 = r13.f11788
            long r2 = r13.f11795
            long r4 = r13.f11794
            long r6 = r13.f11793
            long r8 = r13.f11792
            float r10 = r13.f11789
            float r11 = r13.f11790
            float r13 = r13.f11791
            r0.set(r1, r10, r11, r13)
            float[] r13 = r12.f12001
            if (r13 != 0) goto L2f
            r13 = 8
            float[] r13 = new float[r13]
            r12.f12001 = r13
        L2f:
            float[] r13 = r12.f12001
            r13.getClass()
            r0 = 32
            long r10 = r8 >> r0
            int r1 = (int) r10
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r10 = 0
            r13[r10] = r1
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r10
            int r1 = (int) r8
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r8 = 1
            r13[r8] = r1
            long r8 = r6 >> r0
            int r1 = (int) r8
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r8 = 2
            r13[r8] = r1
            long r6 = r6 & r10
            int r1 = (int) r6
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r6 = 3
            r13[r6] = r1
            long r6 = r4 >> r0
            int r1 = (int) r6
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r6 = 4
            r13[r6] = r1
            long r4 = r4 & r10
            int r1 = (int) r4
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r4 = 5
            r13[r4] = r1
            long r0 = r2 >> r0
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r1 = 6
            r13[r1] = r0
            long r0 = r2 & r10
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r1 = 7
            r13[r1] = r0
            android.graphics.Path r13 = r12.f11999
            android.graphics.RectF r0 = r12.f12000
            r0.getClass()
            float[] r12 = r12.f12001
            r12.getClass()
            android.graphics.Path$Direction r1 = android.graphics.Path.Direction.CCW
            r13.addRoundRect(r0, r12, r1)
            return
    }
}
