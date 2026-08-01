package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class tw1 {

    /* JADX INFO: renamed from: α */
    public p000.yw1 f10482;

    /* JADX INFO: renamed from: β */
    public long f10483;

    /* JADX INFO: renamed from: γ */
    public boolean f10484;

    /* JADX INFO: renamed from: δ */
    public int f10485;

    public tw1(long r8, p000.yw1 r10) {
            r7 = this;
            r7.<init>()
            r7.f10482 = r10
            r7.f10483 = r8
            eu1 r10 = p000.ax1.f1360
            r0 = 0
            int r10 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r10 == 0) goto L47
            yw1 r10 = r7.mo5758()
            long r2 = r10.f12864
            long[] r4 = r10.f12865
            if (r4 == 0) goto L1d
            r8 = 0
            r8 = r4[r8]
            goto L39
        L1d:
            long r4 = r10.f12863
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 == 0) goto L2a
            int r8 = java.lang.Long.numberOfTrailingZeros(r4)
        L27:
            long r8 = (long) r8
            long r8 = r8 + r2
            goto L39
        L2a:
            long r4 = r10.f12862
            int r10 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r10 == 0) goto L39
            r8 = 64
            long r8 = (long) r8
            long r2 = r2 + r8
            int r8 = java.lang.Long.numberOfTrailingZeros(r4)
            goto L27
        L39:
            java.lang.Object r10 = p000.ax1.f1362
            monitor-enter(r10)
            g11 r0 = p000.ax1.f1365     // Catch: java.lang.Throwable -> L44
            int r8 = r0.m2227(r8)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r10)
            goto L48
        L44:
            r7 = move-exception
            monitor-exit(r10)
            throw r7
        L47:
            r8 = -1
        L48:
            r7.f10485 = r8
            return
    }

    /* JADX INFO: renamed from: ρ */
    public static void m5756(p000.tw1 r1) {
            m6 r0 = p000.ax1.f1361
            r0.m3767(r1)
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m5757() {
            r1 = this;
            java.lang.Object r0 = p000.ax1.f1362
            monitor-enter(r0)
            r1.mo1999()     // Catch: java.lang.Throwable -> Lb
            r1.mo2009()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return
        Lb:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    /* JADX INFO: renamed from: β */
    public void mo1999() {
            r3 = this;
            yw1 r0 = p000.ax1.f1363
            long r1 = r3.mo5759()
            yw1 r3 = r0.m7045(r1)
            p000.ax1.f1363 = r3
            return
    }

    /* JADX INFO: renamed from: γ */
    public abstract void mo2000();

    /* JADX INFO: renamed from: δ */
    public p000.yw1 mo5758() {
            r0 = this;
            yw1 r0 = r0.f10482
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public abstract p000.a80 mo2001();

    /* JADX INFO: renamed from: ζ */
    public abstract boolean mo2002();

    /* JADX INFO: renamed from: η */
    public long mo5759() {
            r2 = this;
            long r0 = r2.f10483
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public int mo2003() {
            r0 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ι */
    public abstract p000.a80 mo2004();

    /* JADX INFO: renamed from: κ */
    public final p000.tw1 m5760() {
            r2 = this;
            m6 r0 = p000.ax1.f1361
            java.lang.Object r1 = r0.m3786()
            tw1 r1 = (p000.tw1) r1
            r0.m3767(r2)
            return r1
    }

    /* JADX INFO: renamed from: λ */
    public abstract void mo2005();

    /* JADX INFO: renamed from: μ */
    public abstract void mo2006();

    /* JADX INFO: renamed from: ν */
    public abstract void mo2007();

    /* JADX INFO: renamed from: ξ */
    public abstract void mo2008(p000.i02 r1);

    /* JADX INFO: renamed from: ο */
    public final void m5761() {
            r1 = this;
            int r0 = r1.f10485
            if (r0 < 0) goto La
            p000.ax1.m639(r0)
            r0 = -1
            r1.f10485 = r0
        La:
            return
    }

    /* JADX INFO: renamed from: π */
    public void mo2009() {
            r0 = this;
            r0.m5761()
            return
    }

    /* JADX INFO: renamed from: σ */
    public void mo5762(p000.yw1 r1) {
            r0 = this;
            r0.f10482 = r1
            return
    }

    /* JADX INFO: renamed from: τ */
    public void mo5763(long r1) {
            r0 = this;
            r0.f10483 = r1
            return
    }

    /* JADX INFO: renamed from: υ */
    public void mo2010(int r1) {
            r0 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Updating write count is not supported for this snapshot"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: φ */
    public abstract p000.tw1 mo2011(p000.a80 r1);
}
