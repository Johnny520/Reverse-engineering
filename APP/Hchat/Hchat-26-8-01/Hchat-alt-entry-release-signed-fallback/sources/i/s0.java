package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements i.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i.k f5782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5783b;

    public s0(i.y r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.f5782a = r1
            r0.f5783b = r2
            return
    }

    @Override // i.k
    public final i.n1 a(i.m1 r4) {
            r3 = this;
            i.k r0 = r3.f5782a
            i.n1 r4 = r0.a(r4)
            i.t0 r0 = new i.t0
            long r1 = r3.f5783b
            r0.<init>(r4, r1)
            return r0
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof i.s0
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            i.s0 r7 = (i.s0) r7
            long r2 = r7.f5783b
            long r4 = r6.f5783b
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L1c
            i.k r7 = r7.f5782a
            i.k r0 = r6.f5782a
            boolean r7 = gg.l.a(r7, r0)
            if (r7 == 0) goto L1c
            r7 = 1
            return r7
        L1c:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            i.k r0 = r3.f5782a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            long r1 = r3.f5783b
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }
}
