package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class o31 implements w41 {
    public static final o31 a = new o31();
    public static final ap2 b = up0.i("kotlinx.serialization.json.JsonElement", x12.g, new yo2[0], new nx0(9));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final Object a(y40 y40Var) {
        return rg3.o(y40Var).r0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final void d(ve0 ve0Var, Object obj) {
        j31 j31Var = (j31) obj;
        j31Var.getClass();
        rg3.m(ve0Var);
        if (j31Var instanceof i41) {
            ve0Var.e(k41.a, j31Var);
            return;
        }
        if (j31Var instanceof d41) {
            ve0Var.e(g41.a, j31Var);
        } else if (j31Var instanceof z21) {
            ve0Var.e(c31.a, j31Var);
        } else {
            c80.s();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final yo2 e() {
        return b;
    }
}
