package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class u52 extends p000.f21 {

    /* JADX INFO: renamed from: ο */
    public final p000.f21 f10599;

    /* JADX INFO: renamed from: π */
    public final boolean f10600;

    /* JADX INFO: renamed from: ρ */
    public final boolean f10601;

    /* JADX INFO: renamed from: σ */
    public p000.a80 f10602;

    /* JADX INFO: renamed from: τ */
    public p000.a80 f10603;

    /* JADX INFO: renamed from: υ */
    public final long f10604;

    public u52(p000.f21 r8, p000.a80 r9, p000.a80 r10, boolean r11, boolean r12) {
            r7 = this;
            eu1 r0 = p000.ax1.f1360
            if (r8 == 0) goto La
            a80 r0 = r8.mo1994()
            if (r0 != 0) goto Le
        La:
            sa0 r0 = p000.ax1.f1369
            a80 r0 = r0.f3727
        Le:
            a80 r5 = p000.ax1.m629(r9, r0, r11)
            if (r8 == 0) goto L1a
            a80 r9 = r8.mo2004()
            if (r9 != 0) goto L1e
        L1a:
            sa0 r9 = p000.ax1.f1369
            a80 r9 = r9.f3728
        L1e:
            a80 r6 = p000.ax1.m630(r10, r9)
            r2 = 0
            yw1 r4 = p000.yw1.f12861
            r1 = r7
            r1.<init>(r2, r4, r5, r6)
            r1.f10599 = r8
            r1.f10600 = r11
            r1.f10601 = r12
            a80 r7 = r1.f3727
            r1.f10602 = r7
            a80 r7 = r1.f3728
            r1.f10603 = r7
            long r7 = p000.i91.m2680()
            r1.f10604 = r7
            return
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: Α */
    public final p000.a80 mo1994() {
            r0 = this;
            a80 r0 = r0.f10602
            return r0
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: Δ */
    public final void mo1997(p000.c21 r1) {
            r0 = this;
            p000.u81.m5819()
            r0 = 0
            throw r0
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: Ε */
    public final p000.f21 mo1998(p000.a80 r9, p000.a80 r10) {
            r8 = this;
            a80 r0 = r8.f10602
            r1 = 1
            a80 r4 = p000.ax1.m629(r9, r0, r1)
            a80 r9 = r8.f10603
            a80 r5 = p000.ax1.m630(r10, r9)
            boolean r9 = r8.f10600
            if (r9 != 0) goto L22
            f21 r8 = r8.m5785()
            r9 = 0
            f21 r3 = r8.mo1998(r9, r5)
            u52 r2 = new u52
            r6 = 0
            r7 = 1
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L22:
            f21 r8 = r8.m5785()
            f21 r8 = r8.mo1998(r4, r5)
            return r8
    }

    /* JADX INFO: renamed from: Ζ */
    public final p000.f21 m5785() {
            r0 = this;
            f21 r0 = r0.f10599
            if (r0 != 0) goto L6
            sa0 r0 = p000.ax1.f1369
        L6:
            return r0
    }

    @Override // p000.f21, p000.tw1
    /* JADX INFO: renamed from: γ */
    public final void mo2000() {
            r1 = this;
            r0 = 1
            r1.f10484 = r0
            boolean r0 = r1.f10601
            if (r0 == 0) goto Le
            f21 r1 = r1.f10599
            if (r1 == 0) goto Le
            r1.mo2000()
        Le:
            return
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: δ */
    public final p000.yw1 mo5758() {
            r0 = this;
            f21 r0 = r0.m5785()
            yw1 r0 = r0.mo5758()
            return r0
    }

    @Override // p000.f21, p000.tw1
    /* JADX INFO: renamed from: ε */
    public final p000.a80 mo2001() {
            r0 = this;
            a80 r0 = r0.f10602
            return r0
    }

    @Override // p000.f21, p000.tw1
    /* JADX INFO: renamed from: ζ */
    public final boolean mo2002() {
            r0 = this;
            f21 r0 = r0.m5785()
            boolean r0 = r0.mo2002()
            return r0
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: η */
    public final long mo5759() {
            r2 = this;
            f21 r2 = r2.m5785()
            long r0 = r2.mo5759()
            return r0
    }

    @Override // p000.f21, p000.tw1
    /* JADX INFO: renamed from: θ */
    public final int mo2003() {
            r0 = this;
            f21 r0 = r0.m5785()
            int r0 = r0.mo2003()
            return r0
    }

    @Override // p000.f21, p000.tw1
    /* JADX INFO: renamed from: ι */
    public final p000.a80 mo2004() {
            r0 = this;
            a80 r0 = r0.f10603
            return r0
    }

    @Override // p000.f21, p000.tw1
    /* JADX INFO: renamed from: λ */
    public final void mo2005() {
            r0 = this;
            p000.u81.m5819()
            r0 = 0
            throw r0
    }

    @Override // p000.f21, p000.tw1
    /* JADX INFO: renamed from: μ */
    public final void mo2006() {
            r0 = this;
            p000.u81.m5819()
            r0 = 0
            throw r0
    }

    @Override // p000.f21, p000.tw1
    /* JADX INFO: renamed from: ν */
    public final void mo2007() {
            r0 = this;
            f21 r0 = r0.m5785()
            r0.mo2007()
            return
    }

    @Override // p000.f21, p000.tw1
    /* JADX INFO: renamed from: ξ */
    public final void mo2008(p000.i02 r1) {
            r0 = this;
            f21 r0 = r0.m5785()
            r0.mo2008(r1)
            return
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: σ */
    public final void mo5762(p000.yw1 r1) {
            r0 = this;
            p000.u81.m5819()
            r0 = 0
            throw r0
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: τ */
    public final void mo5763(long r1) {
            r0 = this;
            p000.u81.m5819()
            r0 = 0
            throw r0
    }

    @Override // p000.f21, p000.tw1
    /* JADX INFO: renamed from: υ */
    public final void mo2010(int r1) {
            r0 = this;
            f21 r0 = r0.m5785()
            r0.mo2010(r1)
            return
    }

    @Override // p000.f21, p000.tw1
    /* JADX INFO: renamed from: φ */
    public final p000.tw1 mo2011(p000.a80 r3) {
            r2 = this;
            a80 r0 = r2.f10602
            r1 = 1
            a80 r3 = p000.ax1.m629(r3, r0, r1)
            boolean r0 = r2.f10600
            if (r0 != 0) goto L19
            f21 r2 = r2.m5785()
            r0 = 0
            tw1 r2 = r2.mo2011(r0)
            tw1 r2 = p000.ax1.m625(r2, r3, r1)
            return r2
        L19:
            f21 r2 = r2.m5785()
            tw1 r2 = r2.mo2011(r3)
            return r2
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: ψ */
    public final p000.g81 mo2013() {
            r0 = this;
            f21 r0 = r0.m5785()
            g81 r0 = r0.mo2013()
            return r0
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: ω */
    public final p000.c21 mo2014() {
            r0 = this;
            f21 r0 = r0.m5785()
            c21 r0 = r0.mo2014()
            return r0
    }
}
