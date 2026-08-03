package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class n extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r.g f12047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m.c f12048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m.p1 f12049c;

    public n(r.g r1, m.c r2, m.p1 r3) {
            r0 = this;
            r0.<init>()
            r0.f12047a = r1
            r0.f12048b = r2
            r0.f12049c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof s.n
            if (r0 != 0) goto L8
            goto L26
        L8:
            s.n r3 = (s.n) r3
            r.g r0 = r3.f12047a
            r.g r1 = r2.f12047a
            boolean r0 = gg.l.a(r1, r0)
            if (r0 != 0) goto L15
            goto L26
        L15:
            m.c r0 = r2.f12048b
            m.c r1 = r3.f12048b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L20
            goto L26
        L20:
            m.p1 r0 = r2.f12049c
            m.p1 r3 = r3.f12049c
            if (r0 == r3) goto L28
        L26:
            r3 = 0
            return r3
        L28:
            r3 = 1
            return r3
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            s.r r0 = new s.r
            r0.<init>()
            r.g r1 = r2.f12047a
            r0.f12080u = r1
            m.c r1 = r2.f12048b
            r0.f12081v = r1
            m.p1 r1 = r2.f12049c
            r0.f12082w = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r2) {
            r1 = this;
            s.r r2 = (s.r) r2
            r.g r0 = r1.f12047a
            r2.f12080u = r0
            m.c r0 = r1.f12048b
            r2.f12081v = r0
            m.p1 r0 = r1.f12049c
            r2.f12082w = r0
            return
    }

    public final int hashCode() {
            r3 = this;
            r.g r0 = r3.f12047a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            m.c r2 = r3.f12048b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            r0 = 0
            int r0 = eh.a.h(r2, r1, r0)
            m.p1 r1 = r3.f12049c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }
}
