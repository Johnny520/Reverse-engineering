package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class g02 extends p000.AbstractC1113 {

    /* JADX INFO: renamed from: α */
    public final java.util.concurrent.atomic.AtomicReference f4184;

    public g02() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            r0.<init>(r1)
            r2.f4184 = r0
            return
    }

    @Override // p000.AbstractC1113
    /* JADX INFO: renamed from: α */
    public final boolean mo616(p000.AbstractC1112 r1) {
            r0 = this;
            f02 r1 = (p000.f02) r1
            java.util.concurrent.atomic.AtomicReference r0 = r0.f4184
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto Lc
            r0 = 0
            return r0
        Lc:
            uy r1 = p000.ln0.f6722
            r0.set(r1)
            r0 = 1
            return r0
    }

    @Override // p000.AbstractC1113
    /* JADX INFO: renamed from: β */
    public final p000.InterfaceC0631op[] mo617(p000.AbstractC1112 r1) {
            r0 = this;
            f02 r1 = (p000.f02) r1
            java.util.concurrent.atomic.AtomicReference r0 = r0.f4184
            r1 = 0
            r0.set(r1)
            op[] r0 = p000.AbstractC0978xb.f12098
            return r0
    }
}
