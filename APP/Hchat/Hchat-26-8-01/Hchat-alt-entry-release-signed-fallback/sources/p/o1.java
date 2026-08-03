package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements p.r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f9964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0.j1 f9965b;

    public o1(p.k0 r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f9964a = r2
            i0.j1 r1 = i0.r.u(r1)
            r0.f9965b = r1
            return
    }

    @Override // p.r1
    public final int a(u2.c r1, u2.m r2) {
            r0 = this;
            p.k0 r1 = r0.e()
            int r1 = r1.f9937c
            return r1
    }

    @Override // p.r1
    public final int b(u2.c r1) {
            r0 = this;
            p.k0 r1 = r0.e()
            int r1 = r1.f9938d
            return r1
    }

    @Override // p.r1
    public final int c(u2.c r1, u2.m r2) {
            r0 = this;
            p.k0 r1 = r0.e()
            int r1 = r1.f9935a
            return r1
    }

    @Override // p.r1
    public final int d(u2.c r1) {
            r0 = this;
            p.k0 r1 = r0.e()
            int r1 = r1.f9936b
            return r1
    }

    public final p.k0 e() {
            r1 = this;
            i0.j1 r0 = r1.f9965b
            java.lang.Object r0 = r0.getValue()
            p.k0 r0 = (p.k0) r0
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p.o1
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            p.k0 r0 = r1.e()
            p.o1 r2 = (p.o1) r2
            p.k0 r2 = r2.e()
            boolean r2 = gg.l.a(r0, r2)
            return r2
    }

    public final void f(p.k0 r2) {
            r1 = this;
            i0.j1 r0 = r1.f9965b
            r0.setValue(r2)
            return
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f9964a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.f9964a
            r0.append(r1)
            java.lang.String r1 = "(left="
            r0.append(r1)
            p.k0 r1 = r3.e()
            int r1 = r1.f9935a
            r0.append(r1)
            java.lang.String r1 = ", top="
            r0.append(r1)
            p.k0 r1 = r3.e()
            int r1 = r1.f9936b
            r0.append(r1)
            java.lang.String r1 = ", right="
            r0.append(r1)
            p.k0 r1 = r3.e()
            int r1 = r1.f9937c
            r0.append(r1)
            java.lang.String r1 = ", bottom="
            r0.append(r1)
            p.k0 r1 = r3.e()
            int r1 = r1.f9938d
            r2 = 41
            java.lang.String r0 = p.a.n(r0, r1, r2)
            return r0
    }
}
