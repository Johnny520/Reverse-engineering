package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 implements java.lang.Runnable, java.lang.Comparable, qg.d0 {
    private volatile java.lang.Object _heap;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f11063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11064h;

    public j0(long r1) {
            r0 = this;
            r0.<init>()
            r0.f11063g = r1
            r1 = -1
            r0.f11064h = r1
            return
    }

    @Override // qg.d0
    public final void a() {
            r5 = this;
            monitor-enter(r5)
            java.lang.Object r0 = r5._heap     // Catch: java.lang.Throwable -> L11
            l3.q r1 = qg.v.f11103b     // Catch: java.lang.Throwable -> L11
            if (r0 != r1) goto L9
            monitor-exit(r5)
            return
        L9:
            boolean r2 = r0 instanceof qg.k0     // Catch: java.lang.Throwable -> L11
            r3 = 0
            if (r2 == 0) goto L13
            qg.k0 r0 = (qg.k0) r0     // Catch: java.lang.Throwable -> L11
            goto L14
        L11:
            r0 = move-exception
            goto L31
        L13:
            r0 = r3
        L14:
            if (r0 == 0) goto L2d
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L11
            java.lang.Object r2 = r5._heap     // Catch: java.lang.Throwable -> L2a
            boolean r4 = r2 instanceof vg.u     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L20
            r3 = r2
            vg.u r3 = (vg.u) r3     // Catch: java.lang.Throwable -> L2a
        L20:
            if (r3 != 0) goto L23
            goto L28
        L23:
            int r2 = r5.f11064h     // Catch: java.lang.Throwable -> L2a
            r0.b(r2)     // Catch: java.lang.Throwable -> L2a
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            goto L2d
        L2a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1     // Catch: java.lang.Throwable -> L11
        L2d:
            r5._heap = r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r5)
            return
        L31:
            monitor-exit(r5)
            throw r0
    }

    public final int b(long r9, qg.k0 r11, qg.l0 r12) {
            r8 = this;
            monitor-enter(r8)
            java.lang.Object r0 = r8._heap     // Catch: java.lang.Throwable -> L25
            l3.q r1 = qg.v.f11103b     // Catch: java.lang.Throwable -> L25
            if (r0 != r1) goto La
            monitor-exit(r8)
            r9 = 2
            return r9
        La:
            monitor-enter(r11)     // Catch: java.lang.Throwable -> L25
            qg.j0[] r0 = r11.f14362a     // Catch: java.lang.Throwable -> L2e
            r1 = 0
            if (r0 == 0) goto L13
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L2e
            goto L14
        L13:
            r0 = 0
        L14:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = qg.l0.f11073o     // Catch: java.lang.Throwable -> L2e
            int r12 = r2.get(r12)     // Catch: java.lang.Throwable -> L2e
            r2 = 1
            if (r12 == 0) goto L1f
            r12 = r2
            goto L20
        L1f:
            r12 = r1
        L20:
            if (r12 == 0) goto L27
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r8)
            return r2
        L25:
            r9 = move-exception
            goto L57
        L27:
            r2 = 0
            if (r0 != 0) goto L30
            r11.f11067c = r9     // Catch: java.lang.Throwable -> L2e
            goto L44
        L2e:
            r9 = move-exception
            goto L55
        L30:
            long r4 = r0.f11063g     // Catch: java.lang.Throwable -> L2e
            long r6 = r4 - r9
            int r12 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r12 < 0) goto L39
            goto L3a
        L39:
            r9 = r4
        L3a:
            long r4 = r11.f11067c     // Catch: java.lang.Throwable -> L2e
            long r4 = r9 - r4
            int r12 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r12 <= 0) goto L44
            r11.f11067c = r9     // Catch: java.lang.Throwable -> L2e
        L44:
            long r9 = r8.f11063g     // Catch: java.lang.Throwable -> L2e
            long r4 = r11.f11067c     // Catch: java.lang.Throwable -> L2e
            long r9 = r9 - r4
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 >= 0) goto L4f
            r8.f11063g = r4     // Catch: java.lang.Throwable -> L2e
        L4f:
            r11.a(r8)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r8)
            return r1
        L55:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L25
            throw r9     // Catch: java.lang.Throwable -> L25
        L57:
            monitor-exit(r8)
            throw r9
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r5) {
            r4 = this;
            qg.j0 r5 = (qg.j0) r5
            long r0 = r4.f11063g
            long r2 = r5.f11063g
            long r0 = r0 - r2
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto Lf
            r5 = 1
            return r5
        Lf:
            if (r5 >= 0) goto L13
            r5 = -1
            return r5
        L13:
            r5 = 0
            return r5
    }

    public final void d(qg.k0 r3) {
            r2 = this;
            java.lang.Object r0 = r2._heap
            l3.q r1 = qg.v.f11103b
            if (r0 == r1) goto L9
            r2._heap = r3
            return
        L9:
            java.lang.String r3 = "Failed requirement."
            j8.o.t(r3)
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Delayed[nanos="
            r0.<init>(r1)
            long r1 = r3.f11063g
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
