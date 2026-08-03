package d7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s extends r7.b {
    @Override // r7.b, k7.a
    public final void B(q7.b r1) {
            r0 = this;
            r0.S(r1)
            return
    }

    public final long N(int r5) {
            r4 = this;
            byte[] r0 = r4.f11553k
            int r5 = k7.a.s(r0, r5)
            long r0 = (long) r5
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
    }

    public final int O(int r2) {
            r1 = this;
            byte[] r0 = r1.f11553k
            short r2 = k7.a.w(r0, r2)
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            return r2
    }

    public final void P(byte[] r3, int r4, int r5, int r6) {
            r2 = this;
            if (r6 <= 0) goto L17
            int r0 = r3.length
            if (r0 != 0) goto L6
            goto L17
        L6:
            int r0 = r5 + r6
            int r1 = r2.p()
            if (r0 <= r1) goto L12
            r1 = 0
            r2.M(r0, r1)
        L12:
            byte[] r0 = r2.f11553k
            java.lang.System.arraycopy(r3, r4, r0, r5, r6)
        L17:
            return
    }

    public final void Q(int r2, long r3) {
            r1 = this;
            byte[] r0 = r1.f11553k
            int r3 = (int) r3
            k7.a.D(r0, r2, r3)
            return
    }

    public final void R(int r2, int r3) {
            r1 = this;
            byte[] r0 = r1.f11553k
            short r3 = (short) r3
            k7.a.F(r0, r2, r3)
            return
    }

    public abstract int S(java.io.InputStream r1);
}
