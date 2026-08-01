package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class v52 extends p000.tw1 {

    /* JADX INFO: renamed from: ε */
    public final p000.tw1 f11109;

    /* JADX INFO: renamed from: ζ */
    public final boolean f11110;

    /* JADX INFO: renamed from: η */
    public final boolean f11111;

    /* JADX INFO: renamed from: θ */
    public p000.a80 f11112;

    /* JADX INFO: renamed from: ι */
    public final long f11113;

    public v52(p000.tw1 r4, p000.a80 r5, boolean r6, boolean r7) {
            r3 = this;
            eu1 r0 = p000.ax1.f1360
            r0 = 0
            yw1 r2 = p000.yw1.f12861
            r3.<init>(r0, r2)
            r3.f11109 = r4
            r3.f11110 = r6
            r3.f11111 = r7
            if (r4 == 0) goto L17
            a80 r4 = r4.mo2001()
            if (r4 != 0) goto L1b
        L17:
            sa0 r4 = p000.ax1.f1369
            a80 r4 = r4.f3727
        L1b:
            a80 r4 = p000.ax1.m629(r5, r4, r6)
            r3.f11112 = r4
            long r4 = p000.i91.m2680()
            r3.f11113 = r4
            return
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: γ */
    public final void mo2000() {
            r1 = this;
            r0 = 1
            r1.f10484 = r0
            boolean r0 = r1.f11111
            if (r0 == 0) goto Le
            tw1 r1 = r1.f11109
            if (r1 == 0) goto Le
            r1.mo2000()
        Le:
            return
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: δ */
    public final p000.yw1 mo5758() {
            r0 = this;
            tw1 r0 = r0.m6031()
            yw1 r0 = r0.mo5758()
            return r0
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: ε */
    public final p000.a80 mo2001() {
            r0 = this;
            a80 r0 = r0.f11112
            return r0
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: ζ */
    public final boolean mo2002() {
            r0 = this;
            tw1 r0 = r0.m6031()
            boolean r0 = r0.mo2002()
            return r0
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: η */
    public final long mo5759() {
            r2 = this;
            tw1 r2 = r2.m6031()
            long r0 = r2.mo5759()
            return r0
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: ι */
    public final p000.a80 mo2004() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: λ */
    public final void mo2005() {
            r0 = this;
            p000.u81.m5819()
            r0 = 0
            throw r0
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: μ */
    public final void mo2006() {
            r0 = this;
            p000.u81.m5819()
            r0 = 0
            throw r0
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: ν */
    public final void mo2007() {
            r0 = this;
            tw1 r0 = r0.m6031()
            r0.mo2007()
            return
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: ξ */
    public final void mo2008(p000.i02 r1) {
            r0 = this;
            tw1 r0 = r0.m6031()
            r0.mo2008(r1)
            return
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: φ */
    public final p000.tw1 mo2011(p000.a80 r3) {
            r2 = this;
            a80 r0 = r2.f11112
            r1 = 1
            a80 r3 = p000.ax1.m629(r3, r0, r1)
            boolean r0 = r2.f11110
            if (r0 != 0) goto L19
            tw1 r2 = r2.m6031()
            r0 = 0
            tw1 r2 = r2.mo2011(r0)
            tw1 r2 = p000.ax1.m625(r2, r3, r1)
            return r2
        L19:
            tw1 r2 = r2.m6031()
            tw1 r2 = r2.mo2011(r3)
            return r2
    }

    /* JADX INFO: renamed from: χ */
    public final p000.tw1 m6031() {
            r0 = this;
            tw1 r0 = r0.f11109
            if (r0 != 0) goto L6
            sa0 r0 = p000.ax1.f1369
        L6:
            return r0
    }
}
