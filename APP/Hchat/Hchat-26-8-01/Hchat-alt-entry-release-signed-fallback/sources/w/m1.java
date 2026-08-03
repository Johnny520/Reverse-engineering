package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2.k0 f14569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v1.t f14570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v1.t f14571c;

    public m1(i2.k0 r1, v1.t r2) {
            r0 = this;
            r0.<init>()
            r0.f14569a = r1
            r1 = 0
            r0.f14570b = r1
            r0.f14571c = r2
            return
    }

    public final long a(long r7) {
            r6 = this;
            v1.t r0 = r6.f14570b
            e1.c r1 = e1.c.f2295e
            if (r0 == 0) goto L1d
            boolean r2 = r0.C()
            if (r2 == 0) goto L18
            v1.t r2 = r6.f14571c
            if (r2 == 0) goto L16
            r3 = 1
            e1.c r0 = r2.k0(r0, r3)
            goto L19
        L16:
            r0 = 0
            goto L19
        L18:
            r0 = r1
        L19:
            if (r0 != 0) goto L1c
            goto L1d
        L1c:
            r1 = r0
        L1d:
            r0 = 32
            long r2 = r7 >> r0
            int r2 = (int) r2
            float r3 = java.lang.Float.intBitsToFloat(r2)
            float r4 = r1.f2296a
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L2d
            goto L3c
        L2d:
            float r3 = java.lang.Float.intBitsToFloat(r2)
            float r4 = r1.f2298c
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L38
            goto L3c
        L38:
            float r4 = java.lang.Float.intBitsToFloat(r2)
        L3c:
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r2
            int r7 = (int) r7
            float r8 = java.lang.Float.intBitsToFloat(r7)
            float r5 = r1.f2297b
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 >= 0) goto L4e
            goto L5d
        L4e:
            float r8 = java.lang.Float.intBitsToFloat(r7)
            float r5 = r1.f2299d
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 <= 0) goto L59
            goto L5d
        L59:
            float r5 = java.lang.Float.intBitsToFloat(r7)
        L5d:
            int r7 = java.lang.Float.floatToRawIntBits(r4)
            long r7 = (long) r7
            int r1 = java.lang.Float.floatToRawIntBits(r5)
            long r4 = (long) r1
            long r7 = r7 << r0
            long r0 = r4 & r2
            long r7 = r7 | r0
            return r7
    }

    public final int b(long r1, boolean r3) {
            r0 = this;
            if (r3 == 0) goto L6
            long r1 = r0.a(r1)
        L6:
            long r1 = r0.d(r1)
            i2.k0 r3 = r0.f14569a
            i2.o r3 = r3.f6347b
            int r1 = r3.g(r1)
            return r1
    }

    public final boolean c(long r4) {
            r3 = this;
            long r4 = r3.a(r4)
            long r4 = r3.d(r4)
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            i2.k0 r1 = r3.f14569a
            i2.o r2 = r1.f6347b
            int r0 = r2.e(r0)
            r2 = 32
            long r4 = r4 >> r2
            int r4 = (int) r4
            float r5 = java.lang.Float.intBitsToFloat(r4)
            float r2 = r1.e(r0)
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 < 0) goto L39
            float r4 = java.lang.Float.intBitsToFloat(r4)
            float r5 = r1.f(r0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L39
            r4 = 1
            return r4
        L39:
            r4 = 0
            return r4
    }

    public final long d(long r5) {
            r4 = this;
            v1.t r0 = r4.f14570b
            if (r0 == 0) goto L22
            boolean r1 = r0.C()
            r2 = 0
            if (r1 == 0) goto Lc
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 != 0) goto L10
            goto L22
        L10:
            v1.t r1 = r4.f14571c
            if (r1 == 0) goto L22
            boolean r3 = r1.C()
            if (r3 == 0) goto L1b
            r2 = r1
        L1b:
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            long r5 = r0.w(r2, r5)
        L22:
            return r5
    }

    public final long e(long r5) {
            r4 = this;
            v1.t r0 = r4.f14570b
            if (r0 == 0) goto L22
            boolean r1 = r0.C()
            r2 = 0
            if (r1 == 0) goto Lc
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 != 0) goto L10
            goto L22
        L10:
            v1.t r1 = r4.f14571c
            if (r1 == 0) goto L22
            boolean r3 = r1.C()
            if (r3 == 0) goto L1b
            r2 = r1
        L1b:
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            long r5 = r2.w(r0, r5)
        L22:
            return r5
    }
}
