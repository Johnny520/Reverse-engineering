package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements v1.l1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v1.s0 f14043h = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14044g;

    static {
            v1.s0 r0 = new v1.s0
            r1 = 0
            r0.<init>(r1)
            v1.s0.f14043h = r0
            return
    }

    public /* synthetic */ s0(int r1) {
            r0 = this;
            r0.f14044g = r1
            r0.<init>()
            return
    }

    public long a(long r7, long r9) {
            r6 = this;
            int r0 = r6.f14044g
            r1 = 32
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            switch(r0) {
                case 1: goto L70;
                case 2: goto L5a;
                default: goto Lc;
            }
        Lc:
            long r4 = r7 >> r1
            int r0 = (int) r4
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r4 = r9 >> r1
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L44
            long r4 = r7 & r2
            int r0 = (int) r4
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r4 = r9 & r2
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L44
            r7 = 1065353216(0x3f800000, float:1.0)
            int r8 = java.lang.Float.floatToRawIntBits(r7)
            long r8 = (long) r8
            int r7 = java.lang.Float.floatToRawIntBits(r7)
            long r4 = (long) r7
            long r7 = r8 << r1
            long r9 = r4 & r2
            long r7 = r7 | r9
            int r9 = v1.f1.f13933a
            goto L59
        L44:
            float r7 = v1.w.c(r7, r9)
            int r8 = java.lang.Float.floatToRawIntBits(r7)
            long r8 = (long) r8
            int r7 = java.lang.Float.floatToRawIntBits(r7)
            long r4 = (long) r7
            long r7 = r8 << r1
            long r9 = r4 & r2
            long r7 = r7 | r9
            int r9 = v1.f1.f13933a
        L59:
            return r7
        L5a:
            float r7 = v1.w.c(r7, r9)
            int r8 = java.lang.Float.floatToRawIntBits(r7)
            long r8 = (long) r8
            int r7 = java.lang.Float.floatToRawIntBits(r7)
            long r4 = (long) r7
            long r7 = r8 << r1
            long r9 = r4 & r2
            long r7 = r7 | r9
            int r9 = v1.f1.f13933a
            return r7
        L70:
            long r4 = r9 >> r1
            int r0 = (int) r4
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r4 = r7 >> r1
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            float r0 = r0 / r4
            long r9 = r9 & r2
            int r9 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r9)
            long r7 = r7 & r2
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            float r9 = r9 / r7
            float r7 = java.lang.Math.max(r0, r9)
            int r8 = java.lang.Float.floatToRawIntBits(r7)
            long r8 = (long) r8
            int r7 = java.lang.Float.floatToRawIntBits(r7)
            long r4 = (long) r7
            long r7 = r8 << r1
            long r9 = r4 & r2
            long r7 = r7 | r9
            int r9 = v1.f1.f13933a
            return r7
    }

    @Override // v1.l1
    public void f(f.u0 r1) {
            r0 = this;
            r1.clear()
            return
    }

    @Override // v1.l1
    public boolean g(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.f14044g
            switch(r0) {
                case 4: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.String r0 = "ReusedSlotId"
            return r0
    }
}
