package ia;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f6570b;

    public g(int r1, java.lang.String r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f6569a = r1
            r0.f6570b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof ia.g
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ia.g r5 = (ia.g) r5
            int r1 = r4.f6569a
            int r3 = r5.f6569a
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r1 = r4.f6570b
            java.lang.String r5 = r5.f6570b
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L1e
            return r2
        L1e:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f6569a
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            java.lang.String r1 = r2.f6570b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LikeKey(commentId="
            r0.<init>(r1)
            int r1 = r2.f6569a
            r0.append(r1)
            java.lang.String r1 = ", username="
            r0.append(r1)
            java.lang.String r1 = r2.f6570b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
