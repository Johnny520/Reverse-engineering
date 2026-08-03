package gb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4442b;

    public l(long r1, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f4441a = r3
            r0.f4442b = r1
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof gb.l
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            gb.l r8 = (gb.l) r8
            boolean r1 = r7.f4441a
            boolean r3 = r8.f4441a
            if (r1 == r3) goto L13
            return r2
        L13:
            long r3 = r7.f4442b
            long r5 = r8.f4442b
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L1c
            return r2
        L1c:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f4441a
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 * 31
            long r1 = r3.f4442b
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PluginMarketLikeResult(liked="
            r0.<init>(r1)
            boolean r1 = r3.f4441a
            r0.append(r1)
            java.lang.String r1 = ", likeCount="
            r0.append(r1)
            long r1 = r3.f4442b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
