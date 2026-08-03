package wf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements wf.c, yf.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f20787h = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wf.c f20788g;
    private volatile java.lang.Object result;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "result"
            java.lang.Class<wf.i> r2 = wf.i.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            wf.i.f20787h = r0
            return
    }

    public i(wf.c r2) {
            r1 = this;
            xf.a r0 = xf.a.f21579g
            r1.<init>()
            r1.f20788g = r2
            r1.result = r0
            return
    }

    @Override // yf.d
    public final yf.d getCallerFrame() {
            r2 = this;
            wf.c r0 = r2.f20788g
            boolean r1 = r0 instanceof yf.d
            if (r1 == 0) goto L9
            yf.d r0 = (yf.d) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // wf.c
    public final wf.g getContext() {
            r1 = this;
            wf.c r0 = r1.f20788g
            wf.g r0 = r0.getContext()
            return r0
    }

    @Override // wf.c
    public final void resumeWith(java.lang.Object r5) {
            r4 = this;
        L0:
            java.lang.Object r0 = r4.result
            xf.a r1 = xf.a.f21580h
            if (r0 != r1) goto L16
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = wf.i.f20787h
        L8:
            boolean r0 = r2.compareAndSet(r4, r1, r5)
            if (r0 == 0) goto Lf
            return
        Lf:
            java.lang.Object r0 = r2.get(r4)
            if (r0 == r1) goto L8
            goto L0
        L16:
            xf.a r1 = xf.a.f21579g
            if (r0 != r1) goto L31
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = wf.i.f20787h
            xf.a r2 = xf.a.f21581i
        L1e:
            boolean r3 = r0.compareAndSet(r4, r1, r2)
            if (r3 == 0) goto L2a
            wf.c r0 = r4.f20788g
            r0.resumeWith(r5)
            return
        L2a:
            java.lang.Object r3 = r0.get(r4)
            if (r3 == r1) goto L1e
            goto L0
        L31:
            java.lang.String r5 = "Already resumed"
            j8.o.A(r5)
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SafeContinuation for "
            r0.<init>(r1)
            wf.c r1 = r2.f20788g
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
