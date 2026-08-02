package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bf extends tw2 implements in0 {
    public int l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        return new bf(1, (t00) obj).r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) throws Throwable {
        int i = this.l;
        t00 t00Var = null;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                fg1.T(obj);
                return obj;
            }
            s.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fg1.T(obj);
        ir0 ir0Var = ve.a;
        this.l = 1;
        c60 c60Var = o90.a;
        Object objR = p7.R(t50.j, new sb(2, t00Var, i2), this);
        k20 k20Var = k20.h;
        return objR == k20Var ? k20Var : objR;
    }
}
