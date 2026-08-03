package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements p.r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f9863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0.j1 f9864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0.j1 f9865d;

    public b(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f9862a = r1
            r0.f9863b = r2
            b3.a r1 = b3.a.f444e
            i0.j1 r1 = i0.r.u(r1)
            r0.f9864c = r1
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            i0.j1 r1 = i0.r.u(r1)
            r0.f9865d = r1
            return
    }

    @Override // p.r1
    public final int a(u2.c r1, u2.m r2) {
            r0 = this;
            b3.a r1 = r0.e()
            int r1 = r1.f447c
            return r1
    }

    @Override // p.r1
    public final int b(u2.c r1) {
            r0 = this;
            b3.a r1 = r0.e()
            int r1 = r1.f448d
            return r1
    }

    @Override // p.r1
    public final int c(u2.c r1, u2.m r2) {
            r0 = this;
            b3.a r1 = r0.e()
            int r1 = r1.f445a
            return r1
    }

    @Override // p.r1
    public final int d(u2.c r1) {
            r0 = this;
            b3.a r1 = r0.e()
            int r1 = r1.f446b
            return r1
    }

    public final b3.a e() {
            r1 = this;
            i0.j1 r0 = r1.f9864c
            java.lang.Object r0 = r0.getValue()
            b3.a r0 = (b3.a) r0
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L10
        L3:
            boolean r0 = r2 instanceof p.b
            if (r0 != 0) goto L8
            goto L12
        L8:
            p.b r2 = (p.b) r2
            int r2 = r2.f9862a
            int r0 = r1.f9862a
            if (r0 != r2) goto L12
        L10:
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public final void f(boolean r2) {
            r1 = this;
            i0.j1 r0 = r1.f9865d
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.setValue(r2)
            return
    }

    public final void g(g3.r0 r3, int r4) {
            r2 = this;
            int r0 = r2.f9862a
            if (r4 == 0) goto L9
            r4 = r4 & r0
            if (r4 == 0) goto L8
            goto L9
        L8:
            return
        L9:
            g3.n0 r4 = r3.f4230a
            b3.a r4 = r4.g(r0)
            i0.j1 r1 = r2.f9864c
            r1.setValue(r4)
            g3.n0 r3 = r3.f4230a
            boolean r3 = r3.q(r0)
            r2.f(r3)
            return
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f9862a
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.f9863b
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            b3.a r1 = r3.e()
            int r1 = r1.f445a
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            b3.a r2 = r3.e()
            int r2 = r2.f446b
            r0.append(r2)
            r0.append(r1)
            b3.a r2 = r3.e()
            int r2 = r2.f447c
            r0.append(r2)
            r0.append(r1)
            b3.a r1 = r3.e()
            int r1 = r1.f448d
            r2 = 41
            java.lang.String r0 = p.a.n(r0, r1, r2)
            return r0
    }
}
