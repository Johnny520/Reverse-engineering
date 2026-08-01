package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class sa0 extends p000.f21 {
    @Override // p000.f21
    /* JADX INFO: renamed from: Ε */
    public final p000.f21 mo1998(p000.a80 r2, p000.a80 r3) {
            r1 = this;
            xv r1 = new xv
            r0 = 1
            r1.<init>(r2, r0, r3)
            xj0 r2 = new xj0
            r3 = 9
            r2.<init>(r1, r3)
            java.lang.Object r1 = p000.ax1.m623(r2)
            tw1 r1 = (p000.tw1) r1
            f21 r1 = (p000.f21) r1
            return r1
    }

    @Override // p000.f21, p000.tw1
    /* JADX INFO: renamed from: γ */
    public final void mo2000() {
            r1 = this;
            java.lang.Object r0 = p000.ax1.f1362
            monitor-enter(r0)
            r1.m5761()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
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
            p000.ax1.m619()
            return
    }

    @Override // p000.f21, p000.tw1
    /* JADX INFO: renamed from: φ */
    public final p000.tw1 mo2011(p000.a80 r2) {
            r1 = this;
            oc r1 = new oc
            r0 = 1
            r1.<init>(r0, r2)
            xj0 r2 = new xj0
            r0 = 9
            r2.<init>(r1, r0)
            java.lang.Object r1 = p000.ax1.m623(r2)
            tw1 r1 = (p000.tw1) r1
            ok1 r1 = (p000.ok1) r1
            return r1
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: ψ */
    public final p000.g81 mo2013() {
            r1 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot"
            r1.<init>(r0)
            throw r1
    }
}
