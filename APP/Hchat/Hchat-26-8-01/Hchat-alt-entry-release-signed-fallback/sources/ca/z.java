package ca;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f1605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f1606c;

    public z(int r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f1604a = r1
            r0.f1605b = r2
            r0.f1606c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof ca.z
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ca.z r5 = (ca.z) r5
            int r1 = r4.f1604a
            int r3 = r5.f1604a
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r1 = r4.f1605b
            java.lang.String r3 = r5.f1605b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            java.lang.String r1 = r4.f1606c
            java.lang.String r5 = r5.f1606c
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L29
            return r2
        L29:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f1604a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f1605b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r3.f1606c
            if (r1 != 0) goto L15
            r1 = 0
            goto L19
        L15:
            int r1 = r1.hashCode()
        L19:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FavoriteShareData(type="
            r0.<init>(r1)
            int r1 = r3.f1604a
            r0.append(r1)
            java.lang.String r1 = ", text="
            r0.append(r1)
            java.lang.String r1 = r3.f1605b
            r0.append(r1)
            java.lang.String r1 = ", path="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r3.f1606c
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
