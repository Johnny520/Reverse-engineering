package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class fw0 extends p000.dw0 implements p000.kx0 {

    /* JADX INFO: renamed from: σ */
    public final p000.q31 f4149;

    /* JADX INFO: renamed from: τ */
    public long f4150;

    /* JADX INFO: renamed from: υ */
    public java.util.LinkedHashMap f4151;

    /* JADX INFO: renamed from: φ */
    public final p000.gw0 f4152;

    /* JADX INFO: renamed from: χ */
    public p000.qx0 f4153;

    /* JADX INFO: renamed from: ψ */
    public final p000.u11 f4154;

    public fw0(p000.q31 r3) {
            r2 = this;
            r2.<init>()
            r2.f4149 = r3
            r0 = 0
            r2.f4150 = r0
            gw0 r3 = new gw0
            r3.<init>(r2)
            r2.f4152 = r3
            u11 r3 = p000.z31.f12956
            u11 r3 = new u11
            r3.<init>()
            r2.f4154 = r3
            return
    }

    /* JADX INFO: renamed from: К */
    public static final void m2208(p000.fw0 r6, p000.qx0 r7) {
            if (r7 == 0) goto L1a
            int r0 = r7.mo1626()
            int r1 = r7.mo1623()
            long r2 = (long) r0
            r0 = 32
            long r2 = r2 << r0
            long r0 = (long) r1
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            long r0 = r0 | r2
            r6.m1188(r0)
            goto L1f
        L1a:
            r0 = 0
            r6.m1188(r0)
        L1f:
            qx0 r0 = r6.f4153
            boolean r0 = p000.ln0.m3626(r0, r7)
            if (r0 != 0) goto L6e
            if (r7 == 0) goto L6e
            java.util.LinkedHashMap r0 = r6.f4151
            if (r0 == 0) goto L33
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3d
        L33:
            java.util.Map r0 = r7.mo1624()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L6e
        L3d:
            java.util.Map r0 = r7.mo1624()
            java.util.LinkedHashMap r1 = r6.f4151
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L6e
            q31 r0 = r6.f4149
            yp0 r0 = r0.f8839
            bq0 r0 = r0.f12734
            jw0 r0 = r0.f1816
            r0.getClass()
            zp0 r0 = r0.f5611
            r0.m7222()
            java.util.LinkedHashMap r0 = r6.f4151
            if (r0 != 0) goto L64
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r6.f4151 = r0
        L64:
            r0.clear()
            java.util.Map r1 = r7.mo1624()
            r0.putAll(r1)
        L6e:
            r6.f4153 = r7
            return
    }

    @Override // p000.rx0
    public final p000.np0 getLayoutDirection() {
            r0 = this;
            q31 r0 = r0.f4149
            yp0 r0 = r0.f8839
            np0 r0 = r0.f12727
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: β */
    public final float mo586() {
            r0 = this;
            q31 r0 = r0.f4149
            float r0 = r0.mo586()
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: θ */
    public final float mo590() {
            r0 = this;
            q31 r0 = r0.f4149
            float r0 = r0.mo590()
            return r0
    }

    @Override // p000.ch1, p000.kx0
    /* JADX INFO: renamed from: λ */
    public final java.lang.Object mo1183() {
            r0 = this;
            q31 r0 = r0.f4149
            java.lang.Object r0 = r0.mo1183()
            return r0
    }

    @Override // p000.dw0, p000.rx0
    /* JADX INFO: renamed from: ν */
    public final boolean mo1610() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // p000.dw0
    /* JADX INFO: renamed from: А */
    public final boolean mo1803() {
            r0 = this;
            qx0 r0 = r0.f4153
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // p000.dw0
    /* JADX INFO: renamed from: Б */
    public final p000.yp0 mo1804() {
            r0 = this;
            q31 r0 = r0.f4149
            yp0 r0 = r0.f8839
            return r0
    }

    @Override // p000.dw0
    /* JADX INFO: renamed from: В */
    public final p000.qx0 mo1805() {
            r0 = this;
            qx0 r0 = r0.f4153
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "LookaheadDelegate has not been measured yet when measureResult is requested."
            pm r0 = p000.lz1.m3680(r0)
            throw r0
    }

    @Override // p000.dw0
    /* JADX INFO: renamed from: Г */
    public final p000.dw0 mo1806() {
            r0 = this;
            q31 r0 = r0.f4149
            q31 r0 = r0.f8841
            if (r0 == 0) goto Lb
            fw0 r0 = r0.mo2314()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // p000.dw0
    /* JADX INFO: renamed from: Д */
    public final long mo1807() {
            r2 = this;
            long r0 = r2.f4150
            return r0
    }

    @Override // p000.dw0
    /* JADX INFO: renamed from: И */
    public final void mo1810() {
            r4 = this;
            long r0 = r4.f4150
            r2 = 0
            r3 = 0
            r4.mo1187(r0, r2, r3)
            return
    }

    /* JADX INFO: renamed from: Л */
    public void mo2147() {
            r0 = this;
            qx0 r0 = r0.mo1805()
            r0.mo1622()
            return
    }

    /* JADX INFO: renamed from: М */
    public final void m2209(long r3) {
            r2 = this;
            long r0 = r2.f4150
            boolean r0 = p000.um0.m5938(r0, r3)
            if (r0 != 0) goto L1a
            r2.f4150 = r3
            q31 r3 = r2.f4149
            yp0 r4 = r3.f8839
            bq0 r4 = r4.f12734
            jw0 r4 = r4.f1816
            if (r4 == 0) goto L17
            r4.m2993()
        L17:
            p000.dw0.m1802(r3)
        L1a:
            boolean r3 = r2.f3309
            if (r3 != 0) goto L25
            qx0 r3 = r2.mo1805()
            r2.m1814(r3)
        L25:
            return
    }

    /* JADX INFO: renamed from: Н */
    public final long m2210(p000.fw0 r5, boolean r6) {
            r4 = this;
            r0 = 0
        L2:
            boolean r6 = r4.equals(r5)
            if (r6 != 0) goto L1d
            long r2 = r4.f4150
            long r0 = p000.um0.m5940(r0, r2)
            q31 r4 = r4.f4149
            q31 r4 = r4.f8841
            r4.getClass()
            fw0 r4 = r4.mo2314()
            r4.getClass()
            goto L2
        L1d:
            return r0
    }

    @Override // p000.ch1
    /* JADX INFO: renamed from: у */
    public final void mo1187(long r1, float r3, p000.a80 r4) {
            r0 = this;
            r0.m2209(r1)
            boolean r1 = r0.f3308
            if (r1 == 0) goto L8
            return
        L8:
            r0.mo2147()
            return
    }

    @Override // p000.dw0
    /* JADX INFO: renamed from: ю */
    public final p000.dw0 mo1816() {
            r0 = this;
            q31 r0 = r0.f4149
            q31 r0 = r0.f8840
            if (r0 == 0) goto Lb
            fw0 r0 = r0.mo2314()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // p000.dw0
    /* JADX INFO: renamed from: я */
    public final p000.mp0 mo1817() {
            r0 = this;
            gw0 r0 = r0.f4152
            return r0
    }
}
