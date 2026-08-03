package gc;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends be.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final mh.b f4479g = null;

    static {
            java.lang.Class<gc.a> r0 = gc.a.class
            mh.b r0 = mh.d.b(r0)
            gc.a.f4479g = r0
            return
    }

    @Override // be.a
    public final java.lang.String e() {
            r1 = this;
            r0 = 0
            throw r0
    }

    @Override // be.a
    public final void f(ud.u r3) {
            r2 = this;
            r3 = 0
            throw r3     // Catch: java.lang.Exception -> L2
        L2:
            r3 = move-exception
            mh.b r0 = gc.a.f4479g
            java.lang.String r1 = "Error in decompile pass init: {}"
            r0.n(r2, r1, r3)
            return
    }

    @Override // be.a
    public final void g(ud.r r4) {
            r3 = this;
            r0 = 0
            throw r0     // Catch: java.lang.Exception -> L2
        L2:
            r0 = move-exception
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r2 = "Error in decompile pass: "
            java.lang.String r1 = r2.concat(r1)
            r4.getClass()
            xe.h.a(r4, r1, r0)
            return
    }

    @Override // be.a
    public final boolean h(ud.e r4) {
            r3 = this;
            r0 = 0
            throw r0     // Catch: java.lang.Exception -> L2
        L2:
            r0 = move-exception
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r2 = "Error in decompile pass: "
            java.lang.String r1 = r2.concat(r1)
            r4.getClass()
            xe.h.a(r4, r1, r0)
            r4 = 0
            return r4
    }
}
