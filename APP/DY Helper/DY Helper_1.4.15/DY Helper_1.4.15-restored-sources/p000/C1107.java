package p000;

/* JADX INFO: renamed from: е */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1107 extends p000.h62 {

    /* JADX INFO: renamed from: θ */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f13430;

    /* JADX INFO: renamed from: ι */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f13431;

    /* JADX INFO: renamed from: κ */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f13432;

    public C1107(java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3) {
            r0 = this;
            r0.<init>()
            r0.f13430 = r1
            r0.f13431 = r2
            r0.f13432 = r3
            return
    }

    @Override // p000.h62
    /* JADX INFO: renamed from: φ */
    public final boolean mo2452(p000.AbstractC1110 r3, p000.C1106 r4) {
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = r2.f13431
            д r1 = p000.C1106.f13428
            boolean r1 = r0.compareAndSet(r3, r4, r1)
            if (r1 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            java.lang.Object r0 = r0.get(r3)
            if (r0 == r4) goto L0
            r2 = 0
            return r2
    }

    @Override // p000.h62
    /* JADX INFO: renamed from: χ */
    public final boolean mo2453(p000.AbstractC1110 r3, java.lang.Object r4) {
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = r2.f13432
            r1 = 0
            boolean r1 = r0.compareAndSet(r3, r1, r4)
            if (r1 == 0) goto Lb
            r2 = 1
            return r2
        Lb:
            java.lang.Object r0 = r0.get(r3)
            if (r0 == 0) goto L0
            r2 = 0
            return r2
    }

    @Override // p000.h62
    /* JADX INFO: renamed from: ψ */
    public final boolean mo2454(p000.AbstractC1110 r3, p000.C1109 r4) {
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = r2.f13430
            з r1 = p000.C1109.f13433
            boolean r1 = r0.compareAndSet(r3, r4, r1)
            if (r1 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            java.lang.Object r0 = r0.get(r3)
            if (r0 == r4) goto L0
            r2 = 0
            return r2
    }
}
