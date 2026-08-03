package da;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final da.f f2147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final da.d f2148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2149c;

    public e(da.f r1, da.d r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f2147a = r1
            r0.f2148b = r2
            r0.f2149c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof da.e
            if (r0 != 0) goto L8
            goto L26
        L8:
            da.e r3 = (da.e) r3
            da.f r0 = r2.f2147a
            da.f r1 = r3.f2147a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L26
        L15:
            da.d r0 = r2.f2148b
            da.d r1 = r3.f2148b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L26
        L20:
            boolean r0 = r2.f2149c
            boolean r3 = r3.f2149c
            if (r0 == r3) goto L28
        L26:
            r3 = 0
            return r3
        L28:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            da.f r0 = r2.f2147a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            da.d r1 = r2.f2148b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r2.f2149c
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextMatch(target="
            r0.<init>(r1)
            da.f r1 = r3.f2147a
            r0.append(r1)
            java.lang.String r1 = ", candidate="
            r0.append(r1)
            da.d r1 = r3.f2148b
            r0.append(r1)
            java.lang.String r1 = ", exact="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r2 = r3.f2149c
            java.lang.String r0 = p.a.m(r1, r0, r2)
            return r0
    }
}
