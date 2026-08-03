package v7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k implements java.lang.Comparable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f14163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f14164h;

    public k(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f14163g = r1
            r0.f14164h = r2
            return
    }

    public static v7.k a(v7.k[] r3, int r4, int r5) {
            r4 = r4 & r5
            int r5 = r3.length
            r0 = 0
        L3:
            if (r0 >= r5) goto Lf
            r1 = r3[r0]
            int r2 = r1.f14164h
            if (r4 != r2) goto Lc
            return r1
        Lc:
            int r0 = r0 + 1
            goto L3
        Lf:
            r3 = 0
            return r3
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            v7.k r2 = (v7.k) r2
            if (r2 != 0) goto L6
            r2 = 1
            return r2
        L6:
            int r0 = r1.f14164h
            int r2 = r2.f14164h
            int r2 = y7.a.b(r0, r2)
            return r2
    }

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r1 != r0) goto L4
            r1 = 1
            return r1
        L4:
            r1 = 0
            return r1
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f14163g
            return r0
    }
}
