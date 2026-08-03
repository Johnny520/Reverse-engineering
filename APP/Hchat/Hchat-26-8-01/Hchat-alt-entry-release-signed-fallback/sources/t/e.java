package t;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends y0.n {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public t.c f12959u;

    @Override // y0.n
    public final boolean Z0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // y0.n
    public final void c1() {
            r2 = this;
            t.c r0 = r2.f12959u
            if (r0 == 0) goto L9
            j0.b r1 = r0.f12958a
            r1.j(r2)
        L9:
            if (r0 == 0) goto L10
            j0.b r1 = r0.f12958a
            r1.b(r2)
        L10:
            r2.f12959u = r0
            return
    }

    @Override // y0.n
    public final void d1() {
            r1 = this;
            t.c r0 = r1.f12959u
            if (r0 == 0) goto L9
            j0.b r0 = r0.f12958a
            r0.j(r1)
        L9:
            return
    }
}
