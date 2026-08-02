package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ta0 implements w41 {
    public static final ta0 a = new ta0();
    public static final g32 b = new g32("kotlin.Double", f32.j);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final Object a(y40 y40Var) {
        return Double.valueOf(y40Var.B());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final void d(ve0 ve0Var, Object obj) {
        ve0Var.f(((Number) obj).doubleValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final yo2 e() {
        return b;
    }
}
