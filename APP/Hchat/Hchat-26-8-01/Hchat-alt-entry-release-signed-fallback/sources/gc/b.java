package gc;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends be.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final mh.b f4480g = null;

    static {
            java.lang.Class<gc.b> r0 = gc.b.class
            mh.b r0 = mh.d.b(r0)
            gc.b.f4480g = r0
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
            mh.b r0 = gc.b.f4480g
            java.lang.String r1 = "Error in prepare pass init: {}"
            r0.n(r2, r1, r3)
            return
    }
}
