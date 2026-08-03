package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends r4.z {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4.a f11464h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v4.c0 f11465i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r4.t0 f11466j;

    public n0(w4.a r8) {
            r7 = this;
            r7.<init>()
            if (r8 == 0) goto L58
            w4.b r0 = r8.f14845i
            r7.f11464h = r8
            java.lang.Object[] r1 = r0.f22543h
            int r1 = r1.length
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r1 + 1
            r2.<init>(r3)
            w4.c r8 = r8.f14844h
            java.lang.String r8 = r8.f14878g
            r3 = 0
            char r8 = r8.charAt(r3)
            r4 = 76
            r5 = 91
            if (r8 != r5) goto L23
            r8 = r4
        L23:
            r2.append(r8)
            r8 = r3
        L27:
            if (r8 >= r1) goto L3e
            java.lang.Object r6 = r0.l(r8)
            w4.c r6 = (w4.c) r6
            java.lang.String r6 = r6.f14878g
            char r6 = r6.charAt(r3)
            if (r6 != r5) goto L38
            r6 = r4
        L38:
            r2.append(r6)
            int r8 = r8 + 1
            goto L27
        L3e:
            v4.c0 r8 = new v4.c0
            java.lang.String r1 = r2.toString()
            r8.<init>(r1)
            r7.f11465i = r8
            java.lang.Object[] r8 = r0.f22543h
            int r8 = r8.length
            if (r8 != 0) goto L50
            r8 = 0
            goto L55
        L50:
            r4.t0 r8 = new r4.t0
            r8.<init>(r0)
        L55:
            r7.f11466j = r8
            return
        L58:
            java.lang.String r8 = "prototype == null"
            bsh.j.c(r8)
            r8 = 0
            throw r8
    }

    @Override // r4.a0
    public final void a(r4.p r4) {
            r3 = this;
            r4.h0 r0 = r4.f11481f
            r4.h0 r1 = r4.f11482g
            r4.k0 r4 = r4.f11478c
            w4.a r2 = r3.f11464h
            w4.c r2 = r2.f14844h
            r1.t(r2)
            v4.c0 r1 = r3.f11465i
            r0.r(r1)
            r4.t0 r0 = r3.f11466j
            if (r0 == 0) goto L1e
            r4.l0 r4 = r4.l(r0)
            r4.t0 r4 = (r4.t0) r4
            r3.f11466j = r4
        L1e:
            return
    }

    @Override // r4.a0
    public final r4.b0 b() {
            r1 = this;
            r4.b0 r0 = r4.b0.f11360m
            return r0
    }

    @Override // r4.a0
    public final int c() {
            r1 = this;
            r0 = 12
            return r0
    }

    @Override // r4.a0
    public final void d(r4.p r11, z4.d r12) {
            r10 = this;
            r4.h0 r0 = r11.f11481f
            v4.c0 r1 = r10.f11465i
            int r0 = r0.l(r1)
            r4.h0 r11 = r11.f11482g
            w4.a r2 = r10.f11464h
            w4.c r3 = r2.f14844h
            w4.c r4 = r2.f14844h
            int r11 = r11.o(r3)
            r4.t0 r3 = r10.f11466j
            r5 = 0
            if (r3 != 0) goto L1b
            r3 = r5
            goto L1f
        L1b:
            int r3 = r3.f()
        L1f:
            boolean r6 = r12.d()
            if (r6 == 0) goto Lc7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r4.a()
            r6.append(r7)
            java.lang.String r7 = " proto("
            r6.append(r7)
            w4.b r2 = r2.f14845i
            java.lang.Object[] r7 = r2.f22543h
            int r7 = r7.length
            r8 = r5
        L3c:
            if (r8 >= r7) goto L55
            if (r8 == 0) goto L45
            java.lang.String r9 = ", "
            r6.append(r9)
        L45:
            java.lang.Object r9 = r2.l(r8)
            w4.c r9 = (w4.c) r9
            java.lang.String r9 = r9.a()
            r6.append(r9)
            int r8 = r8 + 1
            goto L3c
        L55:
            java.lang.String r2 = ")"
            r6.append(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = r10.f()
            r2.append(r7)
            r7 = 32
            r2.append(r7)
            java.lang.String r6 = r6.toString()
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r12.b(r5, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "  shorty_idx:      "
            r2.<init>(r5)
            java.lang.String r5 = a.a.Y0(r0)
            r2.append(r5)
            java.lang.String r5 = " // "
            r2.append(r5)
            java.lang.String r1 = r1.l()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r2 = 4
            r12.b(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r6 = "  return_type_idx: "
            r1.<init>(r6)
            java.lang.String r6 = a.a.Y0(r11)
            r1.append(r6)
            r1.append(r5)
            java.lang.String r4 = r4.a()
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r12.b(r2, r1)
            java.lang.String r1 = a.a.Y0(r3)
            java.lang.String r4 = "  parameters_off:  "
            java.lang.String r1 = r4.concat(r1)
            r12.b(r2, r1)
        Lc7:
            r12.k(r0)
            r12.k(r11)
            r12.k(r3)
            return
    }
}
