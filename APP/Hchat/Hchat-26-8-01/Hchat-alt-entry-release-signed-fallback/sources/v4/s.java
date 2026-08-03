package v4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s extends v4.u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f14121g;

    public s(int r1) {
            r0 = this;
            r0.<init>()
            r0.f14121g = r1
            return
    }

    @Override // v4.a
    public final int e(v4.a r2) {
            r1 = this;
            v4.s r2 = (v4.s) r2
            int r2 = r2.f14121g
            int r0 = r1.f14121g
            if (r0 >= r2) goto La
            r2 = -1
            return r2
        La:
            if (r0 <= r2) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 == 0) goto L16
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r1 = r3.getClass()
            if (r0 != r1) goto L16
            v4.s r3 = (v4.s) r3
            int r3 = r3.f14121g
            int r0 = r2.f14121g
            if (r0 != r3) goto L16
            r3 = 1
            return r3
        L16:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f14121g
            return r0
    }

    @Override // v4.a
    public final boolean i() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // v4.u
    public final boolean k() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // v4.u
    public final int l() {
            r1 = this;
            int r0 = r1.f14121g
            return r0
    }

    @Override // v4.u
    public final long m() {
            r2 = this;
            int r0 = r2.f14121g
            long r0 = (long) r0
            return r0
    }
}
