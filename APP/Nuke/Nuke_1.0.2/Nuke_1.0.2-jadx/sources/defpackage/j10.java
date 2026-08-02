package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j10 implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ b03 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ j10(b03 b03Var, int i) {
        this.h = i;
        this.i = b03Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0120  */
    @Override // defpackage.in0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj) {
        o62 o62Var;
        c61 c61VarC;
        char c;
        long j;
        float fIntBitsToFloat;
        c61 c61VarC2;
        c61 c61VarC3;
        c61 c61VarC4;
        c61 c61VarC5;
        int i = this.h;
        b03 b03Var = this.i;
        switch (i) {
            case 0:
                return new f8(5, b03Var);
            case 1:
                b03Var.r();
                return a83.a;
            default:
                c61 c61Var = (c61) obj;
                t91 t91Var = b03Var.d;
                o62 o62Var2 = o62.e;
                if (t91Var == null) {
                    o62Var = o62Var2;
                } else {
                    if (t91Var.p) {
                        t91Var = null;
                    }
                    if (t91Var != null) {
                        us1 us1Var = b03Var.b;
                        long j2 = b03Var.n().b;
                        int i2 = f13.c;
                        int iP = us1Var.p((int) (j2 >> 32));
                        int iP2 = b03Var.b.p((int) (b03Var.n().b & 4294967295L));
                        t91 t91Var2 = b03Var.d;
                        long jM = 0;
                        long jM2 = (t91Var2 == null || (c61VarC5 = t91Var2.c()) == null) ? 0L : c61VarC5.M(b03Var.l(true));
                        t91 t91Var3 = b03Var.d;
                        if (t91Var3 != null && (c61VarC4 = t91Var3.c()) != null) {
                            jM = c61VarC4.M(b03Var.l(false));
                        }
                        t91 t91Var4 = b03Var.d;
                        float fIntBitsToFloat2 = 0.0f;
                        if (t91Var4 == null || (c61VarC3 = t91Var4.c()) == null) {
                            c = ' ';
                            j = jM;
                            fIntBitsToFloat = 0.0f;
                        } else {
                            z03 z03VarD = t91Var.d();
                            c = ' ';
                            j = jM;
                            fIntBitsToFloat = Float.intBitsToFloat((int) (c61VarC3.M((((long) Float.floatToRawIntBits(z03VarD != null ? z03VarD.a.c(iP).b : 0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32)) & 4294967295L));
                        }
                        t91 t91Var5 = b03Var.d;
                        if (t91Var5 != null && (c61VarC2 = t91Var5.c()) != null) {
                            z03 z03VarD2 = t91Var.d();
                            fIntBitsToFloat2 = Float.intBitsToFloat((int) (c61VarC2.M((((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(z03VarD2 != null ? z03VarD2.a.c(iP2).b : 0.0f)) & 4294967295L)) & 4294967295L));
                        }
                        int i3 = (int) (jM2 >> c);
                        int i4 = (int) (j >> c);
                        o62Var = new o62(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), (t91Var.a.g.b() * 25.0f) + Math.max(Float.intBitsToFloat((int) (jM2 & 4294967295L)), Float.intBitsToFloat((int) (j & 4294967295L))));
                    }
                }
                t91 t91Var6 = b03Var.d;
                if (t91Var6 == null || (c61VarC = t91Var6.c()) == null) {
                    return null;
                }
                return (c61VarC.w() && c61Var.w()) ? eu.q(c61Var.r(s11.J(c61VarC), o62Var.d()), o62Var.c()) : o62Var2;
        }
    }
}
