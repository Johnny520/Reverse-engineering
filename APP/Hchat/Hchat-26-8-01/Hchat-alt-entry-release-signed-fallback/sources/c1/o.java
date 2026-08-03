package c1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends y0.n implements x1.v, x1.m {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public k1.b f996u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f997v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public y0.c f998w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public v1.s0 f999x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f1000y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public f1.n f1001z;

    public static boolean l1(long r2) {
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            boolean r0 = e1.e.a(r2, r0)
            if (r0 != 0) goto L24
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            r3 = 2147483647(0x7fffffff, float:NaN)
            r2 = r2 & r3
            r3 = 2139095040(0x7f800000, float:Infinity)
            if (r2 >= r3) goto L24
            r2 = 1
            return r2
        L24:
            r2 = 0
            return r2
    }

    public static boolean m1(long r2) {
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            boolean r0 = e1.e.a(r2, r0)
            if (r0 != 0) goto L21
            r0 = 32
            long r2 = r2 >> r0
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            r3 = 2147483647(0x7fffffff, float:NaN)
            r2 = r2 & r3
            r3 = 2139095040(0x7f800000, float:Infinity)
            if (r2 >= r3) goto L21
            r2 = 1
            return r2
        L21:
            r2 = 0
            return r2
    }

    @Override // x1.m
    public final void B(x1.h0 r18) {
            r17 = this;
            r1 = r17
            r3 = r18
            h1.b r8 = r3.f20932g
            k1.b r0 = r1.f996u
            long r4 = r0.d()
            boolean r0 = m1(r4)
            r2 = 32
            if (r0 == 0) goto L1c
            long r6 = r4 >> r2
            int r0 = (int) r6
            float r0 = java.lang.Float.intBitsToFloat(r0)
            goto L26
        L1c:
            long r6 = r8.a()
            long r6 = r6 >> r2
            int r0 = (int) r6
            float r0 = java.lang.Float.intBitsToFloat(r0)
        L26:
            boolean r6 = l1(r4)
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r6 == 0) goto L38
            long r4 = r4 & r9
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            goto L42
        L38:
            long r4 = r8.a()
            long r4 = r4 & r9
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
        L42:
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r5 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r4)
            long r11 = (long) r0
            long r4 = r5 << r2
            long r6 = r11 & r9
            long r4 = r4 | r6
            long r6 = r8.a()
            long r6 = r6 >> r2
            int r0 = (int) r6
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L61
            goto L6f
        L61:
            long r11 = r8.a()
            long r11 = r11 & r9
            int r0 = (int) r11
            float r0 = java.lang.Float.intBitsToFloat(r0)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L72
        L6f:
            r4 = 0
            goto L80
        L72:
            v1.s0 r0 = r1.f999x
            long r6 = r8.a()
            long r6 = r0.a(r4, r6)
            long r4 = v1.w.o(r4, r6)
        L80:
            y0.c r11 = r1.f998w
            long r6 = r4 >> r2
            int r0 = (int) r6
            float r0 = java.lang.Float.intBitsToFloat(r0)
            int r0 = java.lang.Math.round(r0)
            long r6 = r4 & r9
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            int r6 = java.lang.Math.round(r6)
            long r12 = (long) r0
            long r12 = r12 << r2
            long r6 = (long) r6
            long r6 = r6 & r9
            long r12 = r12 | r6
            long r6 = r8.a()
            long r6 = r6 >> r2
            int r0 = (int) r6
            float r0 = java.lang.Float.intBitsToFloat(r0)
            int r0 = java.lang.Math.round(r0)
            long r6 = r8.a()
            long r6 = r6 & r9
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            int r6 = java.lang.Math.round(r6)
            long r14 = (long) r0
            long r14 = r14 << r2
            long r6 = (long) r6
            long r6 = r6 & r9
            long r14 = r14 | r6
            u2.m r16 = r3.getLayoutDirection()
            long r6 = r11.a(r12, r14, r16)
            long r11 = r6 >> r2
            int r0 = (int) r11
            float r11 = (float) r0
            long r6 = r6 & r9
            int r0 = (int) r6
            float r9 = (float) r0
            b5.c r0 = r8.f5038h
            java.lang.Object r0 = r0.f469a
            androidx.lifecycle.x r0 = (androidx.lifecycle.x) r0
            r0.c0(r11, r9)
            k1.b r2 = r1.f996u     // Catch: java.lang.Throwable -> Lee
            float r6 = r1.f1000y     // Catch: java.lang.Throwable -> Lee
            f1.n r7 = r1.f1001z     // Catch: java.lang.Throwable -> Lee
            r2.c(r3, r4, r6, r7)     // Catch: java.lang.Throwable -> Lee
            b5.c r0 = r8.f5038h
            java.lang.Object r0 = r0.f469a
            androidx.lifecycle.x r0 = (androidx.lifecycle.x) r0
            float r2 = -r11
            float r3 = -r9
            r0.c0(r2, r3)
            r18.e()
            return
        Lee:
            r0 = move-exception
            b5.c r2 = r8.f5038h
            java.lang.Object r2 = r2.f469a
            androidx.lifecycle.x r2 = (androidx.lifecycle.x) r2
            float r3 = -r11
            float r4 = -r9
            r2.c0(r3, r4)
            throw r0
    }

    @Override // x1.v
    public final int G(x1.n0 r3, v1.m0 r4, int r5) {
            r2 = this;
            boolean r3 = r2.k1()
            if (r3 == 0) goto L1d
            r3 = 7
            r0 = 0
            long r0 = u2.b.b(r0, r0, r0, r5, r3)
            long r0 = r2.n1(r0)
            int r3 = r4.G(r5)
            int r4 = u2.a.j(r0)
            int r3 = java.lang.Math.max(r4, r3)
            return r3
        L1d:
            int r3 = r4.G(r5)
            return r3
    }

    @Override // x1.v
    public final int K0(x1.n0 r3, v1.m0 r4, int r5) {
            r2 = this;
            boolean r3 = r2.k1()
            if (r3 == 0) goto L1e
            r3 = 13
            r0 = 0
            long r0 = u2.b.b(r0, r5, r0, r0, r3)
            long r0 = r2.n1(r0)
            int r3 = r4.p0(r5)
            int r4 = u2.a.i(r0)
            int r3 = java.lang.Math.max(r4, r3)
            return r3
        L1e:
            int r3 = r4.p0(r5)
            return r3
    }

    @Override // x1.v
    public final int Q(x1.n0 r3, v1.m0 r4, int r5) {
            r2 = this;
            boolean r3 = r2.k1()
            if (r3 == 0) goto L1d
            r3 = 7
            r0 = 0
            long r0 = u2.b.b(r0, r0, r0, r5, r3)
            long r0 = r2.n1(r0)
            int r3 = r4.M(r5)
            int r4 = u2.a.j(r0)
            int r3 = java.lang.Math.max(r4, r3)
            return r3
        L1d:
            int r3 = r4.M(r5)
            return r3
    }

    @Override // x1.v
    public final int R0(x1.n0 r3, v1.m0 r4, int r5) {
            r2 = this;
            boolean r3 = r2.k1()
            if (r3 == 0) goto L1e
            r3 = 13
            r0 = 0
            long r0 = u2.b.b(r0, r5, r0, r0, r3)
            long r0 = r2.n1(r0)
            int r3 = r4.j(r5)
            int r4 = u2.a.i(r0)
            int r3 = java.lang.Math.max(r4, r3)
            return r3
        L1e:
            int r3 = r4.j(r5)
            return r3
    }

    @Override // y0.n
    public final boolean Z0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // x1.v
    public final v1.o0 j(v1.p0 r3, v1.m0 r4, long r5) {
            r2 = this;
            long r5 = r2.n1(r5)
            v1.b1 r4 = r4.Q(r5)
            int r5 = r4.f13900g
            int r6 = r4.f13901h
            c1.n r0 = new c1.n
            r1 = 0
            r0.<init>(r4, r1)
            tf.u r4 = tf.u.f13168g
            v1.o0 r3 = r3.z(r5, r6, r4, r0)
            return r3
    }

    public final boolean k1() {
            r4 = this;
            boolean r0 = r4.f997v
            if (r0 == 0) goto L15
            k1.b r0 = r4.f996u
            long r0 = r0.d()
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L15
            r0 = 1
            return r0
        L15:
            r0 = 0
            return r0
    }

    public final long n1(long r12) {
            r11 = this;
            boolean r0 = u2.a.d(r12)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L10
            boolean r0 = u2.a.c(r12)
            if (r0 == 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            boolean r3 = u2.a.f(r12)
            if (r3 == 0) goto L1e
            boolean r3 = u2.a.e(r12)
            if (r3 == 0) goto L1e
            r1 = r2
        L1e:
            boolean r2 = r11.k1()
            if (r2 != 0) goto L26
            if (r0 != 0) goto L28
        L26:
            if (r1 == 0) goto L3a
        L28:
            int r5 = u2.a.h(r12)
            int r7 = u2.a.g(r12)
            r8 = 0
            r9 = 10
            r6 = 0
            r3 = r12
            long r12 = u2.a.a(r3, r5, r6, r7, r8, r9)
            return r12
        L3a:
            r0 = r12
            k1.b r12 = r11.f996u
            long r12 = r12.d()
            boolean r2 = m1(r12)
            r3 = 32
            if (r2 == 0) goto L55
            long r4 = r12 >> r3
            int r2 = (int) r4
            float r2 = java.lang.Float.intBitsToFloat(r2)
            int r2 = java.lang.Math.round(r2)
            goto L59
        L55:
            int r2 = u2.a.j(r0)
        L59:
            boolean r4 = l1(r12)
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r4 == 0) goto L6f
            long r12 = r12 & r5
            int r12 = (int) r12
            float r12 = java.lang.Float.intBitsToFloat(r12)
            int r12 = java.lang.Math.round(r12)
            goto L73
        L6f:
            int r12 = u2.a.i(r0)
        L73:
            int r13 = u2.b.g(r2, r0)
            int r12 = u2.b.f(r12, r0)
            float r13 = (float) r13
            float r12 = (float) r12
            int r13 = java.lang.Float.floatToRawIntBits(r13)
            long r7 = (long) r13
            int r12 = java.lang.Float.floatToRawIntBits(r12)
            long r12 = (long) r12
            long r7 = r7 << r3
            long r12 = r12 & r5
            long r12 = r12 | r7
            boolean r2 = r11.k1()
            if (r2 != 0) goto L92
            goto L104
        L92:
            k1.b r2 = r11.f996u
            long r7 = r2.d()
            boolean r2 = m1(r7)
            if (r2 != 0) goto La6
            long r7 = r12 >> r3
            int r2 = (int) r7
            float r2 = java.lang.Float.intBitsToFloat(r2)
            goto Lb2
        La6:
            k1.b r2 = r11.f996u
            long r7 = r2.d()
            long r7 = r7 >> r3
            int r2 = (int) r7
            float r2 = java.lang.Float.intBitsToFloat(r2)
        Lb2:
            k1.b r4 = r11.f996u
            long r7 = r4.d()
            boolean r4 = l1(r7)
            if (r4 != 0) goto Lc6
            long r7 = r12 & r5
            int r4 = (int) r7
            float r4 = java.lang.Float.intBitsToFloat(r4)
            goto Ld2
        Lc6:
            k1.b r4 = r11.f996u
            long r7 = r4.d()
            long r7 = r7 & r5
            int r4 = (int) r7
            float r4 = java.lang.Float.intBitsToFloat(r4)
        Ld2:
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r7 = (long) r2
            int r2 = java.lang.Float.floatToRawIntBits(r4)
            long r9 = (long) r2
            long r7 = r7 << r3
            long r9 = r9 & r5
            long r7 = r7 | r9
            long r9 = r12 >> r3
            int r2 = (int) r9
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto Lec
            goto Lf7
        Lec:
            long r9 = r12 & r5
            int r2 = (int) r9
            float r2 = java.lang.Float.intBitsToFloat(r2)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto Lfa
        Lf7:
            r12 = 0
            goto L104
        Lfa:
            v1.s0 r2 = r11.f999x
            long r12 = r2.a(r7, r12)
            long r12 = v1.w.o(r7, r12)
        L104:
            long r2 = r12 >> r3
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            int r2 = java.lang.Math.round(r2)
            int r2 = u2.b.g(r2, r0)
            long r12 = r12 & r5
            int r12 = (int) r12
            float r12 = java.lang.Float.intBitsToFloat(r12)
            int r12 = java.lang.Math.round(r12)
            int r4 = u2.b.f(r12, r0)
            r5 = 0
            r6 = 10
            r3 = 0
            long r12 = u2.a.a(r0, r2, r3, r4, r5, r6)
            return r12
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PainterModifier(painter="
            r0.<init>(r1)
            k1.b r1 = r2.f996u
            r0.append(r1)
            java.lang.String r1 = ", sizeToIntrinsics="
            r0.append(r1)
            boolean r1 = r2.f997v
            r0.append(r1)
            java.lang.String r1 = ", alignment="
            r0.append(r1)
            y0.c r1 = r2.f998w
            r0.append(r1)
            java.lang.String r1 = ", alpha="
            r0.append(r1)
            float r1 = r2.f1000y
            r0.append(r1)
            java.lang.String r1 = ", colorFilter="
            r0.append(r1)
            f1.n r1 = r2.f1001z
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
