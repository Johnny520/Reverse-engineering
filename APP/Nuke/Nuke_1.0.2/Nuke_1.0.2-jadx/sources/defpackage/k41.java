package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class k41 implements w41 {
    public static final k41 a = new k41();
    public static final ap2 b = up0.j("kotlinx.serialization.json.JsonPrimitive", f32.o, new yo2[0]);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final Object a(y40 y40Var) {
        cv2 cv2VarO = rg3.o(y40Var);
        j31 j31VarR0 = cv2VarO.r0();
        if (j31VarR0 instanceof i41) {
            return (i41) j31VarR0;
        }
        throw new h31(p7.s(-1, "Unexpected JSON element, expected JsonPrimitive, had " + d72.a(j31VarR0.getClass()), null, null, cv2VarO.s0().a.h ? p7.E(j31VarR0.toString(), -1).toString() : null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final void d(ve0 ve0Var, Object obj) {
        i41 i41Var = (i41) obj;
        i41Var.getClass();
        rg3.m(ve0Var);
        if (i41Var instanceof z31) {
            ve0Var.e(b41.a, z31.INSTANCE);
        } else {
            ve0Var.e(x31.a, (w31) i41Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final yo2 e() {
        return b;
    }
}
