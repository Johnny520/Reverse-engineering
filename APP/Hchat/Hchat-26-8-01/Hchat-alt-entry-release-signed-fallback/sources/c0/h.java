package c0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements d0.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c0.j f947h;

    public h(c0.j r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.f947h = r1
            r0.f946g = r2
            return
    }

    @Override // d0.d
    public final long E0(v1.t r4) {
            r3 = this;
            c0.j r0 = r3.f947h
            i0.j1 r0 = r0.f955x
            java.lang.Object r0 = r0.getValue()
            v1.t r0 = (v1.t) r0
            if (r0 == 0) goto L13
            long r1 = r3.f946g
            long r0 = r4.w(r0, r1)
            return r0
        L13:
            java.lang.String r4 = "Tried to open context menu before the anchor was placed."
            o.b.d(r4)
            okio.a.c()
            r0 = 0
            return r0
    }

    @Override // d0.d
    public final z.c j0() {
            r1 = this;
            c0.j r0 = r1.f947h
            z.c r0 = c0.k.b(r0)
            return r0
    }

    @Override // d0.d
    public final e1.c w0(v1.t r5) {
            r4 = this;
            long r0 = r4.E0(r5)
            r2 = 0
            e1.c r5 = ac.p.a(r0, r2)
            return r5
    }
}
