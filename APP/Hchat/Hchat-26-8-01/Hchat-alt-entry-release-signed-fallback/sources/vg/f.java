package vg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends qg.b0 implements yf.d, wf.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f14329n = null;
    private volatile /* synthetic */ java.lang.Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qg.p f14330j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final yf.c f14331k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.lang.Object f14332l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.lang.Object f14333m;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_reusableCancellableContinuation$volatile"
            java.lang.Class<vg.f> r2 = vg.f.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            vg.f.f14329n = r0
            return
    }

    public f(qg.p r2, yf.c r3) {
            r1 = this;
            r0 = -1
            r1.<init>(r0)
            r1.f14330j = r2
            r1.f14331k = r3
            l3.q r2 = vg.a.f14318b
            r1.f14332l = r2
            wf.g r2 = r3.getContext()
            java.lang.Object r2 = vg.a.k(r2)
            r1.f14333m = r2
            return
    }

    @Override // qg.b0
    public final wf.c c() {
            r0 = this;
            return r0
    }

    @Override // qg.b0
    public final java.lang.Object g() {
            r2 = this;
            java.lang.Object r0 = r2.f14332l
            l3.q r1 = vg.a.f14318b
            r2.f14332l = r1
            return r0
    }

    @Override // yf.d
    public final yf.d getCallerFrame() {
            r1 = this;
            yf.c r0 = r1.f14331k
            return r0
    }

    @Override // wf.c
    public final wf.g getContext() {
            r1 = this;
            yf.c r0 = r1.f14331k
            wf.g r0 = r0.getContext()
            return r0
    }

    @Override // wf.c
    public final void resumeWith(java.lang.Object r9) {
            r8 = this;
            java.lang.Throwable r0 = sf.g.b(r9)
            r1 = 0
            if (r0 != 0) goto L9
            r2 = r9
            goto Le
        L9:
            qg.n r2 = new qg.n
            r2.<init>(r0, r1)
        Le:
            yf.c r0 = r8.f14331k
            wf.g r3 = r0.getContext()
            qg.p r4 = r8.f14330j
            boolean r3 = r4.x(r3)
            if (r3 == 0) goto L28
            r8.f14332l = r2
            r8.f11034i = r1
            wf.g r9 = r0.getContext()
            r4.w(r9, r8)
            return
        L28:
            qg.g0 r3 = qg.h1.a()
            long r4 = r3.f11052i
            r6 = 4294967296(0x100000000, double:2.121995791E-314)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L3f
            r8.f14332l = r2
            r8.f11034i = r1
            r3.A(r8)
            return
        L3f:
            r1 = 1
            r3.B(r1)
            wf.g r2 = r0.getContext()     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r4 = r8.f14333m     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r4 = vg.a.l(r2, r4)     // Catch: java.lang.Throwable -> L5d
            r0.resumeWith(r9)     // Catch: java.lang.Throwable -> L5f
            vg.a.g(r2, r4)     // Catch: java.lang.Throwable -> L5d
        L53:
            boolean r9 = r3.D()     // Catch: java.lang.Throwable -> L5d
            if (r9 != 0) goto L53
        L59:
            r3.z(r1)
            goto L68
        L5d:
            r9 = move-exception
            goto L64
        L5f:
            r9 = move-exception
            vg.a.g(r2, r4)     // Catch: java.lang.Throwable -> L5d
            throw r9     // Catch: java.lang.Throwable -> L5d
        L64:
            r8.f(r9)     // Catch: java.lang.Throwable -> L69
            goto L59
        L68:
            return
        L69:
            r9 = move-exception
            r3.z(r1)
            throw r9
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DispatchedContinuation["
            r0.<init>(r1)
            qg.p r1 = r2.f14330j
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            yf.c r1 = r2.f14331k
            java.lang.String r1 = qg.v.u(r1)
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
