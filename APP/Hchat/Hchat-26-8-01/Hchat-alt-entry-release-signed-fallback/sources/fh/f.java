package fh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends fh.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3943g;

    public f(int r1) {
            r0 = this;
            r0.<init>()
            r0.f3943g = r1
            return
    }

    @Override // x6.d
    public final int G(g6.b r6) {
            r5 = this;
            r0 = 1
            r6.n(r0)
            int r0 = r5.f3943g
            if (r0 == 0) goto L1a
            r1 = 4
            r2 = 0
            r6.k(r1, r2)
            java.nio.ByteBuffer r3 = r6.f4318a
            int r4 = r6.f4319b
            int r4 = r4 - r1
            r6.f4319b = r4
            r3.putInt(r4, r0)
            r6.m(r2)
        L1a:
            int r0 = r6.g()
            r6.i(r0)
            return r0
    }
}
