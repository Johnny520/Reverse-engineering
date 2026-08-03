package fh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends fh.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f3941g;

    public d(double r1) {
            r0 = this;
            r0.<init>()
            r0.f3941g = r1
            return
    }

    @Override // x6.d
    public final int G(g6.b r7) {
            r6 = this;
            r0 = 1
            r7.n(r0)
            r0 = 0
            double r2 = r6.f3941g
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L1f
            r0 = 8
            r1 = 0
            r7.k(r0, r1)
            java.nio.ByteBuffer r4 = r7.f4318a
            int r5 = r7.f4319b
            int r5 = r5 - r0
            r7.f4319b = r5
            r4.putDouble(r5, r2)
            r7.m(r1)
        L1f:
            int r0 = r7.g()
            r7.i(r0)
            return r0
    }
}
