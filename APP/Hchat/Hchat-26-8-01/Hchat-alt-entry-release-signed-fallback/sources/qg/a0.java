package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends vg.p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f11032k = null;
    private volatile /* synthetic */ int _decision$volatile;

    static {
            java.lang.Class<qg.a0> r0 = qg.a0.class
            java.lang.String r1 = "_decision$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            qg.a0.f11032k = r0
            return
    }

    @Override // vg.p, qg.y0
    public final void r(java.lang.Object r1) {
            r0 = this;
            r0.u(r1)
            return
    }

    @Override // vg.p, qg.y0
    public final void u(java.lang.Object r4) {
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = qg.a0.f11032k
            int r1 = r0.get(r3)
            if (r1 == 0) goto L1f
            r0 = 1
            if (r1 != r0) goto L19
            wf.c r0 = r3.f14355j
            wf.c r0 = fb.v0.x(r0)
            java.lang.Object r4 = qg.v.r(r4)
            vg.a.h(r4, r0)
            return
        L19:
            java.lang.String r4 = "Already resumed"
            j8.o.A(r4)
            return
        L1f:
            r1 = 2
            r2 = 0
            boolean r0 = r0.compareAndSet(r3, r2, r1)
            if (r0 == 0) goto L0
            return
    }
}
