package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends r4.s implements java.lang.Comparable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v4.m f11503h;

    public r(v4.m r1, int r2) {
            r0 = this;
            r0.<init>(r2)
            if (r1 == 0) goto L8
            r0.f11503h = r1
            return
        L8:
            java.lang.String r1 = "field == null"
            bsh.j.c(r1)
            r1 = 0
            throw r1
    }

    @Override // z4.k
    public final java.lang.String a() {
            r1 = this;
            v4.m r0 = r1.f11503h
            java.lang.String r0 = r0.a()
            return r0
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            r4.r r2 = (r4.r) r2
            v4.m r0 = r1.f11503h
            v4.m r2 = r2.f11503h
            int r2 = r0.d(r2)
            return r2
    }

    @Override // r4.s
    public final int d(r4.p r5, z4.d r6, int r7, int r8) {
            r4 = this;
            r4.w r5 = r5.f11484i
            v4.m r0 = r4.f11503h
            int r5 = r5.l(r0)
            int r7 = r5 - r7
            boolean r1 = r6.d()
            int r2 = r4.f11506g
            if (r1 == 0) goto L55
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r0 = r0.a()
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r0}
            java.lang.String r0 = "  [%x] %s"
            java.lang.String r8 = java.lang.String.format(r0, r8)
            r0 = 0
            r6.b(r0, r8)
            int r8 = ig.a.c0(r7)
            java.lang.String r0 = a.a.Y0(r5)
            java.lang.String r1 = "    field_idx:    "
            java.lang.String r0 = r1.concat(r0)
            r6.b(r8, r0)
            int r8 = ig.a.c0(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "    access_flags: "
            r0.<init>(r1)
            r1 = 20703(0x50df, float:2.9011E-41)
            r3 = 2
            java.lang.String r1 = be.h.A(r2, r1, r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.b(r8, r0)
        L55:
            r6.n(r7)
            r6.n(r2)
            return r5
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof r4.r
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r4.r r3 = (r4.r) r3
            v4.m r0 = r2.f11503h
            v4.m r3 = r3.f11503h
            int r3 = r0.d(r3)
            if (r3 != 0) goto L14
            r3 = 1
            return r3
        L14:
            return r1
    }

    public final int hashCode() {
            r1 = this;
            v4.m r0 = r1.f11503h
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 100
            r0.<init>(r1)
            java.lang.Class<r4.r> r1 = r4.r.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            int r1 = r2.f11506g
            java.lang.String r1 = a.a.X0(r1)
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            v4.m r1 = r2.f11503h
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
