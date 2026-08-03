package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends y0.n implements x1.m, x1.m1, x1.z1 {
    public f1.c0 A;
    public f1.r0 B;
    public f1.c0 C;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f7021u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public f1.s f7022v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f7023w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public f1.r0 f7024x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f7025y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public u2.m f7026z;

    @Override // x1.z1
    public final boolean A() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // x1.m
    public final void B(x1.h0 r32) {
            r31 = this;
            r0 = r31
            r1 = r32
            h1.b r7 = r1.f20932g
            f1.r0 r2 = r0.f7024x
            f1.m0 r3 = f1.c0.f3038b
            if (r2 != r3) goto L3a
            long r2 = r0.f7021u
            long r4 = f1.w.f3131g
            boolean r2 = f1.w.c(r2, r4)
            if (r2 != 0) goto L21
            long r2 = r0.f7021u
            r7 = 0
            r8 = 126(0x7e, float:1.77E-43)
            r4 = 0
            r6 = 0
            h1.d.Z(r1, r2, r4, r6, r7, r8)
        L21:
            f1.s r2 = r0.f7022v
            if (r2 == 0) goto L36
            float r7 = r0.f7023w
            r9 = 0
            r10 = 118(0x76, float:1.65E-43)
            r3 = 0
            r5 = 0
            r8 = 0
            r1 = r32
            h1.d.V0(r1, r2, r3, r5, r7, r8, r9, r10)
            goto L23e
        L36:
            r1 = r32
            goto L23e
        L3a:
            long r2 = r7.a()
            long r4 = r0.f7025y
            boolean r2 = e1.e.a(r2, r4)
            if (r2 == 0) goto L5f
            u2.m r2 = r1.getLayoutDirection()
            u2.m r3 = r0.f7026z
            if (r2 != r3) goto L5f
            f1.r0 r2 = r0.B
            f1.r0 r3 = r0.f7024x
            boolean r2 = gg.l.a(r2, r3)
            if (r2 == 0) goto L5f
            f1.c0 r2 = r0.A
            r2.getClass()
        L5d:
            r11 = r2
            goto L6f
        L5f:
            aa.c r2 = new aa.c
            r3 = 20
            r2.<init>(r0, r3, r1)
            x1.k.r(r0, r2)
            f1.c0 r2 = r0.C
            r3 = 0
            r0.C = r3
            goto L5d
        L6f:
            r0.A = r11
            long r2 = r7.a()
            r0.f7025y = r2
            u2.m r2 = r1.getLayoutDirection()
            r0.f7026z = r2
            f1.r0 r2 = r0.f7024x
            r0.B = r2
            r11.getClass()
            long r2 = r0.f7021u
            long r4 = f1.w.f3131g
            boolean r2 = f1.w.c(r2, r4)
            r12 = 32
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            h1.f r5 = h1.f.f5043b
            if (r2 != 0) goto L18e
            long r2 = r0.f7021u
            boolean r4 = r11 instanceof f1.k0
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r4 == 0) goto Lc6
            r4 = r11
            f1.k0 r4 = (f1.k0) r4
            e1.c r4 = r4.f3073f
            float r6 = r4.f2296a
            float r7 = r4.f2297b
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r9 = (long) r6
            int r6 = java.lang.Float.floatToRawIntBits(r7)
            long r6 = (long) r6
            long r9 = r9 << r12
            long r6 = r6 & r13
            long r6 = r6 | r9
            long r9 = f1.c0.r(r4)
            r29 = r9
            r9 = r5
            r4 = r6
            r6 = r29
            r10 = 3
            r1.P0(r2, r4, r6, r8, r9, r10)
            r5 = r9
            goto L18e
        Lc6:
            boolean r1 = r11 instanceof f1.l0
            if (r1 == 0) goto L172
            r9 = r11
            f1.l0 r9 = (f1.l0) r9
            r3 = r2
            f1.j r2 = r9.f3075g
            if (r2 == 0) goto Ldc
            r1 = r32
            r6 = r5
            r5 = r8
            r1.F0(r2, r3, r5, r6)
            r5 = r6
            goto L18e
        Ldc:
            r2 = r3
            e1.d r1 = r9.f3074f
            float r4 = r1.f2301b
            float r6 = r1.f2300a
            long r8 = r1.f2307h
            long r8 = r8 >> r12
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            int r9 = java.lang.Float.floatToRawIntBits(r6)
            long r9 = (long) r9
            int r15 = java.lang.Float.floatToRawIntBits(r4)
            r16 = r12
            r17 = r13
            long r12 = (long) r15
            long r9 = r9 << r16
            long r12 = r12 & r17
            long r9 = r9 | r12
            float r12 = r1.f2302c
            float r12 = r12 - r6
            float r1 = r1.f2303d
            float r1 = r1 - r4
            int r4 = java.lang.Float.floatToRawIntBits(r12)
            long r12 = (long) r4
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r14 = (long) r1
            long r12 = r12 << r16
            long r14 = r14 & r17
            long r12 = r12 | r14
            int r1 = java.lang.Float.floatToRawIntBits(r8)
            long r14 = (long) r1
            int r1 = java.lang.Float.floatToRawIntBits(r8)
            r19 = r2
            long r1 = (long) r1
            long r3 = r14 << r16
            long r1 = r1 & r17
            long r1 = r1 | r3
            h1.a r3 = r7.f5037g
            f1.u r8 = r3.f5035c
            long r3 = r9 >> r16
            int r3 = (int) r3
            float r22 = java.lang.Float.intBitsToFloat(r3)
            long r9 = r9 & r17
            int r4 = (int) r9
            float r23 = java.lang.Float.intBitsToFloat(r4)
            float r3 = java.lang.Float.intBitsToFloat(r3)
            long r9 = r12 >> r16
            int r6 = (int) r9
            float r6 = java.lang.Float.intBitsToFloat(r6)
            float r24 = r6 + r3
            float r3 = java.lang.Float.intBitsToFloat(r4)
            long r9 = r12 & r17
            int r4 = (int) r9
            float r4 = java.lang.Float.intBitsToFloat(r4)
            float r25 = r4 + r3
            long r3 = r1 >> r16
            int r3 = (int) r3
            float r26 = java.lang.Float.intBitsToFloat(r3)
            long r1 = r1 & r17
            int r1 = (int) r1
            float r27 = java.lang.Float.intBitsToFloat(r1)
            r6 = r5
            r5 = 1065353216(0x3f800000, float:1.0)
            r9 = r6
            r6 = 3
            r1 = r7
            r4 = r9
            r2 = r19
            f1.h r28 = h1.b.e(r1, r2, r4, r5, r6)
            r5 = r4
            r21 = r8
            r21.q(r22, r23, r24, r25, r26, r27, r28)
            goto L192
        L172:
            r16 = r12
            r17 = r13
            boolean r1 = r11 instanceof f1.j0
            if (r1 == 0) goto L18a
            r1 = r11
            f1.j0 r1 = (f1.j0) r1
            f1.j r1 = r1.f3071f
            r3 = r2
            r6 = r5
            r5 = r8
            r2 = r1
            r1 = r32
            r1.F0(r2, r3, r5, r6)
            r5 = r6
            goto L192
        L18a:
            okio.a.k()
            return
        L18e:
            r16 = r12
            r17 = r13
        L192:
            f1.s r2 = r0.f7022v
            if (r2 == 0) goto L23e
            float r4 = r0.f7023w
            boolean r1 = r11 instanceof f1.k0
            r6 = 3
            if (r1 == 0) goto L1ca
            f1.k0 r11 = (f1.k0) r11
            e1.c r1 = r11.f3073f
            float r3 = r1.f2296a
            float r7 = r1.f2297b
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r8 = (long) r3
            int r3 = java.lang.Float.floatToRawIntBits(r7)
            long r10 = (long) r3
            long r7 = r8 << r16
            long r9 = r10 & r17
            long r7 = r7 | r9
            long r9 = f1.c0.r(r1)
            r29 = r7
            r7 = r4
            r3 = r29
            r1 = r32
            r8 = r5
            r29 = r9
            r9 = r6
            r5 = r29
            r1.d0(r2, r3, r5, r7, r8, r9)
            goto L23e
        L1ca:
            boolean r1 = r11 instanceof f1.l0
            if (r1 == 0) goto L22f
            f1.l0 r11 = (f1.l0) r11
            r3 = r2
            f1.j r2 = r11.f3075g
            if (r2 == 0) goto L1db
        L1d5:
            r1 = r32
            r1.V(r2, r3, r4, r5, r6)
            goto L23e
        L1db:
            r2 = r3
            e1.d r1 = r11.f3074f
            float r3 = r1.f2301b
            float r6 = r1.f2300a
            long r7 = r1.f2307h
            long r7 = r7 >> r16
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            int r8 = java.lang.Float.floatToRawIntBits(r6)
            long r8 = (long) r8
            int r10 = java.lang.Float.floatToRawIntBits(r3)
            long r10 = (long) r10
            long r8 = r8 << r16
            long r10 = r10 & r17
            long r8 = r8 | r10
            float r10 = r1.f2302c
            float r10 = r10 - r6
            float r1 = r1.f2303d
            float r1 = r1 - r3
            int r3 = java.lang.Float.floatToRawIntBits(r10)
            long r10 = (long) r3
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r12 = (long) r1
            long r10 = r10 << r16
            long r12 = r12 & r17
            long r10 = r10 | r12
            int r1 = java.lang.Float.floatToRawIntBits(r7)
            long r12 = (long) r1
            int r1 = java.lang.Float.floatToRawIntBits(r7)
            long r6 = (long) r1
            long r12 = r12 << r16
            long r6 = r6 & r17
            long r6 = r6 | r12
            r29 = r8
            r9 = r4
            r3 = r29
            r1 = r32
            r7 = r6
            r29 = r10
            r10 = r5
            r5 = r29
            r1.m(r2, r3, r5, r7, r9, r10)
            goto L23e
        L22f:
            boolean r1 = r11 instanceof f1.j0
            if (r1 == 0) goto L23a
            f1.j0 r11 = (f1.j0) r11
            f1.j r1 = r11.f3071f
            r3 = r2
            r2 = r1
            goto L1d5
        L23a:
            okio.a.k()
            return
        L23e:
            r32.e()
            return
    }

    @Override // x1.m1
    public final void C0() {
            r2 = this;
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r2.f7025y = r0
            r0 = 0
            r2.f7026z = r0
            r2.A = r0
            r2.B = r0
            x1.k.l(r2)
            return
    }

    @Override // x1.z1
    public final void X0(f2.y r2) {
            r1 = this;
            f1.r0 r0 = r1.f7024x
            f2.w.d(r2, r0)
            return
    }
}
