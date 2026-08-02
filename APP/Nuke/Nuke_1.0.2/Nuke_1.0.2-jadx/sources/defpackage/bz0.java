package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bz0 extends tw2 implements mn0 {
    public /* synthetic */ float l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        return ((bz0) p((t00) obj2, Float.valueOf(((Number) obj).floatValue()))).r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        bz0 bz0Var = new bz0(2, t00Var);
        bz0Var.l = ((Number) obj).floatValue();
        return bz0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        fg1.T(obj);
        return Boolean.valueOf(this.l > 0.0f);
    }
}
