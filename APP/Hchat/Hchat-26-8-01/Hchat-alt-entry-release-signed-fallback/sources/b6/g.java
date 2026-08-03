package b6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements w5.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f498g;

    public g(long r1) {
            r0 = this;
            r0.<init>()
            r0.f498g = r1
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r5) {
            r4 = this;
            w5.a r5 = (w5.a) r5
            r0 = 6
            int r1 = r5.h()
            int r0 = java.lang.Integer.compare(r0, r1)
            if (r0 == 0) goto Le
            return r0
        Le:
            b6.g r5 = (b6.g) r5
            long r0 = r5.f498g
            long r2 = r4.f498g
            int r5 = java.lang.Long.compare(r2, r0)
            return r5
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof b6.g
            r1 = 0
            if (r0 == 0) goto L11
            b6.g r7 = (b6.g) r7
            long r2 = r7.f498g
            long r4 = r6.f498g
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 != 0) goto L11
            r7 = 1
            return r7
        L11:
            return r1
    }

    @Override // w5.a
    public final int h() {
            r1 = this;
            r0 = 6
            return r0
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.f498g
            int r2 = (int) r0
            int r2 = r2 * 31
            r3 = 32
            long r0 = r0 >>> r3
            int r0 = (int) r0
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            q5.a r1 = new q5.a     // Catch: java.io.IOException -> L12
            r1.<init>(r0)     // Catch: java.io.IOException -> L12
            r1.g(r2)     // Catch: java.io.IOException -> L12
            java.lang.String r0 = r0.toString()
            return r0
        L12:
            java.lang.String r0 = "Unexpected IOException"
            j8.o.f(r0)
            r0 = 0
            return r0
    }
}
