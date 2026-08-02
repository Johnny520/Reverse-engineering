package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wo1 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f12599h = 0;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ long f12600i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f12601j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f12602k;

    public /* synthetic */ wo1(long j, xm0 xm0Var, xk1 xk1Var) {
        this.f12600i = j;
        this.f12601j = xm0Var;
        this.f12602k = xk1Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f12599h;
        a83 a83Var = a83.f116a;
        Object obj2 = this.f12602k;
        Object obj3 = this.f12601j;
        switch (i) {
            case 0:
                xm0 xm0Var = (xm0) obj3;
                xk1 xk1Var = (xk1) obj2;
                ca2 ca2Var = (ca2) obj;
                ca2Var.getClass();
                long jFloatToRawIntBits = this.f12600i;
                if (rs1.m4609b(jFloatToRawIntBits, 0L)) {
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(((int) (((h11) xk1Var.getValue()).f3775a >> 32)) / 2.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(((int) (((h11) xk1Var.getValue()).f3775a & 4294967295L)) / 2.0f)));
                }
                float fFloatValue = ((Number) xm0Var.mo6a()).floatValue();
                ca2Var.m722g(true);
                ca2Var.m729p(new ap1(fFloatValue, jFloatToRawIntBits));
                break;
            default:
                nc0 nc0Var = (nc0) obj;
                nc0Var.getClass();
                nc0.m3271s0(nc0Var, C0953z8.m6398l((List) obj3), 0L, 0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var.mo3280d() & 4294967295L)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var.mo3280d() & 4294967295L)) / 2.0f)) & 4294967295L), null, 246);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var.mo3280d() >> 32)) * (ci0.m778C(((x13) obj2).f12767a, 0.0f, 359.999f) / 359.999f))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nc0Var.mo3280d() & 4294967295L)) / 2.0f)));
                nc0.m3267O(nc0Var, C0363ju.f5213c, nc0Var.mo689A(10.0f), jFloatToRawIntBits2, new xv2(nc0Var.mo689A(3.0f), 0.0f, 0, 0, 30), 104);
                nc0.m3267O(nc0Var, this.f12600i, nc0Var.mo689A(6.0f), jFloatToRawIntBits2, null, 120);
                break;
        }
        return a83Var;
    }

    public /* synthetic */ wo1(List list, x13 x13Var, long j) {
        this.f12601j = list;
        this.f12602k = x13Var;
        this.f12600i = j;
    }
}
