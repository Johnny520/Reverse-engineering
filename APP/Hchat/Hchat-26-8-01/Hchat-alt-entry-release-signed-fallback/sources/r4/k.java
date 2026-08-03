package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends r4.z {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v4.d0 f11424h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f11425i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v4.d0 f11426j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public r4.t0 f11427k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v4.c0 f11428l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r4.j f11429m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public r4.q f11430n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public r4.e f11431o;

    public k(v4.d0 r1, int r2, v4.d0 r3, w4.e r4, v4.c0 r5) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L41
            if (r4 == 0) goto L3a
            r0.f11424h = r1
            r0.f11425i = r2
            r0.f11426j = r3
            int r2 = r4.size()
            r3 = 0
            if (r2 != 0) goto L16
            r2 = r3
            goto L1b
        L16:
            r4.t0 r2 = new r4.t0
            r2.<init>(r4)
        L1b:
            r0.f11427k = r2
            r0.f11428l = r5
            r4.j r2 = new r4.j
            r2.<init>(r1)
            r0.f11429m = r2
            r0.f11430n = r3
            r4.e r1 = new r4.e
            r2 = 4
            r4 = -1
            r1.<init>(r2, r4)
            r1.f11394k = r3
            r1.f11395l = r3
            r1.f11396m = r3
            r1.f11397n = r3
            r0.f11431o = r1
            return
        L3a:
            java.lang.String r1 = "interfaces == null"
            bsh.j.c(r1)
            r1 = 0
            throw r1
        L41:
            java.lang.String r1 = "thisClass == null"
            bsh.j.c(r1)
            r1 = 0
            throw r1
    }

    @Override // r4.a0
    public final void a(r4.p r8) {
            r7 = this;
            r4.h0 r0 = r8.f11482g
            r4.k0 r1 = r8.f11490o
            r4.k0 r2 = r8.f11477b
            r4.k0 r3 = r8.f11478c
            r4.h0 r4 = r8.f11481f
            v4.d0 r5 = r7.f11424h
            r0.p(r5)
            r4.j r5 = r7.f11429m
            boolean r6 = r5.r()
            if (r6 != 0) goto L2f
            r4.k0 r8 = r8.f11487l
            r8.k(r5)
            v4.d r8 = r5.q()
            if (r8 == 0) goto L2f
            r4.q r5 = new r4.q
            r5.<init>(r8)
            r4.l0 r8 = r1.l(r5)
            r4.q r8 = (r4.q) r8
            r7.f11430n = r8
        L2f:
            v4.d0 r8 = r7.f11426j
            if (r8 == 0) goto L36
            r0.p(r8)
        L36:
            r4.t0 r8 = r7.f11427k
            if (r8 == 0) goto L42
            r4.l0 r8 = r3.l(r8)
            r4.t0 r8 = (r4.t0) r8
            r7.f11427k = r8
        L42:
            v4.c0 r8 = r7.f11428l
            if (r8 == 0) goto L49
            r4.r(r8)
        L49:
            r4.e r8 = r7.f11431o
            r4.b r0 = r8.f11394k
            if (r0 != 0) goto L5c
            java.util.ArrayList r1 = r8.f11395l
            if (r1 != 0) goto L5c
            java.util.ArrayList r1 = r8.f11396m
            if (r1 != 0) goto L5c
            java.util.ArrayList r1 = r8.f11397n
            if (r1 != 0) goto L5c
            return
        L5c:
            if (r0 == 0) goto L6c
            java.util.ArrayList r0 = r8.f11395l
            if (r0 != 0) goto L6c
            java.util.ArrayList r0 = r8.f11396m
            if (r0 != 0) goto L6c
            java.util.ArrayList r0 = r8.f11397n
            if (r0 != 0) goto L6c
            r0 = 1
            goto L6d
        L6c:
            r0 = 0
        L6d:
            if (r0 == 0) goto L78
            r4.l0 r8 = r2.l(r8)
            r4.e r8 = (r4.e) r8
            r7.f11431o = r8
            return
        L78:
            r2.k(r8)
            return
    }

    @Override // r4.a0
    public final r4.b0 b() {
            r1 = this;
            r4.b0 r0 = r4.b0.f11363p
            return r0
    }

    @Override // r4.a0
    public final int c() {
            r1 = this;
            r0 = 32
            return r0
    }

    @Override // r4.a0
    public final void d(r4.p r18, z4.d r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r2.d()
            r4.h0 r4 = r1.f11482g
            v4.d0 r5 = r0.f11424h
            int r6 = r4.m(r5)
            r7 = -1
            v4.d0 r8 = r0.f11426j
            if (r8 != 0) goto L19
            r4 = r7
            goto L1d
        L19:
            int r4 = r4.m(r8)
        L1d:
            r4.t0 r9 = r0.f11427k
            r10 = 0
            if (r9 != 0) goto L24
            r9 = r10
            goto L28
        L24:
            int r9 = r9.f()
        L28:
            r4.e r11 = r0.f11431o
            r4.b r12 = r11.f11394k
            if (r12 != 0) goto L3c
            java.util.ArrayList r12 = r11.f11395l
            if (r12 != 0) goto L3c
            java.util.ArrayList r12 = r11.f11396m
            if (r12 != 0) goto L3c
            java.util.ArrayList r12 = r11.f11397n
            if (r12 != 0) goto L3c
            r11 = r10
            goto L40
        L3c:
            int r11 = r11.f()
        L40:
            v4.c0 r12 = r0.f11428l
            if (r12 != 0) goto L45
            goto L4b
        L45:
            r4.h0 r1 = r1.f11481f
            int r7 = r1.l(r12)
        L4b:
            r4.j r1 = r0.f11429m
            boolean r13 = r1.r()
            if (r13 == 0) goto L55
            r1 = r10
            goto L59
        L55:
            int r1 = r1.f()
        L59:
            r4.q r13 = r0.f11430n
            if (r13 != 0) goto L5f
            r13 = r10
            goto L63
        L5f:
            int r13 = r13.f()
        L63:
            int r14 = r0.f11425i
            if (r3 == 0) goto L15e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r15 = r0.f()
            r3.append(r15)
            r15 = 32
            r3.append(r15)
            w4.c r5 = r5.f14088g
            java.lang.String r5 = r5.a()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r2.b(r10, r3)
            java.lang.String r3 = a.a.Y0(r6)
            java.lang.String r5 = "  class_idx:           "
            java.lang.String r3 = r5.concat(r3)
            r5 = 4
            r2.b(r5, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r15 = "  access_flags:        "
            r3.<init>(r15)
            r15 = 30257(0x7631, float:4.2399E-41)
            r10 = 1
            java.lang.String r10 = be.h.A(r14, r15, r10)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            r2.b(r5, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r10 = "  superclass_idx:      "
            r3.<init>(r10)
            java.lang.String r10 = a.a.Y0(r4)
            r3.append(r10)
            java.lang.String r10 = " // "
            r3.append(r10)
            java.lang.String r15 = "<none>"
            if (r8 != 0) goto Lc7
            r8 = r15
            goto Lcd
        Lc7:
            w4.c r8 = r8.f14088g
            java.lang.String r8 = r8.a()
        Lcd:
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            r2.b(r5, r3)
            java.lang.String r3 = a.a.Y0(r9)
            java.lang.String r8 = "  interfaces_off:      "
            java.lang.String r3 = r8.concat(r3)
            r2.b(r5, r3)
            if (r9 == 0) goto L114
            r4.t0 r3 = r0.f11427k
            w4.e r3 = r3.f11509k
            int r8 = r3.size()
            r5 = 0
        Lef:
            if (r5 >= r8) goto L114
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r16 = r8
            java.lang.String r8 = "    "
            r0.<init>(r8)
            w4.c r8 = r3.getType(r5)
            java.lang.String r8 = r8.a()
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            r8 = 0
            r2.b(r8, r0)
            int r5 = r5 + 1
            r0 = r17
            r8 = r16
            goto Lef
        L114:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "  source_file_idx:     "
            r0.<init>(r3)
            java.lang.String r3 = a.a.Y0(r7)
            r0.append(r3)
            r0.append(r10)
            if (r12 != 0) goto L128
            goto L12c
        L128:
            java.lang.String r15 = r12.a()
        L12c:
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r3 = 4
            r2.b(r3, r0)
            java.lang.String r0 = a.a.Y0(r11)
            java.lang.String r5 = "  annotations_off:     "
            java.lang.String r0 = r5.concat(r0)
            r2.b(r3, r0)
            java.lang.String r0 = a.a.Y0(r1)
            java.lang.String r5 = "  class_data_off:      "
            java.lang.String r0 = r5.concat(r0)
            r2.b(r3, r0)
            java.lang.String r0 = a.a.Y0(r13)
            java.lang.String r5 = "  static_values_off:   "
            java.lang.String r0 = r5.concat(r0)
            r2.b(r3, r0)
        L15e:
            r2.k(r6)
            r2.k(r14)
            r2.k(r4)
            r2.k(r9)
            r2.k(r7)
            r2.k(r11)
            r2.k(r1)
            r2.k(r13)
            return
    }

    public final void i(r4.r r3, v4.a r4) {
            r2 = this;
            r4.j r0 = r2.f11429m
            v4.d r1 = r0.f11421q
            if (r1 != 0) goto L11
            java.util.ArrayList r1 = r0.f11416l
            r1.add(r3)
            java.util.HashMap r0 = r0.f11417m
            r0.put(r3, r4)
            return
        L11:
            java.lang.String r3 = "static fields already sorted"
            j8.o.w(r3)
            return
    }
}
