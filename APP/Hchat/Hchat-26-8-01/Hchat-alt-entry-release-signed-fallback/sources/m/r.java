package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements m.i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fg.l f8340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m.q f8341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k.h1 f8342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0.j1 f8343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i0.j1 f8344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i0.j1 f8345f;

    public r(fg.l r2) {
            r1 = this;
            r1.<init>()
            r1.f8340a = r2
            m.q r2 = new m.q
            r2.<init>(r1)
            r1.f8341b = r2
            k.h1 r2 = new k.h1
            r2.<init>()
            r1.f8342c = r2
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            i0.j1 r0 = i0.r.u(r2)
            r1.f8343d = r0
            i0.j1 r0 = i0.r.u(r2)
            r1.f8344e = r0
            i0.j1 r2 = i0.r.u(r2)
            r1.f8345f = r2
            return
    }

    @Override // m.i2
    public final boolean a() {
            r1 = this;
            i0.j1 r0 = r1.f8343d
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // m.i2
    public final java.lang.Object b(k.d1 r7, fg.p r8, yf.c r9) {
            r6 = this;
            c0.m r0 = new c0.m
            r4 = 0
            r5 = 10
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Object r7 = qg.v.e(r0, r9)
            xf.a r8 = xf.a.f21579g
            if (r7 != r8) goto L14
            return r7
        L14:
            sf.n r7 = sf.n.f12433a
            return r7
    }

    @Override // m.i2
    public final float e(float r2) {
            r1 = this;
            fg.l r0 = r1.f8340a
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object r2 = r0.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            return r2
    }
}
