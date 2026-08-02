package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ld1 extends rz1 {
    public final /* synthetic */ int i;
    public final Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ld1(int i, Object obj) {
        this.i = i;
        this.j = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float b() {
        int i = this.i;
        Object obj = this.j;
        switch (i) {
            case 0:
                return ((kd1) obj).b();
            default:
                return ((b7) obj).getDensity().b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rz1
    public float c(gu0 gu0Var) {
        float fIntBitsToFloat;
        int iO0;
        switch (this.i) {
            case 0:
                mn0 mn0Var = gu0Var.a;
                if (mn0Var != null) {
                    return ((Number) mn0Var.g(this, Float.valueOf(Float.NaN))).floatValue();
                }
                kd1 kd1Var = (kd1) this.j;
                if (kd1Var.r) {
                    return Float.NaN;
                }
                kd1 kd1Var2 = kd1Var;
                while (true) {
                    qb2 qb2Var = kd1Var2.t;
                    float f = (qb2Var == null || (iO0 = mg.o0((gu0[]) qb2Var.c, gu0Var)) < 0) ? Float.NaN : ((float[]) qb2Var.d)[iO0];
                    if (!Float.isNaN(f)) {
                        kd1Var2.l0(kd1Var.w0(), gu0Var);
                        c61 c61VarT0 = kd1Var2.t0();
                        c61 c61VarT02 = kd1Var.t0();
                        switch (gu0Var.b) {
                            case 0:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (c61VarT02.r(c61VarT0, (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(((int) (c61VarT0.L() >> 32)) / 2.0f)) << 32)) & 4294967295L));
                                break;
                            default:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (c61VarT02.r(c61VarT0, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(((int) (c61VarT0.L() & 4294967295L)) / 2.0f)))) >> 32));
                                break;
                        }
                        return fIntBitsToFloat;
                    }
                    kd1 kd1VarB0 = kd1Var2.B0();
                    if (kd1VarB0 == null) {
                        kd1Var2.l0(kd1Var.w0(), gu0Var);
                        return Float.NaN;
                    }
                    kd1Var2 = kd1VarB0;
                }
                break;
            default:
                return super.c(gu0Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rz1
    public final d61 e() {
        int i = this.i;
        Object obj = this.j;
        switch (i) {
            case 0:
                return ((kd1) obj).getLayoutDirection();
            default:
                return ((b7) obj).getLayoutDirection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rz1
    public final int f() {
        int i = this.i;
        Object obj = this.j;
        switch (i) {
            case 0:
                return ((kd1) obj).b0();
            default:
                return ((b7) obj).getRoot().N.p.h;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float m() {
        int i = this.i;
        Object obj = this.j;
        switch (i) {
            case 0:
                return ((kd1) obj).m();
            default:
                return ((b7) obj).getDensity().m();
        }
    }
}
