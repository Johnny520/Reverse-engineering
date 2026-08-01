package p000;

/* JADX INFO: renamed from: ja */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0424ja extends p000.AbstractC1092 {

    /* JADX INFO: renamed from: θ */
    public final java.lang.Thread f5383;

    /* JADX INFO: renamed from: ι */
    public final p000.AbstractC0853tz f5384;

    public C0424ja(p000.InterfaceC0880up r2, java.lang.Thread r3, p000.AbstractC0853tz r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            r1.f5383 = r3
            r1.f5384 = r4
            return
    }

    @Override // p000.fo0
    /* JADX INFO: renamed from: ο */
    public final void mo2181(java.lang.Object r1) {
            r0 = this;
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.Thread r0 = r0.f5383
            boolean r1 = p000.ln0.m3626(r1, r0)
            if (r1 != 0) goto Lf
            java.util.concurrent.locks.LockSupport.unpark(r0)
        Lf:
            return
    }
}
