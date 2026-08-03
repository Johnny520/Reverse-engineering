package u4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.c f13407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w4.e f13408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w4.e f13409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f13411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f13412g;

    public r(int r9, w4.b r10, w4.e r11) {
            r8 = this;
            w4.c r2 = w4.c.f14874w
            r6 = 1
            r7 = 0
            r5 = 6
            r0 = r8
            r1 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public r(int r9, w4.c r10, w4.e r11, int r12, java.lang.String r13) {
            r8 = this;
            w4.b r4 = w4.b.f14847i
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r12
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public r(int r9, w4.c r10, w4.e r11, java.lang.String r12) {
            r8 = this;
            w4.b r4 = w4.b.f14847i
            r5 = 1
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r7 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public r(int r3, w4.c r4, w4.e r5, w4.e r6, int r7, boolean r8, java.lang.String r9) {
            r2 = this;
            r2.<init>()
            if (r4 == 0) goto L47
            if (r5 == 0) goto L40
            if (r6 == 0) goto L39
            r0 = 1
            if (r7 < r0) goto L2e
            r0 = 6
            if (r7 > r0) goto L2e
            int r1 = r6.size()
            if (r1 == 0) goto L1f
            if (r7 != r0) goto L18
            goto L1f
        L18:
            java.lang.String r3 = "exceptions / branchingness mismatch"
            j8.o.t(r3)
            r3 = 0
            throw r3
        L1f:
            r2.f13406a = r3
            r2.f13407b = r4
            r2.f13408c = r5
            r2.f13409d = r6
            r2.f13410e = r7
            r2.f13411f = r8
            r2.f13412g = r9
            return
        L2e:
            java.lang.String r3 = "invalid branchingness: "
            java.lang.String r3 = eh.a.l(r7, r3)
            j8.o.t(r3)
            r3 = 0
            throw r3
        L39:
            java.lang.String r3 = "exceptions == null"
            bsh.j.c(r3)
            r3 = 0
            throw r3
        L40:
            java.lang.String r3 = "sources == null"
            bsh.j.c(r3)
            r3 = 0
            throw r3
        L47:
            java.lang.String r3 = "result == null"
            bsh.j.c(r3)
            r3 = 0
            throw r3
    }

    public r(int r9, w4.c r10, w4.e r11, w4.e r12, java.lang.String r13) {
            r8 = this;
            r5 = 6
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public final boolean a() {
            r1 = this;
            w4.e r0 = r1.f13409d
            int r0 = r0.size()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L30
        L3:
            boolean r0 = r3 instanceof u4.r
            if (r0 != 0) goto L8
            goto L32
        L8:
            u4.r r3 = (u4.r) r3
            int r0 = r2.f13406a
            int r1 = r3.f13406a
            if (r0 != r1) goto L32
            int r0 = r2.f13410e
            int r1 = r3.f13410e
            if (r0 != r1) goto L32
            w4.c r0 = r2.f13407b
            w4.c r1 = r3.f13407b
            if (r0 != r1) goto L32
            w4.e r0 = r2.f13408c
            w4.e r1 = r3.f13408c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L32
            w4.e r0 = r2.f13409d
            w4.e r3 = r3.f13409d
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L32
        L30:
            r3 = 1
            return r3
        L32:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f13406a
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f13410e
            int r0 = r0 + r2
            int r0 = r0 * r1
            w4.c r2 = r3.f13407b
            java.lang.String r2 = r2.f14878g
            int r0 = eh.a.g(r0, r1, r2)
            w4.e r2 = r3.f13408c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            w4.e r0 = r3.f13409d
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 40
            r0.<init>(r1)
            java.lang.String r1 = "Rop{"
            r0.append(r1)
            int r1 = r8.f13406a
            java.lang.String r1 = f8.i.o0(r1)
            r0.append(r1)
            w4.c r1 = w4.c.f14874w
            java.lang.String r2 = " ."
            java.lang.String r3 = " "
            w4.c r4 = r8.f13407b
            if (r4 == r1) goto L26
            r0.append(r3)
            r0.append(r4)
            goto L29
        L26:
            r0.append(r2)
        L29:
            java.lang.String r1 = " <-"
            r0.append(r1)
            w4.e r1 = r8.f13408c
            int r4 = r1.size()
            r5 = 32
            r6 = 0
            if (r4 != 0) goto L3d
            r0.append(r2)
            goto L4d
        L3d:
            r2 = r6
        L3e:
            if (r2 >= r4) goto L4d
            r0.append(r5)
            w4.c r7 = r1.getType(r2)
            r0.append(r7)
            int r2 = r2 + 1
            goto L3e
        L4d:
            boolean r1 = r8.f13411f
            if (r1 == 0) goto L56
            java.lang.String r1 = " call"
            r0.append(r1)
        L56:
            w4.e r1 = r8.f13409d
            int r2 = r1.size()
            if (r2 == 0) goto L80
            java.lang.String r3 = " throws"
            r0.append(r3)
        L63:
            if (r6 >= r2) goto Lba
            r0.append(r5)
            w4.c r3 = r1.getType(r6)
            w4.c r4 = w4.c.H
            if (r3 != r4) goto L76
            java.lang.String r3 = "<any>"
            r0.append(r3)
            goto L7d
        L76:
            w4.c r3 = r1.getType(r6)
            r0.append(r3)
        L7d:
            int r6 = r6 + 1
            goto L63
        L80:
            r1 = 1
            int r2 = r8.f13410e
            if (r2 == r1) goto Lb5
            r1 = 2
            if (r2 == r1) goto Laf
            r1 = 3
            if (r2 == r1) goto La9
            r1 = 4
            if (r2 == r1) goto La3
            r1 = 5
            if (r2 == r1) goto L9d
            java.lang.String r1 = a.a.W0(r2)
            java.lang.String r1 = r3.concat(r1)
            r0.append(r1)
            goto Lba
        L9d:
            java.lang.String r1 = " switches"
            r0.append(r1)
            goto Lba
        La3:
            java.lang.String r1 = " ifs"
            r0.append(r1)
            goto Lba
        La9:
            java.lang.String r1 = " gotos"
            r0.append(r1)
            goto Lba
        Laf:
            java.lang.String r1 = " returns"
            r0.append(r1)
            goto Lba
        Lb5:
            java.lang.String r1 = " flows"
            r0.append(r1)
        Lba:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
