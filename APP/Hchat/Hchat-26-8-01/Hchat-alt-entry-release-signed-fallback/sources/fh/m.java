package fh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends x6.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public fh.a f3959g;

    public static void k0(fh.m r2, java.lang.String r3) {
            fh.a r0 = new fh.a
            r0.<init>()
            r1 = 5
            r0.m0(r1, r3)
            r2.f3959g = r0
            return
    }

    @Override // x6.d
    public final int G(g6.b r4) {
            r3 = this;
            fh.a r0 = r3.f3959g
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.G(r4)
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 2
            r4.n(r2)
            r2 = 1
            r4.c(r2, r0)
            r4.c(r1, r1)
            int r0 = r4.g()
            r4.i(r0)
            return r0
    }
}
