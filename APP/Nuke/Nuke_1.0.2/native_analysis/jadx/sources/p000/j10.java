package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j10 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f4877h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ b03 f4878i;

    public /* synthetic */ j10(b03 b03Var, int i) {
        this.f4877h = i;
        this.f4878i = b03Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0120  */
    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo5j(Object obj) {
        o62 o62Var;
        c61 c61VarM5145c;
        char c;
        long j;
        float fIntBitsToFloat;
        c61 c61VarM5145c2;
        c61 c61VarM5145c3;
        c61 c61VarM5145c4;
        c61 c61VarM5145c5;
        int i = this.f4877h;
        b03 b03Var = this.f4878i;
        switch (i) {
            case 0:
                return new C0194f8(5, b03Var);
            case 1:
                b03Var.m354r();
                return a83.f116a;
            default:
                c61 c61Var = (c61) obj;
                t91 t91Var = b03Var.f483d;
                o62 o62Var2 = o62.f7535e;
                if (t91Var == null) {
                    o62Var = o62Var2;
                } else {
                    if (t91Var.f10637p) {
                        t91Var = null;
                    }
                    if (t91Var != null) {
                        us1 us1Var = b03Var.f481b;
                        long j2 = b03Var.m350n().f5297b;
                        int i2 = f13.f2738c;
                        int iMo2451p = us1Var.mo2451p((int) (j2 >> 32));
                        int iMo2451p2 = b03Var.f481b.mo2451p((int) (b03Var.m350n().f5297b & 4294967295L));
                        t91 t91Var2 = b03Var.f483d;
                        long jMo646M = 0;
                        long jMo646M2 = (t91Var2 == null || (c61VarM5145c5 = t91Var2.m5145c()) == null) ? 0L : c61VarM5145c5.mo646M(b03Var.m348l(true));
                        t91 t91Var3 = b03Var.f483d;
                        if (t91Var3 != null && (c61VarM5145c4 = t91Var3.m5145c()) != null) {
                            jMo646M = c61VarM5145c4.mo646M(b03Var.m348l(false));
                        }
                        t91 t91Var4 = b03Var.f483d;
                        float fIntBitsToFloat2 = 0.0f;
                        if (t91Var4 == null || (c61VarM5145c3 = t91Var4.m5145c()) == null) {
                            c = ' ';
                            j = jMo646M;
                            fIntBitsToFloat = 0.0f;
                        } else {
                            z03 z03VarM5146d = t91Var.m5146d();
                            c = ' ';
                            j = jMo646M;
                            fIntBitsToFloat = Float.intBitsToFloat((int) (c61VarM5145c3.mo646M((((long) Float.floatToRawIntBits(z03VarM5146d != null ? z03VarM5146d.f13697a.m6203c(iMo2451p).f7537b : 0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32)) & 4294967295L));
                        }
                        t91 t91Var5 = b03Var.f483d;
                        if (t91Var5 != null && (c61VarM5145c2 = t91Var5.m5145c()) != null) {
                            z03 z03VarM5146d2 = t91Var.m5146d();
                            fIntBitsToFloat2 = Float.intBitsToFloat((int) (c61VarM5145c2.mo646M((((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(z03VarM5146d2 != null ? z03VarM5146d2.f13697a.m6203c(iMo2451p2).f7537b : 0.0f)) & 4294967295L)) & 4294967295L));
                        }
                        int i3 = (int) (jMo646M2 >> c);
                        int i4 = (int) (j >> c);
                        o62Var = new o62(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), (t91Var.f10622a.f4853g.mo693b() * 25.0f) + Math.max(Float.intBitsToFloat((int) (jMo646M2 & 4294967295L)), Float.intBitsToFloat((int) (j & 4294967295L))));
                    }
                }
                t91 t91Var6 = b03Var.f483d;
                if (t91Var6 == null || (c61VarM5145c = t91Var6.m5145c()) == null) {
                    return null;
                }
                return (c61VarM5145c.mo653w() && c61Var.mo653w()) ? AbstractC0179eu.m1467q(c61Var.mo651r(s11.m4665J(c61VarM5145c), o62Var.m3516d()), o62Var.m3515c()) : o62Var2;
        }
    }
}
