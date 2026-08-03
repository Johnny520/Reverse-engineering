package lg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements java.lang.Iterable, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f8054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f8055h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f8056i;

    public f(long r8, long r10) {
            r7 = this;
            r7.<init>()
            r7.f8054g = r8
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            r1 = 1
            if (r0 < 0) goto Lc
            goto L26
        Lc:
            long r3 = r10 % r1
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L15
            goto L16
        L15:
            long r3 = r3 + r1
        L16:
            long r8 = r8 % r1
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 < 0) goto L1c
            goto L1d
        L1c:
            long r8 = r8 + r1
        L1d:
            long r3 = r3 - r8
            long r3 = r3 % r1
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 < 0) goto L24
            goto L25
        L24:
            long r3 = r3 + r1
        L25:
            long r10 = r10 - r3
        L26:
            r7.f8055h = r10
            r7.f8056i = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof lg.f
            if (r0 == 0) goto L27
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L13
            r0 = r5
            lg.f r0 = (lg.f) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L25
        L13:
            lg.f r5 = (lg.f) r5
            long r0 = r5.f8054g
            long r2 = r4.f8054g
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L27
            long r0 = r4.f8055h
            long r2 = r5.f8055h
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L27
        L25:
            r5 = 1
            return r5
        L27:
            r5 = 0
            return r5
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            return r0
        L8:
            long r0 = r3.f8054g
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            long r1 = r3.f8055h
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final boolean isEmpty() {
            r4 = this;
            long r0 = r4.f8054g
            long r2 = r4.f8055h
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r7 = this;
            lg.e r0 = new lg.e
            long r3 = r7.f8055h
            long r5 = r7.f8056i
            long r1 = r7.f8054g
            r0.<init>(r1, r3, r5)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r3.f8054g
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            long r1 = r3.f8055h
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
