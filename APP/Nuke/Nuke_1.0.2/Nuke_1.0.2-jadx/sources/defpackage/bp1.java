package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bp1 implements in0 {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ long i;
    public final /* synthetic */ Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ bp1(long j, x13 x13Var) {
        this.i = j;
        this.j = x13Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.h;
        a83 a83Var = a83.a;
        Object obj2 = this.j;
        long j = this.i;
        switch (i) {
            case 0:
                ep1 ep1Var = (ep1) obj2;
                sc scVar = (sc) obj;
                scVar.getClass();
                if (ep1Var.e == j && ((Number) scVar.d()).floatValue() >= 0.999f) {
                    ep1Var.f(false);
                }
                break;
            default:
                x13 x13Var = (x13) obj2;
                nc0 nc0Var = (nc0) obj;
                nc0Var.getClass();
                float fA = nc0Var.A(12.0f);
                float fA2 = nc0Var.A(12.0f);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fA2)) & 4294967295L);
                long j2 = ju.c;
                nc0.s0(nc0Var, z8.l(eu.P(new ju(j2), new ju(j))), 0L, 0L, jFloatToRawIntBits, null, 246);
                ju juVar = new ju(ju.f);
                long j3 = ju.b;
                nc0.s0(nc0Var, new bb1(eu.P(juVar, new ju(j3)), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L)), 0L, 0L, jFloatToRawIntBits, null, 246);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (nc0Var.d() >> 32)) * ci0.C(x13Var.b, 0.0f, 1.0f);
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (nc0Var.d() & 4294967295L)) * (1.0f - ci0.C(x13Var.c, 0.0f, 1.0f));
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
                nc0.O(nc0Var, ju.b(0.58f, j3), nc0Var.A(9.0f), jFloatToRawIntBits2, new xv2(nc0Var.A(3.0f), 0.0f, 0, 0, 30), 104);
                nc0.O(nc0Var, j2, nc0Var.A(8.0f), jFloatToRawIntBits2, new xv2(nc0Var.A(2.0f), 0.0f, 0, 0, 30), 104);
                break;
        }
        return a83Var;
    }

    public /* synthetic */ bp1(ep1 ep1Var, long j) {
        this.j = ep1Var;
        this.i = j;
    }
}
