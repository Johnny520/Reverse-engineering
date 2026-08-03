package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends r4.s implements java.lang.Comparable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v4.y f11507h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r4.l f11508i;

    public t(v4.y r2, int r3, i4.a r4, w4.e r5) {
            r1 = this;
            r1.<init>(r3)
            if (r2 == 0) goto L1c
            r1.f11507h = r2
            if (r4 != 0) goto Ld
            r2 = 0
            r1.f11508i = r2
            return
        Ld:
            r3 = r3 & 8
            if (r3 == 0) goto L13
            r3 = 1
            goto L14
        L13:
            r3 = 0
        L14:
            r4.l r0 = new r4.l
            r0.<init>(r2, r4, r3, r5)
            r1.f11508i = r0
            return
        L1c:
            java.lang.String r2 = "method == null"
            bsh.j.c(r2)
            r2 = 0
            throw r2
    }

    @Override // z4.k
    public final java.lang.String a() {
            r1 = this;
            v4.y r0 = r1.f11507h
            java.lang.String r0 = r0.a()
            return r0
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            r4.t r2 = (r4.t) r2
            v4.y r0 = r1.f11507h
            v4.y r2 = r2.f11507h
            int r2 = r0.d(r2)
            return r2
    }

    @Override // r4.s
    public final int d(r4.p r8, z4.d r9, int r10, int r11) {
            r7 = this;
            r4.j0 r8 = r8.f11485j
            v4.y r0 = r7.f11507h
            int r8 = r8.l(r0)
            int r10 = r8 - r10
            r1 = 0
            r4.l r2 = r7.f11508i
            if (r2 != 0) goto L11
            r2 = r1
            goto L15
        L11:
            int r2 = r2.f()
        L15:
            r3 = 1
            if (r2 == 0) goto L1a
            r4 = r3
            goto L1b
        L1a:
            r4 = r1
        L1b:
            int r5 = r7.f11506g
            r6 = r5 & 1280(0x500, float:1.794E-42)
            if (r6 != 0) goto L22
            goto L23
        L22:
            r3 = r1
        L23:
            if (r4 != r3) goto L89
            boolean r3 = r9.d()
            if (r3 == 0) goto L7f
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r0 = r0.a()
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r0}
            java.lang.String r0 = "  [%x] %s"
            java.lang.String r11 = java.lang.String.format(r0, r11)
            r9.b(r1, r11)
            int r11 = ig.a.c0(r10)
            java.lang.String r0 = a.a.Y0(r8)
            java.lang.String r1 = "    method_idx:   "
            java.lang.String r0 = r1.concat(r0)
            r9.b(r11, r0)
            int r11 = ig.a.c0(r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "    access_flags: "
            r0.<init>(r1)
            r1 = 204287(0x31dff, float:2.86267E-40)
            r3 = 3
            java.lang.String r1 = be.h.A(r5, r1, r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.b(r11, r0)
            int r11 = ig.a.c0(r2)
            java.lang.String r0 = a.a.Y0(r2)
            java.lang.String r1 = "    code_off:     "
            java.lang.String r0 = r1.concat(r0)
            r9.b(r11, r0)
        L7f:
            r9.n(r10)
            r9.n(r5)
            r9.n(r2)
            return r8
        L89:
            java.lang.String r8 = "code vs. access_flags mismatch"
            j8.o.w(r8)
            r8 = 0
            return r8
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof r4.t
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r4.t r3 = (r4.t) r3
            v4.y r0 = r2.f11507h
            v4.y r3 = r3.f11507h
            int r3 = r0.d(r3)
            if (r3 != 0) goto L14
            r3 = 1
            return r3
        L14:
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 100
            r0.<init>(r1)
            java.lang.Class<r4.t> r1 = r4.t.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            int r1 = r3.f11506g
            java.lang.String r1 = a.a.X0(r1)
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            v4.y r2 = r3.f11507h
            r0.append(r2)
            r4.l r2 = r3.f11508i
            if (r2 == 0) goto L32
            r0.append(r1)
            r0.append(r2)
        L32:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
