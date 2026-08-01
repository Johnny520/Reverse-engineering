package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class pq0 extends p000.xz1 {

    /* JADX INFO: renamed from: θ */
    public final p000.InterfaceC0631op f8661;

    public pq0(p000.InterfaceC0880up r2, p000.e80 r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            op r2 = p000.AbstractC0978xb.m6590(r1, r1, r3)
            r1.f8661 = r2
            return
    }

    @Override // p000.fo0
    /* JADX INFO: renamed from: Σ */
    public final void mo2174() {
            r2 = this;
            op r0 = r2.f8661
            op r0 = p000.AbstractC0978xb.m6563(r0)     // Catch: java.lang.Throwable -> Lc
            s62 r1 = p000.s62.f9751     // Catch: java.lang.Throwable -> Lc
            p000.jx0.m3033(r0, r1)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r2.mo75(r1)
            throw r0
    }
}
