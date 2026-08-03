package v4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w extends v4.f0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v4.d0 f14125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v4.z f14126h;

    public w(v4.d0 r1, v4.z r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L13
            if (r2 == 0) goto Lc
            r0.f14125g = r1
            r0.f14126h = r2
            return
        Lc:
            java.lang.String r1 = "nat == null"
            bsh.j.c(r1)
            r1 = 0
            throw r1
        L13:
            java.lang.String r1 = "definingClass == null"
            bsh.j.c(r1)
            r1 = 0
            throw r1
    }

    @Override // z4.k
    public final java.lang.String a() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            v4.d0 r1 = r2.f14125g
            w4.c r1 = r1.f14088g
            java.lang.String r1 = r1.a()
            r0.append(r1)
            r1 = 46
            r0.append(r1)
            v4.z r1 = r2.f14126h
            java.lang.String r1 = r1.a()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // v4.a
    public int e(v4.a r3) {
            r2 = this;
            v4.w r3 = (v4.w) r3
            v4.d0 r0 = r2.f14125g
            v4.d0 r1 = r3.f14125g
            int r0 = r0.d(r1)
            if (r0 == 0) goto Ld
            return r0
        Ld:
            v4.z r0 = r2.f14126h
            v4.c0 r0 = r0.f14131g
            v4.z r3 = r3.f14126h
            v4.c0 r3 = r3.f14131g
            int r3 = r0.d(r3)
            return r3
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L26
            java.lang.Class r1 = r3.getClass()
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto Le
            goto L26
        Le:
            v4.w r4 = (v4.w) r4
            v4.d0 r1 = r3.f14125g
            v4.d0 r2 = r4.f14125g
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L26
            v4.z r1 = r3.f14126h
            v4.z r4 = r4.f14126h
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L26
            r4 = 1
            return r4
        L26:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            v4.d0 r0 = r2.f14125g
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            v4.z r1 = r2.f14126h
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    @Override // v4.a
    public final boolean i() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.j()
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            java.lang.String r1 = r2.a()
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
