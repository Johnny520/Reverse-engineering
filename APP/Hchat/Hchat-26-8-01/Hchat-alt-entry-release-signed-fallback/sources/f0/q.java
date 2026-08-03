package f0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static final int a(w.q0 r2, long r3, y1.l2 r5) {
            w.m1 r0 = r2.d()
            r1 = -1
            if (r0 == 0) goto L32
            i2.k0 r0 = r0.f14569a
            i2.o r0 = r0.f6347b
            v1.t r2 = r2.c()
            if (r2 == 0) goto L32
            long r2 = r2.j0(r3)
            int r4 = h(r0, r2, r5)
            if (r4 != r1) goto L1c
            goto L32
        L1c:
            float r5 = r0.f(r4)
            float r4 = r0.b(r4)
            float r4 = r4 + r5
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            r5 = 1
            long r2 = e1.b.a(r2, r4, r5)
            int r2 = r0.g(r2)
            return r2
        L32:
            return r1
    }

    public static final long b(w.q0 r2, e1.c r3, e1.c r4, int r5) {
            long r0 = i(r2, r3, r5)
            boolean r3 = i2.m0.c(r0)
            if (r3 == 0) goto Ld
            long r2 = i2.m0.f6358b
            return r2
        Ld:
            long r2 = i(r2, r4, r5)
            boolean r4 = i2.m0.c(r2)
            if (r4 == 0) goto L1a
            long r2 = i2.m0.f6358b
            return r2
        L1a:
            r4 = 32
            long r4 = r0 >> r4
            int r4 = (int) r4
            int r4 = java.lang.Math.min(r4, r4)
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            int r2 = (int) r2
            int r2 = java.lang.Math.max(r2, r2)
            long r2 = i2.e0.b(r4, r2)
            return r2
    }

    public static final boolean c(i2.k0 r5, int r6) {
            i2.o r0 = r5.f6347b
            int r1 = r0.d(r6)
            int r2 = r5.g(r1)
            r3 = 1
            r4 = 0
            if (r6 == r2) goto L21
            int r0 = r0.c(r1, r4)
            if (r6 != r0) goto L15
            goto L21
        L15:
            t2.j r0 = r5.a(r6)
            int r6 = r6 - r3
            t2.j r5 = r5.a(r6)
            if (r0 == r5) goto L2c
            goto L2b
        L21:
            t2.j r0 = r5.h(r6)
            t2.j r5 = r5.a(r6)
            if (r0 == r5) goto L2c
        L2b:
            return r3
        L2c:
            return r4
    }

    public static final android.view.inputmethod.ExtractedText d(n2.s r4) {
            android.view.inputmethod.ExtractedText r0 = new android.view.inputmethod.ExtractedText
            r0.<init>()
            i2.g r1 = r4.f8976a
            java.lang.String r1 = r1.f6314h
            r0.text = r1
            r2 = 0
            r0.startOffset = r2
            int r1 = r1.length()
            r0.partialEndOffset = r1
            r1 = -1
            r0.partialStartOffset = r1
            long r1 = r4.f8977b
            int r3 = i2.m0.f(r1)
            r0.selectionStart = r3
            int r1 = i2.m0.e(r1)
            r0.selectionEnd = r1
            i2.g r4 = r4.f8976a
            java.lang.String r4 = r4.f6314h
            r1 = 10
            boolean r4 = og.m.i0(r4, r1)
            r4 = r4 ^ 1
            r0.flags = r4
            return r0
    }

    public static final long e(android.graphics.PointF r6) {
            float r0 = r6.x
            float r6 = r6.y
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r0
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r2 = (long) r6
            r6 = 32
            long r0 = r0 << r6
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r0 = r0 | r2
            return r0
    }

    public static final boolean f(e1.c r2, float r3, float r4) {
            float r0 = r2.f2296a
            float r1 = r2.f2298c
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L1a
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 > 0) goto L1a
            float r3 = r2.f2297b
            float r2 = r2.f2299d
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 > 0) goto L1a
            int r2 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r2 > 0) goto L1a
            r2 = 1
            return r2
        L1a:
            r2 = 0
            return r2
    }

    public static int g(android.view.inputmethod.HandwritingGesture r2, b0.d0 r3) {
            java.lang.String r2 = f0.k.o(r2)
            if (r2 != 0) goto L8
            r2 = 3
            return r2
        L8:
            n2.a r0 = new n2.a
            r1 = 1
            r0.<init>(r2, r1)
            r3.invoke(r0)
            r2 = 5
            return r2
    }

    public static final int h(i2.o r4, long r5, y1.l2 r7) {
            if (r7 == 0) goto L7
            float r7 = r7.g()
            goto L8
        L7:
            r7 = 0
        L8:
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r5
            int r0 = (int) r0
            float r1 = java.lang.Float.intBitsToFloat(r0)
            int r1 = r4.e(r1)
            float r2 = java.lang.Float.intBitsToFloat(r0)
            float r3 = r4.f(r1)
            float r3 = r3 - r7
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L4c
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r2 = r4.b(r1)
            float r2 = r2 + r7
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L32
            goto L4c
        L32:
            r0 = 32
            long r5 = r5 >> r0
            int r5 = (int) r5
            float r6 = java.lang.Float.intBitsToFloat(r5)
            float r0 = -r7
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 < 0) goto L4c
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r4 = r4.f6371d
            float r4 = r4 + r7
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 <= 0) goto L4b
            goto L4c
        L4b:
            return r1
        L4c:
            r4 = -1
            return r4
    }

    public static final long i(w.q0 r3, e1.c r4, int r5) {
            w.m1 r0 = r3.d()
            if (r0 == 0) goto Lb
            i2.k0 r0 = r0.f14569a
            i2.o r0 = r0.f6347b
            goto Lc
        Lb:
            r0 = 0
        Lc:
            v1.t r3 = r3.c()
            if (r0 == 0) goto L26
            if (r3 != 0) goto L15
            goto L26
        L15:
            r1 = 0
            long r1 = r3.j0(r1)
            e1.c r3 = r4.i(r1)
            g1.d r4 = i2.i0.f6332b
            long r3 = r0.h(r3, r5, r4)
            return r3
        L26:
            long r3 = i2.m0.f6358b
            return r3
    }

    public static final boolean j(int r1) {
            int r1 = java.lang.Character.getType(r1)
            r0 = 23
            if (r1 == r0) goto L23
            r0 = 20
            if (r1 == r0) goto L23
            r0 = 22
            if (r1 == r0) goto L23
            r0 = 30
            if (r1 == r0) goto L23
            r0 = 29
            if (r1 == r0) goto L23
            r0 = 24
            if (r1 == r0) goto L23
            r0 = 21
            if (r1 != r0) goto L21
            goto L23
        L21:
            r1 = 0
            return r1
        L23:
            r1 = 1
            return r1
    }

    public static final boolean k(int r1) {
            boolean r0 = java.lang.Character.isWhitespace(r1)
            if (r0 != 0) goto Ld
            r0 = 160(0xa0, float:2.24E-43)
            if (r1 != r0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            return r1
        Ld:
            r1 = 1
            return r1
    }

    public static final boolean l(int r2) {
            boolean r0 = k(r2)
            if (r0 == 0) goto L19
            int r0 = java.lang.Character.getType(r2)
            r1 = 14
            if (r0 == r1) goto L19
            r1 = 13
            if (r0 == r1) goto L19
            r0 = 10
            if (r2 != r0) goto L17
            goto L19
        L17:
            r2 = 1
            return r2
        L19:
            r2 = 0
            return r2
    }

    public static final y0.o m(y0.o r1, f0.c r2, w.q0 r3, h0.d1 r4) {
            f0.o r0 = new f0.o
            r0.<init>(r2, r3, r4)
            y0.o r1 = r1.d(r0)
            return r1
    }

    public static void n(long r6, i2.g r8, boolean r9, b0.d0 r10) {
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r9 == 0) goto L7c
            int r9 = i2.m0.f6359c
            r9 = 32
            long r2 = r6 >> r9
            int r9 = (int) r2
            long r2 = r6 & r0
            int r2 = (int) r2
            r3 = 10
            if (r9 <= 0) goto L1a
            int r4 = java.lang.Character.codePointBefore(r8, r9)
            goto L1b
        L1a:
            r4 = r3
        L1b:
            java.lang.String r5 = r8.f6314h
            int r5 = r5.length()
            if (r2 >= r5) goto L27
            int r3 = java.lang.Character.codePointAt(r8, r2)
        L27:
            boolean r5 = l(r4)
            if (r5 == 0) goto L4f
            boolean r5 = k(r3)
            if (r5 != 0) goto L39
            boolean r5 = j(r3)
            if (r5 == 0) goto L4f
        L39:
            int r6 = java.lang.Character.charCount(r4)
            int r9 = r9 - r6
            if (r9 == 0) goto L4a
            int r4 = java.lang.Character.codePointBefore(r8, r9)
            boolean r6 = l(r4)
            if (r6 != 0) goto L39
        L4a:
            long r6 = i2.e0.b(r9, r2)
            goto L7c
        L4f:
            boolean r5 = l(r3)
            if (r5 == 0) goto L7c
            boolean r5 = k(r4)
            if (r5 != 0) goto L61
            boolean r4 = j(r4)
            if (r4 == 0) goto L7c
        L61:
            int r6 = java.lang.Character.charCount(r3)
            int r2 = r2 + r6
            java.lang.String r6 = r8.f6314h
            int r6 = r6.length()
            if (r2 == r6) goto L78
            int r3 = java.lang.Character.codePointAt(r8, r2)
            boolean r6 = l(r3)
            if (r6 != 0) goto L61
        L78:
            long r6 = i2.e0.b(r9, r2)
        L7c:
            n2.r r8 = new n2.r
            long r0 = r0 & r6
            int r9 = (int) r0
            r8.<init>(r9, r9)
            int r6 = i2.m0.d(r6)
            n2.e r7 = new n2.e
            r9 = 0
            r7.<init>(r6, r9)
            r6 = 2
            n2.g[] r6 = new n2.g[r6]
            r6[r9] = r8
            r8 = 1
            r6[r8] = r7
            f0.m r7 = new f0.m
            r7.<init>(r6)
            r10.invoke(r7)
            return
    }
}
