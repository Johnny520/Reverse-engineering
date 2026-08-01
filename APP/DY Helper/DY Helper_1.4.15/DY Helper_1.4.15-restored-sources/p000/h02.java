package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class h02 extends p000.k02 {

    /* JADX INFO: renamed from: γ */
    public p000.AbstractC1103 f4517;

    /* JADX INFO: renamed from: δ */
    public int f4518;

    /* JADX INFO: renamed from: ε */
    public int f4519;

    public h02(long r1, p000.AbstractC1103 r3) {
            r0 = this;
            r0.<init>(r1)
            r0.f4517 = r3
            return
    }

    @Override // p000.k02
    /* JADX INFO: renamed from: α */
    public final void mo1083(p000.k02 r3) {
            r2 = this;
            java.lang.Object r0 = p000.AbstractC0073bd.f1653
            monitor-enter(r0)
            r3.getClass()     // Catch: java.lang.Throwable -> L1c
            r1 = r3
            h02 r1 = (p000.h02) r1     // Catch: java.lang.Throwable -> L1c
            б r1 = r1.f4517     // Catch: java.lang.Throwable -> L1c
            r2.f4517 = r1     // Catch: java.lang.Throwable -> L1c
            r1 = r3
            h02 r1 = (p000.h02) r1     // Catch: java.lang.Throwable -> L1c
            int r1 = r1.f4518     // Catch: java.lang.Throwable -> L1c
            r2.f4518 = r1     // Catch: java.lang.Throwable -> L1c
            h02 r3 = (p000.h02) r3     // Catch: java.lang.Throwable -> L1c
            int r3 = r3.f4519     // Catch: java.lang.Throwable -> L1c
            r2.f4519 = r3     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return
        L1c:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    @Override // p000.k02
    /* JADX INFO: renamed from: β */
    public final p000.k02 mo1084(long r2) {
            r1 = this;
            h02 r0 = new h02
            б r1 = r1.f4517
            r0.<init>(r2, r1)
            return r0
    }
}
