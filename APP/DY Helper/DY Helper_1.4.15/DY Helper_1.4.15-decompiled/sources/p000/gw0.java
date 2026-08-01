package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class gw0 implements p000.mp0 {

    /* JADX INFO: renamed from: ε */
    public final p000.fw0 f4484;

    public gw0(p000.fw0 r1) {
            r0 = this;
            r0.<init>()
            r0.f4484 = r1
            return
    }

    @Override // p000.mp0
    /* JADX INFO: renamed from: Φ */
    public final long mo2330(p000.mp0 r1, long r2) {
            r0 = this;
            long r0 = r0.mo2332(r1, r2)
            return r0
    }

    @Override // p000.mp0
    /* JADX INFO: renamed from: Χ */
    public final boolean mo2331() {
            r0 = this;
            fw0 r0 = r0.f4484
            q31 r0 = r0.f4149
            q01 r0 = r0.mo2315()
            boolean r0 = r0.f8784
            return r0
    }

    @Override // p000.mp0
    /* JADX INFO: renamed from: Ω */
    public final long mo2332(p000.mp0 r10, long r11) {
            r9 = this;
            boolean r0 = r10 instanceof p000.gw0
            fw0 r1 = r9.f4484
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r4 = 32
            if (r0 == 0) goto L9d
            gw0 r10 = (p000.gw0) r10
            fw0 r9 = r10.f4484
            q31 r10 = r9.f4149
            r10.m4746()
            q31 r0 = r1.f4149
            q31 r10 = r0.m4735(r10)
            fw0 r10 = r10.mo2314()
            r0 = 0
            if (r10 == 0) goto L4e
            long r5 = r9.m2210(r10, r0)
            long r11 = p000.h62.m2448(r11)
            long r11 = p000.um0.m5940(r5, r11)
            long r9 = r1.m2210(r10, r0)
            long r9 = p000.um0.m5939(r11, r9)
            long r11 = r9 >> r4
            int r11 = (int) r11
            float r11 = (float) r11
            long r9 = r9 & r2
            int r9 = (int) r9
            float r9 = (float) r9
            int r10 = java.lang.Float.floatToRawIntBits(r11)
            long r10 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r0 = (long) r9
            long r9 = r10 << r4
            long r11 = r0 & r2
            long r9 = r9 | r11
            return r9
        L4e:
            fw0 r10 = p000.pd2.m4501(r9)
            long r5 = r9.m2210(r10, r0)
            long r7 = r10.f4150
            long r5 = p000.um0.m5940(r5, r7)
            long r11 = p000.h62.m2448(r11)
            long r11 = p000.um0.m5940(r5, r11)
            fw0 r9 = p000.pd2.m4501(r1)
            long r0 = r1.m2210(r9, r0)
            long r5 = r9.f4150
            long r0 = p000.um0.m5940(r0, r5)
            long r11 = p000.um0.m5939(r11, r0)
            long r0 = r11 >> r4
            int r0 = (int) r0
            float r0 = (float) r0
            long r11 = r11 & r2
            int r11 = (int) r11
            float r11 = (float) r11
            int r12 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r12
            int r11 = java.lang.Float.floatToRawIntBits(r11)
            long r11 = (long) r11
            long r0 = r0 << r4
            long r11 = r11 & r2
            long r11 = r11 | r0
            q31 r9 = r9.f4149
            q31 r9 = r9.f8841
            r9.getClass()
            q31 r10 = r10.f4149
            q31 r10 = r10.f8841
            r10.getClass()
            long r9 = r9.mo2332(r10, r11)
            return r9
        L9d:
            fw0 r0 = p000.pd2.m4501(r1)
            q31 r1 = r0.f4149
            gw0 r5 = r0.f4152
            long r11 = r9.mo2332(r5, r11)
            long r5 = r0.f4150
            long r7 = r5 >> r4
            int r9 = (int) r7
            float r9 = (float) r9
            long r5 = r5 & r2
            int r0 = (int) r5
            float r0 = (float) r0
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r5 = (long) r9
            int r9 = java.lang.Float.floatToRawIntBits(r0)
            long r7 = (long) r9
            long r4 = r5 << r4
            long r2 = r2 & r7
            long r2 = r2 | r4
            long r11 = p000.o41.m4204(r11, r2)
            q01 r9 = r1.mo2315()
            boolean r9 = r9.f8784
            if (r9 != 0) goto Ld1
            java.lang.String r9 = "LayoutCoordinate operations are only valid when isAttached is true"
            p000.am0.m178(r9)
        Ld1:
            r1.m4746()
            q31 r9 = r1.f8841
            if (r9 != 0) goto Ld9
            goto Lda
        Ld9:
            r1 = r9
        Lda:
            r2 = 0
            long r9 = r1.mo2332(r10, r2)
            long r9 = p000.o41.m4205(r11, r9)
            return r9
    }

    /* JADX INFO: renamed from: α */
    public final long m2333() {
            r7 = this;
            fw0 r0 = r7.f4484
            fw0 r1 = p000.pd2.m4501(r0)
            gw0 r2 = r1.f4152
            r3 = 0
            long r5 = r7.mo2332(r2, r3)
            q31 r7 = r0.f4149
            q31 r0 = r1.f4149
            long r0 = r7.mo2332(r0, r3)
            long r0 = p000.o41.m4204(r5, r0)
            return r0
    }

    @Override // p000.mp0
    /* JADX INFO: renamed from: δ */
    public final long mo2334(long r5) {
            r4 = this;
            fw0 r5 = r4.f4484
            q31 r5 = r5.f4149
            long r0 = r4.m2333()
            r2 = 0
            long r0 = p000.o41.m4205(r2, r0)
            long r4 = r5.mo2334(r0)
            return r4
    }

    @Override // p000.mp0
    /* JADX INFO: renamed from: ι */
    public final long mo2335(long r4) {
            r3 = this;
            fw0 r0 = r3.f4484
            q31 r0 = r0.f4149
            long r1 = r3.m2333()
            long r3 = p000.o41.m4205(r4, r1)
            long r3 = r0.mo2335(r3)
            return r3
    }

    @Override // p000.mp0
    /* JADX INFO: renamed from: μ */
    public final p000.mp0 mo2336() {
            r1 = this;
            boolean r0 = r1.mo2331()
            if (r0 != 0) goto Lb
            java.lang.String r0 = "LayoutCoordinate operations are only valid when isAttached is true"
            p000.am0.m178(r0)
        Lb:
            fw0 r1 = r1.f4484
            q31 r1 = r1.f4149
            yp0 r1 = r1.f8839
            k31 r1 = r1.f12733
            q31 r1 = r1.f5727
            q31 r1 = r1.f8841
            if (r1 == 0) goto L22
            fw0 r1 = r1.mo2314()
            if (r1 == 0) goto L22
            gw0 r1 = r1.f4152
            return r1
        L22:
            r1 = 0
            return r1
    }

    @Override // p000.mp0
    /* JADX INFO: renamed from: ж */
    public final p000.ml1 mo2337(p000.mp0 r1, boolean r2) {
            r0 = this;
            fw0 r0 = r0.f4484
            q31 r0 = r0.f4149
            ml1 r0 = r0.mo2337(r1, r2)
            return r0
    }

    @Override // p000.mp0
    /* JADX INFO: renamed from: з */
    public final long mo2338() {
            r6 = this;
            fw0 r6 = r6.f4484
            int r0 = r6.f2115
            int r6 = r6.f2116
            long r0 = (long) r0
            r2 = 32
            long r0 = r0 << r2
            long r2 = (long) r6
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r0 = r0 | r2
            return r0
    }
}
