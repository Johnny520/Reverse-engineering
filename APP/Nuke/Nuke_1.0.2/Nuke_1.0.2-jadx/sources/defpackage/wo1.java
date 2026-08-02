package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wo1 implements in0 {
    public final /* synthetic */ int h = 0;
    public final /* synthetic */ long i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ wo1(long j, xm0 xm0Var, xk1 xk1Var) {
        this.i = j;
        this.j = xm0Var;
        this.k = xk1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.h;
        a83 a83Var = a83.a;
        Object obj2 = this.k;
        Object obj3 = this.j;
        switch (i) {
            case 0:
                xm0 xm0Var = (xm0) obj3;
                xk1 xk1Var = (xk1) obj2;
                ca2 ca2Var = (ca2) obj;
                ca2Var.getClass();
                long jFloatToRawIntBits = this.i;
                if (rs1.b(jFloatToRawIntBits, 0L)) {
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(((int) (((h11) xk1Var.getValue()).a >> 32)) / 2.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(((int) (((h11) xk1Var.getValue()).a & 4294967295L)) / 2.0f)));
                }
                float fFloatValue = ((Number) xm0Var.a()).floatValue();
                ca2Var.g(true);
                ca2Var.p(new ap1(fFloatValue, jFloatToRawIntBits));
                break;
            default:
                nc0 nc0Var = (nc0) obj;
                nc0Var.getClass();
                nc0.s0(nc0Var, z8.l((List) obj3), 0L, 0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var.d() & 4294967295L)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var.d() & 4294967295L)) / 2.0f)) & 4294967295L), null, 246);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var.d() >> 32)) * (ci0.C(((x13) obj2).a, 0.0f, 359.999f) / 359.999f))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var.d() & 4294967295L)) / 2.0f)));
                nc0.O(nc0Var, ju.c, nc0Var.A(10.0f), jFloatToRawIntBits2, new xv2(nc0Var.A(3.0f), 0.0f, 0, 0, 30), 104);
                nc0.O(nc0Var, this.i, nc0Var.A(6.0f), jFloatToRawIntBits2, null, 120);
                break;
        }
        return a83Var;
    }

    public /* synthetic */ wo1(List list, x13 x13Var, long j) {
        this.j = list;
        this.k = x13Var;
        this.i = j;
    }
}
