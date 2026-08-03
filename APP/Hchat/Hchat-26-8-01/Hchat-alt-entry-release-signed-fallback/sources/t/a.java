package t;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class a extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t.c f12950a;

    public a(t.c r1) {
            r0 = this;
            r0.<init>()
            r0.f12950a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 == r2) goto L15
            boolean r0 = r2 instanceof t.a
            if (r0 == 0) goto L13
            t.a r2 = (t.a) r2
            t.c r2 = r2.f12950a
            t.c r0 = r1.f12950a
            boolean r2 = gg.l.a(r0, r2)
            if (r2 == 0) goto L13
            goto L15
        L13:
            r2 = 0
            return r2
        L15:
            r2 = 1
            return r2
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            t.e r0 = new t.e
            r0.<init>()
            t.c r1 = r2.f12950a
            r0.f12959u = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r3) {
            r2 = this;
            t.e r3 = (t.e) r3
            t.c r0 = r3.f12959u
            if (r0 == 0) goto Lb
            j0.b r0 = r0.f12958a
            r0.j(r3)
        Lb:
            t.c r0 = r2.f12950a
            if (r0 == 0) goto L14
            j0.b r1 = r0.f12958a
            r1.b(r3)
        L14:
            r3.f12959u = r0
            return
    }

    public final int hashCode() {
            r1 = this;
            t.c r0 = r1.f12950a
            int r0 = r0.hashCode()
            return r0
    }
}
