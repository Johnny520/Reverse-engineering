package vg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends qg.p implements qg.y {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f14334n = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ qg.y f14335i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qg.p f14336j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f14337k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final vg.j f14338l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.lang.Object f14339m;
    private volatile /* synthetic */ int runningWorkers$volatile;

    static {
            java.lang.Class<vg.g> r0 = vg.g.class
            java.lang.String r1 = "runningWorkers$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            vg.g.f14334n = r0
            return
    }

    public g(qg.p r2, int r3) {
            r1 = this;
            r1.<init>()
            boolean r0 = r2 instanceof qg.y
            if (r0 == 0) goto Lb
            r0 = r2
            qg.y r0 = (qg.y) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto L10
            qg.y r0 = qg.x.f11119a
        L10:
            r1.f14335i = r0
            r1.f14336j = r2
            r1.f14337k = r3
            vg.j r2 = new vg.j
            r2.<init>()
            r1.f14338l = r2
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.f14339m = r2
            return
    }

    @Override // qg.y
    public final qg.d0 q(long r2, qg.j1 r4, wf.g r5) {
            r1 = this;
            qg.y r0 = r1.f14335i
            qg.d0 r2 = r0.q(r2, r4, r5)
            return r2
    }

    @Override // qg.p
    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            qg.p r1 = r3.f14336j
            r0.append(r1)
            java.lang.String r1 = ".limitedParallelism("
            r0.append(r1)
            int r1 = r3.f14337k
            r2 = 41
            java.lang.String r0 = p.a.n(r0, r1, r2)
            return r0
    }

    @Override // qg.y
    public final void u(long r2, qg.g r4) {
            r1 = this;
            qg.y r0 = r1.f14335i
            r0.u(r2, r4)
            return
    }

    @Override // qg.p
    public final void w(wf.g r3, java.lang.Runnable r4) {
            r2 = this;
            vg.j r3 = r2.f14338l
            r3.a(r4)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = vg.g.f14334n
            int r3 = r3.get(r2)
            int r4 = r2.f14337k
            if (r3 >= r4) goto L3b
            java.lang.Object r3 = r2.f14339m
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = vg.g.f14334n     // Catch: java.lang.Throwable -> L38
            int r0 = r4.get(r2)     // Catch: java.lang.Throwable -> L38
            int r1 = r2.f14337k     // Catch: java.lang.Throwable -> L38
            if (r0 < r1) goto L1f
            monitor-exit(r3)
            r3 = 0
            goto L24
        L1f:
            r4.incrementAndGet(r2)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            r3 = 1
        L24:
            if (r3 == 0) goto L3b
            java.lang.Runnable r3 = r2.z()
            if (r3 != 0) goto L2d
            goto L3b
        L2d:
            rg.d r4 = new rg.d
            r4.<init>(r2, r3)
            qg.p r3 = r2.f14336j
            r3.w(r2, r4)
            return
        L38:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L3b:
            return
    }

    public final java.lang.Runnable z() {
            r3 = this;
        L0:
            vg.j r0 = r3.f14338l
            java.lang.Object r0 = r0.d()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 != 0) goto L25
            java.lang.Object r0 = r3.f14339m
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = vg.g.f14334n     // Catch: java.lang.Throwable -> L22
            r1.decrementAndGet(r3)     // Catch: java.lang.Throwable -> L22
            vg.j r2 = r3.f14338l     // Catch: java.lang.Throwable -> L22
            int r2 = r2.c()     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L1d
            monitor-exit(r0)
            r0 = 0
            return r0
        L1d:
            r1.incrementAndGet(r3)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)
            goto L0
        L22:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L25:
            return r0
    }
}
