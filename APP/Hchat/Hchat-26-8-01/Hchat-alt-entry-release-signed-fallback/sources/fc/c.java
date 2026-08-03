package fc;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements bc.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f3878g;

    public c() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f3878g = r0
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r1.f3878g
            r0.clear()
            return
    }

    @Override // bc.c
    public final void r(java.lang.String r2, bc.d r3) {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r1.f3878g
            r0.put(r2, r3)
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r2.f3878g
            int r0 = r0.size()
            java.lang.String r1 = "InMemoryCodeCache: size="
            java.lang.String r0 = eh.a.l(r0, r1)
            return r0
    }

    @Override // bc.c
    public final bc.d v(java.lang.String r2) {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r1.f3878g
            java.lang.Object r2 = r0.get(r2)
            bc.d r2 = (bc.d) r2
            if (r2 != 0) goto Lc
            fc.e r2 = bc.d.f707a
        Lc:
            return r2
    }
}
