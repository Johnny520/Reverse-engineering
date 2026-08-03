package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m.p1 f8077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f8078b;

    public a3(long r1, m.p1 r3) {
            r0 = this;
            r0.<init>()
            r0.f8077a = r3
            r0.f8078b = r1
            return
    }

    public /* synthetic */ a3(m.p1 r3) {
            r2 = this;
            r0 = 0
            r2.<init>(r0, r3)
            return
    }

    public final long a(long r7, float r9, boolean r10) {
            r6 = this;
            long r0 = r6.f8078b
            if (r10 == 0) goto Lb
            long r7 = e1.b.e(r0, r7)
            r6.f8078b = r7
            goto Lf
        Lb:
            long r7 = e1.b.e(r0, r7)
        Lf:
            m.p1 r10 = r6.f8077a
            if (r10 != 0) goto L18
            float r7 = e1.b.c(r7)
            goto L20
        L18:
            float r7 = r6.b(r7)
            float r7 = java.lang.Math.abs(r7)
        L20:
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 < 0) goto La1
            m.p1 r7 = r6.f8077a
            long r0 = r6.f8078b
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r8 = 32
            if (r7 != 0) goto L5d
            float r7 = e1.b.c(r0)
            long r4 = r0 >> r8
            int r10 = (int) r4
            float r10 = java.lang.Float.intBitsToFloat(r10)
            float r10 = r10 / r7
            long r0 = r0 & r2
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r0 = r0 / r7
            int r7 = java.lang.Float.floatToRawIntBits(r10)
            long r4 = (long) r7
            int r7 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r7
            long r7 = r4 << r8
            long r0 = r0 & r2
            long r7 = r7 | r0
            long r7 = e1.b.f(r7, r9)
            long r9 = r6.f8078b
            long r7 = e1.b.d(r9, r7)
            return r7
        L5d:
            float r7 = r6.b(r0)
            long r0 = r6.f8078b
            float r10 = r6.b(r0)
            float r10 = java.lang.Math.signum(r10)
            float r10 = r10 * r9
            float r7 = r7 - r10
            long r9 = r6.f8078b
            m.p1 r0 = r6.f8077a
            m.p1 r1 = m.p1.f8325h
            if (r0 != r1) goto L7c
            long r9 = r9 & r2
        L76:
            int r9 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r9)
            goto L7e
        L7c:
            long r9 = r9 >> r8
            goto L76
        L7e:
            m.p1 r10 = r6.f8077a
            if (r10 != r1) goto L91
            int r7 = java.lang.Float.floatToRawIntBits(r7)
            long r0 = (long) r7
            int r7 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r7
            long r7 = r0 << r8
            long r9 = r9 & r2
            long r7 = r7 | r9
            return r7
        L91:
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r9
            int r7 = java.lang.Float.floatToRawIntBits(r7)
            long r0 = (long) r7
            long r7 = r9 << r8
            long r9 = r0 & r2
            long r7 = r7 | r9
            return r7
        La1:
            r7 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            return r7
    }

    public final float b(long r3) {
            r2 = this;
            m.p1 r0 = r2.f8077a
            m.p1 r1 = m.p1.f8325h
            if (r0 != r1) goto Lf
            r0 = 32
            long r3 = r3 >> r0
        L9:
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            return r3
        Lf:
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r0
            goto L9
    }
}
