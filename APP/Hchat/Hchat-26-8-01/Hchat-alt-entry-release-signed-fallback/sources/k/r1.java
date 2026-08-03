package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 extends k.p1 {
    @Override // k.p1, k.n1
    public final void a(long r8, long r10) {
            r7 = this;
            r0 = 2143289344(0x7fc00000, float:NaN)
            boolean r1 = java.lang.Float.isNaN(r0)
            if (r1 != 0) goto Ld
            android.widget.Magnifier r1 = r7.f7035a
            r1.setZoom(r0)
        Ld:
            r0 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r10
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            android.widget.Magnifier r1 = r7.f7035a
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r4 = 32
            if (r0 == 0) goto L43
            long r5 = r8 >> r4
            int r0 = (int) r5
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r8 = r8 & r2
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            long r4 = r10 >> r4
            int r9 = (int) r4
            float r9 = java.lang.Float.intBitsToFloat(r9)
            long r10 = r10 & r2
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            r1.show(r0, r8, r9, r10)
            return
        L43:
            long r10 = r8 >> r4
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            long r8 = r8 & r2
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            r1.show(r10, r8)
            return
    }
}
