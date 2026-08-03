package g4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g4.j f4280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f4281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v4.m f4282c;

    public f(g4.j r3, g4.j r4, java.lang.String r5) {
            r2 = this;
            r2.<init>()
            if (r4 == 0) goto L24
            r2.f4280a = r3
            r2.f4281b = r5
            v4.z r0 = new v4.z
            v4.c0 r1 = new v4.c0
            r1.<init>(r5)
            v4.c0 r5 = new v4.c0
            java.lang.String r4 = r4.f4311a
            r5.<init>(r4)
            r0.<init>(r1, r5)
            v4.m r4 = new v4.m
            v4.d0 r3 = r3.f4313c
            r4.<init>(r3, r0)
            r2.f4282c = r4
            return
        L24:
            r3 = 0
            throw r3
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof g4.f
            if (r0 == 0) goto L1c
            g4.f r3 = (g4.f) r3
            g4.j r0 = r3.f4280a
            g4.j r1 = r2.f4280a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1c
            java.lang.String r3 = r3.f4281b
            java.lang.String r0 = r2.f4281b
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L1c
            r3 = 1
            return r3
        L1c:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r2 = this;
            g4.j r0 = r2.f4280a
            java.lang.String r0 = r0.f4311a
            int r0 = r0.hashCode()
            java.lang.String r1 = r2.f4281b
            int r1 = r1.hashCode()
            int r1 = r1 * 37
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            g4.j r1 = r2.f4280a
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
            java.lang.String r1 = r2.f4281b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
