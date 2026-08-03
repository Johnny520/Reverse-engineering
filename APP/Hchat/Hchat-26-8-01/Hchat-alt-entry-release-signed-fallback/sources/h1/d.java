package h1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface d extends u2.c {
    static void D(x1.h0 r10, f1.s r11, long r12, long r14, long r16, h1.c r18, int r19) {
            r0 = r19 & 2
            if (r0 == 0) goto L6
            r12 = 0
        L6:
            r2 = r12
            r12 = r19 & 4
            if (r12 == 0) goto L17
            h1.b r12 = r10.f20932g
            long r12 = r12.a()
            long r12 = n0(r12, r2)
            r4 = r12
            goto L18
        L17:
            r4 = r14
        L18:
            r12 = r19 & 32
            if (r12 == 0) goto L20
            h1.f r12 = h1.f.f5043b
            r9 = r12
            goto L22
        L20:
            r9 = r18
        L22:
            r8 = 1065353216(0x3f800000, float:1.0)
            r0 = r10
            r1 = r11
            r6 = r16
            r0.m(r1, r2, r4, r6, r8, r9)
            return
    }

    static /* synthetic */ void O(h1.d r6, long r7, float r9, long r10, int r12) {
            r0 = r12 & 2
            if (r0 == 0) goto Lf
            long r0 = r6.a()
            float r9 = e1.e.b(r0)
            r0 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r0
        Lf:
            r1 = r9
            r9 = r12 & 4
            if (r9 == 0) goto L18
            long r10 = r6.I0()
        L18:
            r0 = r6
            r2 = r7
            r4 = r10
            r0.t0(r1, r2, r4)
            return
    }

    static /* synthetic */ void U(h1.d r7, f1.g r8, long r9, float r11, f1.n r12, int r13, int r14) {
            r0 = r14 & 2
            if (r0 == 0) goto L6
            r9 = 0
        L6:
            r2 = r9
            r9 = r14 & 4
            if (r9 == 0) goto Ld
            r11 = 1065353216(0x3f800000, float:1.0)
        Ld:
            r4 = r11
            r9 = r14 & 16
            if (r9 == 0) goto L13
            r12 = 0
        L13:
            r5 = r12
            r9 = r14 & 32
            if (r9 == 0) goto L19
            r13 = 3
        L19:
            r0 = r7
            r1 = r8
            r6 = r13
            r0.W0(r1, r2, r4, r5, r6)
            return
    }

    static void U0(h1.d r13, f1.g r14, long r15, long r17, float r19, f1.n r20, int r21, int r22) {
            r0 = r22
            r1 = r0 & 16
            if (r1 == 0) goto L8
            r8 = r15
            goto La
        L8:
            r8 = r17
        La:
            r1 = r0 & 32
            if (r1 == 0) goto L12
            r1 = 1065353216(0x3f800000, float:1.0)
            r10 = r1
            goto L14
        L12:
            r10 = r19
        L14:
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L1b
            r0 = 1
            r12 = r0
            goto L1d
        L1b:
            r12 = r21
        L1d:
            r4 = 0
            r2 = r13
            r3 = r14
            r6 = r15
            r11 = r20
            r2.v0(r3, r4, r6, r8, r10, r11, r12)
            return
    }

    static /* synthetic */ void V0(h1.d r9, f1.s r10, long r11, long r13, float r15, h1.c r16, int r17, int r18) {
            r0 = r18 & 2
            if (r0 == 0) goto L6
            r11 = 0
        L6:
            r2 = r11
            r11 = r18 & 4
            if (r11 == 0) goto L15
            long r11 = r9.a()
            long r11 = n0(r11, r2)
            r4 = r11
            goto L16
        L15:
            r4 = r13
        L16:
            r11 = r18 & 8
            if (r11 == 0) goto L1e
            r11 = 1065353216(0x3f800000, float:1.0)
            r6 = r11
            goto L1f
        L1e:
            r6 = r15
        L1f:
            r11 = r18 & 16
            if (r11 == 0) goto L27
            h1.f r11 = h1.f.f5043b
            r7 = r11
            goto L29
        L27:
            r7 = r16
        L29:
            r11 = r18 & 64
            if (r11 == 0) goto L32
            r11 = 3
            r8 = r11
        L2f:
            r0 = r9
            r1 = r10
            goto L35
        L32:
            r8 = r17
            goto L2f
        L35:
            r0.d0(r1, r2, r4, r6, r7, r8)
            return
    }

    static /* synthetic */ void Z(h1.d r11, long r12, long r14, float r16, int r17, int r18) {
            r0 = r18 & 4
            r4 = 0
            if (r0 == 0) goto Le
            long r14 = r11.a()
            long r14 = n0(r14, r4)
        Le:
            r6 = r14
            r14 = r18 & 8
            if (r14 == 0) goto L17
            r14 = 1065353216(0x3f800000, float:1.0)
            r8 = r14
            goto L19
        L17:
            r8 = r16
        L19:
            r14 = r18 & 64
            if (r14 == 0) goto L20
            r14 = 3
            r10 = r14
            goto L22
        L20:
            r10 = r17
        L22:
            h1.f r9 = h1.f.f5043b
            r1 = r11
            r2 = r12
            r1.P0(r2, r4, r6, r8, r9, r10)
            return
    }

    static long n0(long r6, long r8) {
            r0 = 32
            long r1 = r6 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r2 = r8 >> r0
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r1 = r1 - r2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r2
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            long r7 = r8 & r2
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            float r6 = r6 - r7
            int r7 = java.lang.Float.floatToRawIntBits(r1)
            long r7 = (long) r7
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r4 = (long) r6
            long r6 = r7 << r0
            long r8 = r4 & r2
            long r6 = r6 | r8
            return r6
    }

    static /* synthetic */ void s0(h1.d r6, f1.j r7, f1.s r8, float r9, h1.g r10, int r11) {
            r0 = r11 & 4
            if (r0 == 0) goto L6
            r9 = 1065353216(0x3f800000, float:1.0)
        L6:
            r3 = r9
            r9 = r11 & 8
            if (r9 == 0) goto Ld
            h1.f r10 = h1.f.f5043b
        Ld:
            r4 = r10
            r9 = r11 & 32
            if (r9 == 0) goto L18
            r9 = 3
        L13:
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r9
            goto L1a
        L18:
            r9 = 0
            goto L13
        L1a:
            r0.V(r1, r2, r3, r4, r5)
            return
    }

    void F0(f1.j r1, long r2, float r4, h1.c r5);

    default long I0() {
            r2 = this;
            b5.c r0 = r2.z0()
            long r0 = r0.v()
            long r0 = f8.i.B(r0)
            return r0
    }

    void P0(long r1, long r3, long r5, float r7, h1.c r8, int r9);

    void V(f1.j r1, f1.s r2, float r3, h1.c r4, int r5);

    void W0(f1.g r1, long r2, float r4, f1.n r5, int r6);

    default long a() {
            r2 = this;
            b5.c r0 = r2.z0()
            long r0 = r0.v()
            return r0
    }

    void a0(long r1, long r3, long r5, float r7);

    void d0(f1.s r1, long r2, long r4, float r6, h1.c r7, int r8);

    u2.m getLayoutDirection();

    void t0(float r1, long r2, long r4);

    void v0(f1.g r1, long r2, long r4, long r6, float r8, f1.n r9, int r10);

    void x(long r1, long r3, h1.c r5);

    default void y(long r7, fg.l r9, i1.b r10) {
            r6 = this;
            u2.m r2 = r6.getLayoutDirection()
            f1.p r5 = new f1.p
            r0 = 3
            r5.<init>(r6, r0, r9)
            r1 = r6
            r3 = r7
            r0 = r10
            r0.e(r1, r2, r3, r5)
            return
    }

    b5.c z0();
}
