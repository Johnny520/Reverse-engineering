package gh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends x6.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4566g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4567h;

    public a(int r1) {
            r0 = this;
            r0.<init>()
            r0.f4566g = r1
            r0.f4567h = r1
            return
    }

    @Override // x6.d
    public final int G(g6.b r7) {
            r6 = this;
            int r0 = r6.f4566g
            int r1 = r6.f4567h
            r2 = 2
            r7.n(r2)
            r2 = 4
            r3 = 0
            if (r1 == 0) goto L1d
            r7.k(r2, r3)
            java.nio.ByteBuffer r4 = r7.f4318a
            int r5 = r7.f4319b
            int r5 = r5 - r2
            r7.f4319b = r5
            r4.putInt(r5, r1)
            r1 = 1
            r7.m(r1)
        L1d:
            if (r0 == 0) goto L2f
            r7.k(r2, r3)
            java.nio.ByteBuffer r1 = r7.f4318a
            int r4 = r7.f4319b
            int r4 = r4 - r2
            r7.f4319b = r4
            r1.putInt(r4, r0)
            r7.m(r3)
        L2f:
            int r0 = r7.g()
            r7.i(r0)
            return r0
    }
}
