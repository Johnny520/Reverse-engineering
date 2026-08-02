package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 extends tw2 implements mn0 {
    public final /* synthetic */ int l;
    public final /* synthetic */ kt m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j2(kt ktVar, t00 t00Var, int i) {
        super(2, t00Var);
        this.l = i;
        this.m = ktVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.l;
        a83 a83Var = a83.a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
            case 0:
                ((j2) p(t00Var, j20Var)).r(a83Var);
                break;
            default:
                ((j2) p(t00Var, j20Var)).r(a83Var);
                break;
        }
        return a83Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        int i = this.l;
        kt ktVar = this.m;
        switch (i) {
            case 0:
                return new j2(ktVar, t00Var, 0);
            default:
                return new j2(ktVar, t00Var, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        int i = this.l;
        a83 a83Var = a83.a;
        kt ktVar = this.m;
        switch (i) {
            case 0:
                fg1.T(obj);
                if (ktVar.H == null) {
                    xu0 xu0Var = new xu0();
                    bk1 bk1Var = ktVar.x;
                    if (bk1Var != null) {
                        p7.A(ktVar.A0(), null, new a2(bk1Var, xu0Var, null, 1), 3);
                    }
                    ktVar.H = xu0Var;
                }
                break;
            default:
                fg1.T(obj);
                xu0 xu0Var2 = ktVar.H;
                if (xu0Var2 != null) {
                    yu0 yu0Var = new yu0(xu0Var2);
                    bk1 bk1Var2 = ktVar.x;
                    if (bk1Var2 != null) {
                        p7.A(ktVar.A0(), null, new a2(bk1Var2, yu0Var, null, 2), 3);
                    }
                    ktVar.H = null;
                }
                break;
        }
        return a83Var;
    }
}
