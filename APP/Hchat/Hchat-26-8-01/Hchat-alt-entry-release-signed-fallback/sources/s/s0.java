package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class s0 extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fg.a f12089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r.f f12090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m.p1 f12091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12092d;

    public s0(fg.a r1, r.f r2, m.p1 r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.f12089a = r1
            r0.f12090b = r2
            r0.f12091c = r3
            r0.f12092d = r4
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof s.s0
            if (r1 != 0) goto L9
            goto L2a
        L9:
            s.s0 r4 = (s.s0) r4
            fg.a r1 = r4.f12089a
            fg.a r2 = r3.f12089a
            if (r2 == r1) goto L12
            goto L2a
        L12:
            r.f r1 = r3.f12090b
            r.f r2 = r4.f12090b
            boolean r1 = gg.l.a(r1, r2)
            if (r1 != 0) goto L1d
            goto L2a
        L1d:
            m.p1 r1 = r3.f12091c
            m.p1 r2 = r4.f12091c
            if (r1 == r2) goto L24
            goto L2a
        L24:
            boolean r1 = r3.f12092d
            boolean r4 = r4.f12092d
            if (r1 == r4) goto L2c
        L2a:
            r4 = 0
            return r4
        L2c:
            return r0
    }

    @Override // x1.x0
    public final y0.n f() {
            r5 = this;
            s.w0 r0 = new s.w0
            m.p1 r1 = r5.f12091c
            boolean r2 = r5.f12092d
            fg.a r3 = r5.f12089a
            r.f r4 = r5.f12090b
            r0.<init>(r3, r4, r1, r2)
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r3) {
            r2 = this;
            s.w0 r3 = (s.w0) r3
            fg.a r0 = r2.f12089a
            r3.f12121u = r0
            r.f r0 = r2.f12090b
            r3.f12122v = r0
            m.p1 r0 = r3.f12123w
            m.p1 r1 = r2.f12091c
            if (r0 == r1) goto L15
            r3.f12123w = r1
            x1.k.n(r3)
        L15:
            boolean r0 = r3.f12124x
            boolean r1 = r2.f12092d
            if (r0 != r1) goto L1c
            return
        L1c:
            r3.f12124x = r1
            r3.k1()
            x1.k.n(r3)
            return
    }

    public final int hashCode() {
            r3 = this;
            fg.a r0 = r3.f12089a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            r.f r2 = r3.f12090b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            m.p1 r0 = r3.f12091c
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            boolean r2 = r3.f12092d
            int r0 = eh.a.h(r0, r1, r2)
            r1 = 0
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }
}
