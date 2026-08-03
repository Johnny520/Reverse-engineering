package a9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y9.f f79a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f80b;

    public a(y9.f r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f79a = r1
            r0.f80b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof a9.a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            a9.a r5 = (a9.a) r5
            y9.f r1 = r4.f79a
            y9.f r3 = r5.f79a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r4.f80b
            int r5 = r5.f80b
            if (r1 == r5) goto L1e
            return r2
        L1e:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            y9.f r0 = r2.f79a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            int r0 = r0 * 31
            int r1 = r2.f80b
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BaseNameStyle(color="
            r0.<init>(r1)
            y9.f r1 = r2.f79a
            r0.append(r1)
            java.lang.String r1 = ", weight="
            r0.append(r1)
            int r1 = r2.f80b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
