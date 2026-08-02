package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e03 implements xm0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ e03(int i, Object obj, Object obj2) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        long j;
        z03 z03VarD;
        t91 t91Var;
        sd sdVar;
        int i = this.h;
        t00 t00Var = null;
        Object obj = this.j;
        Object obj2 = this.i;
        int i2 = 1;
        switch (i) {
            case 0:
                p7.A((j20) obj2, null, new ew0((in0) obj, t00Var, i2), 1);
                return a83.a;
            default:
                b03 b03Var = (b03) obj2;
                long j2 = ((h11) ((xk1) obj).getValue()).a;
                rs1 rs1VarI = b03Var.i();
                long jFloatToRawIntBits = 9205357640488583168L;
                if (rs1VarI != null) {
                    long j3 = rs1VarI.a;
                    sd sdVarM = b03Var.m();
                    if (sdVarM != null && sdVarM.i.length() != 0) {
                        rr0 rr0Var = (rr0) b03Var.r.getValue();
                        int i3 = rr0Var == null ? -1 : d03.a[rr0Var.ordinal()];
                        if (i3 != -1) {
                            if (i3 == 1 || i3 == 2) {
                                long j4 = b03Var.n().b;
                                int i4 = f13.c;
                                j = j4 >> 32;
                            } else {
                                if (i3 != 3) {
                                    c80.s();
                                    return null;
                                }
                                long j5 = b03Var.n().b;
                                int i5 = f13.c;
                                j = j5 & 4294967295L;
                            }
                            int i6 = (int) j;
                            t91 t91Var2 = b03Var.d;
                            if (t91Var2 != null && (z03VarD = t91Var2.d()) != null && (t91Var = b03Var.d) != null && (sdVar = t91Var.a.a) != null) {
                                int iD = ci0.D(b03Var.b.p(i6), 0, sdVar.i.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (z03VarD.d(j3) >> 32));
                                y03 y03Var = z03VarD.a;
                                lj1 lj1Var = y03Var.b;
                                int iD2 = lj1Var.d(iD);
                                float fD = y03Var.d(iD2);
                                float fE = y03Var.e(iD2);
                                float fC = ci0.C(fIntBitsToFloat, Math.min(fD, fE), Math.max(fD, fE));
                                if (h11.a(j2, 0L) || Math.abs(fIntBitsToFloat - fC) <= ((int) (j2 >> 32)) / 2) {
                                    float f = lj1Var.f(iD2);
                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fC)) << 32) | (((long) Float.floatToRawIntBits(((lj1Var.b(iD2) - f) / 2.0f) + f)) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new rs1(jFloatToRawIntBits);
        }
    }
}
