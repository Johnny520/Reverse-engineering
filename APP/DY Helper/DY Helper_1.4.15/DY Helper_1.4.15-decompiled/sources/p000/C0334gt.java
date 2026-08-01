package p000;

/* JADX INFO: renamed from: gt */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0334gt extends p000.AbstractC0444jt implements p000.InterfaceC0220dq, p000.InterfaceC0631op {

    /* JADX INFO: renamed from: μ */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f4444 = null;
    private volatile /* synthetic */ java.lang.Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: θ */
    public final kotlinx.coroutines.AbstractC0479 f4445;

    /* JADX INFO: renamed from: ι */
    public final p000.AbstractC0695pp f4446;

    /* JADX INFO: renamed from: κ */
    public java.lang.Object f4447;

    /* JADX INFO: renamed from: λ */
    public final java.lang.Object f4448;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_reusableCancellableContinuation$volatile"
            java.lang.Class<gt> r2 = p000.C0334gt.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            p000.C0334gt.f4444 = r0
            return
    }

    public C0334gt(kotlinx.coroutines.AbstractC0479 r2, p000.AbstractC0695pp r3) {
            r1 = this;
            r0 = -1
            r1.<init>(r0)
            r1.f4445 = r2
            r1.f4446 = r3
            uy r2 = p000.jx0.f5621
            r1.f4447 = r2
            up r2 = r3.mo72()
            java.lang.Object r2 = p000.pd2.m4478(r2)
            r1.f4448 = r2
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DispatchedContinuation["
            r0.<init>(r1)
            kotlinx.coroutines.α r1 = r2.f4445
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            pp r2 = r2.f4446
            java.lang.String r2 = p000.AbstractC1021yh.m6918(r2)
            r0.append(r2)
            r2 = 93
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.InterfaceC0220dq
    /* JADX INFO: renamed from: β */
    public final p000.InterfaceC0220dq mo71() {
            r0 = this;
            pp r0 = r0.f4446
            return r0
    }

    @Override // p000.InterfaceC0631op
    /* JADX INFO: renamed from: γ */
    public final p000.InterfaceC0880up mo72() {
            r0 = this;
            pp r0 = r0.f4446
            up r0 = r0.mo72()
            return r0
    }

    @Override // p000.AbstractC0444jt
    /* JADX INFO: renamed from: ε */
    public final p000.InterfaceC0631op mo74() {
            r0 = this;
            return r0
    }

    @Override // p000.InterfaceC0631op
    /* JADX INFO: renamed from: ζ */
    public final void mo75(java.lang.Object r9) {
            r8 = this;
            java.lang.Throwable r0 = p000.fo1.m2190(r9)
            r1 = 0
            if (r0 != 0) goto L9
            r2 = r9
            goto Le
        L9:
            om r2 = new om
            r2.<init>(r0, r1)
        Le:
            pp r0 = r8.f4446
            up r3 = r0.mo72()
            kotlinx.coroutines.α r4 = r8.f4445
            boolean r3 = r4.mo3392(r3)
            if (r3 == 0) goto L28
            r8.f4447 = r2
            r8.f5573 = r1
            up r9 = r0.mo72()
            r4.mo1950(r9, r8)
            return
        L28:
            tz r3 = p000.d42.m1648()
            long r4 = r3.f10513
            r6 = 4294967296(0x100000000, double:2.121995791E-314)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L3f
            r8.f4447 = r2
            r8.f5573 = r1
            r3.m5765(r8)
            return
        L3f:
            r1 = 1
            r3.m5766(r1)
            up r2 = r0.mo72()     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r4 = r8.f4448     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r4 = p000.pd2.m4504(r2, r4)     // Catch: java.lang.Throwable -> L5d
            r0.mo75(r9)     // Catch: java.lang.Throwable -> L5f
            p000.pd2.m4470(r2, r4)     // Catch: java.lang.Throwable -> L5d
        L53:
            boolean r9 = r3.m5767()     // Catch: java.lang.Throwable -> L5d
            if (r9 != 0) goto L53
        L59:
            r3.m5764(r1)
            goto L68
        L5d:
            r9 = move-exception
            goto L64
        L5f:
            r9 = move-exception
            p000.pd2.m4470(r2, r4)     // Catch: java.lang.Throwable -> L5d
            throw r9     // Catch: java.lang.Throwable -> L5d
        L64:
            r8.m2987(r9)     // Catch: java.lang.Throwable -> L69
            goto L59
        L68:
            return
        L69:
            r8 = move-exception
            r3.m5764(r1)
            throw r8
    }

    @Override // p000.AbstractC0444jt
    /* JADX INFO: renamed from: λ */
    public final java.lang.Object mo79() {
            r2 = this;
            java.lang.Object r0 = r2.f4447
            uy r1 = p000.jx0.f5621
            r2.f4447 = r1
            return r0
    }
}
