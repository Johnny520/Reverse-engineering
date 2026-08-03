package v4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t extends v4.u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f14122g;

    public t(long r1) {
            r0 = this;
            r0.<init>()
            r0.f14122g = r1
            return
    }

    @Override // v4.a
    public final int e(v4.a r5) {
            r4 = this;
            v4.t r5 = (v4.t) r5
            long r0 = r5.f14122g
            long r2 = r4.f14122g
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 >= 0) goto Lc
            r5 = -1
            return r5
        Lc:
            if (r5 <= 0) goto L10
            r5 = 1
            return r5
        L10:
            r5 = 0
            return r5
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r5 == 0) goto L18
            java.lang.Class r0 = r4.getClass()
            java.lang.Class r1 = r5.getClass()
            if (r0 != r1) goto L18
            v4.t r5 = (v4.t) r5
            long r0 = r5.f14122g
            long r2 = r4.f14122g
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 != 0) goto L18
            r5 = 1
            return r5
        L18:
            r5 = 0
            return r5
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.f14122g
            int r2 = (int) r0
            r3 = 32
            long r0 = r0 >> r3
            int r0 = (int) r0
            r0 = r0 ^ r2
            return r0
    }

    @Override // v4.a
    public final boolean i() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // v4.u
    public final boolean k() {
            r4 = this;
            long r0 = r4.f14122g
            int r2 = (int) r0
            long r2 = (long) r2
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // v4.u
    public final int l() {
            r2 = this;
            long r0 = r2.f14122g
            int r0 = (int) r0
            return r0
    }

    @Override // v4.u
    public final long m() {
            r2 = this;
            long r0 = r2.f14122g
            return r0
    }
}
