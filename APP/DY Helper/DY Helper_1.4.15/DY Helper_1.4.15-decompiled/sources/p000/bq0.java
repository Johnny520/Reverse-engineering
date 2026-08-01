package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class bq0 {

    /* JADX INFO: renamed from: α */
    public final p000.yp0 f1800;

    /* JADX INFO: renamed from: β */
    public boolean f1801;

    /* JADX INFO: renamed from: γ */
    public boolean f1802;

    /* JADX INFO: renamed from: δ */
    public p000.up0 f1803;

    /* JADX INFO: renamed from: ε */
    public boolean f1804;

    /* JADX INFO: renamed from: ζ */
    public boolean f1805;

    /* JADX INFO: renamed from: η */
    public boolean f1806;

    /* JADX INFO: renamed from: θ */
    public int f1807;

    /* JADX INFO: renamed from: ι */
    public int f1808;

    /* JADX INFO: renamed from: κ */
    public boolean f1809;

    /* JADX INFO: renamed from: λ */
    public boolean f1810;

    /* JADX INFO: renamed from: μ */
    public int f1811;

    /* JADX INFO: renamed from: ν */
    public boolean f1812;

    /* JADX INFO: renamed from: ξ */
    public boolean f1813;

    /* JADX INFO: renamed from: ο */
    public int f1814;

    /* JADX INFO: renamed from: π */
    public final p000.ox0 f1815;

    /* JADX INFO: renamed from: ρ */
    public p000.jw0 f1816;

    public bq0(p000.yp0 r1) {
            r0 = this;
            r0.<init>()
            r0.f1800 = r1
            up0 r1 = p000.up0.f10923
            r0.f1803 = r1
            ox0 r1 = new ox0
            r1.<init>(r0)
            r0.f1815 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public final p000.q31 m994() {
            r0 = this;
            yp0 r0 = r0.f1800
            k31 r0 = r0.f12733
            q31 r0 = r0.f5727
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final void m995() {
            r4 = this;
            yp0 r0 = r4.f1800
            bq0 r0 = r0.f12734
            up0 r0 = r0.f1803
            up0 r1 = p000.up0.f10921
            up0 r2 = p000.up0.f10922
            r3 = 1
            if (r0 == r1) goto Lf
            if (r0 != r2) goto L1c
        Lf:
            ox0 r1 = r4.f1815
            boolean r1 = r1.f8319
            if (r1 == 0) goto L19
            r4.m1000(r3)
            goto L1c
        L19:
            r4.m999(r3)
        L1c:
            if (r0 != r2) goto L2d
            jw0 r0 = r4.f1816
            if (r0 == 0) goto L2a
            boolean r0 = r0.f5614
            if (r0 != r3) goto L2a
            r4.m1002(r3)
            return
        L2a:
            r4.m1001(r3)
        L2d:
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m996(long r4) {
            r3 = this;
            jw0 r3 = r3.f1816
            if (r3 == 0) goto L3a
            bq0 r0 = r3.f5600
            up0 r1 = p000.up0.f10920
            r0.f1803 = r1
            yp0 r1 = r0.f1800
            r2 = 0
            r0.f1804 = r2
            r3.f5596 = r4
            androidx.compose.ui.platform.AndroidComposeView r4 = p000.ln0.m3646(r1)
            y81 r4 = r4.getSnapshotObserver()
            iw0 r3 = r3.f5597
            a1 r5 = r4.f12492
            kx1 r4 = r4.f12491
            r4.m3425(r1, r5, r3)
            r3 = 1
            r0.f1805 = r3
            r0.f1806 = r3
            boolean r4 = p000.AbstractC1021yh.m6870(r1)
            ox0 r5 = r0.f1815
            if (r4 == 0) goto L34
            r5.f8343 = r3
            r5.f8315 = r3
            goto L36
        L34:
            r5.f8342 = r3
        L36:
            up0 r3 = p000.up0.f10923
            r0.f1803 = r3
        L3a:
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m997(int r4) {
            r3 = this;
            int r0 = r3.f1811
            r3.f1811 = r4
            r1 = 0
            r2 = 1
            if (r0 != 0) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r1
        Lb:
            if (r4 != 0) goto Le
            r1 = r2
        Le:
            if (r0 == r1) goto L2c
            yp0 r3 = r3.f1800
            yp0 r3 = r3.m7005()
            if (r3 == 0) goto L1b
            bq0 r3 = r3.f12734
            goto L1c
        L1b:
            r3 = 0
        L1c:
            if (r3 == 0) goto L2c
            int r0 = r3.f1811
            if (r4 != 0) goto L28
            int r0 = r0 + (-1)
            r3.m997(r0)
            return
        L28:
            int r0 = r0 + r2
            r3.m997(r0)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m998(int r4) {
            r3 = this;
            int r0 = r3.f1814
            r3.f1814 = r4
            r1 = 0
            r2 = 1
            if (r0 != 0) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r1
        Lb:
            if (r4 != 0) goto Le
            r1 = r2
        Le:
            if (r0 == r1) goto L2c
            yp0 r3 = r3.f1800
            yp0 r3 = r3.m7005()
            if (r3 == 0) goto L1b
            bq0 r3 = r3.f12734
            goto L1c
        L1b:
            r3 = 0
        L1c:
            if (r3 == 0) goto L2c
            int r0 = r3.f1814
            if (r4 != 0) goto L28
            int r0 = r0 + (-1)
            r3.m998(r0)
            return
        L28:
            int r0 = r0 + r2
            r3.m998(r0)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ζ */
    public final void m999(boolean r2) {
            r1 = this;
            boolean r0 = r1.f1810
            if (r0 == r2) goto L21
            r1.f1810 = r2
            if (r2 == 0) goto L14
            boolean r0 = r1.f1809
            if (r0 != 0) goto L14
            int r2 = r1.f1811
            int r2 = r2 + 1
            r1.m997(r2)
            return
        L14:
            if (r2 != 0) goto L21
            boolean r2 = r1.f1809
            if (r2 != 0) goto L21
            int r2 = r1.f1811
            int r2 = r2 + (-1)
            r1.m997(r2)
        L21:
            return
    }

    /* JADX INFO: renamed from: η */
    public final void m1000(boolean r2) {
            r1 = this;
            boolean r0 = r1.f1809
            if (r0 == r2) goto L21
            r1.f1809 = r2
            if (r2 == 0) goto L14
            boolean r0 = r1.f1810
            if (r0 != 0) goto L14
            int r2 = r1.f1811
            int r2 = r2 + 1
            r1.m997(r2)
            return
        L14:
            if (r2 != 0) goto L21
            boolean r2 = r1.f1810
            if (r2 != 0) goto L21
            int r2 = r1.f1811
            int r2 = r2 + (-1)
            r1.m997(r2)
        L21:
            return
    }

    /* JADX INFO: renamed from: θ */
    public final void m1001(boolean r2) {
            r1 = this;
            boolean r0 = r1.f1813
            if (r0 == r2) goto L21
            r1.f1813 = r2
            if (r2 == 0) goto L14
            boolean r0 = r1.f1812
            if (r0 != 0) goto L14
            int r2 = r1.f1814
            int r2 = r2 + 1
            r1.m998(r2)
            return
        L14:
            if (r2 != 0) goto L21
            boolean r2 = r1.f1812
            if (r2 != 0) goto L21
            int r2 = r1.f1814
            int r2 = r2 + (-1)
            r1.m998(r2)
        L21:
            return
    }

    /* JADX INFO: renamed from: ι */
    public final void m1002(boolean r2) {
            r1 = this;
            boolean r0 = r1.f1812
            if (r0 == r2) goto L21
            r1.f1812 = r2
            if (r2 == 0) goto L14
            boolean r0 = r1.f1813
            if (r0 != 0) goto L14
            int r2 = r1.f1814
            int r2 = r2 + 1
            r1.m998(r2)
            return
        L14:
            if (r2 != 0) goto L21
            boolean r2 = r1.f1813
            if (r2 != 0) goto L21
            int r2 = r1.f1814
            int r2 = r2 + (-1)
            r1.m998(r2)
        L21:
            return
    }

    /* JADX INFO: renamed from: κ */
    public final void m1003() {
            r6 = this;
            ox0 r0 = r6.f1815
            bq0 r1 = r0.f8329
            java.lang.Object r2 = r0.f8339
            r3 = 7
            yp0 r4 = r6.f1800
            r5 = 0
            if (r2 != 0) goto L17
            q31 r2 = r1.m994()
            java.lang.Object r2 = r2.mo1183()
            if (r2 != 0) goto L17
            goto L31
        L17:
            boolean r2 = r0.f8338
            if (r2 != 0) goto L1c
            goto L31
        L1c:
            r0.f8338 = r5
            q31 r1 = r1.m994()
            java.lang.Object r1 = r1.mo1183()
            r0.f8339 = r1
            yp0 r0 = r4.m7005()
            if (r0 == 0) goto L31
            p000.yp0.m6968(r0, r5, r3)
        L31:
            jw0 r6 = r6.f1816
            if (r6 == 0) goto L82
            bq0 r0 = r6.f5600
            java.lang.Object r1 = r6.f5595
            if (r1 != 0) goto L4f
            q31 r1 = r0.m994()
            fw0 r1 = r1.mo2314()
            r1.getClass()
            q31 r1 = r1.f4149
            java.lang.Object r1 = r1.mo1183()
            if (r1 != 0) goto L4f
            goto L82
        L4f:
            boolean r1 = r6.f5594
            if (r1 != 0) goto L54
            goto L82
        L54:
            r6.f5594 = r5
            q31 r0 = r0.m994()
            fw0 r0 = r0.mo2314()
            r0.getClass()
            q31 r0 = r0.f4149
            java.lang.Object r0 = r0.mo1183()
            r6.f5595 = r0
            boolean r6 = p000.AbstractC1021yh.m6870(r4)
            if (r6 == 0) goto L79
            yp0 r6 = r4.m7005()
            if (r6 == 0) goto L82
            p000.yp0.m6968(r6, r5, r3)
            return
        L79:
            yp0 r6 = r4.m7005()
            if (r6 == 0) goto L82
            p000.yp0.m6967(r6, r5, r3)
        L82:
            return
    }
}
