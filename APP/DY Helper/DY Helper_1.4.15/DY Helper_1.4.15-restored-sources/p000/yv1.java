package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class yv1 implements p000.InterfaceC0922vt {

    /* JADX INFO: renamed from: ε */
    public final p000.k12 f12839;

    /* JADX INFO: renamed from: ζ */
    public final long f12840;

    /* JADX INFO: renamed from: η */
    public final java.lang.Object f12841;

    /* JADX INFO: renamed from: θ */
    public final p000.C0015ae f12842;

    public yv1(p000.k12 r1, long r2, java.lang.Object r4, p000.C0015ae r5) {
            r0 = this;
            r0.<init>()
            r0.f12839 = r1
            r0.f12840 = r2
            r0.f12841 = r4
            r0.f12842 = r5
            return
    }

    @Override // p000.InterfaceC0922vt
    /* JADX INFO: renamed from: α */
    public final void mo1276() {
            r6 = this;
            k12 r0 = r6.f12839
            monitor-enter(r0)
            long r1 = r6.f12840     // Catch: java.lang.Throwable -> L2b
            long r3 = r0.m3114()     // Catch: java.lang.Throwable -> L2b
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto Lf
            monitor-exit(r0)
            return
        Lf:
            java.lang.Object[] r1 = r0.f5706     // Catch: java.lang.Throwable -> L2b
            r1.getClass()     // Catch: java.lang.Throwable -> L2b
            long r2 = r6.f12840     // Catch: java.lang.Throwable -> L2b
            int r4 = (int) r2     // Catch: java.lang.Throwable -> L2b
            int r5 = r1.length     // Catch: java.lang.Throwable -> L2b
            int r5 = r5 + (-1)
            r4 = r4 & r5
            r4 = r1[r4]     // Catch: java.lang.Throwable -> L2b
            if (r4 == r6) goto L21
            monitor-exit(r0)
            return
        L21:
            uy r6 = p000.pd2.f8524     // Catch: java.lang.Throwable -> L2b
            p000.pd2.m4480(r1, r2, r6)     // Catch: java.lang.Throwable -> L2b
            r0.m3110()     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r0)
            return
        L2b:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
    }
}
