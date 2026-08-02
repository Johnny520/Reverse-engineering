package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b41 implements w41 {
    public static final b41 a = new b41();
    public static final ap2 b = up0.j("kotlinx.serialization.json.JsonNull", cp2.g, new yo2[0]);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final Object a(y40 y40Var) {
        rg3.o(y40Var);
        if (y40Var.g()) {
            throw new h31(p7.s(-1, "Expected 'null' literal", null, null, null));
        }
        return z31.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final void d(ve0 ve0Var, Object obj) {
        ((z31) obj).getClass();
        rg3.m(ve0Var);
        ve0Var.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final yo2 e() {
        return b;
    }
}
