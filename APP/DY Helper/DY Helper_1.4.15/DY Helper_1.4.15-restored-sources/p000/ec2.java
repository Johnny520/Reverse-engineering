package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class ec2 extends p000.lc2 {

    /* JADX INFO: renamed from: γ */
    public final android.view.WindowInsets f3488;

    /* JADX INFO: renamed from: δ */
    public p000.nm0[] f3489;

    /* JADX INFO: renamed from: ε */
    public p000.nm0 f3490;

    /* JADX INFO: renamed from: ζ */
    public p000.oc2 f3491;

    /* JADX INFO: renamed from: η */
    public p000.nm0 f3492;

    /* JADX INFO: renamed from: θ */
    public int f3493;

    public ec2(p000.oc2 r1, android.view.WindowInsets r2) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.f3490 = r1
            r0.f3488 = r2
            return
    }

    public ec2(p000.oc2 r2, p000.ec2 r3) {
            r1 = this;
            android.view.WindowInsets r0 = new android.view.WindowInsets
            android.view.WindowInsets r3 = r3.f3488
            r0.<init>(r3)
            r1.<init>(r2, r0)
            return
    }

    /* JADX INFO: renamed from: Α */
    private p000.nm0 m1899(android.view.View r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead."
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: Γ */
    public static boolean m1900(int r0, int r1) {
            r0 = r0 & 6
            r1 = r1 & 6
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: χ */
    private p000.nm0 m1901(int r8, boolean r9) {
            r7 = this;
            nm0 r0 = p000.nm0.f7673
            r1 = 1
        L3:
            r2 = 512(0x200, float:7.17E-43)
            if (r1 > r2) goto L37
            r2 = r8 & r1
            if (r2 != 0) goto Lc
            goto L34
        Lc:
            nm0 r2 = r7.m1916(r1, r9)
            int r3 = r0.f7674
            int r4 = r2.f7674
            int r3 = java.lang.Math.max(r3, r4)
            int r4 = r0.f7675
            int r5 = r2.f7675
            int r4 = java.lang.Math.max(r4, r5)
            int r5 = r0.f7676
            int r6 = r2.f7676
            int r5 = java.lang.Math.max(r5, r6)
            int r0 = r0.f7677
            int r2 = r2.f7677
            int r0 = java.lang.Math.max(r0, r2)
            nm0 r0 = p000.nm0.m4080(r3, r4, r5, r0)
        L34:
            int r1 = r1 << 1
            goto L3
        L37:
            return r0
    }

    /* JADX INFO: renamed from: ω */
    private p000.nm0 m1902() {
            r0 = this;
            oc2 r0 = r0.f3491
            if (r0 == 0) goto Lb
            lc2 r0 = r0.f8033
            nm0 r0 = r0.mo2097()
            return r0
        Lb:
            nm0 r0 = p000.nm0.f7673
            return r0
    }

    @Override // p000.lc2
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = super.equals(r4)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            ec2 r4 = (p000.ec2) r4
            nm0 r0 = r3.f3492
            nm0 r2 = r4.f3492
            boolean r0 = java.util.Objects.equals(r0, r2)
            if (r0 == 0) goto L20
            int r3 = r3.f3493
            int r4 = r4.f3493
            boolean r3 = m1900(r3, r4)
            if (r3 == 0) goto L20
            r3 = 1
            return r3
        L20:
            return r1
    }

    /* JADX INFO: renamed from: Β */
    public boolean m1903(int r4) {
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 == r1) goto L14
            r2 = 2
            if (r4 == r2) goto L14
            r2 = 4
            if (r4 == r2) goto L13
            r2 = 8
            if (r4 == r2) goto L14
            r2 = 128(0x80, float:1.8E-43)
            if (r4 == r2) goto L14
            return r1
        L13:
            return r0
        L14:
            nm0 r3 = r3.m1916(r4, r0)
            nm0 r4 = p000.nm0.f7673
            boolean r3 = r3.equals(r4)
            r3 = r3 ^ r1
            return r3
    }

    @Override // p000.lc2
    /* JADX INFO: renamed from: δ */
    public void mo1904(android.view.View r1) {
            r0 = this;
            nm0 r1 = r0.m1899(r1)
            if (r1 != 0) goto L8
            nm0 r1 = p000.nm0.f7673
        L8:
            r0.mo1913(r1)
            return
    }

    @Override // p000.lc2
    /* JADX INFO: renamed from: ε */
    public void mo1905(p000.oc2 r3) {
            r2 = this;
            oc2 r0 = r2.f3491
            lc2 r1 = r3.f8033
            r1.mo1914(r0)
            nm0 r0 = r2.f3492
            lc2 r3 = r3.f8033
            r3.mo1913(r0)
            int r2 = r2.f3493
            r3.mo1915(r2)
            return
    }

    @Override // p000.lc2
    /* JADX INFO: renamed from: η */
    public p000.nm0 mo1906(int r2) {
            r1 = this;
            r0 = 0
            nm0 r1 = r1.m1901(r2, r0)
            return r1
    }

    @Override // p000.lc2
    /* JADX INFO: renamed from: θ */
    public p000.nm0 mo1907(int r2) {
            r1 = this;
            r0 = 1
            nm0 r1 = r1.m1901(r2, r0)
            return r1
    }

    @Override // p000.lc2
    /* JADX INFO: renamed from: μ */
    public final p000.nm0 mo1908() {
            r4 = this;
            nm0 r0 = r4.f3490
            if (r0 != 0) goto L1c
            android.view.WindowInsets r0 = r4.f3488
            int r1 = r0.getSystemWindowInsetLeft()
            int r2 = r0.getSystemWindowInsetTop()
            int r3 = r0.getSystemWindowInsetRight()
            int r0 = r0.getSystemWindowInsetBottom()
            nm0 r0 = p000.nm0.m4080(r1, r2, r3, r0)
            r4.f3490 = r0
        L1c:
            nm0 r4 = r4.f3490
            return r4
    }

    @Override // p000.lc2
    /* JADX INFO: renamed from: ξ */
    public p000.oc2 mo1909(int r4, int r5, int r6, int r7) {
            r3 = this;
            android.view.WindowInsets r0 = r3.f3488
            r1 = 0
            oc2 r0 = p000.oc2.m4220(r1, r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            if (r1 < r2) goto L13
            cc2 r1 = new cc2
            r1.<init>(r0)
            goto L22
        L13:
            r2 = 31
            if (r1 < r2) goto L1d
            bc2 r1 = new bc2
            r1.<init>(r0)
            goto L22
        L1d:
            ac2 r1 = new ac2
            r1.<init>(r0)
        L22:
            nm0 r0 = r3.mo1908()
            nm0 r0 = p000.oc2.m4219(r0, r4, r5, r6, r7)
            r1.mo1700(r0)
            nm0 r3 = r3.mo2097()
            nm0 r3 = p000.oc2.m4219(r3, r4, r5, r6, r7)
            r1.mo1699(r3)
            oc2 r3 = r1.mo1698()
            return r3
    }

    @Override // p000.lc2
    /* JADX INFO: renamed from: π */
    public boolean mo1910() {
            r0 = this;
            android.view.WindowInsets r0 = r0.f3488
            boolean r0 = r0.isRound()
            return r0
    }

    @Override // p000.lc2
    /* JADX INFO: renamed from: ρ */
    public boolean mo1911(int r4) {
            r3 = this;
            r0 = 1
            r1 = r0
        L2:
            r2 = 512(0x200, float:7.17E-43)
            if (r1 > r2) goto L16
            r2 = r4 & r1
            if (r2 != 0) goto Lb
            goto L13
        Lb:
            boolean r2 = r3.m1903(r1)
            if (r2 != 0) goto L13
            r3 = 0
            return r3
        L13:
            int r1 = r1 << 1
            goto L2
        L16:
            return r0
    }

    @Override // p000.lc2
    /* JADX INFO: renamed from: σ */
    public void mo1912(p000.nm0[] r1) {
            r0 = this;
            r0.f3489 = r1
            return
    }

    @Override // p000.lc2
    /* JADX INFO: renamed from: τ */
    public void mo1913(p000.nm0 r1) {
            r0 = this;
            r0.f3492 = r1
            return
    }

    @Override // p000.lc2
    /* JADX INFO: renamed from: υ */
    public void mo1914(p000.oc2 r1) {
            r0 = this;
            r0.f3491 = r1
            return
    }

    @Override // p000.lc2
    /* JADX INFO: renamed from: φ */
    public void mo1915(int r1) {
            r0 = this;
            r0.f3493 = r1
            return
    }

    /* JADX INFO: renamed from: ψ */
    public p000.nm0 m1916(int r5, boolean r6) {
            r4 = this;
            r0 = 1
            nm0 r1 = p000.nm0.f7673
            r2 = 0
            if (r5 == r0) goto Ld9
            r0 = 0
            r3 = 2
            if (r5 == r3) goto L8b
            r6 = 8
            if (r5 == r6) goto L57
            r6 = 16
            if (r5 == r6) goto L52
            r6 = 32
            if (r5 == r6) goto L4d
            r6 = 64
            if (r5 == r6) goto L48
            r6 = 128(0x80, float:1.8E-43)
            if (r5 == r6) goto L20
            goto Lf6
        L20:
            oc2 r5 = r4.f3491
            if (r5 == 0) goto L2b
            lc2 r4 = r5.f8033
            mt r4 = r4.mo2297()
            goto L2f
        L2b:
            mt r4 = r4.mo2297()
        L2f:
            if (r4 == 0) goto Lf6
            android.view.DisplayCutout r4 = r4.f7267
            int r5 = r4.getSafeInsetLeft()
            int r6 = r4.getSafeInsetTop()
            int r0 = r4.getSafeInsetRight()
            int r4 = r4.getSafeInsetBottom()
            nm0 r4 = p000.nm0.m4080(r5, r6, r0, r4)
            return r4
        L48:
            nm0 r4 = r4.mo2492()
            return r4
        L4d:
            nm0 r4 = r4.mo2490()
            return r4
        L52:
            nm0 r4 = r4.mo2491()
            return r4
        L57:
            nm0[] r5 = r4.f3489
            if (r5 == 0) goto L5e
            r6 = 3
            r0 = r5[r6]
        L5e:
            if (r0 == 0) goto L61
            return r0
        L61:
            nm0 r5 = r4.mo1908()
            nm0 r6 = r4.m1902()
            int r5 = r5.f7677
            int r0 = r6.f7677
            if (r5 <= r0) goto L74
            nm0 r4 = p000.nm0.m4080(r2, r2, r2, r5)
            return r4
        L74:
            nm0 r5 = r4.f3492
            if (r5 == 0) goto Lf6
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto Lf6
            nm0 r4 = r4.f3492
            int r4 = r4.f7677
            int r5 = r6.f7677
            if (r4 <= r5) goto Lf6
            nm0 r4 = p000.nm0.m4080(r2, r2, r2, r4)
            return r4
        L8b:
            if (r6 == 0) goto Lb2
            nm0 r5 = r4.m1902()
            nm0 r4 = r4.mo2097()
            int r6 = r5.f7674
            int r0 = r4.f7674
            int r6 = java.lang.Math.max(r6, r0)
            int r0 = r5.f7676
            int r1 = r4.f7676
            int r0 = java.lang.Math.max(r0, r1)
            int r5 = r5.f7677
            int r4 = r4.f7677
            int r4 = java.lang.Math.max(r5, r4)
            nm0 r4 = p000.nm0.m4080(r6, r2, r0, r4)
            return r4
        Lb2:
            int r5 = r4.f3493
            r5 = r5 & r3
            if (r5 == 0) goto Lb8
            goto Lf6
        Lb8:
            nm0 r5 = r4.mo1908()
            oc2 r4 = r4.f3491
            if (r4 == 0) goto Lc6
            lc2 r4 = r4.f8033
            nm0 r0 = r4.mo2097()
        Lc6:
            int r4 = r5.f7677
            if (r0 == 0) goto Ld0
            int r6 = r0.f7677
            int r4 = java.lang.Math.min(r4, r6)
        Ld0:
            int r6 = r5.f7674
            int r5 = r5.f7676
            nm0 r4 = p000.nm0.m4080(r6, r2, r5, r4)
            return r4
        Ld9:
            if (r6 == 0) goto Lf0
            nm0 r5 = r4.m1902()
            int r5 = r5.f7675
            nm0 r4 = r4.mo1908()
            int r4 = r4.f7675
            int r4 = java.lang.Math.max(r5, r4)
            nm0 r4 = p000.nm0.m4080(r2, r4, r2, r2)
            return r4
        Lf0:
            int r5 = r4.f3493
            r5 = r5 & 4
            if (r5 == 0) goto Lf7
        Lf6:
            return r1
        Lf7:
            nm0 r4 = r4.mo1908()
            int r4 = r4.f7675
            nm0 r4 = p000.nm0.m4080(r2, r4, r2, r2)
            return r4
    }
}
