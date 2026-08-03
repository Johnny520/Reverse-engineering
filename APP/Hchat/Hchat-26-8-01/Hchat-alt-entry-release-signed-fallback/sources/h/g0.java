package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class g0 extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i.k1 f4669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i.d1 f4670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i.d1 f4671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i.d1 f4672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h.r0 f4673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h.s0 f4674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fg.a f4675g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h.h0 f4676h;

    public g0(i.k1 r1, i.d1 r2, i.d1 r3, i.d1 r4, h.r0 r5, h.s0 r6, fg.a r7, h.h0 r8) {
            r0 = this;
            r0.<init>()
            r0.f4669a = r1
            r0.f4670b = r2
            r0.f4671c = r3
            r0.f4672d = r4
            r0.f4673e = r5
            r0.f4674f = r6
            r0.f4675g = r7
            r0.f4676h = r8
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof h.g0
            if (r0 == 0) goto L54
            h.g0 r3 = (h.g0) r3
            i.k1 r0 = r3.f4669a
            i.k1 r1 = r2.f4669a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L54
            i.d1 r0 = r3.f4670b
            i.d1 r1 = r2.f4670b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L54
            i.d1 r0 = r3.f4671c
            i.d1 r1 = r2.f4671c
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L54
            i.d1 r0 = r3.f4672d
            i.d1 r1 = r2.f4672d
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L54
            h.r0 r0 = r3.f4673e
            h.r0 r1 = r2.f4673e
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L54
            h.s0 r0 = r3.f4674f
            h.s0 r1 = r2.f4674f
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L54
            fg.a r0 = r3.f4675g
            fg.a r1 = r2.f4675g
            if (r0 != r1) goto L54
            h.h0 r3 = r3.f4676h
            h.h0 r0 = r2.f4676h
            boolean r3 = gg.l.a(r3, r0)
            if (r3 == 0) goto L54
            r3 = 1
            return r3
        L54:
            r3 = 0
            return r3
    }

    @Override // x1.x0
    public final y0.n f() {
            r9 = this;
            h.q0 r0 = new h.q0
            fg.a r7 = r9.f4675g
            h.h0 r8 = r9.f4676h
            i.k1 r1 = r9.f4669a
            i.d1 r2 = r9.f4670b
            i.d1 r3 = r9.f4671c
            i.d1 r4 = r9.f4672d
            h.r0 r5 = r9.f4673e
            h.s0 r6 = r9.f4674f
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r2) {
            r1 = this;
            h.q0 r2 = (h.q0) r2
            i.k1 r0 = r1.f4669a
            r2.f4737v = r0
            i.d1 r0 = r1.f4670b
            r2.f4738w = r0
            i.d1 r0 = r1.f4671c
            r2.f4739x = r0
            i.d1 r0 = r1.f4672d
            r2.f4740y = r0
            h.r0 r0 = r1.f4673e
            r2.f4741z = r0
            h.s0 r0 = r1.f4674f
            r2.A = r0
            fg.a r0 = r1.f4675g
            r2.B = r0
            h.h0 r0 = r1.f4676h
            r2.C = r0
            return
    }

    public final int hashCode() {
            r3 = this;
            i.k1 r0 = r3.f4669a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            r1 = 0
            i.d1 r2 = r3.f4670b
            if (r2 == 0) goto L12
            int r2 = r2.hashCode()
            goto L13
        L12:
            r2 = r1
        L13:
            int r0 = r0 + r2
            int r0 = r0 * 31
            i.d1 r2 = r3.f4671c
            if (r2 == 0) goto L1f
            int r2 = r2.hashCode()
            goto L20
        L1f:
            r2 = r1
        L20:
            int r0 = r0 + r2
            int r0 = r0 * 31
            i.d1 r2 = r3.f4672d
            if (r2 == 0) goto L2b
            int r1 = r2.hashCode()
        L2b:
            int r0 = r0 + r1
            int r0 = r0 * 31
            h.r0 r1 = r3.f4673e
            h.h1 r1 = r1.f4746a
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            h.s0 r0 = r3.f4674f
            h.h1 r0 = r0.f4753a
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            fg.a r1 = r3.f4675g
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            h.h0 r0 = r3.f4676h
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }
}
