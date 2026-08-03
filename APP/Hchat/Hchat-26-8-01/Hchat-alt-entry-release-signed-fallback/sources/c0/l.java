package c0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class l extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b.e f956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0.v0 f957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0.w0 f958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h0.t0 f959d;

    public l(b.e r1, h0.v0 r2, h0.w0 r3, h0.t0 r4) {
            r0 = this;
            r0.<init>()
            r0.f956a = r1
            r0.f957b = r2
            r0.f958c = r3
            r0.f959d = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L27
        L3:
            boolean r0 = r3 instanceof c0.l
            if (r0 != 0) goto L8
            goto L25
        L8:
            c0.l r3 = (c0.l) r3
            b.e r0 = r3.f956a
            b.e r1 = r2.f956a
            if (r1 == r0) goto L11
            goto L25
        L11:
            h0.v0 r0 = r2.f957b
            h0.v0 r1 = r3.f957b
            if (r0 == r1) goto L18
            goto L25
        L18:
            h0.w0 r0 = r2.f958c
            h0.w0 r1 = r3.f958c
            if (r0 == r1) goto L1f
            goto L25
        L1f:
            h0.t0 r0 = r2.f959d
            h0.t0 r3 = r3.f959d
            if (r0 == r3) goto L27
        L25:
            r3 = 0
            return r3
        L27:
            r3 = 1
            return r3
    }

    @Override // x1.x0
    public final y0.n f() {
            r5 = this;
            c0.n r0 = new c0.n
            h0.w0 r1 = r5.f958c
            h0.t0 r2 = r5.f959d
            b.e r3 = r5.f956a
            h0.v0 r4 = r5.f957b
            r0.<init>(r3, r4, r1, r2)
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r3) {
            r2 = this;
            c0.n r3 = (c0.n) r3
            b.e r0 = r3.f965w
            r1 = 0
            r0.f332h = r1
            b.e r0 = r2.f956a
            r3.f965w = r0
            r0.f332h = r3
            boolean r1 = r3.f21832t
            if (r1 == 0) goto L14
            c0.o r1 = c0.o.f971i
            goto L16
        L14:
            c0.o r1 = c0.o.f970h
        L16:
            r0.f333i = r1
            h0.v0 r0 = r2.f957b
            r3.f966x = r0
            h0.w0 r0 = r2.f958c
            r3.f967y = r0
            h0.t0 r0 = r2.f959d
            r3.f968z = r0
            return
    }

    public final int hashCode() {
            r2 = this;
            b.e r0 = r2.f956a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            h0.v0 r1 = r2.f957b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            h0.w0 r0 = r2.f958c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            h0.t0 r1 = r2.f959d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }
}
