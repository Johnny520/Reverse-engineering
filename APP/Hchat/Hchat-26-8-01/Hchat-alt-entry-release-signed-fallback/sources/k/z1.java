package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k.w1 f7121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7122b;

    public z1(k.w1 r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f7121a = r1
            r0.f7122b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof k.z1
            if (r0 != 0) goto L5
            goto L19
        L5:
            k.z1 r3 = (k.z1) r3
            k.w1 r0 = r3.f7121a
            k.w1 r1 = r2.f7121a
            boolean r0 = gg.l.a(r1, r0)
            if (r0 == 0) goto L19
            boolean r0 = r2.f7122b
            boolean r3 = r3.f7122b
            if (r0 != r3) goto L19
            r3 = 1
            return r3
        L19:
            r3 = 0
            return r3
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            k.u1 r0 = new k.u1
            r0.<init>()
            k.w1 r1 = r2.f7121a
            r0.f7081u = r1
            boolean r1 = r2.f7122b
            r0.f7082v = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r2) {
            r1 = this;
            k.u1 r2 = (k.u1) r2
            k.w1 r0 = r1.f7121a
            r2.f7081u = r0
            boolean r0 = r1.f7122b
            r2.f7082v = r0
            return
    }

    public final int hashCode() {
            r3 = this;
            k.w1 r0 = r3.f7121a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            int r0 = eh.a.h(r0, r1, r2)
            boolean r1 = r3.f7122b
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }
}
