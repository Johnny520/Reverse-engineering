package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements m.f {
    @Override // m.f
    public final float a(float r4, float r5, float r6) {
            r3 = this;
            float r5 = r5 + r4
            float r5 = r5 - r4
            float r5 = java.lang.Math.abs(r5)
            int r0 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r0 > 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            r1 = 1050253722(0x3e99999a, float:0.3)
            float r1 = r1 * r6
            r2 = 0
            float r2 = r2 * r5
            float r1 = r1 - r2
            float r2 = r6 - r1
            if (r0 == 0) goto L1e
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L1e
            float r1 = r6 - r5
        L1e:
            float r4 = r4 - r1
            return r4
    }
}
