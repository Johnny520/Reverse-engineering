package u2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface c {
    default int G0(float r2) {
            r1 = this;
            float r2 = r1.x0(r2)
            boolean r0 = java.lang.Float.isInfinite(r2)
            if (r0 == 0) goto Le
            r2 = 2147483647(0x7fffffff, float:NaN)
            return r2
        Le:
            int r2 = java.lang.Math.round(r2)
            return r2
    }

    default long J(float r4) {
            r3 = this;
            float[] r0 = v2.b.f14058a
            float r0 = r3.q0()
            r1 = 1065604874(0x3f83d70a, float:1.03)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 4294967296(0x100000000, double:2.121995791E-314)
            if (r0 < 0) goto L2b
            float r0 = r3.q0()
            v2.a r0 = v2.b.a(r0)
            if (r0 == 0) goto L21
            float r4 = r0.a(r4)
            goto L26
        L21:
            float r0 = r3.q0()
            float r4 = r4 / r0
        L26:
            long r0 = x6.d.R(r1, r4)
            return r0
        L2b:
            float r0 = r3.q0()
            float r4 = r4 / r0
            long r0 = x6.d.R(r1, r4)
            return r0
    }

    default long K(long r4) {
            r3 = this;
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L2a
            r0 = 32
            long r0 = r4 >> r0
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r0 = r3.l0(r0)
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r1
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            float r4 = r3.l0(r4)
            long r4 = g4.a.d(r0, r4)
            return r4
        L2a:
            return r0
    }

    default long L0(long r5) {
            r4 = this;
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 == 0) goto L2e
            float r0 = u2.h.b(r5)
            float r0 = r4.x0(r0)
            float r5 = u2.h.a(r5)
            float r5 = r4.x0(r5)
            int r6 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r6
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            long r5 = (long) r5
            r2 = 32
            long r0 = r0 << r2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r2
            long r5 = r5 | r0
            return r5
        L2e:
            return r0
    }

    default float O0(long r5) {
            r4 = this;
            long r0 = u2.o.b(r5)
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r0 = u2.p.a(r0, r2)
            if (r0 != 0) goto L14
            java.lang.String r0 = "Only Sp can convert to Px"
            u2.i.b(r0)
        L14:
            float r5 = r4.S(r5)
            float r5 = r4.x0(r5)
            return r5
    }

    default float S(long r5) {
            r4 = this;
            long r0 = u2.o.b(r5)
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r0 = u2.p.a(r0, r2)
            if (r0 != 0) goto L14
            java.lang.String r0 = "Only Sp can convert to Px"
            u2.i.b(r0)
        L14:
            float[] r0 = v2.b.f14058a
            float r0 = r4.q0()
            r1 = 1065604874(0x3f83d70a, float:1.03)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L3a
            float r0 = r4.q0()
            v2.a r0 = v2.b.a(r0)
            float r5 = u2.o.c(r5)
            if (r0 != 0) goto L35
            float r6 = r4.q0()
        L33:
            float r6 = r6 * r5
            return r6
        L35:
            float r5 = r0.b(r5)
            return r5
        L3a:
            float r5 = u2.o.c(r5)
            float r6 = r4.q0()
            goto L33
    }

    float d();

    default long e0(float r3) {
            r2 = this;
            float r3 = r2.l0(r3)
            long r0 = r2.J(r3)
            return r0
    }

    default float i0(int r2) {
            r1 = this;
            float r2 = (float) r2
            float r0 = r1.d()
            float r2 = r2 / r0
            return r2
    }

    default float l0(float r2) {
            r1 = this;
            float r0 = r1.d()
            float r2 = r2 / r0
            return r2
    }

    float q0();

    default float x0(float r2) {
            r1 = this;
            float r0 = r1.d()
            float r0 = r0 * r2
            return r0
    }
}
