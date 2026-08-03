package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l0 extends r4.a0 implements java.lang.Comparable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f11443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r4.k0 f11445i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11446j;

    public l0(int r2, int r3) {
            r1 = this;
            r1.<init>()
            if (r2 <= 0) goto L1e
            int r0 = r2 + (-1)
            r0 = r0 & r2
            if (r0 != 0) goto L1e
            r0 = -1
            if (r3 < r0) goto L17
            r1.f11443g = r2
            r1.f11444h = r3
            r2 = 0
            r1.f11445i = r2
            r1.f11446j = r0
            return
        L17:
            java.lang.String r2 = "writeSize < -1"
            j8.o.t(r2)
            r2 = 0
            throw r2
        L1e:
            java.lang.String r2 = "invalid alignment"
            j8.o.t(r2)
            r2 = 0
            throw r2
    }

    @Override // r4.a0
    public final int c() {
            r1 = this;
            int r0 = r1.f11444h
            if (r0 < 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "writeSize is unknown"
            j8.o.w(r0)
            r0 = 0
            return r0
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r3) {
            r2 = this;
            r4.l0 r3 = (r4.l0) r3
            if (r2 != r3) goto L6
            r3 = 0
            return r3
        L6:
            r4.b0 r0 = r2.b()
            r4.b0 r1 = r3.b()
            if (r0 == r1) goto L15
            int r3 = r0.compareTo(r1)
            return r3
        L15:
            int r3 = r2.e(r3)
            return r3
    }

    @Override // r4.a0
    public final void d(r4.p r4, z4.d r5) {
            r3 = this;
            int r0 = r3.f11443g
            r5.a(r0)
            int r0 = r3.f11444h     // Catch: java.lang.RuntimeException -> L34
            if (r0 < 0) goto L36
            int r0 = r3.f()     // Catch: java.lang.RuntimeException -> L34
            int r1 = r5.f22538c     // Catch: java.lang.RuntimeException -> L34
            if (r1 != r0) goto L15
            r3.m(r4, r5)
            return
        L15:
            f4.a r4 = new f4.a     // Catch: java.lang.RuntimeException -> L34
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L34
            java.lang.String r2 = "expected cursor "
            r1.<init>(r2)     // Catch: java.lang.RuntimeException -> L34
            r1.append(r0)     // Catch: java.lang.RuntimeException -> L34
            java.lang.String r0 = "; actual value: "
            r1.append(r0)     // Catch: java.lang.RuntimeException -> L34
            int r5 = r5.f22538c     // Catch: java.lang.RuntimeException -> L34
            r1.append(r5)     // Catch: java.lang.RuntimeException -> L34
            java.lang.String r5 = r1.toString()     // Catch: java.lang.RuntimeException -> L34
            r0 = 0
            r4.<init>(r5, r0)     // Catch: java.lang.RuntimeException -> L34
            throw r4     // Catch: java.lang.RuntimeException -> L34
        L34:
            r4 = move-exception
            goto L3e
        L36:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException     // Catch: java.lang.RuntimeException -> L34
            java.lang.String r5 = "writeSize is unknown"
            r4.<init>(r5)     // Catch: java.lang.RuntimeException -> L34
            throw r4     // Catch: java.lang.RuntimeException -> L34
        L3e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "...while writing "
            r5.<init>(r0)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            f4.a r4 = f4.a.b(r5, r4)
            throw r4
    }

    public int e(r4.l0 r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "unsupported"
            r2.<init>(r0)
            throw r2
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r4.l0 r5 = (r4.l0) r5
            r4.b0 r1 = r4.b()
            r4.b0 r2 = r5.b()
            r3 = 0
            if (r1 == r2) goto L12
            return r3
        L12:
            int r5 = r4.e(r5)
            if (r5 != 0) goto L19
            return r0
        L19:
            return r3
    }

    public final int f() {
            r2 = this;
            int r0 = r2.f11446j
            if (r0 < 0) goto L1e
            r4.k0 r1 = r2.f11445i
            if (r0 < 0) goto L15
            int r1 = r1.f11474d
            if (r1 < 0) goto Le
            int r1 = r1 + r0
            return r1
        Le:
            java.lang.String r0 = "fileOffset not yet set"
            bsh.j.g(r0)
        L13:
            r0 = 0
            return r0
        L15:
            r1.getClass()
            java.lang.String r0 = "relative < 0"
            j8.o.t(r0)
            goto L13
        L1e:
            java.lang.String r0 = "offset not yet known"
            bsh.j.g(r0)
            goto L13
    }

    public final java.lang.String g() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            int r1 = r2.f()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final int i(r4.k0 r2, int r3) {
            r1 = this;
            if (r3 < 0) goto L1c
            r4.k0 r0 = r1.f11445i
            if (r0 != 0) goto L15
            int r0 = r1.f11443g
            int r0 = r0 + (-1)
            int r3 = r3 + r0
            int r0 = ~r0
            r3 = r3 & r0
            r1.f11445i = r2
            r1.f11446j = r3
            r1.j(r2, r3)
            return r3
        L15:
            java.lang.String r2 = "already written"
            bsh.j.g(r2)
        L1a:
            r2 = 0
            return r2
        L1c:
            java.lang.String r2 = "offset < 0"
            j8.o.t(r2)
            goto L1a
    }

    public void j(r4.k0 r1, int r2) {
            r0 = this;
            return
    }

    public final void k(int r2) {
            r1 = this;
            if (r2 < 0) goto Lf
            int r0 = r1.f11444h
            if (r0 >= 0) goto L9
            r1.f11444h = r2
            return
        L9:
            java.lang.String r2 = "writeSize already set"
            j8.o.w(r2)
            return
        Lf:
            java.lang.String r2 = "writeSize < 0"
            j8.o.t(r2)
            return
    }

    public abstract java.lang.String l();

    public abstract void m(r4.p r1, z4.d r2);
}
