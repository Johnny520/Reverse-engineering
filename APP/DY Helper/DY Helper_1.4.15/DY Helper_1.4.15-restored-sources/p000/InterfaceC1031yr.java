package p000;

/* JADX INFO: renamed from: yr */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1031yr {
    /* JADX INFO: renamed from: Θ */
    default float mo581(long r5) {
            r4 = this;
            long r0 = p000.y32.m6819(r5)
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r0 = p000.z32.m7086(r0, r2)
            if (r0 != 0) goto L14
            java.lang.String r0 = "Only Sp can convert to Px"
            p000.cm0.m1266(r0)
        L14:
            float[] r0 = p000.z50.f12979
            float r0 = r4.mo590()
            r1 = 1065604874(0x3f83d70a, float:1.03)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L3e
            float r0 = r4.mo590()
            y50 r0 = p000.z50.m7089(r0)
            if (r0 != 0) goto L35
            float r5 = p000.y32.m6820(r5)
            float r4 = r4.mo590()
            float r4 = r4 * r5
            return r4
        L35:
            float r4 = p000.y32.m6820(r5)
            float r4 = r0.mo44(r4)
            return r4
        L3e:
            float r5 = p000.y32.m6820(r5)
            float r4 = r4.mo590()
            float r4 = r4 * r5
            return r4
    }

    /* JADX INFO: renamed from: Ξ */
    default int mo583(float r1) {
            r0 = this;
            float r0 = r0.mo594(r1)
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 == 0) goto Le
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
        Le:
            int r0 = java.lang.Math.round(r0)
            return r0
    }

    /* JADX INFO: renamed from: Ψ */
    default long mo584(long r7) {
            r6 = this;
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L35
            r0 = 32
            long r1 = r7 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r1 = r6.mo594(r1)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r2
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            float r6 = r6.mo594(r7)
            int r7 = java.lang.Float.floatToRawIntBits(r1)
            long r7 = (long) r7
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r4 = (long) r6
            long r6 = r7 << r0
            long r0 = r4 & r2
            long r6 = r6 | r0
            return r6
        L35:
            return r0
    }

    /* JADX INFO: renamed from: β */
    float mo586();

    /* JADX INFO: renamed from: θ */
    float mo590();

    /* JADX INFO: renamed from: σ */
    default long mo592(float r4) {
            r3 = this;
            float[] r0 = p000.z50.f12979
            float r0 = r3.mo590()
            r1 = 1065604874(0x3f83d70a, float:1.03)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 4294967296(0x100000000, double:2.121995791E-314)
            if (r0 < 0) goto L2c
            float r0 = r3.mo590()
            y50 r0 = p000.z50.m7089(r0)
            if (r0 == 0) goto L21
            float r3 = r0.mo43(r4)
            goto L27
        L21:
            float r3 = r3.mo590()
            float r3 = r4 / r3
        L27:
            long r3 = p000.u81.m5814(r1, r3)
            return r3
        L2c:
            float r3 = r3.mo590()
            float r4 = r4 / r3
            long r3 = p000.u81.m5814(r1, r4)
            return r3
    }

    /* JADX INFO: renamed from: τ */
    default long mo593(long r4) {
            r3 = this;
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L2a
            r0 = 32
            long r0 = r4 >> r0
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r0 = r3.mo598(r0)
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r1
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            float r3 = r3.mo598(r4)
            long r3 = p000.AbstractC0782s1.m5324(r0, r3)
            return r3
        L2a:
            return r0
    }

    /* JADX INFO: renamed from: υ */
    default float mo594(float r1) {
            r0 = this;
            float r0 = r0.mo586()
            float r0 = r0 * r1
            return r0
    }

    /* JADX INFO: renamed from: д */
    default float mo595(long r5) {
            r4 = this;
            long r0 = p000.y32.m6819(r5)
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r0 = p000.z32.m7086(r0, r2)
            if (r0 != 0) goto L14
            java.lang.String r0 = "Only Sp can convert to Px"
            p000.cm0.m1266(r0)
        L14:
            float r5 = r4.mo581(r5)
            float r4 = r4.mo594(r5)
            return r4
    }

    /* JADX INFO: renamed from: к */
    default long mo596(float r1) {
            r0 = this;
            float r1 = r0.mo598(r1)
            long r0 = r0.mo592(r1)
            return r0
    }

    /* JADX INFO: renamed from: п */
    default float mo597(int r1) {
            r0 = this;
            float r1 = (float) r1
            float r0 = r0.mo586()
            float r1 = r1 / r0
            return r1
    }

    /* JADX INFO: renamed from: с */
    default float mo598(float r1) {
            r0 = this;
            float r0 = r0.mo586()
            float r1 = r1 / r0
            return r1
    }
}
