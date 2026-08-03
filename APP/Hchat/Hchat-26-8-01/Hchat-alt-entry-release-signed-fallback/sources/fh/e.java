package fh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends fh.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f3942g;

    public e(float r1) {
            r0 = this;
            r0.<init>()
            r0.f3942g = r1
            return
    }

    @Override // x6.d
    public final int G(g6.b r6) {
            r5 = this;
            r0 = 1
            r6.n(r0)
            r0 = 0
            float r2 = r5.f3942g
            double r3 = (double) r2
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L1f
            r0 = 4
            r1 = 0
            r6.k(r0, r1)
            java.nio.ByteBuffer r3 = r6.f4318a
            int r4 = r6.f4319b
            int r4 = r4 - r0
            r6.f4319b = r4
            r3.putFloat(r4, r2)
            r6.m(r1)
        L1f:
            int r0 = r6.g()
            r6.i(r0)
            return r0
    }
}
