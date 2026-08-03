package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends r4.z implements java.lang.Comparable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v4.c0 f11504h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r4.q0 f11505i;

    public r0(v4.c0 r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto Lb
            r0.f11504h = r1
            r1 = 0
            r0.f11505i = r1
            return
        Lb:
            java.lang.String r1 = "value == null"
            bsh.j.c(r1)
            r1 = 0
            throw r1
    }

    @Override // r4.a0
    public final void a(r4.p r3) {
            r2 = this;
            r4.q0 r0 = r2.f11505i
            if (r0 != 0) goto L12
            r4.k0 r3 = r3.f11480e
            r4.q0 r0 = new r4.q0
            v4.c0 r1 = r2.f11504h
            r0.<init>(r1)
            r2.f11505i = r0
            r3.k(r0)
        L12:
            return
    }

    @Override // r4.a0
    public final r4.b0 b() {
            r1 = this;
            r4.b0 r0 = r4.b0.f11358k
            return r0
    }

    @Override // r4.a0
    public final int c() {
            r1 = this;
            r0 = 4
            return r0
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            r4.r0 r2 = (r4.r0) r2
            v4.c0 r0 = r1.f11504h
            v4.c0 r2 = r2.f11504h
            int r2 = r0.d(r2)
            return r2
    }

    @Override // r4.a0
    public final void d(r4.p r7, z4.d r8) {
            r6 = this;
            r4.q0 r7 = r6.f11505i
            int r7 = r7.f()
            boolean r0 = r8.d()
            if (r0 == 0) goto L65
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r6.f()
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            v4.c0 r1 = r6.f11504h
            java.lang.String r1 = r1.a()
            int r2 = r1.length()
            r3 = 98
            r4 = 0
            if (r2 > r3) goto L2f
            java.lang.String r2 = ""
            goto L37
        L2f:
            r2 = 95
            java.lang.String r1 = r1.substring(r4, r2)
            java.lang.String r2 = "..."
        L37:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "\""
            r3.<init>(r5)
            r3.append(r1)
            r3.append(r2)
            r1 = 34
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.b(r4, r0)
            java.lang.String r0 = a.a.Y0(r7)
            java.lang.String r1 = "  string_data_off: "
            java.lang.String r0 = r1.concat(r0)
            r1 = 4
            r8.b(r1, r0)
        L65:
            r8.k(r7)
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof r4.r0
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            r4.r0 r2 = (r4.r0) r2
            v4.c0 r0 = r1.f11504h
            v4.c0 r2 = r2.f11504h
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            v4.c0 r0 = r1.f11504h
            java.lang.String r0 = r0.f14067g
            int r0 = r0.hashCode()
            return r0
    }
}
