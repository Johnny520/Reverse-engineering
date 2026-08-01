package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ok1 extends p000.tw1 {

    /* JADX INFO: renamed from: ε */
    public final p000.a80 f8130;

    /* JADX INFO: renamed from: ζ */
    public int f8131;

    public ok1(long r1, p000.yw1 r3, p000.a80 r4) {
            r0 = this;
            r0.<init>(r1, r3)
            r0.f8130 = r4
            r1 = 1
            r0.f8131 = r1
            return
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: γ */
    public final void mo2000() {
            r1 = this;
            boolean r0 = r1.f10484
            if (r0 != 0) goto L15
            r1.mo2006()
            r0 = 1
            r1.f10484 = r0
            java.lang.Object r0 = p000.ax1.f1362
            monitor-enter(r0)
            r1.m5761()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return
        L12:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L15:
            return
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: ε */
    public final p000.a80 mo2001() {
            r0 = this;
            a80 r0 = r0.f8130
            return r0
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: ζ */
    public final boolean mo2002() {
            r0 = this;
            r0 = 1
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
            r1 = this;
            int r0 = r1.f8131
            int r0 = r0 + 1
            r1.f8131 = r0
            return
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: μ */
    public final void mo2006() {
            r1 = this;
            int r0 = r1.f8131
            int r0 = r0 + (-1)
            r1.f8131 = r0
            if (r0 != 0) goto Lb
            r1.m5757()
        Lb:
            return
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: ν */
    public final void mo2007() {
            r0 = this;
            return
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: ξ */
    public final void mo2008(p000.i02 r1) {
            r0 = this;
            eu1 r0 = p000.ax1.f1360
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot modify a state object in a read-only snapshot"
            r0.<init>(r1)
            throw r0
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: φ */
    public final p000.tw1 mo2011(p000.a80 r7) {
            r6 = this;
            p000.ax1.m621(r6)
            v21 r0 = new v21
            long r1 = r6.f10483
            yw1 r3 = r6.f10482
            a80 r4 = r6.f8130
            r5 = 1
            a80 r4 = p000.ax1.m629(r7, r4, r5)
            r5 = r6
            r0.<init>(r1, r3, r4, r5)
            return r0
    }
}
