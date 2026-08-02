package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bp1 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f979h = 1;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ long f980i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f981j;

    public /* synthetic */ bp1(long j, x13 x13Var) {
        this.f980i = j;
        this.f981j = x13Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f979h;
        a83 a83Var = a83.f116a;
        Object obj2 = this.f981j;
        long j = this.f980i;
        switch (i) {
            case 0:
                ep1 ep1Var = (ep1) obj2;
                C0689sc c0689sc = (C0689sc) obj;
                c0689sc.getClass();
                if (ep1Var.f2552e == j && ((Number) c0689sc.m4788d()).floatValue() >= 0.999f) {
                    ep1Var.m1408f(false);
                }
                break;
            default:
                x13 x13Var = (x13) obj2;
                nc0 nc0Var = (nc0) obj;
                nc0Var.getClass();
                float fMo689A = nc0Var.mo689A(12.0f);
                float fMo689A2 = nc0Var.mo689A(12.0f);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMo689A)) << 32) | (((long) Float.floatToRawIntBits(fMo689A2)) & 4294967295L);
                long j2 = C0363ju.f5213c;
                nc0.m3271s0(nc0Var, C0953z8.m6398l(AbstractC0179eu.m1435P(new C0363ju(j2), new C0363ju(j))), 0L, 0L, jFloatToRawIntBits, null, 246);
                C0363ju c0363ju = new C0363ju(C0363ju.f5216f);
                long j3 = C0363ju.f5212b;
                nc0.m3271s0(nc0Var, new bb1(AbstractC0179eu.m1435P(c0363ju, new C0363ju(j3)), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L)), 0L, 0L, jFloatToRawIntBits, null, 246);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (nc0Var.mo3280d() >> 32)) * ci0.m778C(x13Var.f12768b, 0.0f, 1.0f);
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (nc0Var.mo3280d() & 4294967295L)) * (1.0f - ci0.m778C(x13Var.f12769c, 0.0f, 1.0f));
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
                nc0.m3267O(nc0Var, C0363ju.m2565b(0.58f, j3), nc0Var.mo689A(9.0f), jFloatToRawIntBits2, new xv2(nc0Var.mo689A(3.0f), 0.0f, 0, 0, 30), 104);
                nc0.m3267O(nc0Var, j2, nc0Var.mo689A(8.0f), jFloatToRawIntBits2, new xv2(nc0Var.mo689A(2.0f), 0.0f, 0, 0, 30), 104);
                break;
        }
        return a83Var;
    }

    public /* synthetic */ bp1(ep1 ep1Var, long j) {
        this.f981j = ep1Var;
        this.f980i = j;
    }
}
