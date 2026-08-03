package fh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends fh.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte f3940g;

    public c(byte r1) {
            r0 = this;
            r0.<init>()
            r0.f3940g = r1
            return
    }

    @Override // x6.d
    public final int G(g6.b r2) {
            r1 = this;
            r0 = 1
            r2.n(r0)
            byte r0 = r1.f3940g
            if (r0 == 0) goto Lf
            r2.a(r0)
            r0 = 0
            r2.m(r0)
        Lf:
            int r0 = r2.g()
            r2.i(r0)
            return r0
    }
}
