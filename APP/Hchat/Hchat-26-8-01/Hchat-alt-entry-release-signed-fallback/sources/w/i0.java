package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class i0 extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2.n0 f14491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14493c;

    public i0(i2.n0 r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f14491a = r1
            r0.f14492b = r2
            r0.f14493c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L24
        L3:
            boolean r0 = r3 instanceof w.i0
            if (r0 != 0) goto L8
            goto L22
        L8:
            w.i0 r3 = (w.i0) r3
            i2.n0 r0 = r3.f14491a
            i2.n0 r1 = r2.f14491a
            boolean r0 = gg.l.a(r1, r0)
            if (r0 != 0) goto L15
            goto L22
        L15:
            int r0 = r2.f14492b
            int r1 = r3.f14492b
            if (r0 == r1) goto L1c
            goto L22
        L1c:
            int r0 = r2.f14493c
            int r3 = r3.f14493c
            if (r0 == r3) goto L24
        L22:
            r3 = 0
            return r3
        L24:
            r3 = 1
            return r3
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            w.k0 r0 = new w.k0
            r0.<init>()
            i2.n0 r1 = r2.f14491a
            r0.f14519u = r1
            int r1 = r2.f14492b
            r0.f14520v = r1
            int r1 = r2.f14493c
            r0.f14521w = r1
            r1 = -1
            r0.f14523y = r1
            r0.f14524z = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r5) {
            r4 = this;
            w.k0 r5 = (w.k0) r5
            i2.n0 r0 = r5.f14519u
            i2.n0 r1 = r4.f14491a
            boolean r0 = gg.l.a(r0, r1)
            int r2 = r4.f14492b
            int r3 = r4.f14493c
            if (r0 == 0) goto L1a
            int r0 = r5.f14520v
            if (r0 != r2) goto L1a
            int r0 = r5.f14521w
            if (r0 == r3) goto L19
            goto L1a
        L19:
            return
        L1a:
            r5.f14519u = r1
            r5.f14520v = r2
            r5.f14521w = r3
            x1.f0 r0 = x1.k.w(r5)
            u2.m r0 = r0.F
            i2.n0 r0 = i2.e0.h(r1, r0)
            r5.A = r0
            r0 = 1
            r5.f14522x = r0
            x1.k.m(r5)
            return
    }

    public final int hashCode() {
            r2 = this;
            i2.n0 r0 = r2.f14491a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r2.f14492b
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.f14493c
            int r0 = r0 + r1
            return r0
    }
}
