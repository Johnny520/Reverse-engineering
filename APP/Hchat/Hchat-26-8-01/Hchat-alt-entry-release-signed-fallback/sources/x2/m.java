package x2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class m extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1.b0 f21163a;

    public m(s1.b0 r1) {
            r0 = this;
            r0.<init>()
            r0.f21163a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 == r2) goto L11
            boolean r0 = r2 instanceof x2.m
            if (r0 == 0) goto Lf
            x2.m r2 = (x2.m) r2
            s1.b0 r2 = r2.f21163a
            s1.b0 r0 = r1.f21163a
            if (r0 != r2) goto Lf
            goto L11
        Lf:
            r2 = 0
            return r2
        L11:
            r2 = 1
            return r2
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            x2.n r0 = new x2.n
            s1.b0 r1 = r2.f21163a
            r0.<init>(r1)
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r3) {
            r2 = this;
            x2.n r3 = (x2.n) r3
            s1.b0 r0 = r2.f21163a
            r3.f21164u = r0
            boolean r1 = r3.f21832t
            if (r1 == 0) goto Lf
            b1.f r3 = r3.f21165v
            r0.invoke(r3)
        Lf:
            return
    }

    public final int hashCode() {
            r1 = this;
            s1.b0 r0 = r1.f21163a
            int r0 = r0.hashCode()
            return r0
    }
}
