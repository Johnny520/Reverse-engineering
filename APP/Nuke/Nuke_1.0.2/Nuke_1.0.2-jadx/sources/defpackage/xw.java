package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xw extends tw2 implements nn0 {
    public final /* synthetic */ y62 l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw(y62 y62Var, t00 t00Var) {
        super(3, t00Var);
        this.l = y62Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn0
    public final Object e(Object obj, Object obj2, Object obj3) {
        xw xwVar = new xw(this.l, (t00) obj3);
        a83 a83Var = a83.a;
        xwVar.r(a83Var);
        return a83Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        fg1.T(obj);
        this.l.h = true;
        return a83.a;
    }
}
