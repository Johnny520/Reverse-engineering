package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends qg.u0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f11091l = null;
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p8.p f11092k;

    static {
            java.lang.Class<qg.q0> r0 = qg.q0.class
            java.lang.String r1 = "_invoked$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            qg.q0.f11091l = r0
            return
    }

    public q0(p8.p r1) {
            r0 = this;
            r0.<init>()
            r0.f11092k = r1
            r1 = 0
            r0._invoked$volatile = r1
            return
    }

    @Override // qg.u0
    public final boolean k() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // qg.u0
    public final void l(java.lang.Throwable r4) {
            r3 = this;
            r0 = 0
            r1 = 1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = qg.q0.f11091l
            boolean r0 = r2.compareAndSet(r3, r0, r1)
            if (r0 == 0) goto Lf
            p8.p r0 = r3.f11092k
            r0.invoke(r4)
        Lf:
            return
    }
}
