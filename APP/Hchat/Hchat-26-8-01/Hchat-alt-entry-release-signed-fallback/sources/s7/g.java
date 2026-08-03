package s7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends s7.d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r7.a f12373o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12374p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f12375q;

    public g(r7.a r2, p7.i r3, o7.c r4, okio.a r5) {
            r1 = this;
            r7.f r0 = r3.f10294w
            r1.<init>(r0, r4)
            r1.f12373o = r2
            q9.a r2 = new q9.a
            r4 = 4
            r2.<init>(r1, r4)
            r3.f10296y = r2
            e9.a r2 = new e9.a
            r4 = 6
            r2.<init>(r5, r4, r3)
            r1.b0(r2)
            return
    }

    @Override // o7.b
    public final void L(int r2, k7.a r3) {
            r1 = this;
            r7.s r3 = (r7.s) r3
            java.lang.Class<u7.c> r0 = u7.c.class
            k7.a r0 = r1.v(r0)
            u7.c r0 = (u7.c) r0
            r0.Y(r2, r3)
            super.L(r2, r3)
            return
    }

    @Override // s7.d, o7.b
    public final void V() {
            r2 = this;
            o7.c r0 = r2.l0()
            z7.c r1 = r2.f9563k
            int r1 = r1.size()
            r0.c0(r1)
            boolean r0 = r2.f12375q
            if (r0 == 0) goto L14
            r2.m0()
        L14:
            return
    }

    @Override // o7.b
    public final void W(k7.a r9) {
            r8 = this;
            r7.s r9 = (r7.s) r9
            java.lang.Class<u7.c> r0 = u7.c.class
            k7.a r0 = r8.v(r0)
            u7.c r0 = (u7.c) r0
            boolean r1 = r0.f13534s
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L69
            f1.h r0 = r0.f13533r
            java.lang.String r1 = r9.Y()
            java.lang.Object r4 = r0.f3058i
            monitor-enter(r4)
            if (r1 != 0) goto L1f
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1d
            goto L69
        L1d:
            r9 = move-exception
            goto L67
        L1f:
            java.lang.Object r0 = r0.f3059j     // Catch: java.lang.Throwable -> L1d
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L27
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1d
            goto L69
        L27:
            java.lang.Object r5 = r0.get(r1)     // Catch: java.lang.Throwable -> L1d
            if (r5 != 0) goto L2f
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1d
            goto L69
        L2f:
            java.lang.Class r6 = r5.getClass()     // Catch: java.lang.Throwable -> L1d
            java.lang.Class<z7.o> r7 = z7.o.class
            if (r6 != r7) goto L5e
            z7.o r5 = (z7.o) r5     // Catch: java.lang.Throwable -> L1d
            int r6 = r5.f(r9, r3, r2)     // Catch: java.lang.Throwable -> L1d
            if (r6 >= 0) goto L41
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1d
            goto L69
        L41:
            r5.remove(r6)     // Catch: java.lang.Throwable -> L1d
            boolean r6 = r5.isEmpty()     // Catch: java.lang.Throwable -> L1d
            if (r6 == 0) goto L4e
            r0.remove(r1)     // Catch: java.lang.Throwable -> L1d
            goto L5c
        L4e:
            int r6 = r5.f22586i     // Catch: java.lang.Throwable -> L1d
            if (r6 != r3) goto L5c
            java.lang.Object[] r5 = r5.f22584g     // Catch: java.lang.Throwable -> L1d
            r5 = r5[r2]     // Catch: java.lang.Throwable -> L1d
            r0.remove(r1)     // Catch: java.lang.Throwable -> L1d
            r0.put(r1, r5)     // Catch: java.lang.Throwable -> L1d
        L5c:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1d
            goto L69
        L5e:
            if (r5 != r9) goto L65
            r0.remove(r1)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1d
            goto L69
        L65:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1d
            goto L69
        L67:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1d
            throw r9
        L69:
            r7.u r0 = r9.f11583q
            if (r0 == 0) goto L70
            r0.R()
        L70:
            r0 = 0
            r9.J(r0)
            r8.f12374p = r2
            r8.f12375q = r3
            return
    }

    @Override // s7.d, o7.b
    public final void Y(q7.b r1) {
            r0 = this;
            super.Y(r1)
            r1 = 0
            r0.f12374p = r1
            r0.f12375q = r1
            return
    }

    @Override // s7.d
    public final int j0() {
            r2 = this;
            int r0 = super.j0()
            r7.a r1 = r2.f12373o
            int r1 = r1.p()
            int r1 = r0 - r1
            r2.f12374p = r1
            return r0
    }

    @Override // s7.d
    public final r7.a k0() {
            r1 = this;
            r7.a r0 = r1.f12373o
            return r0
    }

    public final void m0() {
            r2 = this;
            r0 = 0
            r2.f12375q = r0
            super.e0()
            java.lang.Class<u7.c> r1 = u7.c.class
            k7.a r1 = r2.v(r1)
            u7.c r1 = (u7.c) r1
            if (r1 == 0) goto L13
            r1.Z()
        L13:
            r2.f12375q = r0
            return
    }

    @Override // o7.b, k7.a
    public final int p() {
            r2 = this;
            int r0 = r2.f12374p
            if (r0 != 0) goto L12
            z7.c r1 = r2.f9563k
            int r1 = r1.size()
            if (r1 == 0) goto L12
            int r0 = super.p()
            r2.f12374p = r0
        L12:
            return r0
    }

    @Override // o7.b, k7.a
    public final void z(f6.b r3) {
            r2 = this;
            boolean r0 = r3.f3306b
            if (r0 == 0) goto L5
            goto L23
        L5:
            java.lang.Object r0 = r3.f3308d
            k7.a r0 = (k7.a) r0
            if (r0 != r2) goto Lf
            r0 = 1
            r3.f3306b = r0
            return
        Lf:
            boolean r0 = r0 instanceof r7.s
            if (r0 != 0) goto L24
            int r0 = r2.p()
            boolean r1 = r3.f3306b
            if (r1 != 0) goto L23
            if (r0 != 0) goto L1e
            goto L23
        L1e:
            int r1 = r3.f3307c
            int r1 = r1 + r0
            r3.f3307c = r1
        L23:
            return
        L24:
            super.z(r3)
            return
    }
}
