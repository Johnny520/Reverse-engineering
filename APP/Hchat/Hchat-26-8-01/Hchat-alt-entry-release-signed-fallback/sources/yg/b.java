package yg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends yg.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f22442g = null;
    private volatile /* synthetic */ java.lang.Object owner$volatile;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "owner$volatile"
            java.lang.Class<yg.b> r2 = yg.b.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            yg.b.f22442g = r0
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            l3.q r0 = yg.c.f22443a
            r1.owner$volatile = r0
            return
    }

    public final boolean c() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = yg.f.f22450f
            int r0 = r0.get(r2)
            r1 = 0
            int r0 = java.lang.Math.max(r0, r1)
            if (r0 != 0) goto Lf
            r0 = 1
            return r0
        Lf:
            return r1
    }

    public final java.lang.Object d(yf.c r3) {
            r2 = this;
            boolean r0 = r2.e()
            sf.n r1 = sf.n.f12433a
            if (r0 == 0) goto L9
            goto L26
        L9:
            wf.c r3 = fb.v0.x(r3)
            qg.g r3 = qg.v.l(r3)
            yg.a r0 = new yg.a     // Catch: java.lang.Throwable -> L27
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L27
            r2.a(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.Object r3 = r3.o()
            xf.a r0 = xf.a.f21579g
            if (r3 != r0) goto L22
            goto L23
        L22:
            r3 = r1
        L23:
            if (r3 != r0) goto L26
            return r3
        L26:
            return r1
        L27:
            r0 = move-exception
            r3.x()
            throw r0
    }

    public final boolean e() {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = yg.f.f22450f
            int r1 = r0.get(r4)
            r2 = 1
            if (r1 <= r2) goto L16
        L9:
            int r1 = r0.get(r4)
            if (r1 <= r2) goto L0
            boolean r1 = r0.compareAndSet(r4, r1, r2)
            if (r1 == 0) goto L9
            goto L0
        L16:
            if (r1 > 0) goto L1a
            r0 = 0
            return r0
        L1a:
            int r3 = r1 + (-1)
            boolean r0 = r0.compareAndSet(r4, r1, r3)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = yg.b.f22442g
            r1 = 0
            r0.set(r4, r1)
            return r2
    }

    public final void f(java.lang.Object r5) {
            r4 = this;
        L0:
            boolean r0 = r4.c()
            if (r0 == 0) goto L4b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = yg.b.f22442g
            java.lang.Object r1 = r0.get(r4)
            l3.q r2 = yg.c.f22443a
            if (r1 == r2) goto L0
            if (r1 == r5) goto L3a
            if (r5 != 0) goto L15
            goto L3a
        L15:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "This mutex is locked by "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r1 = ", but "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = " is expected"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        L3a:
            boolean r3 = r0.compareAndSet(r4, r1, r2)
            if (r3 == 0) goto L44
            r4.b()
            return
        L44:
            java.lang.Object r3 = r0.get(r4)
            if (r3 == r1) goto L3a
            goto L0
        L4b:
            java.lang.String r5 = "This mutex is not locked"
            j8.o.A(r5)
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Mutex@"
            r0.<init>(r1)
            java.lang.String r1 = qg.v.j(r2)
            r0.append(r1)
            java.lang.String r1 = "[isLocked="
            r0.append(r1)
            boolean r1 = r2.c()
            r0.append(r1)
            java.lang.String r1 = ",owner="
            r0.append(r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = yg.b.f22442g
            java.lang.Object r1 = r1.get(r2)
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
