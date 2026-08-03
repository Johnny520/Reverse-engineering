package g4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g4.j[] f4314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.b f4315b;

    public k(g4.j[] r4) {
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = r4.clone()
            g4.j[] r0 = (g4.j[]) r0
            r3.f4314a = r0
            w4.b r0 = new w4.b
            int r1 = r4.length
            r0.<init>(r1)
            r3.f4315b = r0
            r0 = 0
        L14:
            int r1 = r4.length
            if (r0 >= r1) goto L23
            w4.b r1 = r3.f4315b
            r2 = r4[r0]
            w4.c r2 = r2.f4312b
            r1.m(r0, r2)
            int r0 = r0 + 1
            goto L14
        L23:
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof g4.k
            if (r0 == 0) goto L12
            g4.k r2 = (g4.k) r2
            g4.j[] r2 = r2.f4314a
            g4.j[] r0 = r1.f4314a
            boolean r2 = java.util.Arrays.equals(r2, r0)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            g4.j[] r0 = r1.f4314a
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            g4.j[] r2 = r4.f4314a
            int r3 = r2.length
            if (r1 >= r3) goto L1a
            if (r1 <= 0) goto L12
            java.lang.String r3 = ", "
            r0.append(r3)
        L12:
            r2 = r2[r1]
            r0.append(r2)
            int r1 = r1 + 1
            goto L6
        L1a:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
