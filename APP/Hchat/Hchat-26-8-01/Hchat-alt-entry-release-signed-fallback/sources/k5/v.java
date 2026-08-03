package k5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v implements java.lang.Comparable {
    public abstract java.lang.String a();

    public abstract int b();

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r3) {
            r2 = this;
            k5.v r3 = (k5.v) r3
            java.lang.String r0 = r2.a()
            if (r0 != 0) goto L10
            java.lang.String r0 = r3.a()
            if (r0 == 0) goto L23
            r3 = 1
            return r3
        L10:
            java.lang.String r1 = r3.a()
            if (r1 != 0) goto L18
            r3 = -1
            return r3
        L18:
            java.lang.String r1 = r3.a()
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto L23
            return r0
        L23:
            int r0 = r2.b()
            int r3 = r3.b()
            int r3 = java.lang.Integer.compare(r0, r3)
            return r3
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof k5.v
            if (r0 == 0) goto L20
            k5.v r3 = (k5.v) r3
            java.lang.String r0 = r2.a()
            java.lang.String r1 = r3.a()
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 == 0) goto L20
            int r0 = r2.b()
            int r3 = r3.b()
            if (r0 != r3) goto L20
            r3 = 1
            return r3
        L20:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.a()
            if (r0 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            int r0 = r0.hashCode()
        Lc:
            int r0 = r0 * 31
            int r1 = r2.b()
            int r1 = r1 + r0
            return r1
    }
}
