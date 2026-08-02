package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e03 implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2287h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f2288i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f2289j;

    public /* synthetic */ e03(int i, Object obj, Object obj2) {
        this.f2287h = i;
        this.f2288i = obj;
        this.f2289j = obj2;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        long j;
        z03 z03VarM5146d;
        t91 t91Var;
        C0690sd c0690sd;
        int i = this.f2287h;
        t00 t00Var = null;
        Object obj = this.f2289j;
        Object obj2 = this.f2288i;
        int i2 = 1;
        switch (i) {
            case 0:
                AbstractC0570p7.m3745A((j20) obj2, null, new ew0((in0) obj, t00Var, i2), 1);
                return a83.f116a;
            default:
                b03 b03Var = (b03) obj2;
                long j2 = ((h11) ((xk1) obj).getValue()).f3775a;
                rs1 rs1VarM345i = b03Var.m345i();
                long jFloatToRawIntBits = 9205357640488583168L;
                if (rs1VarM345i != null) {
                    long j3 = rs1VarM345i.f9744a;
                    C0690sd c0690sdM349m = b03Var.m349m();
                    if (c0690sdM349m != null && c0690sdM349m.f10051i.length() != 0) {
                        rr0 rr0Var = (rr0) b03Var.f497r.getValue();
                        int i3 = rr0Var == null ? -1 : d03.f1802a[rr0Var.ordinal()];
                        if (i3 != -1) {
                            if (i3 == 1 || i3 == 2) {
                                long j4 = b03Var.m350n().f5297b;
                                int i4 = f13.f2738c;
                                j = j4 >> 32;
                            } else {
                                if (i3 != 3) {
                                    c80.m675s();
                                    return null;
                                }
                                long j5 = b03Var.m350n().f5297b;
                                int i5 = f13.f2738c;
                                j = j5 & 4294967295L;
                            }
                            int i6 = (int) j;
                            t91 t91Var2 = b03Var.f483d;
                            if (t91Var2 != null && (z03VarM5146d = t91Var2.m5146d()) != null && (t91Var = b03Var.f483d) != null && (c0690sd = t91Var.f10622a.f4847a) != null) {
                                int iM779D = ci0.m779D(b03Var.f481b.mo2451p(i6), 0, c0690sd.f10051i.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (z03VarM5146d.m6378d(j3) >> 32));
                                y03 y03Var = z03VarM5146d.f13697a;
                                lj1 lj1Var = y03Var.f13267b;
                                int iM2917d = lj1Var.m2917d(iM779D);
                                float fM6204d = y03Var.m6204d(iM2917d);
                                float fM6205e = y03Var.m6205e(iM2917d);
                                float fM778C = ci0.m778C(fIntBitsToFloat, Math.min(fM6204d, fM6205e), Math.max(fM6204d, fM6205e));
                                if (h11.m2041a(j2, 0L) || Math.abs(fIntBitsToFloat - fM778C) <= ((int) (j2 >> 32)) / 2) {
                                    float fM2919f = lj1Var.m2919f(iM2917d);
                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fM778C)) << 32) | (((long) Float.floatToRawIntBits(((lj1Var.m2915b(iM2917d) - fM2919f) / 2.0f) + fM2919f)) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new rs1(jFloatToRawIntBits);
        }
    }
}
